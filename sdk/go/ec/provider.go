// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the ec package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
	Apikey pulumi.StringPtrOutput `pulumi:"apikey"`
	// Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Timeout used for individual HTTP calls. Defaults to "1m".
	Timeout pulumi.StringPtrOutput `pulumi:"timeout"`
	// Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// Timeout used for individual HTTP calls. Defaults to "1m".
	VerboseFile pulumi.StringPtrOutput `pulumi:"verboseFile"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:ec", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
	Apikey *string `pulumi:"apikey"`
	// Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
	Endpoint *string `pulumi:"endpoint"`
	// Allow the provider to skip TLS validation on its outgoing HTTP calls.
	Insecure *bool `pulumi:"insecure"`
	// Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Password *string `pulumi:"password"`
	// Timeout used for individual HTTP calls. Defaults to "1m".
	Timeout *string `pulumi:"timeout"`
	// Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Username *string `pulumi:"username"`
	// When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
	Verbose *bool `pulumi:"verbose"`
	// When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
	VerboseCredentials *bool `pulumi:"verboseCredentials"`
	// Timeout used for individual HTTP calls. Defaults to "1m".
	VerboseFile *string `pulumi:"verboseFile"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
	Apikey pulumi.StringPtrInput
	// Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
	Endpoint pulumi.StringPtrInput
	// Allow the provider to skip TLS validation on its outgoing HTTP calls.
	Insecure pulumi.BoolPtrInput
	// Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Password pulumi.StringPtrInput
	// Timeout used for individual HTTP calls. Defaults to "1m".
	Timeout pulumi.StringPtrInput
	// Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
	// Private.
	Username pulumi.StringPtrInput
	// When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
	Verbose pulumi.BoolPtrInput
	// When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
	VerboseCredentials pulumi.BoolPtrInput
	// Timeout used for individual HTTP calls. Defaults to "1m".
	VerboseFile pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

func (i *Provider) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *Provider) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderPtrInput interface {
	pulumi.Input

	ToProviderPtrOutput() ProviderPtrOutput
	ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput
}

type providerPtrType ProviderArgs

func (*providerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (i *providerPtrType) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

func (i *providerPtrType) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o.ToProviderPtrOutputWithContext(context.Background())
}

func (o ProviderOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Provider) *Provider {
		return &v
	}).(ProviderPtrOutput)
}

type ProviderPtrOutput struct{ *pulumi.OutputState }

func (ProviderPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

func (o ProviderPtrOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o
}

func (o ProviderPtrOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o
}

func (o ProviderPtrOutput) Elem() ProviderOutput {
	return o.ApplyT(func(v *Provider) Provider {
		if v != nil {
			return *v
		}
		var ret Provider
		return ret
	}).(ProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderPtrInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderPtrOutput{})
}
