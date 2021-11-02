// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing Elastic Cloud stack.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := true
// 		_, err := ec.GetStack(ctx, &GetStackArgs{
// 			Lock:         &opt0,
// 			Region:       "us-east-1",
// 			VersionRegex: "latest",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.GetStack(ctx, &GetStackArgs{
// 			Region:       "us-east-1",
// 			VersionRegex: "7.9.?",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetStack(ctx *pulumi.Context, args *GetStackArgs, opts ...pulumi.InvokeOption) (*GetStackResult, error) {
	var rv GetStackResult
	err := ctx.Invoke("ec:index/getStack:getStack", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStack.
type GetStackArgs struct {
	// Lock the `"latest"` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
	Lock *bool `pulumi:"lock"`
	// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `"ece-region`.
	Region string `pulumi:"region"`
	// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `"latest"` is also accepted to obtain the latest available stack version.
	VersionRegex string `pulumi:"versionRegex"`
}

// A collection of values returned by getStack.
type GetStackResult struct {
	// To have this version accessible/not accessible by the calling user. This is only relevant for Elasticsearch Service (ESS), not for ECE.
	Accessible bool `pulumi:"accessible"`
	// To include/not include this version in the `allowlist`. This is only relevant for Elasticsearch Service (ESS), not for ECE.
	Allowlisted bool `pulumi:"allowlisted"`
	// Information for APM workloads on this stack version.
	// * `apm.#.denylist` - List of configuration options that cannot be overridden by user settings.
	// * `apm.#.capacity_constraints_min` - Minimum size of the instances.
	// * `apm.#.capacity_constraints_max` - Maximum size of the instances.
	// * `apm.#.compatible_node_types` - List of node types compatible with this one.
	// * `apm.#.docker_image` - Docker image to use for the APM instance.
	Apms []GetStackApm `pulumi:"apms"`
	// Information for Elasticsearch workloads on this stack version.
	// * `elasticsearch.#.denylist` - List of configuration options that cannot be overridden by user settings.
	// * `elasticsearch.#.capacity_constraints_min` - Minimum size of the instances.
	// * `elasticsearch.#.capacity_constraints_max` - Maximum size of the instances.
	// * `elasticsearch.#.compatible_node_types` - List of node types compatible with this one.
	// * `elasticsearch.#.default_plugins` - List of default plugins which are included in all Elasticsearch cluster instances.
	// * `elasticsearch.#.docker_image` - Docker image to use for the Elasticsearch cluster instances.
	// * `elasticsearch.#.plugins` - List of available plugins to be specified by users in Elasticsearch cluster instances.
	Elasticsearches []GetStackElasticsearch `pulumi:"elasticsearches"`
	// Information for Enterprise Search workloads on this stack version.
	// * `enterprise_search.#.denylist` - List of configuration options that cannot be overridden by user settings.
	// * `enterprise_search.#.capacity_constraints_min` - Minimum size of the instances.
	// * `enterprise_search.#.capacity_constraints_max` - Maximum size of the instances.
	// * `enterprise_search.#.compatible_node_types` - List of node types compatible with this one.
	// * `enterprise_search.#.docker_image` - Docker image to use for the Enterprise Search instance.
	EnterpriseSearches []GetStackEnterpriseSearch `pulumi:"enterpriseSearches"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information for Kibana workloads on this stack version.
	// * `kibana.#.denylist` - List of configuration options that cannot be overridden by user settings.
	// * `kibana.#.capacity_constraints_min` - Minimum size of the instances.
	// * `kibana.#.capacity_constraints_max` - Maximum size of the instances.
	// * `kibana.#.compatible_node_types` - List of node types compatible with this one.
	// * `kibana.#.docker_image` - Docker image to use for the Kibana instance.
	Kibanas []GetStackKibana `pulumi:"kibanas"`
	Lock    *bool            `pulumi:"lock"`
	// The minimum stack version recommended.
	MinUpgradableFrom string `pulumi:"minUpgradableFrom"`
	Region            string `pulumi:"region"`
	// The stack version you can upgrade to.
	UpgradableTos []string `pulumi:"upgradableTos"`
	// The stack version.
	Version      string `pulumi:"version"`
	VersionRegex string `pulumi:"versionRegex"`
}

func GetStackOutput(ctx *pulumi.Context, args GetStackOutputArgs, opts ...pulumi.InvokeOption) GetStackResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStackResult, error) {
			args := v.(GetStackArgs)
			r, err := GetStack(ctx, &args, opts...)
			return *r, err
		}).(GetStackResultOutput)
}

// A collection of arguments for invoking getStack.
type GetStackOutputArgs struct {
	// Lock the `"latest"` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
	Lock pulumi.BoolPtrInput `pulumi:"lock"`
	// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `"ece-region`.
	Region pulumi.StringInput `pulumi:"region"`
	// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `"latest"` is also accepted to obtain the latest available stack version.
	VersionRegex pulumi.StringInput `pulumi:"versionRegex"`
}

func (GetStackOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackArgs)(nil)).Elem()
}

// A collection of values returned by getStack.
type GetStackResultOutput struct{ *pulumi.OutputState }

func (GetStackResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackResult)(nil)).Elem()
}

func (o GetStackResultOutput) ToGetStackResultOutput() GetStackResultOutput {
	return o
}

func (o GetStackResultOutput) ToGetStackResultOutputWithContext(ctx context.Context) GetStackResultOutput {
	return o
}

// To have this version accessible/not accessible by the calling user. This is only relevant for Elasticsearch Service (ESS), not for ECE.
func (o GetStackResultOutput) Accessible() pulumi.BoolOutput {
	return o.ApplyT(func(v GetStackResult) bool { return v.Accessible }).(pulumi.BoolOutput)
}

// To include/not include this version in the `allowlist`. This is only relevant for Elasticsearch Service (ESS), not for ECE.
func (o GetStackResultOutput) Allowlisted() pulumi.BoolOutput {
	return o.ApplyT(func(v GetStackResult) bool { return v.Allowlisted }).(pulumi.BoolOutput)
}

// Information for APM workloads on this stack version.
// * `apm.#.denylist` - List of configuration options that cannot be overridden by user settings.
// * `apm.#.capacity_constraints_min` - Minimum size of the instances.
// * `apm.#.capacity_constraints_max` - Maximum size of the instances.
// * `apm.#.compatible_node_types` - List of node types compatible with this one.
// * `apm.#.docker_image` - Docker image to use for the APM instance.
func (o GetStackResultOutput) Apms() GetStackApmArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackApm { return v.Apms }).(GetStackApmArrayOutput)
}

// Information for Elasticsearch workloads on this stack version.
// * `elasticsearch.#.denylist` - List of configuration options that cannot be overridden by user settings.
// * `elasticsearch.#.capacity_constraints_min` - Minimum size of the instances.
// * `elasticsearch.#.capacity_constraints_max` - Maximum size of the instances.
// * `elasticsearch.#.compatible_node_types` - List of node types compatible with this one.
// * `elasticsearch.#.default_plugins` - List of default plugins which are included in all Elasticsearch cluster instances.
// * `elasticsearch.#.docker_image` - Docker image to use for the Elasticsearch cluster instances.
// * `elasticsearch.#.plugins` - List of available plugins to be specified by users in Elasticsearch cluster instances.
func (o GetStackResultOutput) Elasticsearches() GetStackElasticsearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackElasticsearch { return v.Elasticsearches }).(GetStackElasticsearchArrayOutput)
}

// Information for Enterprise Search workloads on this stack version.
// * `enterprise_search.#.denylist` - List of configuration options that cannot be overridden by user settings.
// * `enterprise_search.#.capacity_constraints_min` - Minimum size of the instances.
// * `enterprise_search.#.capacity_constraints_max` - Maximum size of the instances.
// * `enterprise_search.#.compatible_node_types` - List of node types compatible with this one.
// * `enterprise_search.#.docker_image` - Docker image to use for the Enterprise Search instance.
func (o GetStackResultOutput) EnterpriseSearches() GetStackEnterpriseSearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackEnterpriseSearch { return v.EnterpriseSearches }).(GetStackEnterpriseSearchArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetStackResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information for Kibana workloads on this stack version.
// * `kibana.#.denylist` - List of configuration options that cannot be overridden by user settings.
// * `kibana.#.capacity_constraints_min` - Minimum size of the instances.
// * `kibana.#.capacity_constraints_max` - Maximum size of the instances.
// * `kibana.#.compatible_node_types` - List of node types compatible with this one.
// * `kibana.#.docker_image` - Docker image to use for the Kibana instance.
func (o GetStackResultOutput) Kibanas() GetStackKibanaArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackKibana { return v.Kibanas }).(GetStackKibanaArrayOutput)
}

func (o GetStackResultOutput) Lock() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackResult) *bool { return v.Lock }).(pulumi.BoolPtrOutput)
}

// The minimum stack version recommended.
func (o GetStackResultOutput) MinUpgradableFrom() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.MinUpgradableFrom }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Region }).(pulumi.StringOutput)
}

// The stack version you can upgrade to.
func (o GetStackResultOutput) UpgradableTos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStackResult) []string { return v.UpgradableTos }).(pulumi.StringArrayOutput)
}

// The stack version.
func (o GetStackResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Version }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) VersionRegex() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.VersionRegex }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackResultOutput{})
}
