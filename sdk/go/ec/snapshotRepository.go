// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-ec/sdk/go/ec/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages Elastic Cloud Enterprise snapshot repositories.
//
//	> **This resource can only be used with Elastic Cloud Enterprise** For Elastic Cloud SaaS please use the elasticstack_elasticsearch_snapshot_repository.
//
// ## Example Usage
//
// ### Azure
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-ec/sdk/go/ec"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"container": "my_container",
//				"client":    "my_alternate_client",
//				"compress":  false,
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = ec.NewSnapshotRepository(ctx, "this", &ec.SnapshotRepositoryArgs{
//				Name: pulumi.String("my-snapshot-repository"),
//				Generic: &ec.SnapshotRepositoryGenericArgs{
//					Type:     pulumi.String("azure"),
//					Settings: pulumi.String(json0),
//				},
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
// ### GCS
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-ec/sdk/go/ec"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"bucket":   "my_bucket",
//				"client":   "my_alternate_client",
//				"compress": false,
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = ec.NewSnapshotRepository(ctx, "this", &ec.SnapshotRepositoryArgs{
//				Name: pulumi.String("my-snapshot-repository"),
//				Generic: &ec.SnapshotRepositoryGenericArgs{
//					Type:     pulumi.String("gcs"),
//					Settings: pulumi.String(json0),
//				},
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
// You can import snapshot repositories using the `name`, for example:
//
// ```sh
// $ pulumi import ec:index/snapshotRepository:SnapshotRepository this my-snapshot-repository
// ```
type SnapshotRepository struct {
	pulumi.CustomResourceState

	// Generic repository settings.
	Generic SnapshotRepositoryGenericPtrOutput `pulumi:"generic"`
	// The name of the snapshot repository configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// S3 repository settings.
	S3 SnapshotRepositoryS3PtrOutput `pulumi:"s3"`
}

// NewSnapshotRepository registers a new resource with the given unique name, arguments, and options.
func NewSnapshotRepository(ctx *pulumi.Context,
	name string, args *SnapshotRepositoryArgs, opts ...pulumi.ResourceOption) (*SnapshotRepository, error) {
	if args == nil {
		args = &SnapshotRepositoryArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SnapshotRepository
	err := ctx.RegisterResource("ec:index/snapshotRepository:SnapshotRepository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSnapshotRepository gets an existing SnapshotRepository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSnapshotRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SnapshotRepositoryState, opts ...pulumi.ResourceOption) (*SnapshotRepository, error) {
	var resource SnapshotRepository
	err := ctx.ReadResource("ec:index/snapshotRepository:SnapshotRepository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SnapshotRepository resources.
type snapshotRepositoryState struct {
	// Generic repository settings.
	Generic *SnapshotRepositoryGeneric `pulumi:"generic"`
	// The name of the snapshot repository configuration.
	Name *string `pulumi:"name"`
	// S3 repository settings.
	S3 *SnapshotRepositoryS3 `pulumi:"s3"`
}

type SnapshotRepositoryState struct {
	// Generic repository settings.
	Generic SnapshotRepositoryGenericPtrInput
	// The name of the snapshot repository configuration.
	Name pulumi.StringPtrInput
	// S3 repository settings.
	S3 SnapshotRepositoryS3PtrInput
}

func (SnapshotRepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotRepositoryState)(nil)).Elem()
}

type snapshotRepositoryArgs struct {
	// Generic repository settings.
	Generic *SnapshotRepositoryGeneric `pulumi:"generic"`
	// The name of the snapshot repository configuration.
	Name *string `pulumi:"name"`
	// S3 repository settings.
	S3 *SnapshotRepositoryS3 `pulumi:"s3"`
}

// The set of arguments for constructing a SnapshotRepository resource.
type SnapshotRepositoryArgs struct {
	// Generic repository settings.
	Generic SnapshotRepositoryGenericPtrInput
	// The name of the snapshot repository configuration.
	Name pulumi.StringPtrInput
	// S3 repository settings.
	S3 SnapshotRepositoryS3PtrInput
}

func (SnapshotRepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotRepositoryArgs)(nil)).Elem()
}

type SnapshotRepositoryInput interface {
	pulumi.Input

	ToSnapshotRepositoryOutput() SnapshotRepositoryOutput
	ToSnapshotRepositoryOutputWithContext(ctx context.Context) SnapshotRepositoryOutput
}

func (*SnapshotRepository) ElementType() reflect.Type {
	return reflect.TypeOf((**SnapshotRepository)(nil)).Elem()
}

func (i *SnapshotRepository) ToSnapshotRepositoryOutput() SnapshotRepositoryOutput {
	return i.ToSnapshotRepositoryOutputWithContext(context.Background())
}

func (i *SnapshotRepository) ToSnapshotRepositoryOutputWithContext(ctx context.Context) SnapshotRepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotRepositoryOutput)
}

// SnapshotRepositoryArrayInput is an input type that accepts SnapshotRepositoryArray and SnapshotRepositoryArrayOutput values.
// You can construct a concrete instance of `SnapshotRepositoryArrayInput` via:
//
//	SnapshotRepositoryArray{ SnapshotRepositoryArgs{...} }
type SnapshotRepositoryArrayInput interface {
	pulumi.Input

	ToSnapshotRepositoryArrayOutput() SnapshotRepositoryArrayOutput
	ToSnapshotRepositoryArrayOutputWithContext(context.Context) SnapshotRepositoryArrayOutput
}

type SnapshotRepositoryArray []SnapshotRepositoryInput

func (SnapshotRepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnapshotRepository)(nil)).Elem()
}

func (i SnapshotRepositoryArray) ToSnapshotRepositoryArrayOutput() SnapshotRepositoryArrayOutput {
	return i.ToSnapshotRepositoryArrayOutputWithContext(context.Background())
}

func (i SnapshotRepositoryArray) ToSnapshotRepositoryArrayOutputWithContext(ctx context.Context) SnapshotRepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotRepositoryArrayOutput)
}

// SnapshotRepositoryMapInput is an input type that accepts SnapshotRepositoryMap and SnapshotRepositoryMapOutput values.
// You can construct a concrete instance of `SnapshotRepositoryMapInput` via:
//
//	SnapshotRepositoryMap{ "key": SnapshotRepositoryArgs{...} }
type SnapshotRepositoryMapInput interface {
	pulumi.Input

	ToSnapshotRepositoryMapOutput() SnapshotRepositoryMapOutput
	ToSnapshotRepositoryMapOutputWithContext(context.Context) SnapshotRepositoryMapOutput
}

type SnapshotRepositoryMap map[string]SnapshotRepositoryInput

func (SnapshotRepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnapshotRepository)(nil)).Elem()
}

func (i SnapshotRepositoryMap) ToSnapshotRepositoryMapOutput() SnapshotRepositoryMapOutput {
	return i.ToSnapshotRepositoryMapOutputWithContext(context.Background())
}

func (i SnapshotRepositoryMap) ToSnapshotRepositoryMapOutputWithContext(ctx context.Context) SnapshotRepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotRepositoryMapOutput)
}

type SnapshotRepositoryOutput struct{ *pulumi.OutputState }

func (SnapshotRepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SnapshotRepository)(nil)).Elem()
}

func (o SnapshotRepositoryOutput) ToSnapshotRepositoryOutput() SnapshotRepositoryOutput {
	return o
}

func (o SnapshotRepositoryOutput) ToSnapshotRepositoryOutputWithContext(ctx context.Context) SnapshotRepositoryOutput {
	return o
}

// Generic repository settings.
func (o SnapshotRepositoryOutput) Generic() SnapshotRepositoryGenericPtrOutput {
	return o.ApplyT(func(v *SnapshotRepository) SnapshotRepositoryGenericPtrOutput { return v.Generic }).(SnapshotRepositoryGenericPtrOutput)
}

// The name of the snapshot repository configuration.
func (o SnapshotRepositoryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SnapshotRepository) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// S3 repository settings.
func (o SnapshotRepositoryOutput) S3() SnapshotRepositoryS3PtrOutput {
	return o.ApplyT(func(v *SnapshotRepository) SnapshotRepositoryS3PtrOutput { return v.S3 }).(SnapshotRepositoryS3PtrOutput)
}

type SnapshotRepositoryArrayOutput struct{ *pulumi.OutputState }

func (SnapshotRepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnapshotRepository)(nil)).Elem()
}

func (o SnapshotRepositoryArrayOutput) ToSnapshotRepositoryArrayOutput() SnapshotRepositoryArrayOutput {
	return o
}

func (o SnapshotRepositoryArrayOutput) ToSnapshotRepositoryArrayOutputWithContext(ctx context.Context) SnapshotRepositoryArrayOutput {
	return o
}

func (o SnapshotRepositoryArrayOutput) Index(i pulumi.IntInput) SnapshotRepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SnapshotRepository {
		return vs[0].([]*SnapshotRepository)[vs[1].(int)]
	}).(SnapshotRepositoryOutput)
}

type SnapshotRepositoryMapOutput struct{ *pulumi.OutputState }

func (SnapshotRepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnapshotRepository)(nil)).Elem()
}

func (o SnapshotRepositoryMapOutput) ToSnapshotRepositoryMapOutput() SnapshotRepositoryMapOutput {
	return o
}

func (o SnapshotRepositoryMapOutput) ToSnapshotRepositoryMapOutputWithContext(ctx context.Context) SnapshotRepositoryMapOutput {
	return o
}

func (o SnapshotRepositoryMapOutput) MapIndex(k pulumi.StringInput) SnapshotRepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SnapshotRepository {
		return vs[0].(map[string]*SnapshotRepository)[vs[1].(string)]
	}).(SnapshotRepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotRepositoryInput)(nil)).Elem(), &SnapshotRepository{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotRepositoryArrayInput)(nil)).Elem(), SnapshotRepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotRepositoryMapInput)(nil)).Elem(), SnapshotRepositoryMap{})
	pulumi.RegisterOutputType(SnapshotRepositoryOutput{})
	pulumi.RegisterOutputType(SnapshotRepositoryArrayOutput{})
	pulumi.RegisterOutputType(SnapshotRepositoryMapOutput{})
}
