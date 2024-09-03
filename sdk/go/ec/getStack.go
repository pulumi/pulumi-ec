// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-ec/sdk/go/ec/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing Elastic Cloud stack.
//
// > **Note on regions** Before you start, you might want to check the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions available in Elasticsearch Service (ESS).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-ec/sdk/go/ec"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec.GetStack(ctx, &ec.GetStackArgs{
//				VersionRegex: "latest",
//				Region:       "us-east-1",
//				Lock:         pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ec.GetStack(ctx, &ec.GetStackArgs{
//				VersionRegex: "7.9.?",
//				Region:       "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetStack(ctx *pulumi.Context, args *GetStackArgs, opts ...pulumi.InvokeOption) (*GetStackResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStackResult
	err := ctx.Invoke("ec:index/getStack:getStack", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStack.
type GetStackArgs struct {
	// Lock the `latest` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
	Lock *bool `pulumi:"lock"`
	// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region string `pulumi:"region"`
	// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
	VersionRegex string `pulumi:"versionRegex"`
}

// A collection of values returned by getStack.
type GetStackResult struct {
	// To have this version accessible/not accessible by the calling user. This is only relevant for Elasticsearch Service (ESS), not for ECE.
	Accessible bool `pulumi:"accessible"`
	// To include/not include this version in the `allowlist`. This is only relevant for Elasticsearch Service (ESS), not for ECE.
	Allowlisted bool `pulumi:"allowlisted"`
	// Information for APM workloads on this stack version.
	Apms []GetStackApm `pulumi:"apms"`
	// Information for Elasticsearch workloads on this stack version.
	Elasticsearches []GetStackElasticsearch `pulumi:"elasticsearches"`
	// Information for Enterprise Search workloads on this stack version.
	EnterpriseSearches []GetStackEnterpriseSearch `pulumi:"enterpriseSearches"`
	// Unique identifier of this data source.
	Id string `pulumi:"id"`
	// Information for Kibana workloads on this stack version.
	Kibanas []GetStackKibana `pulumi:"kibanas"`
	// Lock the `latest` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
	Lock *bool `pulumi:"lock"`
	// The minimum stack version which can be upgraded to this stack version.
	MinUpgradableFrom string `pulumi:"minUpgradableFrom"`
	// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region string `pulumi:"region"`
	// A list of stack versions which this stack version can be upgraded to.
	UpgradableTos []string `pulumi:"upgradableTos"`
	// The stack version
	Version string `pulumi:"version"`
	// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
	VersionRegex string `pulumi:"versionRegex"`
}

func GetStackOutput(ctx *pulumi.Context, args GetStackOutputArgs, opts ...pulumi.InvokeOption) GetStackResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStackResult, error) {
			args := v.(GetStackArgs)
			r, err := GetStack(ctx, &args, opts...)
			var s GetStackResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStackResultOutput)
}

// A collection of arguments for invoking getStack.
type GetStackOutputArgs struct {
	// Lock the `latest` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
	Lock pulumi.BoolPtrInput `pulumi:"lock"`
	// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region pulumi.StringInput `pulumi:"region"`
	// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
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
func (o GetStackResultOutput) Apms() GetStackApmArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackApm { return v.Apms }).(GetStackApmArrayOutput)
}

// Information for Elasticsearch workloads on this stack version.
func (o GetStackResultOutput) Elasticsearches() GetStackElasticsearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackElasticsearch { return v.Elasticsearches }).(GetStackElasticsearchArrayOutput)
}

// Information for Enterprise Search workloads on this stack version.
func (o GetStackResultOutput) EnterpriseSearches() GetStackEnterpriseSearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackEnterpriseSearch { return v.EnterpriseSearches }).(GetStackEnterpriseSearchArrayOutput)
}

// Unique identifier of this data source.
func (o GetStackResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information for Kibana workloads on this stack version.
func (o GetStackResultOutput) Kibanas() GetStackKibanaArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackKibana { return v.Kibanas }).(GetStackKibanaArrayOutput)
}

// Lock the `latest` `versionRegex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
func (o GetStackResultOutput) Lock() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackResult) *bool { return v.Lock }).(pulumi.BoolPtrOutput)
}

// The minimum stack version which can be upgraded to this stack version.
func (o GetStackResultOutput) MinUpgradableFrom() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.MinUpgradableFrom }).(pulumi.StringOutput)
}

// Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
func (o GetStackResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Region }).(pulumi.StringOutput)
}

// A list of stack versions which this stack version can be upgraded to.
func (o GetStackResultOutput) UpgradableTos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStackResult) []string { return v.UpgradableTos }).(pulumi.StringArrayOutput)
}

// The stack version
func (o GetStackResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Version }).(pulumi.StringOutput)
}

// Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
func (o GetStackResultOutput) VersionRegex() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.VersionRegex }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackResultOutput{})
}
