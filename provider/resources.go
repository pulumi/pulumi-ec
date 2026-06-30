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
	"context"
	"fmt"
	"path/filepath"
	"regexp"
	"strings"

	// Allow us to embed metadata
	_ "embed"

	"github.com/elastic/terraform-provider-ec/ec"

	pf "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-ec/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "ec"
	// modules:
	mainMod = "index" // the y module

	elasticsearchKey = "elasticsearch"
)

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
		Version:      version.Version,
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		DocRules:     &tfbridge.DocRuleInfo{EditRules: docEditRules},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			// Overlay: &tfbridge.OverlayInfo{},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			Namespaces: map[string]string{
				"ec": "ElasticCloud",
			},
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.MustComputeTokens(tks.SingleModule("ec_", mainMod,
		tks.MakeStandard(mainPkg)))

	// The Elastic Cloud deployment resource has two breaking schema changes from v1 to v2; transform them and
	// update the schema version
	if r := prov.Resources["ec_deployment"]; r != nil {
		r.TransformFromState = migrateElasticsearchState

		// The upstream ec_deployment has no StateUpgrader; provide one
		r.PreStateUpgradeHook = func(args tfbridge.PreStateUpgradeHookArgs) (int64, resource.PropertyMap, error) {
			return args.ResourceSchemaVersion, args.PriorState, nil
		}
	}

	prov.SetAutonaming(255, "-")

	prov.MustApplyAutoAliases()

	return prov
}

// migrateElasticsearchState coerces `elasticsearch` field shapes from v1 -> v2 schema.
// Changes only `autoscale` and `strategy` fields to match the upstream provider.
func migrateElasticsearchState(_ context.Context, state resource.PropertyMap) (resource.PropertyMap, error) {
	es, ok := state[elasticsearchKey]
	if !ok {
		return state, nil
	}

	// extractStrategyType pulls the `type` string out of the `strategy` value,
	// which the v1 schema modeled as a (single-element) list of `{type: "..."}`
	// objects, or as a single such object. Returns false if no string type is found.
	extractStrategyType := func(v resource.PropertyValue) (string, bool) {
		if v.IsArray() {
			arr := v.ArrayValue()
			if len(arr) == 0 {
				return "", false
			}
			v = arr[0]
		}
		if v.IsObject() {
			if t, ok := v.ObjectValue()["type"]; ok && t.IsString() {
				return t.StringValue(), true
			}
		}
		return "", false
	}

	coerce := func(v resource.PropertyValue) resource.PropertyValue {
		if !v.IsObject() {
			return v
		}
		obj := v.ObjectValue()
		if a, ok := obj["autoscale"]; ok && a.IsString() {
			obj["autoscale"] = resource.NewBoolProperty(strings.EqualFold(a.StringValue(), "true"))
		}
		if s, ok := obj["strategy"]; ok && !s.IsString() {
			if t, got := extractStrategyType(s); got {
				obj["strategy"] = resource.NewStringProperty(t)
			}
		}
		return resource.NewObjectProperty(obj)
	}

	switch {
	case es.IsObject():
		state["elasticsearch"] = coerce(es)
	case es.IsArray():
		// Older schema shapes modeled elasticsearch as a single-element list.
		arr := es.ArrayValue()
		for i := range arr {
			arr[i] = coerce(arr[i])
		}
		state["elasticsearch"] = resource.NewArrayProperty(arr)
	}

	return state, nil
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		skipSectionHeadersEdit("index.md"),
	)
}

// Removes sections that include TF-specific recommendations
func skipSectionHeadersEdit(docFile string) tfbridge.DocsEdit {
	headerSkipRegexps := getHeadersToSkip()
	return tfbridge.DocsEdit{
		Path: docFile,
		Edit: func(_ string, content []byte) ([]byte, error) {
			return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
				for _, header := range headerSkipRegexps {
					if header.Match([]byte(headerText)) {
						return true
					}
				}
				return false
			})
		},
	}
}

// List of headers to skip for this provider
func getHeadersToSkip() []*regexp.Regexp {
	headerSkipRegexps := []*regexp.Regexp{
		regexp.MustCompile("Version guidance"),
		regexp.MustCompile("Minimum Terraform version"),
		regexp.MustCompile("Releases"),
	}
	return headerSkipRegexps
}
