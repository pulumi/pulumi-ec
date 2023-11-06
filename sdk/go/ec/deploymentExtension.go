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

// Provides an Elastic Cloud extension resource, which allows extensions to be created, updated, and deleted.
//
//	Extensions allow users of Elastic Cloud to use custom plugins, scripts, or dictionaries to enhance the core functionality of Elasticsearch. Before you install an extension, be sure to check out the supported and official [Elasticsearch plugins](https://www.elastic.co/guide/en/elasticsearch/plugins/current/index.html) already available.
//
//	**Tip :** If you experience timeouts when uploading an extension through a slow network, you might need to increase the timeout setting.
//
// ## Example Usage
//
// ## Import
//
// # Extensions can be imported using the `id`, for example
//
// ```sh
//
//	$ pulumi import ec:index/deploymentExtension:DeploymentExtension name 320b7b540dfc967a7a649c18e2fce4ed
//
// ```
type DeploymentExtension struct {
	pulumi.CustomResourceState

	// Description for the extension
	Description pulumi.StringOutput `pulumi:"description"`
	// The URL to download the extension archive.
	DownloadUrl pulumi.StringOutput `pulumi:"downloadUrl"`
	// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
	ExtensionType pulumi.StringOutput `pulumi:"extensionType"`
	// Hash value of the file. Triggers re-uploading the file on change.
	FileHash pulumi.StringPtrOutput `pulumi:"fileHash"`
	// Local file path to upload as the extension.
	FilePath pulumi.StringPtrOutput `pulumi:"filePath"`
	// The datatime the extension was last modified.
	LastModified pulumi.StringOutput `pulumi:"lastModified"`
	// Name of the extension
	Name pulumi.StringOutput `pulumi:"name"`
	// The size of the extension file in bytes.
	Size pulumi.IntOutput `pulumi:"size"`
	// The extension URL which will be used in the Elastic Cloud deployment plan.
	Url pulumi.StringOutput `pulumi:"url"`
	// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewDeploymentExtension registers a new resource with the given unique name, arguments, and options.
func NewDeploymentExtension(ctx *pulumi.Context,
	name string, args *DeploymentExtensionArgs, opts ...pulumi.ResourceOption) (*DeploymentExtension, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExtensionType == nil {
		return nil, errors.New("invalid value for required argument 'ExtensionType'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeploymentExtension
	err := ctx.RegisterResource("ec:index/deploymentExtension:DeploymentExtension", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentExtension gets an existing DeploymentExtension resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentExtension(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentExtensionState, opts ...pulumi.ResourceOption) (*DeploymentExtension, error) {
	var resource DeploymentExtension
	err := ctx.ReadResource("ec:index/deploymentExtension:DeploymentExtension", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentExtension resources.
type deploymentExtensionState struct {
	// Description for the extension
	Description *string `pulumi:"description"`
	// The URL to download the extension archive.
	DownloadUrl *string `pulumi:"downloadUrl"`
	// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
	ExtensionType *string `pulumi:"extensionType"`
	// Hash value of the file. Triggers re-uploading the file on change.
	FileHash *string `pulumi:"fileHash"`
	// Local file path to upload as the extension.
	FilePath *string `pulumi:"filePath"`
	// The datatime the extension was last modified.
	LastModified *string `pulumi:"lastModified"`
	// Name of the extension
	Name *string `pulumi:"name"`
	// The size of the extension file in bytes.
	Size *int `pulumi:"size"`
	// The extension URL which will be used in the Elastic Cloud deployment plan.
	Url *string `pulumi:"url"`
	// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
	Version *string `pulumi:"version"`
}

type DeploymentExtensionState struct {
	// Description for the extension
	Description pulumi.StringPtrInput
	// The URL to download the extension archive.
	DownloadUrl pulumi.StringPtrInput
	// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
	ExtensionType pulumi.StringPtrInput
	// Hash value of the file. Triggers re-uploading the file on change.
	FileHash pulumi.StringPtrInput
	// Local file path to upload as the extension.
	FilePath pulumi.StringPtrInput
	// The datatime the extension was last modified.
	LastModified pulumi.StringPtrInput
	// Name of the extension
	Name pulumi.StringPtrInput
	// The size of the extension file in bytes.
	Size pulumi.IntPtrInput
	// The extension URL which will be used in the Elastic Cloud deployment plan.
	Url pulumi.StringPtrInput
	// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
	Version pulumi.StringPtrInput
}

func (DeploymentExtensionState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentExtensionState)(nil)).Elem()
}

type deploymentExtensionArgs struct {
	// Description for the extension
	Description *string `pulumi:"description"`
	// The URL to download the extension archive.
	DownloadUrl *string `pulumi:"downloadUrl"`
	// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
	ExtensionType string `pulumi:"extensionType"`
	// Hash value of the file. Triggers re-uploading the file on change.
	FileHash *string `pulumi:"fileHash"`
	// Local file path to upload as the extension.
	FilePath *string `pulumi:"filePath"`
	// Name of the extension
	Name *string `pulumi:"name"`
	// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a DeploymentExtension resource.
type DeploymentExtensionArgs struct {
	// Description for the extension
	Description pulumi.StringPtrInput
	// The URL to download the extension archive.
	DownloadUrl pulumi.StringPtrInput
	// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
	ExtensionType pulumi.StringInput
	// Hash value of the file. Triggers re-uploading the file on change.
	FileHash pulumi.StringPtrInput
	// Local file path to upload as the extension.
	FilePath pulumi.StringPtrInput
	// Name of the extension
	Name pulumi.StringPtrInput
	// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
	Version pulumi.StringInput
}

func (DeploymentExtensionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentExtensionArgs)(nil)).Elem()
}

type DeploymentExtensionInput interface {
	pulumi.Input

	ToDeploymentExtensionOutput() DeploymentExtensionOutput
	ToDeploymentExtensionOutputWithContext(ctx context.Context) DeploymentExtensionOutput
}

func (*DeploymentExtension) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentExtension)(nil)).Elem()
}

func (i *DeploymentExtension) ToDeploymentExtensionOutput() DeploymentExtensionOutput {
	return i.ToDeploymentExtensionOutputWithContext(context.Background())
}

func (i *DeploymentExtension) ToDeploymentExtensionOutputWithContext(ctx context.Context) DeploymentExtensionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentExtensionOutput)
}

// DeploymentExtensionArrayInput is an input type that accepts DeploymentExtensionArray and DeploymentExtensionArrayOutput values.
// You can construct a concrete instance of `DeploymentExtensionArrayInput` via:
//
//	DeploymentExtensionArray{ DeploymentExtensionArgs{...} }
type DeploymentExtensionArrayInput interface {
	pulumi.Input

	ToDeploymentExtensionArrayOutput() DeploymentExtensionArrayOutput
	ToDeploymentExtensionArrayOutputWithContext(context.Context) DeploymentExtensionArrayOutput
}

type DeploymentExtensionArray []DeploymentExtensionInput

func (DeploymentExtensionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentExtension)(nil)).Elem()
}

func (i DeploymentExtensionArray) ToDeploymentExtensionArrayOutput() DeploymentExtensionArrayOutput {
	return i.ToDeploymentExtensionArrayOutputWithContext(context.Background())
}

func (i DeploymentExtensionArray) ToDeploymentExtensionArrayOutputWithContext(ctx context.Context) DeploymentExtensionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentExtensionArrayOutput)
}

// DeploymentExtensionMapInput is an input type that accepts DeploymentExtensionMap and DeploymentExtensionMapOutput values.
// You can construct a concrete instance of `DeploymentExtensionMapInput` via:
//
//	DeploymentExtensionMap{ "key": DeploymentExtensionArgs{...} }
type DeploymentExtensionMapInput interface {
	pulumi.Input

	ToDeploymentExtensionMapOutput() DeploymentExtensionMapOutput
	ToDeploymentExtensionMapOutputWithContext(context.Context) DeploymentExtensionMapOutput
}

type DeploymentExtensionMap map[string]DeploymentExtensionInput

func (DeploymentExtensionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentExtension)(nil)).Elem()
}

func (i DeploymentExtensionMap) ToDeploymentExtensionMapOutput() DeploymentExtensionMapOutput {
	return i.ToDeploymentExtensionMapOutputWithContext(context.Background())
}

func (i DeploymentExtensionMap) ToDeploymentExtensionMapOutputWithContext(ctx context.Context) DeploymentExtensionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentExtensionMapOutput)
}

type DeploymentExtensionOutput struct{ *pulumi.OutputState }

func (DeploymentExtensionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentExtension)(nil)).Elem()
}

func (o DeploymentExtensionOutput) ToDeploymentExtensionOutput() DeploymentExtensionOutput {
	return o
}

func (o DeploymentExtensionOutput) ToDeploymentExtensionOutputWithContext(ctx context.Context) DeploymentExtensionOutput {
	return o
}

// Description for the extension
func (o DeploymentExtensionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The URL to download the extension archive.
func (o DeploymentExtensionOutput) DownloadUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.DownloadUrl }).(pulumi.StringOutput)
}

// Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
func (o DeploymentExtensionOutput) ExtensionType() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.ExtensionType }).(pulumi.StringOutput)
}

// Hash value of the file. Triggers re-uploading the file on change.
func (o DeploymentExtensionOutput) FileHash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringPtrOutput { return v.FileHash }).(pulumi.StringPtrOutput)
}

// Local file path to upload as the extension.
func (o DeploymentExtensionOutput) FilePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringPtrOutput { return v.FilePath }).(pulumi.StringPtrOutput)
}

// The datatime the extension was last modified.
func (o DeploymentExtensionOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.LastModified }).(pulumi.StringOutput)
}

// Name of the extension
func (o DeploymentExtensionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The size of the extension file in bytes.
func (o DeploymentExtensionOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The extension URL which will be used in the Elastic Cloud deployment plan.
func (o DeploymentExtensionOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
func (o DeploymentExtensionOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentExtension) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type DeploymentExtensionArrayOutput struct{ *pulumi.OutputState }

func (DeploymentExtensionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentExtension)(nil)).Elem()
}

func (o DeploymentExtensionArrayOutput) ToDeploymentExtensionArrayOutput() DeploymentExtensionArrayOutput {
	return o
}

func (o DeploymentExtensionArrayOutput) ToDeploymentExtensionArrayOutputWithContext(ctx context.Context) DeploymentExtensionArrayOutput {
	return o
}

func (o DeploymentExtensionArrayOutput) Index(i pulumi.IntInput) DeploymentExtensionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentExtension {
		return vs[0].([]*DeploymentExtension)[vs[1].(int)]
	}).(DeploymentExtensionOutput)
}

type DeploymentExtensionMapOutput struct{ *pulumi.OutputState }

func (DeploymentExtensionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentExtension)(nil)).Elem()
}

func (o DeploymentExtensionMapOutput) ToDeploymentExtensionMapOutput() DeploymentExtensionMapOutput {
	return o
}

func (o DeploymentExtensionMapOutput) ToDeploymentExtensionMapOutputWithContext(ctx context.Context) DeploymentExtensionMapOutput {
	return o
}

func (o DeploymentExtensionMapOutput) MapIndex(k pulumi.StringInput) DeploymentExtensionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentExtension {
		return vs[0].(map[string]*DeploymentExtension)[vs[1].(string)]
	}).(DeploymentExtensionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentExtensionInput)(nil)).Elem(), &DeploymentExtension{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentExtensionArrayInput)(nil)).Elem(), DeploymentExtensionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentExtensionMapInput)(nil)).Elem(), DeploymentExtensionMap{})
	pulumi.RegisterOutputType(DeploymentExtensionOutput{})
	pulumi.RegisterOutputType(DeploymentExtensionArrayOutput{})
	pulumi.RegisterOutputType(DeploymentExtensionMapOutput{})
}
