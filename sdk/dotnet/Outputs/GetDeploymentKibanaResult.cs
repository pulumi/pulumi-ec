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
        public readonly string ElasticsearchClusterRefId;
        /// <summary>
        /// Overall health status of the deployment.
        /// </summary>
        public readonly bool Healthy;
        public readonly string HttpEndpoint;
        public readonly string HttpsEndpoint;
        public readonly string RefId;
        public readonly string ResourceId;
        public readonly string Status;
        public readonly ImmutableArray<Outputs.GetDeploymentKibanaTopologyResult> Topologies;
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
