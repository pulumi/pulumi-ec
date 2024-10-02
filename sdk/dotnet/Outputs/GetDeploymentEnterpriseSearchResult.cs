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
    public sealed class GetDeploymentEnterpriseSearchResult
    {
        /// <summary>
        /// A locally-unique friendly alias for an Elasticsearch resource in this deployment.
        /// </summary>
        public readonly string ElasticsearchClusterRefId;
        /// <summary>
        /// Enterprise Search resource health status.
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// HTTP endpoint for the Enterprise Search resource.
        /// </summary>
        public readonly string HttpEndpoint;
        /// <summary>
        /// HTTPS endpoint for the Enterprise Search resource.
        /// </summary>
        public readonly string HttpsEndpoint;
        /// <summary>
        /// A locally-unique friendly alias for this Enterprise Search resource.
        /// </summary>
        public readonly string RefId;
        /// <summary>
        /// The resource unique identifier.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// Enterprise Search resource status (for example, "started", "stopped", etc).
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Node topology element definition.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeploymentEnterpriseSearchTopologyResult> Topologies;
        /// <summary>
        /// Elastic stack version.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetDeploymentEnterpriseSearchResult(
            string elasticsearchClusterRefId,

            bool healthy,

            string httpEndpoint,

            string httpsEndpoint,

            string refId,

            string resourceId,

            string status,

            ImmutableArray<Outputs.GetDeploymentEnterpriseSearchTopologyResult> topologies,

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