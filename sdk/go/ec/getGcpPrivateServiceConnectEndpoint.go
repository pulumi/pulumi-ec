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

// Use this data source to retrieve information about the GCP Private Service Connect configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).
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
//			_, err := ec.GetGcpPrivateServiceConnectEndpoint(ctx, &ec.GetGcpPrivateServiceConnectEndpointArgs{
//				Region: "us-central1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGcpPrivateServiceConnectEndpoint(ctx *pulumi.Context, args *GetGcpPrivateServiceConnectEndpointArgs, opts ...pulumi.InvokeOption) (*GetGcpPrivateServiceConnectEndpointResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGcpPrivateServiceConnectEndpointResult
	err := ctx.Invoke("ec:index/getGcpPrivateServiceConnectEndpoint:getGcpPrivateServiceConnectEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGcpPrivateServiceConnectEndpoint.
type GetGcpPrivateServiceConnectEndpointArgs struct {
	// Region to retrieve the Prive Link configuration for.
	Region string `pulumi:"region"`
}

// A collection of values returned by getGcpPrivateServiceConnectEndpoint.
type GetGcpPrivateServiceConnectEndpointResult struct {
	// The domain name to point towards the PSC endpoint.
	DomainName string `pulumi:"domainName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Region to retrieve the Prive Link configuration for.
	Region string `pulumi:"region"`
	// The service attachment URI to attach the PSC endpoint to.
	ServiceAttachmentUri string `pulumi:"serviceAttachmentUri"`
}

func GetGcpPrivateServiceConnectEndpointOutput(ctx *pulumi.Context, args GetGcpPrivateServiceConnectEndpointOutputArgs, opts ...pulumi.InvokeOption) GetGcpPrivateServiceConnectEndpointResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGcpPrivateServiceConnectEndpointResult, error) {
			args := v.(GetGcpPrivateServiceConnectEndpointArgs)
			r, err := GetGcpPrivateServiceConnectEndpoint(ctx, &args, opts...)
			var s GetGcpPrivateServiceConnectEndpointResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGcpPrivateServiceConnectEndpointResultOutput)
}

// A collection of arguments for invoking getGcpPrivateServiceConnectEndpoint.
type GetGcpPrivateServiceConnectEndpointOutputArgs struct {
	// Region to retrieve the Prive Link configuration for.
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetGcpPrivateServiceConnectEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGcpPrivateServiceConnectEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getGcpPrivateServiceConnectEndpoint.
type GetGcpPrivateServiceConnectEndpointResultOutput struct{ *pulumi.OutputState }

func (GetGcpPrivateServiceConnectEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGcpPrivateServiceConnectEndpointResult)(nil)).Elem()
}

func (o GetGcpPrivateServiceConnectEndpointResultOutput) ToGetGcpPrivateServiceConnectEndpointResultOutput() GetGcpPrivateServiceConnectEndpointResultOutput {
	return o
}

func (o GetGcpPrivateServiceConnectEndpointResultOutput) ToGetGcpPrivateServiceConnectEndpointResultOutputWithContext(ctx context.Context) GetGcpPrivateServiceConnectEndpointResultOutput {
	return o
}

func (o GetGcpPrivateServiceConnectEndpointResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetGcpPrivateServiceConnectEndpointResult] {
	return pulumix.Output[GetGcpPrivateServiceConnectEndpointResult]{
		OutputState: o.OutputState,
	}
}

// The domain name to point towards the PSC endpoint.
func (o GetGcpPrivateServiceConnectEndpointResultOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGcpPrivateServiceConnectEndpointResult) string { return v.DomainName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGcpPrivateServiceConnectEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGcpPrivateServiceConnectEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

// Region to retrieve the Prive Link configuration for.
func (o GetGcpPrivateServiceConnectEndpointResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetGcpPrivateServiceConnectEndpointResult) string { return v.Region }).(pulumi.StringOutput)
}

// The service attachment URI to attach the PSC endpoint to.
func (o GetGcpPrivateServiceConnectEndpointResultOutput) ServiceAttachmentUri() pulumi.StringOutput {
	return o.ApplyT(func(v GetGcpPrivateServiceConnectEndpointResult) string { return v.ServiceAttachmentUri }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGcpPrivateServiceConnectEndpointResultOutput{})
}
