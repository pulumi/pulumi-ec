// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-ec/sdk/go/ec/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Technical preview
//
// This functionality is in technical preview and may be changed or removed in a future release.
// Elastic will work to fix any issues, but features in technical preview are not subject to the support SLA of official GA features.
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
//			_, err := ec.NewSecurityProject(ctx, "my_project", &ec.SecurityProjectArgs{
//				Name:     pulumi.String("my_project"),
//				RegionId: pulumi.String("aws-us-east-1"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Projects can be imported using the `id`, for example:
//
// ```sh
// $ pulumi import ec:index/securityProject:SecurityProject id 320b7b540dfc967a7a649c18e2fce4ed
// ```
type SecurityProject struct {
	pulumi.CustomResourceState

	// admin features package (BYOK, BYOIDP, CCS, CCR)
	AdminFeaturesPackage pulumi.StringOutput `pulumi:"adminFeaturesPackage"`
	// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
	Alias pulumi.StringOutput `pulumi:"alias"`
	// The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
	CloudId pulumi.StringOutput `pulumi:"cloudId"`
	// Basic auth credentials to access the Elasticsearch API.
	Credentials SecurityProjectCredentialsOutput `pulumi:"credentials"`
	// The endpoints to access the different apps of the project.
	Endpoints SecurityProjectEndpointsOutput `pulumi:"endpoints"`
	// Additional details about the project.
	Metadata SecurityProjectMetadataOutput `pulumi:"metadata"`
	// Descriptive name for a project.
	Name         pulumi.StringOutput                   `pulumi:"name"`
	ProductTypes SecurityProjectProductTypeArrayOutput `pulumi:"productTypes"`
	// Unique human-readable identifier for a region in Elastic Cloud.
	RegionId pulumi.StringOutput `pulumi:"regionId"`
	// the type of the project
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewSecurityProject registers a new resource with the given unique name, arguments, and options.
func NewSecurityProject(ctx *pulumi.Context,
	name string, args *SecurityProjectArgs, opts ...pulumi.ResourceOption) (*SecurityProject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RegionId == nil {
		return nil, errors.New("invalid value for required argument 'RegionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecurityProject
	err := ctx.RegisterResource("ec:index/securityProject:SecurityProject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityProject gets an existing SecurityProject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityProjectState, opts ...pulumi.ResourceOption) (*SecurityProject, error) {
	var resource SecurityProject
	err := ctx.ReadResource("ec:index/securityProject:SecurityProject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityProject resources.
type securityProjectState struct {
	// admin features package (BYOK, BYOIDP, CCS, CCR)
	AdminFeaturesPackage *string `pulumi:"adminFeaturesPackage"`
	// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
	Alias *string `pulumi:"alias"`
	// The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
	CloudId *string `pulumi:"cloudId"`
	// Basic auth credentials to access the Elasticsearch API.
	Credentials *SecurityProjectCredentials `pulumi:"credentials"`
	// The endpoints to access the different apps of the project.
	Endpoints *SecurityProjectEndpoints `pulumi:"endpoints"`
	// Additional details about the project.
	Metadata *SecurityProjectMetadata `pulumi:"metadata"`
	// Descriptive name for a project.
	Name         *string                      `pulumi:"name"`
	ProductTypes []SecurityProjectProductType `pulumi:"productTypes"`
	// Unique human-readable identifier for a region in Elastic Cloud.
	RegionId *string `pulumi:"regionId"`
	// the type of the project
	Type *string `pulumi:"type"`
}

type SecurityProjectState struct {
	// admin features package (BYOK, BYOIDP, CCS, CCR)
	AdminFeaturesPackage pulumi.StringPtrInput
	// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
	Alias pulumi.StringPtrInput
	// The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
	CloudId pulumi.StringPtrInput
	// Basic auth credentials to access the Elasticsearch API.
	Credentials SecurityProjectCredentialsPtrInput
	// The endpoints to access the different apps of the project.
	Endpoints SecurityProjectEndpointsPtrInput
	// Additional details about the project.
	Metadata SecurityProjectMetadataPtrInput
	// Descriptive name for a project.
	Name         pulumi.StringPtrInput
	ProductTypes SecurityProjectProductTypeArrayInput
	// Unique human-readable identifier for a region in Elastic Cloud.
	RegionId pulumi.StringPtrInput
	// the type of the project
	Type pulumi.StringPtrInput
}

func (SecurityProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProjectState)(nil)).Elem()
}

type securityProjectArgs struct {
	// admin features package (BYOK, BYOIDP, CCS, CCR)
	AdminFeaturesPackage *string `pulumi:"adminFeaturesPackage"`
	// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
	Alias *string `pulumi:"alias"`
	// Descriptive name for a project.
	Name         *string                      `pulumi:"name"`
	ProductTypes []SecurityProjectProductType `pulumi:"productTypes"`
	// Unique human-readable identifier for a region in Elastic Cloud.
	RegionId string `pulumi:"regionId"`
}

// The set of arguments for constructing a SecurityProject resource.
type SecurityProjectArgs struct {
	// admin features package (BYOK, BYOIDP, CCS, CCR)
	AdminFeaturesPackage pulumi.StringPtrInput
	// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
	Alias pulumi.StringPtrInput
	// Descriptive name for a project.
	Name         pulumi.StringPtrInput
	ProductTypes SecurityProjectProductTypeArrayInput
	// Unique human-readable identifier for a region in Elastic Cloud.
	RegionId pulumi.StringInput
}

func (SecurityProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityProjectArgs)(nil)).Elem()
}

type SecurityProjectInput interface {
	pulumi.Input

	ToSecurityProjectOutput() SecurityProjectOutput
	ToSecurityProjectOutputWithContext(ctx context.Context) SecurityProjectOutput
}

func (*SecurityProject) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProject)(nil)).Elem()
}

func (i *SecurityProject) ToSecurityProjectOutput() SecurityProjectOutput {
	return i.ToSecurityProjectOutputWithContext(context.Background())
}

func (i *SecurityProject) ToSecurityProjectOutputWithContext(ctx context.Context) SecurityProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProjectOutput)
}

// SecurityProjectArrayInput is an input type that accepts SecurityProjectArray and SecurityProjectArrayOutput values.
// You can construct a concrete instance of `SecurityProjectArrayInput` via:
//
//	SecurityProjectArray{ SecurityProjectArgs{...} }
type SecurityProjectArrayInput interface {
	pulumi.Input

	ToSecurityProjectArrayOutput() SecurityProjectArrayOutput
	ToSecurityProjectArrayOutputWithContext(context.Context) SecurityProjectArrayOutput
}

type SecurityProjectArray []SecurityProjectInput

func (SecurityProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProject)(nil)).Elem()
}

func (i SecurityProjectArray) ToSecurityProjectArrayOutput() SecurityProjectArrayOutput {
	return i.ToSecurityProjectArrayOutputWithContext(context.Background())
}

func (i SecurityProjectArray) ToSecurityProjectArrayOutputWithContext(ctx context.Context) SecurityProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProjectArrayOutput)
}

// SecurityProjectMapInput is an input type that accepts SecurityProjectMap and SecurityProjectMapOutput values.
// You can construct a concrete instance of `SecurityProjectMapInput` via:
//
//	SecurityProjectMap{ "key": SecurityProjectArgs{...} }
type SecurityProjectMapInput interface {
	pulumi.Input

	ToSecurityProjectMapOutput() SecurityProjectMapOutput
	ToSecurityProjectMapOutputWithContext(context.Context) SecurityProjectMapOutput
}

type SecurityProjectMap map[string]SecurityProjectInput

func (SecurityProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProject)(nil)).Elem()
}

func (i SecurityProjectMap) ToSecurityProjectMapOutput() SecurityProjectMapOutput {
	return i.ToSecurityProjectMapOutputWithContext(context.Background())
}

func (i SecurityProjectMap) ToSecurityProjectMapOutputWithContext(ctx context.Context) SecurityProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityProjectMapOutput)
}

type SecurityProjectOutput struct{ *pulumi.OutputState }

func (SecurityProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityProject)(nil)).Elem()
}

func (o SecurityProjectOutput) ToSecurityProjectOutput() SecurityProjectOutput {
	return o
}

func (o SecurityProjectOutput) ToSecurityProjectOutputWithContext(ctx context.Context) SecurityProjectOutput {
	return o
}

// admin features package (BYOK, BYOIDP, CCS, CCR)
func (o SecurityProjectOutput) AdminFeaturesPackage() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.AdminFeaturesPackage }).(pulumi.StringOutput)
}

// A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
func (o SecurityProjectOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.Alias }).(pulumi.StringOutput)
}

// The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
func (o SecurityProjectOutput) CloudId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.CloudId }).(pulumi.StringOutput)
}

// Basic auth credentials to access the Elasticsearch API.
func (o SecurityProjectOutput) Credentials() SecurityProjectCredentialsOutput {
	return o.ApplyT(func(v *SecurityProject) SecurityProjectCredentialsOutput { return v.Credentials }).(SecurityProjectCredentialsOutput)
}

// The endpoints to access the different apps of the project.
func (o SecurityProjectOutput) Endpoints() SecurityProjectEndpointsOutput {
	return o.ApplyT(func(v *SecurityProject) SecurityProjectEndpointsOutput { return v.Endpoints }).(SecurityProjectEndpointsOutput)
}

// Additional details about the project.
func (o SecurityProjectOutput) Metadata() SecurityProjectMetadataOutput {
	return o.ApplyT(func(v *SecurityProject) SecurityProjectMetadataOutput { return v.Metadata }).(SecurityProjectMetadataOutput)
}

// Descriptive name for a project.
func (o SecurityProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SecurityProjectOutput) ProductTypes() SecurityProjectProductTypeArrayOutput {
	return o.ApplyT(func(v *SecurityProject) SecurityProjectProductTypeArrayOutput { return v.ProductTypes }).(SecurityProjectProductTypeArrayOutput)
}

// Unique human-readable identifier for a region in Elastic Cloud.
func (o SecurityProjectOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.RegionId }).(pulumi.StringOutput)
}

// the type of the project
func (o SecurityProjectOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityProject) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type SecurityProjectArrayOutput struct{ *pulumi.OutputState }

func (SecurityProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityProject)(nil)).Elem()
}

func (o SecurityProjectArrayOutput) ToSecurityProjectArrayOutput() SecurityProjectArrayOutput {
	return o
}

func (o SecurityProjectArrayOutput) ToSecurityProjectArrayOutputWithContext(ctx context.Context) SecurityProjectArrayOutput {
	return o
}

func (o SecurityProjectArrayOutput) Index(i pulumi.IntInput) SecurityProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityProject {
		return vs[0].([]*SecurityProject)[vs[1].(int)]
	}).(SecurityProjectOutput)
}

type SecurityProjectMapOutput struct{ *pulumi.OutputState }

func (SecurityProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityProject)(nil)).Elem()
}

func (o SecurityProjectMapOutput) ToSecurityProjectMapOutput() SecurityProjectMapOutput {
	return o
}

func (o SecurityProjectMapOutput) ToSecurityProjectMapOutputWithContext(ctx context.Context) SecurityProjectMapOutput {
	return o
}

func (o SecurityProjectMapOutput) MapIndex(k pulumi.StringInput) SecurityProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityProject {
		return vs[0].(map[string]*SecurityProject)[vs[1].(string)]
	}).(SecurityProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProjectInput)(nil)).Elem(), &SecurityProject{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProjectArrayInput)(nil)).Elem(), SecurityProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityProjectMapInput)(nil)).Elem(), SecurityProjectMap{})
	pulumi.RegisterOutputType(SecurityProjectOutput{})
	pulumi.RegisterOutputType(SecurityProjectArrayOutput{})
	pulumi.RegisterOutputType(SecurityProjectMapOutput{})
}