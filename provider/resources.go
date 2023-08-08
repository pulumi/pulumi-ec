// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ec

import (
	// Allow us to embed metadata
	_ "embed"

	"fmt"
	"path/filepath"
	"unicode"

	"github.com/elastic/terraform-provider-ec/ec"
	"github.com/pulumi/pulumi-ec/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/x"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "ec"
	// modules:
	mainMod = "index" // the y module
)

func makeMember(mod, name string) tokens.ModuleMember {
	lower := string(unicode.ToLower(rune(name[0]))) + name[1:]
	return tokens.ModuleMember(fmt.Sprintf("%s:%s/%s:%s", mainPkg, mod, lower, name))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod, fn string) tokens.ModuleMember {
	return makeMember(mod, fn)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod, res string) tokens.Type {
	return tokens.Type(makeMember(mod, res))
}

//go:embed  cmd/pulumi-resource-ec/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(ec.New(version.Version))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:            p,
		Name:         "ec",
		DisplayName:  "ElasticCloud (EC)",
		GitHubOrg:    "elastic",
		Description:  "A Pulumi package for creating and managing ElasticCloud resources.",
		Keywords:     []string{"pulumi", "ec", "elasticsearch", "es", "elastic", "elasticcloud"},
		License:      "Apache-2.0",
		Homepage:     "https://pulumi.io",
		Repository:   "https://github.com/pulumi/pulumi-ec",
		Config:       map[string]*tfbridge.SchemaInfo{},
		Version:      version.Version,
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Resources: map[string]*tfbridge.ResourceInfo{
			"ec_deployment":                            {Tok: makeResource(mainMod, "Deployment")},
			"ec_deployment_elasticsearch_keystore":     {Tok: makeResource(mainMod, "DeploymentElasticsearchKeystore")},
			"ec_deployment_extension":                  {Tok: makeResource(mainMod, "DeploymentExtension")},
			"ec_deployment_traffic_filter":             {Tok: makeResource(mainMod, "DeploymentTrafficFilter")},
			"ec_deployment_traffic_filter_association": {Tok: makeResource(mainMod, "DeploymentTrafficFilterAssociation")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"ec_deployment":  {Tok: makeDataSource(mainMod, "getDeployment")},
			"ec_deployments": {Tok: makeDataSource(mainMod, "getDeployments")},
			"ec_stack":       {Tok: makeDataSource(mainMod, "getStack")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			Namespaces: map[string]string{
				"ec": "ElasticCloud",
			},
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	err := x.ComputeDefaults(&prov, x.TokensSingleModule("ec_", mainMod,
		x.MakeStandardToken(mainPkg)))
	contract.AssertNoError(err)

	prov.SetAutonaming(255, "-")

	return prov
}
