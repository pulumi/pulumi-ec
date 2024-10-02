// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class GetDeploymentElasticsearchResult
    {
        /// <summary>
        /// Whether or not Elasticsearch autoscaling is enabled.
        /// </summary>
        public readonly string Autoscale;
        /// <summary>
        /// The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
        /// </summary>
        public readonly string CloudId;
        /// <summary>
        /// Elasticsearch resource health status.
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// HTTP endpoint for the Elasticsearch resource.
        /// </summary>
        public readonly string HttpEndpoint;
        /// <summary>
        /// HTTPS endpoint for the Elasticsearch resource.
        /// </summary>
        public readonly string HttpsEndpoint;
        /// <summary>
        /// A locally-unique friendly alias for this Elasticsearch cluster.
        /// </summary>
        public readonly string RefId;
        /// <summary>
        /// The resource unique identifier.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// Elasticsearch resource status (for example, "started", "stopped", etc).
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Node topology element definition.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentElasticsearchTopologyResult> Topologies;
        /// <summary>
        /// Elastic stack version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetDeploymentElasticsearchResult(
            string autoscale,

            string cloudId,

            bool healthy,

            string httpEndpoint,

            string httpsEndpoint,

            string refId,

            string resourceId,

            string status,

            ImmutableArray<Outputs.GetDeploymentElasticsearchTopologyResult> topologies,

            string version)
        {
            Autoscale = autoscale;
            CloudId = cloudId;
            Healthy = healthy;
            HttpEndpoint = httpEndpoint;
            HttpsEndpoint = httpsEndpoint;
            RefId = refId;
            ResourceId = resourceId;
            Status = status;
            Topologies = topologies;
            Version = version;
        }
    }
}