// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// These examples show how to use the resource at a basic level, and can be copied. This resource becomes really useful when combined with other data providers, like vault or similar.
// ### Adding a new keystore setting to your deployment
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
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleKeystore, err := ec.NewDeployment(ctx, "exampleKeystore", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch:        nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeploymentElasticsearchKeystore(ctx, "secureUrl", &ec.DeploymentElasticsearchKeystoreArgs{
// 			DeploymentId: exampleKeystore.ID(),
// 			SettingName:  pulumi.String("xpack.notification.slack.account.hello.secure_url"),
// 			Value:        pulumi.String("http://my-secure-url.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Adding credentials to use GCS as a snapshot repository
//
// For up-to-date documentation on the `settingName`, refer to the [ESS documentation](https://www.elastic.co/guide/en/cloud/current/ec-gcs-snapshotting.html#ec-gcs-service-account-key).
//
// ```go
// package main
//
// import (
// 	"io/ioutil"
//
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func readFileOrPanic(path string) pulumi.StringPtrInput {
// 	data, err := ioutil.ReadFile(path)
// 	if err != nil {
// 		panic(err.Error())
// 	}
// 	return pulumi.String(string(data))
// }
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleKeystore, err := ec.NewDeployment(ctx, "exampleKeystore", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch:        nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeploymentElasticsearchKeystore(ctx, "gcsCredential", &ec.DeploymentElasticsearchKeystoreArgs{
// 			DeploymentId: exampleKeystore.ID(),
// 			SettingName:  pulumi.String("gcs.client.default.credentials_file"),
// 			Value:        readFileOrPanic("service-account-key.json"),
// 			AsFile:       pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes reference
//
// There are no additional attributes exported by this resource other than the referenced arguments.
//
// ## Import
//
// This resource cannot be imported.
type DeploymentElasticsearchKeystore struct {
	pulumi.CustomResourceState

	// if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
	AsFile pulumi.BoolPtrOutput `pulumi:"asFile"`
	// Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
	DeploymentId pulumi.StringOutput `pulumi:"deploymentId"`
	// Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
	SettingName pulumi.StringOutput `pulumi:"settingName"`
	// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewDeploymentElasticsearchKeystore registers a new resource with the given unique name, arguments, and options.
func NewDeploymentElasticsearchKeystore(ctx *pulumi.Context,
	name string, args *DeploymentElasticsearchKeystoreArgs, opts ...pulumi.ResourceOption) (*DeploymentElasticsearchKeystore, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentId'")
	}
	if args.SettingName == nil {
		return nil, errors.New("invalid value for required argument 'SettingName'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	var resource DeploymentElasticsearchKeystore
	err := ctx.RegisterResource("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentElasticsearchKeystore gets an existing DeploymentElasticsearchKeystore resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentElasticsearchKeystore(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentElasticsearchKeystoreState, opts ...pulumi.ResourceOption) (*DeploymentElasticsearchKeystore, error) {
	var resource DeploymentElasticsearchKeystore
	err := ctx.ReadResource("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentElasticsearchKeystore resources.
type deploymentElasticsearchKeystoreState struct {
	// if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
	AsFile *bool `pulumi:"asFile"`
	// Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
	DeploymentId *string `pulumi:"deploymentId"`
	// Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
	SettingName *string `pulumi:"settingName"`
	// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
	Value *string `pulumi:"value"`
}

type DeploymentElasticsearchKeystoreState struct {
	// if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
	AsFile pulumi.BoolPtrInput
	// Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
	DeploymentId pulumi.StringPtrInput
	// Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
	SettingName pulumi.StringPtrInput
	// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
	Value pulumi.StringPtrInput
}

func (DeploymentElasticsearchKeystoreState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentElasticsearchKeystoreState)(nil)).Elem()
}

type deploymentElasticsearchKeystoreArgs struct {
	// if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
	AsFile *bool `pulumi:"asFile"`
	// Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
	DeploymentId string `pulumi:"deploymentId"`
	// Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
	SettingName string `pulumi:"settingName"`
	// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a DeploymentElasticsearchKeystore resource.
type DeploymentElasticsearchKeystoreArgs struct {
	// if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
	AsFile pulumi.BoolPtrInput
	// Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
	DeploymentId pulumi.StringInput
	// Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
	SettingName pulumi.StringInput
	// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
	Value pulumi.StringInput
}

func (DeploymentElasticsearchKeystoreArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentElasticsearchKeystoreArgs)(nil)).Elem()
}

type DeploymentElasticsearchKeystoreInput interface {
	pulumi.Input

	ToDeploymentElasticsearchKeystoreOutput() DeploymentElasticsearchKeystoreOutput
	ToDeploymentElasticsearchKeystoreOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreOutput
}

func (*DeploymentElasticsearchKeystore) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (i *DeploymentElasticsearchKeystore) ToDeploymentElasticsearchKeystoreOutput() DeploymentElasticsearchKeystoreOutput {
	return i.ToDeploymentElasticsearchKeystoreOutputWithContext(context.Background())
}

func (i *DeploymentElasticsearchKeystore) ToDeploymentElasticsearchKeystoreOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentElasticsearchKeystoreOutput)
}

// DeploymentElasticsearchKeystoreArrayInput is an input type that accepts DeploymentElasticsearchKeystoreArray and DeploymentElasticsearchKeystoreArrayOutput values.
// You can construct a concrete instance of `DeploymentElasticsearchKeystoreArrayInput` via:
//
//          DeploymentElasticsearchKeystoreArray{ DeploymentElasticsearchKeystoreArgs{...} }
type DeploymentElasticsearchKeystoreArrayInput interface {
	pulumi.Input

	ToDeploymentElasticsearchKeystoreArrayOutput() DeploymentElasticsearchKeystoreArrayOutput
	ToDeploymentElasticsearchKeystoreArrayOutputWithContext(context.Context) DeploymentElasticsearchKeystoreArrayOutput
}

type DeploymentElasticsearchKeystoreArray []DeploymentElasticsearchKeystoreInput

func (DeploymentElasticsearchKeystoreArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (i DeploymentElasticsearchKeystoreArray) ToDeploymentElasticsearchKeystoreArrayOutput() DeploymentElasticsearchKeystoreArrayOutput {
	return i.ToDeploymentElasticsearchKeystoreArrayOutputWithContext(context.Background())
}

func (i DeploymentElasticsearchKeystoreArray) ToDeploymentElasticsearchKeystoreArrayOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentElasticsearchKeystoreArrayOutput)
}

// DeploymentElasticsearchKeystoreMapInput is an input type that accepts DeploymentElasticsearchKeystoreMap and DeploymentElasticsearchKeystoreMapOutput values.
// You can construct a concrete instance of `DeploymentElasticsearchKeystoreMapInput` via:
//
//          DeploymentElasticsearchKeystoreMap{ "key": DeploymentElasticsearchKeystoreArgs{...} }
type DeploymentElasticsearchKeystoreMapInput interface {
	pulumi.Input

	ToDeploymentElasticsearchKeystoreMapOutput() DeploymentElasticsearchKeystoreMapOutput
	ToDeploymentElasticsearchKeystoreMapOutputWithContext(context.Context) DeploymentElasticsearchKeystoreMapOutput
}

type DeploymentElasticsearchKeystoreMap map[string]DeploymentElasticsearchKeystoreInput

func (DeploymentElasticsearchKeystoreMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (i DeploymentElasticsearchKeystoreMap) ToDeploymentElasticsearchKeystoreMapOutput() DeploymentElasticsearchKeystoreMapOutput {
	return i.ToDeploymentElasticsearchKeystoreMapOutputWithContext(context.Background())
}

func (i DeploymentElasticsearchKeystoreMap) ToDeploymentElasticsearchKeystoreMapOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentElasticsearchKeystoreMapOutput)
}

type DeploymentElasticsearchKeystoreOutput struct{ *pulumi.OutputState }

func (DeploymentElasticsearchKeystoreOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (o DeploymentElasticsearchKeystoreOutput) ToDeploymentElasticsearchKeystoreOutput() DeploymentElasticsearchKeystoreOutput {
	return o
}

func (o DeploymentElasticsearchKeystoreOutput) ToDeploymentElasticsearchKeystoreOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreOutput {
	return o
}

type DeploymentElasticsearchKeystoreArrayOutput struct{ *pulumi.OutputState }

func (DeploymentElasticsearchKeystoreArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (o DeploymentElasticsearchKeystoreArrayOutput) ToDeploymentElasticsearchKeystoreArrayOutput() DeploymentElasticsearchKeystoreArrayOutput {
	return o
}

func (o DeploymentElasticsearchKeystoreArrayOutput) ToDeploymentElasticsearchKeystoreArrayOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreArrayOutput {
	return o
}

func (o DeploymentElasticsearchKeystoreArrayOutput) Index(i pulumi.IntInput) DeploymentElasticsearchKeystoreOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentElasticsearchKeystore {
		return vs[0].([]*DeploymentElasticsearchKeystore)[vs[1].(int)]
	}).(DeploymentElasticsearchKeystoreOutput)
}

type DeploymentElasticsearchKeystoreMapOutput struct{ *pulumi.OutputState }

func (DeploymentElasticsearchKeystoreMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentElasticsearchKeystore)(nil)).Elem()
}

func (o DeploymentElasticsearchKeystoreMapOutput) ToDeploymentElasticsearchKeystoreMapOutput() DeploymentElasticsearchKeystoreMapOutput {
	return o
}

func (o DeploymentElasticsearchKeystoreMapOutput) ToDeploymentElasticsearchKeystoreMapOutputWithContext(ctx context.Context) DeploymentElasticsearchKeystoreMapOutput {
	return o
}

func (o DeploymentElasticsearchKeystoreMapOutput) MapIndex(k pulumi.StringInput) DeploymentElasticsearchKeystoreOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentElasticsearchKeystore {
		return vs[0].(map[string]*DeploymentElasticsearchKeystore)[vs[1].(string)]
	}).(DeploymentElasticsearchKeystoreOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentElasticsearchKeystoreInput)(nil)).Elem(), &DeploymentElasticsearchKeystore{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentElasticsearchKeystoreArrayInput)(nil)).Elem(), DeploymentElasticsearchKeystoreArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentElasticsearchKeystoreMapInput)(nil)).Elem(), DeploymentElasticsearchKeystoreMap{})
	pulumi.RegisterOutputType(DeploymentElasticsearchKeystoreOutput{})
	pulumi.RegisterOutputType(DeploymentElasticsearchKeystoreArrayOutput{})
	pulumi.RegisterOutputType(DeploymentElasticsearchKeystoreMapOutput{})
}
