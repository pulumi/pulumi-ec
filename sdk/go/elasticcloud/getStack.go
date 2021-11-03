// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetStack(ctx *pulumi.Context, args *GetStackArgs, opts ...pulumi.InvokeOption) (*GetStackResult, error) {
	var rv GetStackResult
	err := ctx.Invoke("elasticcloud:index/getStack:getStack", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStack.
type GetStackArgs struct {
	Lock         *bool  `pulumi:"lock"`
	Region       string `pulumi:"region"`
	VersionRegex string `pulumi:"versionRegex"`
}

// A collection of values returned by getStack.
type GetStackResult struct {
	Accessible         bool                       `pulumi:"accessible"`
	Allowlisted        bool                       `pulumi:"allowlisted"`
	Apms               []GetStackApm              `pulumi:"apms"`
	Elasticsearches    []GetStackElasticsearch    `pulumi:"elasticsearches"`
	EnterpriseSearches []GetStackEnterpriseSearch `pulumi:"enterpriseSearches"`
	// The provider-assigned unique ID for this managed resource.
	Id                string           `pulumi:"id"`
	Kibanas           []GetStackKibana `pulumi:"kibanas"`
	Lock              *bool            `pulumi:"lock"`
	MinUpgradableFrom string           `pulumi:"minUpgradableFrom"`
	Region            string           `pulumi:"region"`
	UpgradableTos     []string         `pulumi:"upgradableTos"`
	Version           string           `pulumi:"version"`
	VersionRegex      string           `pulumi:"versionRegex"`
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
	Lock         pulumi.BoolPtrInput `pulumi:"lock"`
	Region       pulumi.StringInput  `pulumi:"region"`
	VersionRegex pulumi.StringInput  `pulumi:"versionRegex"`
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

func (o GetStackResultOutput) Accessible() pulumi.BoolOutput {
	return o.ApplyT(func(v GetStackResult) bool { return v.Accessible }).(pulumi.BoolOutput)
}

func (o GetStackResultOutput) Allowlisted() pulumi.BoolOutput {
	return o.ApplyT(func(v GetStackResult) bool { return v.Allowlisted }).(pulumi.BoolOutput)
}

func (o GetStackResultOutput) Apms() GetStackApmArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackApm { return v.Apms }).(GetStackApmArrayOutput)
}

func (o GetStackResultOutput) Elasticsearches() GetStackElasticsearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackElasticsearch { return v.Elasticsearches }).(GetStackElasticsearchArrayOutput)
}

func (o GetStackResultOutput) EnterpriseSearches() GetStackEnterpriseSearchArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackEnterpriseSearch { return v.EnterpriseSearches }).(GetStackEnterpriseSearchArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetStackResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) Kibanas() GetStackKibanaArrayOutput {
	return o.ApplyT(func(v GetStackResult) []GetStackKibana { return v.Kibanas }).(GetStackKibanaArrayOutput)
}

func (o GetStackResultOutput) Lock() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackResult) *bool { return v.Lock }).(pulumi.BoolPtrOutput)
}

func (o GetStackResultOutput) MinUpgradableFrom() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.MinUpgradableFrom }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) UpgradableTos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStackResult) []string { return v.UpgradableTos }).(pulumi.StringArrayOutput)
}

func (o GetStackResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.Version }).(pulumi.StringOutput)
}

func (o GetStackResultOutput) VersionRegex() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackResult) string { return v.VersionRegex }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackResultOutput{})
}
