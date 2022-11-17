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
//			_, err := ec.LookupDeployment(ctx, &GetDeploymentArgs{
//				Id: "320b7b540dfc967a7a649c18e2fce4ed",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleDeploymentTrafficFilter, err := ec.NewDeploymentTrafficFilter(ctx, "exampleDeploymentTrafficFilter", &ec.DeploymentTrafficFilterArgs{
//				Region: pulumi.String("us-east-1"),
//				Type:   pulumi.String("ip"),
//				Rules: DeploymentTrafficFilterRuleArray{
//					&DeploymentTrafficFilterRuleArgs{
//						Source: pulumi.String("0.0.0.0/0"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec.NewDeploymentTrafficFilterAssociation(ctx, "exampleDeploymentTrafficFilterAssociation", &ec.DeploymentTrafficFilterAssociationArgs{
//				TrafficFilterId: exampleDeploymentTrafficFilter.ID(),
//				DeploymentId:    pulumi.Any(ec_deployment.Example.Id),
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
// Import is not supported on this resource.
type DeploymentTrafficFilterAssociation struct {
	pulumi.CustomResourceState

	// Deployment ID of the deployment to which the traffic filter rule is attached.
	DeploymentId pulumi.StringOutput `pulumi:"deploymentId"`
	// Traffic filter ID of the rule to use for the attachment.
	TrafficFilterId pulumi.StringOutput `pulumi:"trafficFilterId"`
}

// NewDeploymentTrafficFilterAssociation registers a new resource with the given unique name, arguments, and options.
func NewDeploymentTrafficFilterAssociation(ctx *pulumi.Context,
	name string, args *DeploymentTrafficFilterAssociationArgs, opts ...pulumi.ResourceOption) (*DeploymentTrafficFilterAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentId'")
	}
	if args.TrafficFilterId == nil {
		return nil, errors.New("invalid value for required argument 'TrafficFilterId'")
	}
	var resource DeploymentTrafficFilterAssociation
	err := ctx.RegisterResource("ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentTrafficFilterAssociation gets an existing DeploymentTrafficFilterAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentTrafficFilterAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentTrafficFilterAssociationState, opts ...pulumi.ResourceOption) (*DeploymentTrafficFilterAssociation, error) {
	var resource DeploymentTrafficFilterAssociation
	err := ctx.ReadResource("ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentTrafficFilterAssociation resources.
type deploymentTrafficFilterAssociationState struct {
	// Deployment ID of the deployment to which the traffic filter rule is attached.
	DeploymentId *string `pulumi:"deploymentId"`
	// Traffic filter ID of the rule to use for the attachment.
	TrafficFilterId *string `pulumi:"trafficFilterId"`
}

type DeploymentTrafficFilterAssociationState struct {
	// Deployment ID of the deployment to which the traffic filter rule is attached.
	DeploymentId pulumi.StringPtrInput
	// Traffic filter ID of the rule to use for the attachment.
	TrafficFilterId pulumi.StringPtrInput
}

func (DeploymentTrafficFilterAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentTrafficFilterAssociationState)(nil)).Elem()
}

type deploymentTrafficFilterAssociationArgs struct {
	// Deployment ID of the deployment to which the traffic filter rule is attached.
	DeploymentId string `pulumi:"deploymentId"`
	// Traffic filter ID of the rule to use for the attachment.
	TrafficFilterId string `pulumi:"trafficFilterId"`
}

// The set of arguments for constructing a DeploymentTrafficFilterAssociation resource.
type DeploymentTrafficFilterAssociationArgs struct {
	// Deployment ID of the deployment to which the traffic filter rule is attached.
	DeploymentId pulumi.StringInput
	// Traffic filter ID of the rule to use for the attachment.
	TrafficFilterId pulumi.StringInput
}

func (DeploymentTrafficFilterAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentTrafficFilterAssociationArgs)(nil)).Elem()
}

type DeploymentTrafficFilterAssociationInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterAssociationOutput() DeploymentTrafficFilterAssociationOutput
	ToDeploymentTrafficFilterAssociationOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationOutput
}

func (*DeploymentTrafficFilterAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (i *DeploymentTrafficFilterAssociation) ToDeploymentTrafficFilterAssociationOutput() DeploymentTrafficFilterAssociationOutput {
	return i.ToDeploymentTrafficFilterAssociationOutputWithContext(context.Background())
}

func (i *DeploymentTrafficFilterAssociation) ToDeploymentTrafficFilterAssociationOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterAssociationOutput)
}

// DeploymentTrafficFilterAssociationArrayInput is an input type that accepts DeploymentTrafficFilterAssociationArray and DeploymentTrafficFilterAssociationArrayOutput values.
// You can construct a concrete instance of `DeploymentTrafficFilterAssociationArrayInput` via:
//
//	DeploymentTrafficFilterAssociationArray{ DeploymentTrafficFilterAssociationArgs{...} }
type DeploymentTrafficFilterAssociationArrayInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterAssociationArrayOutput() DeploymentTrafficFilterAssociationArrayOutput
	ToDeploymentTrafficFilterAssociationArrayOutputWithContext(context.Context) DeploymentTrafficFilterAssociationArrayOutput
}

type DeploymentTrafficFilterAssociationArray []DeploymentTrafficFilterAssociationInput

func (DeploymentTrafficFilterAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (i DeploymentTrafficFilterAssociationArray) ToDeploymentTrafficFilterAssociationArrayOutput() DeploymentTrafficFilterAssociationArrayOutput {
	return i.ToDeploymentTrafficFilterAssociationArrayOutputWithContext(context.Background())
}

func (i DeploymentTrafficFilterAssociationArray) ToDeploymentTrafficFilterAssociationArrayOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterAssociationArrayOutput)
}

// DeploymentTrafficFilterAssociationMapInput is an input type that accepts DeploymentTrafficFilterAssociationMap and DeploymentTrafficFilterAssociationMapOutput values.
// You can construct a concrete instance of `DeploymentTrafficFilterAssociationMapInput` via:
//
//	DeploymentTrafficFilterAssociationMap{ "key": DeploymentTrafficFilterAssociationArgs{...} }
type DeploymentTrafficFilterAssociationMapInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterAssociationMapOutput() DeploymentTrafficFilterAssociationMapOutput
	ToDeploymentTrafficFilterAssociationMapOutputWithContext(context.Context) DeploymentTrafficFilterAssociationMapOutput
}

type DeploymentTrafficFilterAssociationMap map[string]DeploymentTrafficFilterAssociationInput

func (DeploymentTrafficFilterAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (i DeploymentTrafficFilterAssociationMap) ToDeploymentTrafficFilterAssociationMapOutput() DeploymentTrafficFilterAssociationMapOutput {
	return i.ToDeploymentTrafficFilterAssociationMapOutputWithContext(context.Background())
}

func (i DeploymentTrafficFilterAssociationMap) ToDeploymentTrafficFilterAssociationMapOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterAssociationMapOutput)
}

type DeploymentTrafficFilterAssociationOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (o DeploymentTrafficFilterAssociationOutput) ToDeploymentTrafficFilterAssociationOutput() DeploymentTrafficFilterAssociationOutput {
	return o
}

func (o DeploymentTrafficFilterAssociationOutput) ToDeploymentTrafficFilterAssociationOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationOutput {
	return o
}

type DeploymentTrafficFilterAssociationArrayOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (o DeploymentTrafficFilterAssociationArrayOutput) ToDeploymentTrafficFilterAssociationArrayOutput() DeploymentTrafficFilterAssociationArrayOutput {
	return o
}

func (o DeploymentTrafficFilterAssociationArrayOutput) ToDeploymentTrafficFilterAssociationArrayOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationArrayOutput {
	return o
}

func (o DeploymentTrafficFilterAssociationArrayOutput) Index(i pulumi.IntInput) DeploymentTrafficFilterAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentTrafficFilterAssociation {
		return vs[0].([]*DeploymentTrafficFilterAssociation)[vs[1].(int)]
	}).(DeploymentTrafficFilterAssociationOutput)
}

type DeploymentTrafficFilterAssociationMapOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentTrafficFilterAssociation)(nil)).Elem()
}

func (o DeploymentTrafficFilterAssociationMapOutput) ToDeploymentTrafficFilterAssociationMapOutput() DeploymentTrafficFilterAssociationMapOutput {
	return o
}

func (o DeploymentTrafficFilterAssociationMapOutput) ToDeploymentTrafficFilterAssociationMapOutputWithContext(ctx context.Context) DeploymentTrafficFilterAssociationMapOutput {
	return o
}

func (o DeploymentTrafficFilterAssociationMapOutput) MapIndex(k pulumi.StringInput) DeploymentTrafficFilterAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentTrafficFilterAssociation {
		return vs[0].(map[string]*DeploymentTrafficFilterAssociation)[vs[1].(string)]
	}).(DeploymentTrafficFilterAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterAssociationInput)(nil)).Elem(), &DeploymentTrafficFilterAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterAssociationArrayInput)(nil)).Elem(), DeploymentTrafficFilterAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterAssociationMapInput)(nil)).Elem(), DeploymentTrafficFilterAssociationMap{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterAssociationOutput{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterAssociationArrayOutput{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterAssociationMapOutput{})
}
