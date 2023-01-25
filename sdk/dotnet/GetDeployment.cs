// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud
{
    public static class GetDeployment
    {
        /// <summary>
        /// Use this data source to retrieve information about an existing Elastic Cloud deployment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ElasticCloud.GetDeployment.Invoke(new()
        ///     {
        ///         Id = "f759065e5e64e9f3546f6c44f2743893",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeploymentResult> InvokeAsync(GetDeploymentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeploymentResult>("ec:index/getDeployment:getDeployment", args ?? new GetDeploymentArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing Elastic Cloud deployment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ElasticCloud.GetDeployment.Invoke(new()
        ///     {
        ///         Id = "f759065e5e64e9f3546f6c44f2743893",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDeploymentResult> Invoke(GetDeploymentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeploymentResult>("ec:index/getDeployment:getDeployment", args ?? new GetDeploymentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeploymentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of an existing Elastic Cloud deployment.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetDeploymentArgs()
        {
        }
        public static new GetDeploymentArgs Empty => new GetDeploymentArgs();
    }

    public sealed class GetDeploymentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of an existing Elastic Cloud deployment.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetDeploymentInvokeArgs()
        {
        }
        public static new GetDeploymentInvokeArgs Empty => new GetDeploymentInvokeArgs();
    }


    [OutputType]
    public sealed class GetDeploymentResult
    {
        /// <summary>
        /// Deployment alias.
        /// </summary>
        public readonly string Alias;
        /// <summary>
        /// Instance configuration of the APM type.
        /// * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        /// * `apm.#.healthy` - Resource kind health status.
        /// * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
        /// * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
        /// * `apm.#.ref_id` - User specified ref_id for the resource kind.
        /// * `apm.#.resource_id` - The resource unique identifier.
        /// * `apm.#.status` - Resource kind status (for example, "started", "stopped", etc).
        /// * `apm.#.version` - Elastic stack version.
        /// * `apm.#.topology` - Node topology element definition.
        /// * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the "&lt;size in GB&gt;g" notation.
        /// * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentApmResult> Apms;
        /// <summary>
        /// ID of the deployment template used to create the deployment.
        /// </summary>
        public readonly string DeploymentTemplateId;
        /// <summary>
        /// Instance configuration of the Elasticsearch resource kind.
        /// * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
        /// * `elasticsearch.#.healthy` - Resource kind health status.
        /// * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
        /// * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
        /// * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
        /// * `elasticsearch.#.ref_id` - User specified ref_id for the resource kind.
        /// * `elasticsearch.#.resource_id` - The resource unique identifier.
        /// * `elasticsearch.#.status` - Resource kind status (for example, "started", "stopped", etc).
        /// * `elasticsearch.#.version` - Elastic stack version.
        /// * `elasticsearch.#.topology` - Topology element definition.
        /// * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the "&lt;size in GB&gt;g" notation.
        /// * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        /// * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (&gt;=7.10.0).
        /// * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (&lt;7.10.0).
        /// * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (&lt;7.10.0).
        /// * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (&lt;7.10.0).
        /// * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (&lt;7.10.0).
        /// * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
        /// * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
        /// * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
        /// * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
        /// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentElasticsearchResult> Elasticsearches;
        /// <summary>
        /// Instance configuration of the Enterprise Search type.
        /// * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        /// * `enterprise_search.#.healthy` - Resource kind health status.
        /// * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
        /// * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
        /// * `enterprise_search.#.ref_id` - User specified ref_id for the resource kind.
        /// * `enterprise_search.#.resource_id` - The resource unique identifier.
        /// * `enterprise_search.#.status` - Resource kind status (for example, "started", "stopped", etc).
        /// * `enterprise_search.#.version` - Elastic stack version.
        /// * `enterprise_search.#.topology` - Node topology element definition.
        /// * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the "&lt;size in GB&gt;g" notation.
        /// * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        /// * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
        /// * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
        /// * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentEnterpriseSearchResult> EnterpriseSearches;
        /// <summary>
        /// Overall health status of the deployment.
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// The unique ID of the deployment.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Instance configuration of the Integrations Server type.
        /// * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        /// * `integrations_server.#.healthy` - Resource kind health status.
        /// * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
        /// * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
        /// * `integrations_server.#.ref_id` - User specified ref_id for the resource kind.
        /// * `integrations_server.#.resource_id` - The resource unique identifier.
        /// * `integrations_server.#.status` - Resource kind status (for example, "started", "stopped", etc).
        /// * `integrations_server.#.version` - Elastic stack version.
        /// * `integrations_server.#.topology` - Node topology element definition.
        /// * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the "&lt;size in GB&gt;g" notation.
        /// * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentIntegrationsServerResult> IntegrationsServers;
        /// <summary>
        /// Instance configuration of the Kibana type.
        /// * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        /// * `kibana.#.healthy` - Resource kind health status.
        /// * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
        /// * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
        /// * `kibana.#.ref_id` - User specified ref_id for the resource kind.
        /// * `kibana.#.resource_id` - The resource unique identifier.
        /// * `kibana.#.status` - Resource kind status (for example, "started", "stopped", etc).
        /// * `kibana.#.version` - Elastic stack version.
        /// * `kibana.#.topology` - Node topology element definition.
        /// * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the "&lt;size in GB&gt;g" notation.
        /// * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentKibanaResult> Kibanas;
        /// <summary>
        /// The name of the deployment.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Observability settings. Information about logs and metrics shipped to a dedicated deployment.
        /// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
        /// * `observability.#.ref_id` - Elasticsearch resource kind ref_id of the destination deployment.
        /// * `observability.#.logs` - Defines whether logs are enabled or disabled.
        /// * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentObservabilityResult> Observabilities;
        /// <summary>
        /// Region where the deployment can be found.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Key value map of arbitrary string tags.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Traffic filter block, which contains a list of traffic filter rule identifiers.
        /// </summary>
        public readonly ImmutableArray<string> TrafficFilters;

        [OutputConstructor]
        private GetDeploymentResult(
            string alias,

            ImmutableArray<Outputs.GetDeploymentApmResult> apms,

            string deploymentTemplateId,

            ImmutableArray<Outputs.GetDeploymentElasticsearchResult> elasticsearches,

            ImmutableArray<Outputs.GetDeploymentEnterpriseSearchResult> enterpriseSearches,

            bool healthy,

            string id,

            ImmutableArray<Outputs.GetDeploymentIntegrationsServerResult> integrationsServers,

            ImmutableArray<Outputs.GetDeploymentKibanaResult> kibanas,

            string name,

            ImmutableArray<Outputs.GetDeploymentObservabilityResult> observabilities,

            string region,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<string> trafficFilters)
        {
            Alias = alias;
            Apms = apms;
            DeploymentTemplateId = deploymentTemplateId;
            Elasticsearches = elasticsearches;
            EnterpriseSearches = enterpriseSearches;
            Healthy = healthy;
            Id = id;
            IntegrationsServers = integrationsServers;
            Kibanas = kibanas;
            Name = name;
            Observabilities = observabilities;
            Region = region;
            Tags = tags;
            TrafficFilters = trafficFilters;
        }
    }
}
