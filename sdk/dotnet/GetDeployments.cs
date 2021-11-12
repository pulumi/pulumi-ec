// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.ElasticCloud
{
    public static class GetDeployments
    {
        /// <summary>
        /// Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(ElasticCloud.GetDeployments.InvokeAsync(new ElasticCloud.GetDeploymentsArgs
        ///         {
        ///             Apm = new ElasticCloud.Inputs.GetDeploymentsApmArgs
        ///             {
        ///                 Version = "7.9.1",
        ///             },
        ///             DeploymentTemplateId = "azure-compute-optimized",
        ///             Elasticsearch = new ElasticCloud.Inputs.GetDeploymentsElasticsearchArgs
        ///             {
        ///                 Healthy = "true",
        ///             },
        ///             EnterpriseSearch = new ElasticCloud.Inputs.GetDeploymentsEnterpriseSearchArgs
        ///             {
        ///                 Healthy = "true",
        ///             },
        ///             Kibana = new ElasticCloud.Inputs.GetDeploymentsKibanaArgs
        ///             {
        ///                 Status = "started",
        ///             },
        ///             NamePrefix = "test",
        ///             Size = 200,
        ///             Tags = 
        ///             {
        ///                 { "foo", "bar" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeploymentsResult> InvokeAsync(GetDeploymentsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDeploymentsResult>("ec:index/getDeployments:getDeployments", args ?? new GetDeploymentsArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(ElasticCloud.GetDeployments.InvokeAsync(new ElasticCloud.GetDeploymentsArgs
        ///         {
        ///             Apm = new ElasticCloud.Inputs.GetDeploymentsApmArgs
        ///             {
        ///                 Version = "7.9.1",
        ///             },
        ///             DeploymentTemplateId = "azure-compute-optimized",
        ///             Elasticsearch = new ElasticCloud.Inputs.GetDeploymentsElasticsearchArgs
        ///             {
        ///                 Healthy = "true",
        ///             },
        ///             EnterpriseSearch = new ElasticCloud.Inputs.GetDeploymentsEnterpriseSearchArgs
        ///             {
        ///                 Healthy = "true",
        ///             },
        ///             Kibana = new ElasticCloud.Inputs.GetDeploymentsKibanaArgs
        ///             {
        ///                 Status = "started",
        ///             },
        ///             NamePrefix = "test",
        ///             Size = 200,
        ///             Tags = 
        ///             {
        ///                 { "foo", "bar" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDeploymentsResult> Invoke(GetDeploymentsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDeploymentsResult>("ec:index/getDeployments:getDeployments", args ?? new GetDeploymentsInvokeArgs(), options.WithVersion());
    }


    public sealed class GetDeploymentsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter by APM resource kind status or configuration.
        /// * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `apm.#.version` - Elastic stack version.
        /// * `apm.#.healthy` - Overall health status of the APM instances.
        /// </summary>
        [Input("apm")]
        public Inputs.GetDeploymentsApmArgs? Apm { get; set; }

        /// <summary>
        /// ID of the deployment template used to create the deployment.
        /// </summary>
        [Input("deploymentTemplateId")]
        public string? DeploymentTemplateId { get; set; }

        /// <summary>
        /// Filter by Elasticsearch resource kind status or configuration.
        /// * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `elasticsearch.#.version` - Elastic stack version.
        /// * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
        /// </summary>
        [Input("elasticsearch")]
        public Inputs.GetDeploymentsElasticsearchArgs? Elasticsearch { get; set; }

        /// <summary>
        /// Filter by Enterprise Search resource kind status or configuration.
        /// * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `enterprise_search.#.version` - Elastic stack version.
        /// * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
        /// </summary>
        [Input("enterpriseSearch")]
        public Inputs.GetDeploymentsEnterpriseSearchArgs? EnterpriseSearch { get; set; }

        /// <summary>
        /// Overall health status of the deployment.
        /// </summary>
        [Input("healthy")]
        public string? Healthy { get; set; }

        /// <summary>
        /// Filter by Kibana resource kind status or configuration.
        /// * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `kibana.#.version` - Elastic stack version.
        /// * `kibana.#.healthy` - Overall health status of the Kibana instances.
        /// </summary>
        [Input("kibana")]
        public Inputs.GetDeploymentsKibanaArgs? Kibana { get; set; }

        /// <summary>
        /// Prefix that one or several deployment names have in common.
        /// </summary>
        [Input("namePrefix")]
        public string? NamePrefix { get; set; }

        /// <summary>
        /// The maximum number of deployments to return. Defaults to `100`.
        /// </summary>
        [Input("size")]
        public int? Size { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key value map of arbitrary string tags for the deployment.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetDeploymentsArgs()
        {
        }
    }

    public sealed class GetDeploymentsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter by APM resource kind status or configuration.
        /// * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `apm.#.version` - Elastic stack version.
        /// * `apm.#.healthy` - Overall health status of the APM instances.
        /// </summary>
        [Input("apm")]
        public Input<Inputs.GetDeploymentsApmInputArgs>? Apm { get; set; }

        /// <summary>
        /// ID of the deployment template used to create the deployment.
        /// </summary>
        [Input("deploymentTemplateId")]
        public Input<string>? DeploymentTemplateId { get; set; }

        /// <summary>
        /// Filter by Elasticsearch resource kind status or configuration.
        /// * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `elasticsearch.#.version` - Elastic stack version.
        /// * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.GetDeploymentsElasticsearchInputArgs>? Elasticsearch { get; set; }

        /// <summary>
        /// Filter by Enterprise Search resource kind status or configuration.
        /// * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `enterprise_search.#.version` - Elastic stack version.
        /// * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
        /// </summary>
        [Input("enterpriseSearch")]
        public Input<Inputs.GetDeploymentsEnterpriseSearchInputArgs>? EnterpriseSearch { get; set; }

        /// <summary>
        /// Overall health status of the deployment.
        /// </summary>
        [Input("healthy")]
        public Input<string>? Healthy { get; set; }

        /// <summary>
        /// Filter by Kibana resource kind status or configuration.
        /// * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
        /// * `kibana.#.version` - Elastic stack version.
        /// * `kibana.#.healthy` - Overall health status of the Kibana instances.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.GetDeploymentsKibanaInputArgs>? Kibana { get; set; }

        /// <summary>
        /// Prefix that one or several deployment names have in common.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The maximum number of deployments to return. Defaults to `100`.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key value map of arbitrary string tags for the deployment.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetDeploymentsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDeploymentsResult
    {
        public readonly Outputs.GetDeploymentsApmResult? Apm;
        public readonly string? DeploymentTemplateId;
        /// <summary>
        /// List of deployments which match the specified query.
        /// * `deployments.#.deployment_id` - The deployment unique ID.
        /// * `deployments.#.alias` - Deployment alias.
        /// * `deployments.#.name` - The name of the deployment.
        /// * `deployments.#.elasticsearch_resource_id` - The Elasticsearch resource unique ID.
        /// * `deployments.#.elasticsearch_ref_id` - The Elasticsearch resource reference.
        /// * `deployments.#.kibana_resource_id` - The Kibana resource unique ID.
        /// * `deployments.#.kibana_ref_id` - The Kibana resource reference.
        /// * `deployments.#.apm_resource_id` - The APM resource unique ID.
        /// * `deployments.#.apm_ref_id` - The APM resource reference.
        /// * `deployments.#.enterprise_search_resource_id` - The Enterprise Search resource unique ID.
        /// * `deployments.#.enterprise_search_ref_id` - The Enterprise Search resource reference.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentsDeploymentResult> Deployments;
        public readonly Outputs.GetDeploymentsElasticsearchResult? Elasticsearch;
        public readonly Outputs.GetDeploymentsEnterpriseSearchResult? EnterpriseSearch;
        public readonly string? Healthy;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetDeploymentsKibanaResult? Kibana;
        public readonly string? NamePrefix;
        public readonly int ReturnCount;
        public readonly int? Size;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetDeploymentsResult(
            Outputs.GetDeploymentsApmResult? apm,

            string? deploymentTemplateId,

            ImmutableArray<Outputs.GetDeploymentsDeploymentResult> deployments,

            Outputs.GetDeploymentsElasticsearchResult? elasticsearch,

            Outputs.GetDeploymentsEnterpriseSearchResult? enterpriseSearch,

            string? healthy,

            string id,

            Outputs.GetDeploymentsKibanaResult? kibana,

            string? namePrefix,

            int returnCount,

            int? size,

            ImmutableDictionary<string, string>? tags)
        {
            Apm = apm;
            DeploymentTemplateId = deploymentTemplateId;
            Deployments = deployments;
            Elasticsearch = elasticsearch;
            EnterpriseSearch = enterpriseSearch;
            Healthy = healthy;
            Id = id;
            Kibana = kibana;
            NamePrefix = namePrefix;
            ReturnCount = returnCount;
            Size = size;
            Tags = tags;
        }
    }
}
