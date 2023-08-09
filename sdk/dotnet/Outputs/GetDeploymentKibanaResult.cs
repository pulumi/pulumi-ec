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
    public sealed class GetDeploymentKibanaResult
    {
        /// <summary>
        /// A locally-unique friendly alias for an Elasticsearch resource in this deployment.
        /// </summary>
        public readonly string ElasticsearchClusterRefId;
        /// <summary>
        /// Kibana resource health status.
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// HTTP endpoint for the Kibana resource.
        /// </summary>
        public readonly string HttpEndpoint;
        /// <summary>
        /// HTTPS endpoint for the Kibana resource.
        /// </summary>
        public readonly string HttpsEndpoint;
        /// <summary>
        /// A locally-unique friendly alias for this Kibana resource.
        /// </summary>
        public readonly string RefId;
        /// <summary>
        /// The resource unique identifier.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// Kibana resource status (for example, "started", "stopped", etc).
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Node topology element definition.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentKibanaTopologyResult> Topologies;
        /// <summary>
        /// Elastic stack version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetDeploymentKibanaResult(
            string elasticsearchClusterRefId,

            bool healthy,

            string httpEndpoint,

            string httpsEndpoint,

            string refId,

            string resourceId,

            string status,

            ImmutableArray<Outputs.GetDeploymentKibanaTopologyResult> topologies,

            string version)
        {
            ElasticsearchClusterRefId = elasticsearchClusterRefId;
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
