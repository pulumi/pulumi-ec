// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-ec/sdk/go/ec/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve a list of available deployment templates.
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
//			_, err := ec.GetDeploymentTemplates(ctx, &ec.GetDeploymentTemplatesArgs{
//				Region: "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ec.NewDeployment(ctx, "my_deployment", &ec.DeploymentArgs{
//				Name:                 pulumi.String("My Deployment"),
//				Version:              pulumi.String("8.12.2"),
//				Region:               pulumi.Any(allTemplates.Region),
//				DeploymentTemplateId: pulumi.Any(allTemplates.Templates[0].Id),
//				Elasticsearch: &ec.DeploymentElasticsearchArgs{
//					Hot: &ec.DeploymentElasticsearchHotArgs{
//						Autoscaling: nil,
//					},
//				},
//				Kibana: nil,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDeploymentTemplates(ctx *pulumi.Context, args *GetDeploymentTemplatesArgs, opts ...pulumi.InvokeOption) (*GetDeploymentTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDeploymentTemplatesResult
	err := ctx.Invoke("ec:index/getDeploymentTemplates:getDeploymentTemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDeploymentTemplates.
type GetDeploymentTemplatesArgs struct {
	// Filters for a deployment template with this id.
	Id *string `pulumi:"id"`
	// Region to select. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region string `pulumi:"region"`
	// Enable to also show deprecated deployment templates. (Set to false by default.)
	ShowDeprecated *bool `pulumi:"showDeprecated"`
	// Filters for deployment templates compatible with this stack version.
	StackVersion *string `pulumi:"stackVersion"`
}

// A collection of values returned by getDeploymentTemplates.
type GetDeploymentTemplatesResult struct {
	// Filters for a deployment template with this id.
	Id *string `pulumi:"id"`
	// Region to select. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region string `pulumi:"region"`
	// Enable to also show deprecated deployment templates. (Set to false by default.)
	ShowDeprecated *bool `pulumi:"showDeprecated"`
	// Filters for deployment templates compatible with this stack version.
	StackVersion *string `pulumi:"stackVersion"`
	// List of available deployment templates.
	Templates []GetDeploymentTemplatesTemplate `pulumi:"templates"`
}

func GetDeploymentTemplatesOutput(ctx *pulumi.Context, args GetDeploymentTemplatesOutputArgs, opts ...pulumi.InvokeOption) GetDeploymentTemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDeploymentTemplatesResult, error) {
			args := v.(GetDeploymentTemplatesArgs)
			r, err := GetDeploymentTemplates(ctx, &args, opts...)
			var s GetDeploymentTemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDeploymentTemplatesResultOutput)
}

// A collection of arguments for invoking getDeploymentTemplates.
type GetDeploymentTemplatesOutputArgs struct {
	// Filters for a deployment template with this id.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Region to select. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
	Region pulumi.StringInput `pulumi:"region"`
	// Enable to also show deprecated deployment templates. (Set to false by default.)
	ShowDeprecated pulumi.BoolPtrInput `pulumi:"showDeprecated"`
	// Filters for deployment templates compatible with this stack version.
	StackVersion pulumi.StringPtrInput `pulumi:"stackVersion"`
}

func (GetDeploymentTemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeploymentTemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getDeploymentTemplates.
type GetDeploymentTemplatesResultOutput struct{ *pulumi.OutputState }

func (GetDeploymentTemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeploymentTemplatesResult)(nil)).Elem()
}

func (o GetDeploymentTemplatesResultOutput) ToGetDeploymentTemplatesResultOutput() GetDeploymentTemplatesResultOutput {
	return o
}

func (o GetDeploymentTemplatesResultOutput) ToGetDeploymentTemplatesResultOutputWithContext(ctx context.Context) GetDeploymentTemplatesResultOutput {
	return o
}

// Filters for a deployment template with this id.
func (o GetDeploymentTemplatesResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDeploymentTemplatesResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// Region to select. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
func (o GetDeploymentTemplatesResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeploymentTemplatesResult) string { return v.Region }).(pulumi.StringOutput)
}

// Enable to also show deprecated deployment templates. (Set to false by default.)
func (o GetDeploymentTemplatesResultOutput) ShowDeprecated() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDeploymentTemplatesResult) *bool { return v.ShowDeprecated }).(pulumi.BoolPtrOutput)
}

// Filters for deployment templates compatible with this stack version.
func (o GetDeploymentTemplatesResultOutput) StackVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDeploymentTemplatesResult) *string { return v.StackVersion }).(pulumi.StringPtrOutput)
}

// List of available deployment templates.
func (o GetDeploymentTemplatesResultOutput) Templates() GetDeploymentTemplatesTemplateArrayOutput {
	return o.ApplyT(func(v GetDeploymentTemplatesResult) []GetDeploymentTemplatesTemplate { return v.Templates }).(GetDeploymentTemplatesTemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDeploymentTemplatesResultOutput{})
}
