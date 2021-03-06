// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about an existing Elastic Cloud deployment.
//
// ## Example Usage
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
// 		_, err := ec.LookupDeployment(ctx, &GetDeploymentArgs{
// 			Id: "f759065e5e64e9f3546f6c44f2743893",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupDeployment(ctx *pulumi.Context, args *LookupDeploymentArgs, opts ...pulumi.InvokeOption) (*LookupDeploymentResult, error) {
	var rv LookupDeploymentResult
	err := ctx.Invoke("ec:index/getDeployment:getDeployment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDeployment.
type LookupDeploymentArgs struct {
	// The ID of an existing Elastic Cloud deployment.
	Id string `pulumi:"id"`
}

// A collection of values returned by getDeployment.
type LookupDeploymentResult struct {
	// Deployment alias.
	Alias string `pulumi:"alias"`
	// Instance configuration of the APM type.
	// * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
	// * `apm.#.healthy` - Resource kind health status.
	// * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
	// * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
	// * `apm.#.ref_id` - User specified refId for the resource kind.
	// * `apm.#.resource_id` - The resource unique identifier.
	// * `apm.#.status` - Resource kind status (for example, "started", "stopped", etc).
	// * `apm.#.version` - Elastic stack version.
	// * `apm.#.topology` - Node topology element definition.
	// * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
	// * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
	// * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
	Apms []GetDeploymentApm `pulumi:"apms"`
	// ID of the deployment template used to create the deployment.
	DeploymentTemplateId string `pulumi:"deploymentTemplateId"`
	// Instance configuration of the Elasticsearch resource kind.
	// * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
	// * `elasticsearch.#.healthy` - Resource kind health status.
	// * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
	// * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
	// * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
	// * `elasticsearch.#.ref_id` - User specified refId for the resource kind.
	// * `elasticsearch.#.resource_id` - The resource unique identifier.
	// * `elasticsearch.#.status` - Resource kind status (for example, "started", "stopped", etc).
	// * `elasticsearch.#.version` - Elastic stack version.
	// * `elasticsearch.#.topology` - Topology element definition.
	// * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
	// * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
	// * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
	// * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (>=7.10.0).
	// * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (<7.10.0).
	// * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (<7.10.0).
	// * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (<7.10.0).
	// * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (<7.10.0).
	// * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
	// * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
	// * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
	// * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
	// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
	Elasticsearches []GetDeploymentElasticsearch `pulumi:"elasticsearches"`
	// Instance configuration of the Enterprise Search type.
	// * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
	// * `enterprise_search.#.healthy` - Resource kind health status.
	// * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
	// * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
	// * `enterprise_search.#.ref_id` - User specified refId for the resource kind.
	// * `enterprise_search.#.resource_id` - The resource unique identifier.
	// * `enterprise_search.#.status` - Resource kind status (for example, "started", "stopped", etc).
	// * `enterprise_search.#.version` - Elastic stack version.
	// * `enterprise_search.#.topology` - Node topology element definition.
	// * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
	// * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
	// * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
	// * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
	// * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
	// * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
	EnterpriseSearches []GetDeploymentEnterpriseSearch `pulumi:"enterpriseSearches"`
	// Overall health status of the deployment.
	Healthy bool `pulumi:"healthy"`
	// The unique ID of the deployment.
	Id string `pulumi:"id"`
	// Instance configuration of the Integrations Server type.
	// * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
	// * `integrations_server.#.healthy` - Resource kind health status.
	// * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
	// * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
	// * `integrations_server.#.ref_id` - User specified refId for the resource kind.
	// * `integrations_server.#.resource_id` - The resource unique identifier.
	// * `integrations_server.#.status` - Resource kind status (for example, "started", "stopped", etc).
	// * `integrations_server.#.version` - Elastic stack version.
	// * `integrations_server.#.topology` - Node topology element definition.
	// * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
	// * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
	// * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
	IntegrationsServers []GetDeploymentIntegrationsServer `pulumi:"integrationsServers"`
	// Instance configuration of the Kibana type.
	// * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
	// * `kibana.#.healthy` - Resource kind health status.
	// * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
	// * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
	// * `kibana.#.ref_id` - User specified refId for the resource kind.
	// * `kibana.#.resource_id` - The resource unique identifier.
	// * `kibana.#.status` - Resource kind status (for example, "started", "stopped", etc).
	// * `kibana.#.version` - Elastic stack version.
	// * `kibana.#.topology` - Node topology element definition.
	// * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
	// * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
	// * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
	Kibanas []GetDeploymentKibana `pulumi:"kibanas"`
	// The name of the deployment.
	Name            string                       `pulumi:"name"`
	Observabilities []GetDeploymentObservability `pulumi:"observabilities"`
	// Region where the deployment can be found.
	Region string            `pulumi:"region"`
	Tags   map[string]string `pulumi:"tags"`
	// Traffic filter block, which contains a list of traffic filter rule identifiers.
	// * `tags` Key value map of arbitrary string tags.
	// * `observability` Observability settings. Information about logs and metrics shipped to a dedicated deployment.
	// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
	// * `observability.#.ref_id` - Elasticsearch resource kind refId of the destination deployment.
	// * `observability.#.logs` - Defines whether logs are enabled or disabled.
	// * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
	TrafficFilters []string `pulumi:"trafficFilters"`
}

func LookupDeploymentOutput(ctx *pulumi.Context, args LookupDeploymentOutputArgs, opts ...pulumi.InvokeOption) LookupDeploymentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDeploymentResult, error) {
			args := v.(LookupDeploymentArgs)
			r, err := LookupDeployment(ctx, &args, opts...)
			var s LookupDeploymentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDeploymentResultOutput)
}

// A collection of arguments for invoking getDeployment.
type LookupDeploymentOutputArgs struct {
	// The ID of an existing Elastic Cloud deployment.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupDeploymentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDeploymentArgs)(nil)).Elem()
}

// A collection of values returned by getDeployment.
type LookupDeploymentResultOutput struct{ *pulumi.OutputState }

func (LookupDeploymentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDeploymentResult)(nil)).Elem()
}

func (o LookupDeploymentResultOutput) ToLookupDeploymentResultOutput() LookupDeploymentResultOutput {
	return o
}

func (o LookupDeploymentResultOutput) ToLookupDeploymentResultOutputWithContext(ctx context.Context) LookupDeploymentResultOutput {
	return o
}

// Deployment alias.
func (o LookupDeploymentResultOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeploymentResult) string { return v.Alias }).(pulumi.StringOutput)
}

// Instance configuration of the APM type.
// * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
// * `apm.#.healthy` - Resource kind health status.
// * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
// * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
// * `apm.#.ref_id` - User specified refId for the resource kind.
// * `apm.#.resource_id` - The resource unique identifier.
// * `apm.#.status` - Resource kind status (for example, "started", "stopped", etc).
// * `apm.#.version` - Elastic stack version.
// * `apm.#.topology` - Node topology element definition.
// * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
// * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
// * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
func (o LookupDeploymentResultOutput) Apms() GetDeploymentApmArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentApm { return v.Apms }).(GetDeploymentApmArrayOutput)
}

// ID of the deployment template used to create the deployment.
func (o LookupDeploymentResultOutput) DeploymentTemplateId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeploymentResult) string { return v.DeploymentTemplateId }).(pulumi.StringOutput)
}

// Instance configuration of the Elasticsearch resource kind.
// * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
// * `elasticsearch.#.healthy` - Resource kind health status.
// * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
// * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
// * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
// * `elasticsearch.#.ref_id` - User specified refId for the resource kind.
// * `elasticsearch.#.resource_id` - The resource unique identifier.
// * `elasticsearch.#.status` - Resource kind status (for example, "started", "stopped", etc).
// * `elasticsearch.#.version` - Elastic stack version.
// * `elasticsearch.#.topology` - Topology element definition.
// * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
// * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
// * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
// * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (>=7.10.0).
// * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (<7.10.0).
// * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (<7.10.0).
// * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (<7.10.0).
// * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (<7.10.0).
// * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
// * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
// * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
// * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
func (o LookupDeploymentResultOutput) Elasticsearches() GetDeploymentElasticsearchArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentElasticsearch { return v.Elasticsearches }).(GetDeploymentElasticsearchArrayOutput)
}

// Instance configuration of the Enterprise Search type.
// * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
// * `enterprise_search.#.healthy` - Resource kind health status.
// * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
// * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
// * `enterprise_search.#.ref_id` - User specified refId for the resource kind.
// * `enterprise_search.#.resource_id` - The resource unique identifier.
// * `enterprise_search.#.status` - Resource kind status (for example, "started", "stopped", etc).
// * `enterprise_search.#.version` - Elastic stack version.
// * `enterprise_search.#.topology` - Node topology element definition.
// * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
// * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
// * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
// * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
// * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
// * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
func (o LookupDeploymentResultOutput) EnterpriseSearches() GetDeploymentEnterpriseSearchArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentEnterpriseSearch { return v.EnterpriseSearches }).(GetDeploymentEnterpriseSearchArrayOutput)
}

// Overall health status of the deployment.
func (o LookupDeploymentResultOutput) Healthy() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDeploymentResult) bool { return v.Healthy }).(pulumi.BoolOutput)
}

// The unique ID of the deployment.
func (o LookupDeploymentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeploymentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Instance configuration of the Integrations Server type.
// * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
// * `integrations_server.#.healthy` - Resource kind health status.
// * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
// * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
// * `integrations_server.#.ref_id` - User specified refId for the resource kind.
// * `integrations_server.#.resource_id` - The resource unique identifier.
// * `integrations_server.#.status` - Resource kind status (for example, "started", "stopped", etc).
// * `integrations_server.#.version` - Elastic stack version.
// * `integrations_server.#.topology` - Node topology element definition.
// * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
// * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
// * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
func (o LookupDeploymentResultOutput) IntegrationsServers() GetDeploymentIntegrationsServerArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentIntegrationsServer { return v.IntegrationsServers }).(GetDeploymentIntegrationsServerArrayOutput)
}

// Instance configuration of the Kibana type.
// * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
// * `kibana.#.healthy` - Resource kind health status.
// * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
// * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
// * `kibana.#.ref_id` - User specified refId for the resource kind.
// * `kibana.#.resource_id` - The resource unique identifier.
// * `kibana.#.status` - Resource kind status (for example, "started", "stopped", etc).
// * `kibana.#.version` - Elastic stack version.
// * `kibana.#.topology` - Node topology element definition.
// * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
// * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
// * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
func (o LookupDeploymentResultOutput) Kibanas() GetDeploymentKibanaArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentKibana { return v.Kibanas }).(GetDeploymentKibanaArrayOutput)
}

// The name of the deployment.
func (o LookupDeploymentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeploymentResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDeploymentResultOutput) Observabilities() GetDeploymentObservabilityArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []GetDeploymentObservability { return v.Observabilities }).(GetDeploymentObservabilityArrayOutput)
}

// Region where the deployment can be found.
func (o LookupDeploymentResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeploymentResult) string { return v.Region }).(pulumi.StringOutput)
}

func (o LookupDeploymentResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDeploymentResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Traffic filter block, which contains a list of traffic filter rule identifiers.
// * `tags` Key value map of arbitrary string tags.
// * `observability` Observability settings. Information about logs and metrics shipped to a dedicated deployment.
// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
// * `observability.#.ref_id` - Elasticsearch resource kind refId of the destination deployment.
// * `observability.#.logs` - Defines whether logs are enabled or disabled.
// * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
func (o LookupDeploymentResultOutput) TrafficFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDeploymentResult) []string { return v.TrafficFilters }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDeploymentResultOutput{})
}
