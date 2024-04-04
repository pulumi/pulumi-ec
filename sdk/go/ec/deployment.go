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
//
// ### Basic
//
// ### With config
//
// `es.yaml`
//
// `deployment.tf`:
//
// ### With autoscaling
//
// ### With observability
//
// It is possible to enable observability without using a second deployment, by storing the observability data in the current deployment. To enable this, set `deploymentId` to `self`.
//
// ### With Cross Cluster Search settings
//
// ### With Keystore
//
// ## Import
//
// ~> **Note on deployment credentials** The `elastic` user credentials are only available whilst creating a deployment. Importing a deployment will not import the `elasticsearch_username` or `elasticsearch_password` attributes.
//
// ~> **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported.
//
// ~> **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported.
//
// ~> **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing.
//
// Deployments can be imported using the `id`, for example:
//
// ```sh
// $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
// ```
type Deployment struct {
	pulumi.CustomResourceState

	// Alias for this Cross Cluster Search binding
	Alias pulumi.StringOutput `pulumi:"alias"`
	// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
	Apm            DeploymentApmPtrOutput `pulumi:"apm"`
	ApmSecretToken pulumi.StringOutput    `pulumi:"apmSecretToken"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringOutput `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition
	Elasticsearch DeploymentElasticsearchOutput `pulumi:"elasticsearch"`
	// Password for authenticating to the Elasticsearch resource. ~> **Note on deployment credentials** The
	// <code>elastic</code> user credentials are only available whilst creating a deployment. Importing a deployment will not
	// import the <code>elasticsearch_username</code> or <code>elasticsearch_password</code> attributes. ~> **Note on
	// deployment credentials in state** The <code>elastic</code> user credentials are stored in the state file as plain text.
	// Please follow the official Terraform recommendations regarding senstaive data in state.
	ElasticsearchPassword pulumi.StringOutput `pulumi:"elasticsearchPassword"`
	// Username for authenticating to the Elasticsearch resource.
	ElasticsearchUsername pulumi.StringOutput `pulumi:"elasticsearchUsername"`
	// Enterprise Search cluster definition.
	EnterpriseSearch DeploymentEnterpriseSearchPtrOutput `pulumi:"enterpriseSearch"`
	// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
	IntegrationsServer DeploymentIntegrationsServerPtrOutput `pulumi:"integrationsServer"`
	// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
	// block, since not doing so might cause issues when modifying or upgrading the deployment.
	Kibana DeploymentKibanaPtrOutput `pulumi:"kibana"`
	// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
	// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
	// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
	// with node types. To use this field, the deployment needs to be migrated to node roles first.
	MigrateToLatestHardware pulumi.BoolPtrOutput `pulumi:"migrateToLatestHardware"`
	// Extension name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
	// current deployment itself by setting observability.deployment_id to `self`.
	Observability DeploymentObservabilityPtrOutput `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
	// installations, set to `"ece-region".
	Region pulumi.StringOutput `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
	// returned as part of the error.
	RequestId pulumi.StringOutput `pulumi:"requestId"`
	// Explicitly resets the elasticsearch_password when true
	ResetElasticsearchPassword pulumi.BoolPtrOutput `pulumi:"resetElasticsearchPassword"`
	// Optional map of deployment tags
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// List of traffic filters rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayOutput `pulumi:"trafficFilters"`
	// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewDeployment registers a new resource with the given unique name, arguments, and options.
func NewDeployment(ctx *pulumi.Context,
	name string, args *DeploymentArgs, opts ...pulumi.ResourceOption) (*Deployment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentTemplateId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentTemplateId'")
	}
	if args.Elasticsearch == nil {
		return nil, errors.New("invalid value for required argument 'Elasticsearch'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apmSecretToken",
		"elasticsearchPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Deployment
	err := ctx.RegisterResource("ec:index/deployment:Deployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeployment gets an existing Deployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentState, opts ...pulumi.ResourceOption) (*Deployment, error) {
	var resource Deployment
	err := ctx.ReadResource("ec:index/deployment:Deployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Deployment resources.
type deploymentState struct {
	// Alias for this Cross Cluster Search binding
	Alias *string `pulumi:"alias"`
	// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
	Apm            *DeploymentApm `pulumi:"apm"`
	ApmSecretToken *string        `pulumi:"apmSecretToken"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId *string `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition
	Elasticsearch *DeploymentElasticsearch `pulumi:"elasticsearch"`
	// Password for authenticating to the Elasticsearch resource. ~> **Note on deployment credentials** The
	// <code>elastic</code> user credentials are only available whilst creating a deployment. Importing a deployment will not
	// import the <code>elasticsearch_username</code> or <code>elasticsearch_password</code> attributes. ~> **Note on
	// deployment credentials in state** The <code>elastic</code> user credentials are stored in the state file as plain text.
	// Please follow the official Terraform recommendations regarding senstaive data in state.
	ElasticsearchPassword *string `pulumi:"elasticsearchPassword"`
	// Username for authenticating to the Elasticsearch resource.
	ElasticsearchUsername *string `pulumi:"elasticsearchUsername"`
	// Enterprise Search cluster definition.
	EnterpriseSearch *DeploymentEnterpriseSearch `pulumi:"enterpriseSearch"`
	// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
	IntegrationsServer *DeploymentIntegrationsServer `pulumi:"integrationsServer"`
	// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
	// block, since not doing so might cause issues when modifying or upgrading the deployment.
	Kibana *DeploymentKibana `pulumi:"kibana"`
	// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
	// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
	// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
	// with node types. To use this field, the deployment needs to be migrated to node roles first.
	MigrateToLatestHardware *bool `pulumi:"migrateToLatestHardware"`
	// Extension name.
	Name *string `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
	// current deployment itself by setting observability.deployment_id to `self`.
	Observability *DeploymentObservability `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
	// installations, set to `"ece-region".
	Region *string `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
	// returned as part of the error.
	RequestId *string `pulumi:"requestId"`
	// Explicitly resets the elasticsearch_password when true
	ResetElasticsearchPassword *bool `pulumi:"resetElasticsearchPassword"`
	// Optional map of deployment tags
	Tags map[string]string `pulumi:"tags"`
	// List of traffic filters rule identifiers that will be applied to the deployment.
	TrafficFilters []string `pulumi:"trafficFilters"`
	// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
	Version *string `pulumi:"version"`
}

type DeploymentState struct {
	// Alias for this Cross Cluster Search binding
	Alias pulumi.StringPtrInput
	// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
	Apm            DeploymentApmPtrInput
	ApmSecretToken pulumi.StringPtrInput
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringPtrInput
	// Elasticsearch cluster definition
	Elasticsearch DeploymentElasticsearchPtrInput
	// Password for authenticating to the Elasticsearch resource. ~> **Note on deployment credentials** The
	// <code>elastic</code> user credentials are only available whilst creating a deployment. Importing a deployment will not
	// import the <code>elasticsearch_username</code> or <code>elasticsearch_password</code> attributes. ~> **Note on
	// deployment credentials in state** The <code>elastic</code> user credentials are stored in the state file as plain text.
	// Please follow the official Terraform recommendations regarding senstaive data in state.
	ElasticsearchPassword pulumi.StringPtrInput
	// Username for authenticating to the Elasticsearch resource.
	ElasticsearchUsername pulumi.StringPtrInput
	// Enterprise Search cluster definition.
	EnterpriseSearch DeploymentEnterpriseSearchPtrInput
	// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
	IntegrationsServer DeploymentIntegrationsServerPtrInput
	// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
	// block, since not doing so might cause issues when modifying or upgrading the deployment.
	Kibana DeploymentKibanaPtrInput
	// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
	// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
	// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
	// with node types. To use this field, the deployment needs to be migrated to node roles first.
	MigrateToLatestHardware pulumi.BoolPtrInput
	// Extension name.
	Name pulumi.StringPtrInput
	// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
	// current deployment itself by setting observability.deployment_id to `self`.
	Observability DeploymentObservabilityPtrInput
	// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
	// installations, set to `"ece-region".
	Region pulumi.StringPtrInput
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
	// returned as part of the error.
	RequestId pulumi.StringPtrInput
	// Explicitly resets the elasticsearch_password when true
	ResetElasticsearchPassword pulumi.BoolPtrInput
	// Optional map of deployment tags
	Tags pulumi.StringMapInput
	// List of traffic filters rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayInput
	// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
	Version pulumi.StringPtrInput
}

func (DeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentState)(nil)).Elem()
}

type deploymentArgs struct {
	// Alias for this Cross Cluster Search binding
	Alias *string `pulumi:"alias"`
	// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
	Apm *DeploymentApm `pulumi:"apm"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId string `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition
	Elasticsearch DeploymentElasticsearch `pulumi:"elasticsearch"`
	// Enterprise Search cluster definition.
	EnterpriseSearch *DeploymentEnterpriseSearch `pulumi:"enterpriseSearch"`
	// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
	IntegrationsServer *DeploymentIntegrationsServer `pulumi:"integrationsServer"`
	// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
	// block, since not doing so might cause issues when modifying or upgrading the deployment.
	Kibana *DeploymentKibana `pulumi:"kibana"`
	// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
	// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
	// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
	// with node types. To use this field, the deployment needs to be migrated to node roles first.
	MigrateToLatestHardware *bool `pulumi:"migrateToLatestHardware"`
	// Extension name.
	Name *string `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
	// current deployment itself by setting observability.deployment_id to `self`.
	Observability *DeploymentObservability `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
	// installations, set to `"ece-region".
	Region string `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
	// returned as part of the error.
	RequestId *string `pulumi:"requestId"`
	// Explicitly resets the elasticsearch_password when true
	ResetElasticsearchPassword *bool `pulumi:"resetElasticsearchPassword"`
	// Optional map of deployment tags
	Tags map[string]string `pulumi:"tags"`
	// List of traffic filters rule identifiers that will be applied to the deployment.
	TrafficFilters []string `pulumi:"trafficFilters"`
	// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a Deployment resource.
type DeploymentArgs struct {
	// Alias for this Cross Cluster Search binding
	Alias pulumi.StringPtrInput
	// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
	Apm DeploymentApmPtrInput
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringInput
	// Elasticsearch cluster definition
	Elasticsearch DeploymentElasticsearchInput
	// Enterprise Search cluster definition.
	EnterpriseSearch DeploymentEnterpriseSearchPtrInput
	// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
	IntegrationsServer DeploymentIntegrationsServerPtrInput
	// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
	// block, since not doing so might cause issues when modifying or upgrading the deployment.
	Kibana DeploymentKibanaPtrInput
	// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
	// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
	// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
	// with node types. To use this field, the deployment needs to be migrated to node roles first.
	MigrateToLatestHardware pulumi.BoolPtrInput
	// Extension name.
	Name pulumi.StringPtrInput
	// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
	// current deployment itself by setting observability.deployment_id to `self`.
	Observability DeploymentObservabilityPtrInput
	// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
	// installations, set to `"ece-region".
	Region pulumi.StringInput
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
	// returned as part of the error.
	RequestId pulumi.StringPtrInput
	// Explicitly resets the elasticsearch_password when true
	ResetElasticsearchPassword pulumi.BoolPtrInput
	// Optional map of deployment tags
	Tags pulumi.StringMapInput
	// List of traffic filters rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayInput
	// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
	Version pulumi.StringInput
}

func (DeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentArgs)(nil)).Elem()
}

type DeploymentInput interface {
	pulumi.Input

	ToDeploymentOutput() DeploymentOutput
	ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput
}

func (*Deployment) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (i *Deployment) ToDeploymentOutput() DeploymentOutput {
	return i.ToDeploymentOutputWithContext(context.Background())
}

func (i *Deployment) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentOutput)
}

// DeploymentArrayInput is an input type that accepts DeploymentArray and DeploymentArrayOutput values.
// You can construct a concrete instance of `DeploymentArrayInput` via:
//
//	DeploymentArray{ DeploymentArgs{...} }
type DeploymentArrayInput interface {
	pulumi.Input

	ToDeploymentArrayOutput() DeploymentArrayOutput
	ToDeploymentArrayOutputWithContext(context.Context) DeploymentArrayOutput
}

type DeploymentArray []DeploymentInput

func (DeploymentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (i DeploymentArray) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return i.ToDeploymentArrayOutputWithContext(context.Background())
}

func (i DeploymentArray) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentArrayOutput)
}

// DeploymentMapInput is an input type that accepts DeploymentMap and DeploymentMapOutput values.
// You can construct a concrete instance of `DeploymentMapInput` via:
//
//	DeploymentMap{ "key": DeploymentArgs{...} }
type DeploymentMapInput interface {
	pulumi.Input

	ToDeploymentMapOutput() DeploymentMapOutput
	ToDeploymentMapOutputWithContext(context.Context) DeploymentMapOutput
}

type DeploymentMap map[string]DeploymentInput

func (DeploymentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (i DeploymentMap) ToDeploymentMapOutput() DeploymentMapOutput {
	return i.ToDeploymentMapOutputWithContext(context.Background())
}

func (i DeploymentMap) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentMapOutput)
}

type DeploymentOutput struct{ *pulumi.OutputState }

func (DeploymentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (o DeploymentOutput) ToDeploymentOutput() DeploymentOutput {
	return o
}

func (o DeploymentOutput) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return o
}

// Alias for this Cross Cluster Search binding
func (o DeploymentOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.Alias }).(pulumi.StringOutput)
}

// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
func (o DeploymentOutput) Apm() DeploymentApmPtrOutput {
	return o.ApplyT(func(v *Deployment) DeploymentApmPtrOutput { return v.Apm }).(DeploymentApmPtrOutput)
}

func (o DeploymentOutput) ApmSecretToken() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ApmSecretToken }).(pulumi.StringOutput)
}

// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
func (o DeploymentOutput) DeploymentTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.DeploymentTemplateId }).(pulumi.StringOutput)
}

// Elasticsearch cluster definition
func (o DeploymentOutput) Elasticsearch() DeploymentElasticsearchOutput {
	return o.ApplyT(func(v *Deployment) DeploymentElasticsearchOutput { return v.Elasticsearch }).(DeploymentElasticsearchOutput)
}

// Password for authenticating to the Elasticsearch resource. ~> **Note on deployment credentials** The
// <code>elastic</code> user credentials are only available whilst creating a deployment. Importing a deployment will not
// import the <code>elasticsearch_username</code> or <code>elasticsearch_password</code> attributes. ~> **Note on
// deployment credentials in state** The <code>elastic</code> user credentials are stored in the state file as plain text.
// Please follow the official Terraform recommendations regarding senstaive data in state.
func (o DeploymentOutput) ElasticsearchPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ElasticsearchPassword }).(pulumi.StringOutput)
}

// Username for authenticating to the Elasticsearch resource.
func (o DeploymentOutput) ElasticsearchUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.ElasticsearchUsername }).(pulumi.StringOutput)
}

// Enterprise Search cluster definition.
func (o DeploymentOutput) EnterpriseSearch() DeploymentEnterpriseSearchPtrOutput {
	return o.ApplyT(func(v *Deployment) DeploymentEnterpriseSearchPtrOutput { return v.EnterpriseSearch }).(DeploymentEnterpriseSearchPtrOutput)
}

// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions > 8.0
func (o DeploymentOutput) IntegrationsServer() DeploymentIntegrationsServerPtrOutput {
	return o.ApplyT(func(v *Deployment) DeploymentIntegrationsServerPtrOutput { return v.IntegrationsServer }).(DeploymentIntegrationsServerPtrOutput)
}

// Kibana cluster definition. -> **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
// block, since not doing so might cause issues when modifying or upgrading the deployment.
func (o DeploymentOutput) Kibana() DeploymentKibanaPtrOutput {
	return o.ApplyT(func(v *Deployment) DeploymentKibanaPtrOutput { return v.Kibana }).(DeploymentKibanaPtrOutput)
}

// When set to true, the deployment will be updated according to the latest deployment template values. ~> **Note** If the
// <code>instance_configuration_id</code> or <code>instance_configuration_version</code> fields are set for a specific
// topology element, that element will not be updated. ~> **Note** Hardware migrations are not supported for deployments
// with node types. To use this field, the deployment needs to be migrated to node roles first.
func (o DeploymentOutput) MigrateToLatestHardware() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Deployment) pulumi.BoolPtrOutput { return v.MigrateToLatestHardware }).(pulumi.BoolPtrOutput)
}

// Extension name.
func (o DeploymentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
// current deployment itself by setting observability.deployment_id to `self`.
func (o DeploymentOutput) Observability() DeploymentObservabilityPtrOutput {
	return o.ApplyT(func(v *Deployment) DeploymentObservabilityPtrOutput { return v.Observability }).(DeploymentObservabilityPtrOutput)
}

// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
// installations, set to `"ece-region".
func (o DeploymentOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
// returned as part of the error.
func (o DeploymentOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// Explicitly resets the elasticsearch_password when true
func (o DeploymentOutput) ResetElasticsearchPassword() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Deployment) pulumi.BoolPtrOutput { return v.ResetElasticsearchPassword }).(pulumi.BoolPtrOutput)
}

// Optional map of deployment tags
func (o DeploymentOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// List of traffic filters rule identifiers that will be applied to the deployment.
func (o DeploymentOutput) TrafficFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringArrayOutput { return v.TrafficFilters }).(pulumi.StringArrayOutput)
}

// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
func (o DeploymentOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *Deployment) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type DeploymentArrayOutput struct{ *pulumi.OutputState }

func (DeploymentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) Index(i pulumi.IntInput) DeploymentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].([]*Deployment)[vs[1].(int)]
	}).(DeploymentOutput)
}

type DeploymentMapOutput struct{ *pulumi.OutputState }

func (DeploymentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (o DeploymentMapOutput) ToDeploymentMapOutput() DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) MapIndex(k pulumi.StringInput) DeploymentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].(map[string]*Deployment)[vs[1].(string)]
	}).(DeploymentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentInput)(nil)).Elem(), &Deployment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentArrayInput)(nil)).Elem(), DeploymentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentMapInput)(nil)).Elem(), DeploymentMap{})
	pulumi.RegisterOutputType(DeploymentOutput{})
	pulumi.RegisterOutputType(DeploymentArrayOutput{})
	pulumi.RegisterOutputType(DeploymentMapOutput{})
}
