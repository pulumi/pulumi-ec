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

// ## Example Usage
// ### IP based traffic filter
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
//			latest, err := ec.GetStack(ctx, &ec.GetStackArgs{
//				VersionRegex: "latest",
//				Region:       "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := ec.NewDeploymentTrafficFilter(ctx, "example", &ec.DeploymentTrafficFilterArgs{
//				Region: pulumi.String("us-east-1"),
//				Type:   pulumi.String("ip"),
//				Rules: ec.DeploymentTrafficFilterRuleArray{
//					&ec.DeploymentTrafficFilterRuleArgs{
//						Source: pulumi.String("0.0.0.0/0"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec.NewDeployment(ctx, "exampleMinimal", &ec.DeploymentArgs{
//				Region:               pulumi.String("us-east-1"),
//				Version:              *pulumi.String(latest.Version),
//				DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
//				TrafficFilters: pulumi.StringArray{
//					example.ID(),
//				},
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
// ### Azure Private Link traffic filter
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
//			region := azure_australiaeast
//			latest, err := ec.GetStack(ctx, &ec.GetStackArgs{
//				VersionRegex: "latest",
//				Region:       region,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			azure, err := ec.NewDeploymentTrafficFilter(ctx, "azure", &ec.DeploymentTrafficFilterArgs{
//				Region: pulumi.Any(region),
//				Type:   pulumi.String("azure_private_endpoint"),
//				Rules: ec.DeploymentTrafficFilterRuleArray{
//					&ec.DeploymentTrafficFilterRuleArgs{
//						AzureEndpointName: pulumi.String("my-azure-pl"),
//						AzureEndpointGuid: pulumi.String("78c64959-fd88-41cc-81ac-1cfcdb1ac32e"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec.NewDeployment(ctx, "exampleMinimal", &ec.DeploymentArgs{
//				Region:               pulumi.Any(region),
//				Version:              *pulumi.String(latest.Version),
//				DeploymentTemplateId: pulumi.String("azure-io-optimized-v3"),
//				TrafficFilters: pulumi.StringArray{
//					azure.ID(),
//				},
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
//
// ###GCP Private Service Connect traffic filter
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
//			region := asia_east1
//			latest, err := ec.GetStack(ctx, &ec.GetStackArgs{
//				VersionRegex: "latest",
//				Region:       region,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			gcpPsc, err := ec.NewDeploymentTrafficFilter(ctx, "gcpPsc", &ec.DeploymentTrafficFilterArgs{
//				Region: pulumi.Any(region),
//				Type:   pulumi.String("gcp_private_service_connect_endpoint"),
//				Rules: ec.DeploymentTrafficFilterRuleArray{
//					&ec.DeploymentTrafficFilterRuleArgs{
//						Source: pulumi.String("18446744072646845332"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec.NewDeployment(ctx, "exampleMinimal", &ec.DeploymentArgs{
//				Region:               pulumi.Any(region),
//				Version:              *pulumi.String(latest.Version),
//				DeploymentTemplateId: pulumi.String("gcp-storage-optimized"),
//				TrafficFilters: pulumi.StringArray{
//					gcpPsc.ID(),
//				},
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
//
// ## Import
//
// Traffic filters can be imported using the `id`, for example:
//
// ```sh
// $ pulumi import ec:index/deploymentTrafficFilter:DeploymentTrafficFilter name 320b7b540dfc967a7a649c18e2fce4ed
// ```
type DeploymentTrafficFilter struct {
	pulumi.CustomResourceState

	// Description of this individual rule
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
	IncludeByDefault pulumi.BoolOutput `pulumi:"includeByDefault"`
	// Name of the ruleset
	Name pulumi.StringOutput `pulumi:"name"`
	// Filter region, the ruleset can only be attached to deployments in the specific region
	Region pulumi.StringOutput `pulumi:"region"`
	// Set of rules, which the ruleset is made of.
	Rules DeploymentTrafficFilterRuleArrayOutput `pulumi:"rules"`
	// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDeploymentTrafficFilter registers a new resource with the given unique name, arguments, and options.
func NewDeploymentTrafficFilter(ctx *pulumi.Context,
	name string, args *DeploymentTrafficFilterArgs, opts ...pulumi.ResourceOption) (*DeploymentTrafficFilter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeploymentTrafficFilter
	err := ctx.RegisterResource("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeploymentTrafficFilter gets an existing DeploymentTrafficFilter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeploymentTrafficFilter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentTrafficFilterState, opts ...pulumi.ResourceOption) (*DeploymentTrafficFilter, error) {
	var resource DeploymentTrafficFilter
	err := ctx.ReadResource("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeploymentTrafficFilter resources.
type deploymentTrafficFilterState struct {
	// Description of this individual rule
	Description *string `pulumi:"description"`
	// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
	IncludeByDefault *bool `pulumi:"includeByDefault"`
	// Name of the ruleset
	Name *string `pulumi:"name"`
	// Filter region, the ruleset can only be attached to deployments in the specific region
	Region *string `pulumi:"region"`
	// Set of rules, which the ruleset is made of.
	Rules []DeploymentTrafficFilterRule `pulumi:"rules"`
	// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
	Type *string `pulumi:"type"`
}

type DeploymentTrafficFilterState struct {
	// Description of this individual rule
	Description pulumi.StringPtrInput
	// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
	IncludeByDefault pulumi.BoolPtrInput
	// Name of the ruleset
	Name pulumi.StringPtrInput
	// Filter region, the ruleset can only be attached to deployments in the specific region
	Region pulumi.StringPtrInput
	// Set of rules, which the ruleset is made of.
	Rules DeploymentTrafficFilterRuleArrayInput
	// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
	Type pulumi.StringPtrInput
}

func (DeploymentTrafficFilterState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentTrafficFilterState)(nil)).Elem()
}

type deploymentTrafficFilterArgs struct {
	// Description of this individual rule
	Description *string `pulumi:"description"`
	// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
	IncludeByDefault *bool `pulumi:"includeByDefault"`
	// Name of the ruleset
	Name *string `pulumi:"name"`
	// Filter region, the ruleset can only be attached to deployments in the specific region
	Region string `pulumi:"region"`
	// Set of rules, which the ruleset is made of.
	Rules []DeploymentTrafficFilterRule `pulumi:"rules"`
	// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DeploymentTrafficFilter resource.
type DeploymentTrafficFilterArgs struct {
	// Description of this individual rule
	Description pulumi.StringPtrInput
	// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
	IncludeByDefault pulumi.BoolPtrInput
	// Name of the ruleset
	Name pulumi.StringPtrInput
	// Filter region, the ruleset can only be attached to deployments in the specific region
	Region pulumi.StringInput
	// Set of rules, which the ruleset is made of.
	Rules DeploymentTrafficFilterRuleArrayInput
	// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
	Type pulumi.StringInput
}

func (DeploymentTrafficFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentTrafficFilterArgs)(nil)).Elem()
}

type DeploymentTrafficFilterInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterOutput() DeploymentTrafficFilterOutput
	ToDeploymentTrafficFilterOutputWithContext(ctx context.Context) DeploymentTrafficFilterOutput
}

func (*DeploymentTrafficFilter) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentTrafficFilter)(nil)).Elem()
}

func (i *DeploymentTrafficFilter) ToDeploymentTrafficFilterOutput() DeploymentTrafficFilterOutput {
	return i.ToDeploymentTrafficFilterOutputWithContext(context.Background())
}

func (i *DeploymentTrafficFilter) ToDeploymentTrafficFilterOutputWithContext(ctx context.Context) DeploymentTrafficFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterOutput)
}

// DeploymentTrafficFilterArrayInput is an input type that accepts DeploymentTrafficFilterArray and DeploymentTrafficFilterArrayOutput values.
// You can construct a concrete instance of `DeploymentTrafficFilterArrayInput` via:
//
//	DeploymentTrafficFilterArray{ DeploymentTrafficFilterArgs{...} }
type DeploymentTrafficFilterArrayInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterArrayOutput() DeploymentTrafficFilterArrayOutput
	ToDeploymentTrafficFilterArrayOutputWithContext(context.Context) DeploymentTrafficFilterArrayOutput
}

type DeploymentTrafficFilterArray []DeploymentTrafficFilterInput

func (DeploymentTrafficFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentTrafficFilter)(nil)).Elem()
}

func (i DeploymentTrafficFilterArray) ToDeploymentTrafficFilterArrayOutput() DeploymentTrafficFilterArrayOutput {
	return i.ToDeploymentTrafficFilterArrayOutputWithContext(context.Background())
}

func (i DeploymentTrafficFilterArray) ToDeploymentTrafficFilterArrayOutputWithContext(ctx context.Context) DeploymentTrafficFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterArrayOutput)
}

// DeploymentTrafficFilterMapInput is an input type that accepts DeploymentTrafficFilterMap and DeploymentTrafficFilterMapOutput values.
// You can construct a concrete instance of `DeploymentTrafficFilterMapInput` via:
//
//	DeploymentTrafficFilterMap{ "key": DeploymentTrafficFilterArgs{...} }
type DeploymentTrafficFilterMapInput interface {
	pulumi.Input

	ToDeploymentTrafficFilterMapOutput() DeploymentTrafficFilterMapOutput
	ToDeploymentTrafficFilterMapOutputWithContext(context.Context) DeploymentTrafficFilterMapOutput
}

type DeploymentTrafficFilterMap map[string]DeploymentTrafficFilterInput

func (DeploymentTrafficFilterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentTrafficFilter)(nil)).Elem()
}

func (i DeploymentTrafficFilterMap) ToDeploymentTrafficFilterMapOutput() DeploymentTrafficFilterMapOutput {
	return i.ToDeploymentTrafficFilterMapOutputWithContext(context.Background())
}

func (i DeploymentTrafficFilterMap) ToDeploymentTrafficFilterMapOutputWithContext(ctx context.Context) DeploymentTrafficFilterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentTrafficFilterMapOutput)
}

type DeploymentTrafficFilterOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeploymentTrafficFilter)(nil)).Elem()
}

func (o DeploymentTrafficFilterOutput) ToDeploymentTrafficFilterOutput() DeploymentTrafficFilterOutput {
	return o
}

func (o DeploymentTrafficFilterOutput) ToDeploymentTrafficFilterOutputWithContext(ctx context.Context) DeploymentTrafficFilterOutput {
	return o
}

// Description of this individual rule
func (o DeploymentTrafficFilterOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
func (o DeploymentTrafficFilterOutput) IncludeByDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) pulumi.BoolOutput { return v.IncludeByDefault }).(pulumi.BoolOutput)
}

// Name of the ruleset
func (o DeploymentTrafficFilterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Filter region, the ruleset can only be attached to deployments in the specific region
func (o DeploymentTrafficFilterOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Set of rules, which the ruleset is made of.
func (o DeploymentTrafficFilterOutput) Rules() DeploymentTrafficFilterRuleArrayOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) DeploymentTrafficFilterRuleArrayOutput { return v.Rules }).(DeploymentTrafficFilterRuleArrayOutput)
}

// Type of the ruleset. It can be `ip`, `vpce`, `azurePrivateEndpoint`, or `gcpPrivateServiceConnectEndpoint`
func (o DeploymentTrafficFilterOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DeploymentTrafficFilter) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DeploymentTrafficFilterArrayOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeploymentTrafficFilter)(nil)).Elem()
}

func (o DeploymentTrafficFilterArrayOutput) ToDeploymentTrafficFilterArrayOutput() DeploymentTrafficFilterArrayOutput {
	return o
}

func (o DeploymentTrafficFilterArrayOutput) ToDeploymentTrafficFilterArrayOutputWithContext(ctx context.Context) DeploymentTrafficFilterArrayOutput {
	return o
}

func (o DeploymentTrafficFilterArrayOutput) Index(i pulumi.IntInput) DeploymentTrafficFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeploymentTrafficFilter {
		return vs[0].([]*DeploymentTrafficFilter)[vs[1].(int)]
	}).(DeploymentTrafficFilterOutput)
}

type DeploymentTrafficFilterMapOutput struct{ *pulumi.OutputState }

func (DeploymentTrafficFilterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeploymentTrafficFilter)(nil)).Elem()
}

func (o DeploymentTrafficFilterMapOutput) ToDeploymentTrafficFilterMapOutput() DeploymentTrafficFilterMapOutput {
	return o
}

func (o DeploymentTrafficFilterMapOutput) ToDeploymentTrafficFilterMapOutputWithContext(ctx context.Context) DeploymentTrafficFilterMapOutput {
	return o
}

func (o DeploymentTrafficFilterMapOutput) MapIndex(k pulumi.StringInput) DeploymentTrafficFilterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeploymentTrafficFilter {
		return vs[0].(map[string]*DeploymentTrafficFilter)[vs[1].(string)]
	}).(DeploymentTrafficFilterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterInput)(nil)).Elem(), &DeploymentTrafficFilter{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterArrayInput)(nil)).Elem(), DeploymentTrafficFilterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentTrafficFilterMapInput)(nil)).Elem(), DeploymentTrafficFilterMap{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterOutput{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterArrayOutput{})
	pulumi.RegisterOutputType(DeploymentTrafficFilterMapOutput{})
}
