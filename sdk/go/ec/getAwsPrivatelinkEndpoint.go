// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-ec/sdk/go/ec/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to retrieve information about the AWS Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vpc.html).
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
//			_, err := ec.GetAzurePrivatelinkEndpoint(ctx, &ec.GetAzurePrivatelinkEndpointArgs{
//				Region: "eastus",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAwsPrivatelinkEndpoint(ctx *pulumi.Context, args *GetAwsPrivatelinkEndpointArgs, opts ...pulumi.InvokeOption) (*GetAwsPrivatelinkEndpointResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsPrivatelinkEndpointResult
	err := ctx.Invoke("ec:index/getAwsPrivatelinkEndpoint:getAwsPrivatelinkEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsPrivatelinkEndpoint.
type GetAwsPrivatelinkEndpointArgs struct {
	// Region to retrieve the Private Link configuration for.
	Region string `pulumi:"region"`
}

// A collection of values returned by getAwsPrivatelinkEndpoint.
type GetAwsPrivatelinkEndpointResult struct {
	// The domain name to used in when configuring a private hosted zone in the VPCE connection.
	DomainName string `pulumi:"domainName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Region to retrieve the Private Link configuration for.
	Region string `pulumi:"region"`
	// The VPC service name used to connect to the region.
	VpcServiceName string `pulumi:"vpcServiceName"`
	// The IDs of the availability zones hosting the VPC endpoints.
	ZoneIds []string `pulumi:"zoneIds"`
}

func GetAwsPrivatelinkEndpointOutput(ctx *pulumi.Context, args GetAwsPrivatelinkEndpointOutputArgs, opts ...pulumi.InvokeOption) GetAwsPrivatelinkEndpointResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAwsPrivatelinkEndpointResult, error) {
			args := v.(GetAwsPrivatelinkEndpointArgs)
			r, err := GetAwsPrivatelinkEndpoint(ctx, &args, opts...)
			var s GetAwsPrivatelinkEndpointResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAwsPrivatelinkEndpointResultOutput)
}

// A collection of arguments for invoking getAwsPrivatelinkEndpoint.
type GetAwsPrivatelinkEndpointOutputArgs struct {
	// Region to retrieve the Private Link configuration for.
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetAwsPrivatelinkEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsPrivatelinkEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getAwsPrivatelinkEndpoint.
type GetAwsPrivatelinkEndpointResultOutput struct{ *pulumi.OutputState }

func (GetAwsPrivatelinkEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsPrivatelinkEndpointResult)(nil)).Elem()
}

func (o GetAwsPrivatelinkEndpointResultOutput) ToGetAwsPrivatelinkEndpointResultOutput() GetAwsPrivatelinkEndpointResultOutput {
	return o
}

func (o GetAwsPrivatelinkEndpointResultOutput) ToGetAwsPrivatelinkEndpointResultOutputWithContext(ctx context.Context) GetAwsPrivatelinkEndpointResultOutput {
	return o
}

func (o GetAwsPrivatelinkEndpointResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAwsPrivatelinkEndpointResult] {
	return pulumix.Output[GetAwsPrivatelinkEndpointResult]{
		OutputState: o.OutputState,
	}
}

// The domain name to used in when configuring a private hosted zone in the VPCE connection.
func (o GetAwsPrivatelinkEndpointResultOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsPrivatelinkEndpointResult) string { return v.DomainName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsPrivatelinkEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsPrivatelinkEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

// Region to retrieve the Private Link configuration for.
func (o GetAwsPrivatelinkEndpointResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsPrivatelinkEndpointResult) string { return v.Region }).(pulumi.StringOutput)
}

// The VPC service name used to connect to the region.
func (o GetAwsPrivatelinkEndpointResultOutput) VpcServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsPrivatelinkEndpointResult) string { return v.VpcServiceName }).(pulumi.StringOutput)
}

// The IDs of the availability zones hosting the VPC endpoints.
func (o GetAwsPrivatelinkEndpointResultOutput) ZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAwsPrivatelinkEndpointResult) []string { return v.ZoneIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsPrivatelinkEndpointResultOutput{})
}
