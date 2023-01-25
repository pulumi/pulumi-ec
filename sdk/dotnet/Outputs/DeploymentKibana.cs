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
    public sealed class DeploymentKibana
    {
        /// <summary>
        /// Kibana settings applied to all topologies unless overridden in the `topology` element.
        /// </summary>
        public readonly Outputs.DeploymentKibanaConfig? Config;
        /// <summary>
        /// This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
        /// </summary>
        public readonly string? ElasticsearchClusterRefId;
        public readonly string? HttpEndpoint;
        public readonly string? HttpsEndpoint;
        /// <summary>
        /// Can be set on the Kibana resource. The default value `main-kibana` is recommended.
        /// </summary>
        public readonly string? RefId;
        /// <summary>
        /// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
        /// </summary>
        public readonly string? Region;
        public readonly string? ResourceId;
        /// <summary>
        /// Can be set multiple times to compose complex topologies.
        /// </summary>
        public readonly Outputs.DeploymentKibanaTopology? Topology;

        [OutputConstructor]
        private DeploymentKibana(
            Outputs.DeploymentKibanaConfig? config,

            string? elasticsearchClusterRefId,

            string? httpEndpoint,

            string? httpsEndpoint,

            string? refId,

            string? region,

            string? resourceId,

            Outputs.DeploymentKibanaTopology? topology)
        {
            Config = config;
            ElasticsearchClusterRefId = elasticsearchClusterRefId;
            HttpEndpoint = httpEndpoint;
            HttpsEndpoint = httpsEndpoint;
            RefId = refId;
            Region = region;
            ResourceId = resourceId;
            Topology = topology;
        }
    }
}
