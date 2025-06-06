// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Task<GetDeploymentResult> InvokeAsync(GetDeploymentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDeploymentResult>("ec:index/getDeployment:getDeployment", args ?? new GetDeploymentArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing Elastic Cloud deployment.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Output<GetDeploymentResult> Invoke(GetDeploymentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeploymentResult>("ec:index/getDeployment:getDeployment", args ?? new GetDeploymentInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about an existing Elastic Cloud deployment.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Output<GetDeploymentResult> Invoke(GetDeploymentInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDeploymentResult>("ec:index/getDeployment:getDeployment", args ?? new GetDeploymentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeploymentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID of the deployment.
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
        /// The unique ID of the deployment.
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
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentApmResult> Apms;
        /// <summary>
        /// ID of the deployment template this deployment is based off.
        /// </summary>
        public readonly string DeploymentTemplateId;
        /// <summary>
        /// Instance configuration of the Elasticsearch Elasticsearch resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentElasticsearchResult> Elasticsearches;
        /// <summary>
        /// Instance configuration of the Enterprise Search type.
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
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentIntegrationsServerResult> IntegrationsServers;
        /// <summary>
        /// Instance configuration of the Kibana type.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentKibanaResult> Kibanas;
        /// <summary>
        /// The name of the deployment.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Observability settings. Information about logs and metrics shipped to a dedicated deployment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentObservabilityResult> Observabilities;
        /// <summary>
        /// Region where the deployment is hosted.
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
