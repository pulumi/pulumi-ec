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
    public sealed class DeploymentEnterpriseSearch
    {
        /// <summary>
        /// Optionally define the Enterprise Search configuration options for the Enterprise Search Server
        /// </summary>
        public readonly Outputs.DeploymentEnterpriseSearchConfig? Config;
        public readonly string? ElasticsearchClusterRefId;
        public readonly string? HttpEndpoint;
        public readonly string? HttpsEndpoint;
        public readonly string? InstanceConfigurationId;
        public readonly bool? NodeTypeAppserver;
        public readonly bool? NodeTypeConnector;
        public readonly bool? NodeTypeWorker;
        public readonly string? RefId;
        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `"ece-region".
        /// </summary>
        public readonly string? Region;
        public readonly string? ResourceId;
        public readonly string? Size;
        /// <summary>
        /// Optional size type, defaults to "memory".
        /// </summary>
        public readonly string? SizeResource;
        public readonly int? ZoneCount;

        [OutputConstructor]
        private DeploymentEnterpriseSearch(
            Outputs.DeploymentEnterpriseSearchConfig? config,

            string? elasticsearchClusterRefId,

            string? httpEndpoint,

            string? httpsEndpoint,

            string? instanceConfigurationId,

            bool? nodeTypeAppserver,

            bool? nodeTypeConnector,

            bool? nodeTypeWorker,

            string? refId,

            string? region,

            string? resourceId,

            string? size,

            string? sizeResource,

            int? zoneCount)
        {
            Config = config;
            ElasticsearchClusterRefId = elasticsearchClusterRefId;
            HttpEndpoint = httpEndpoint;
            HttpsEndpoint = httpsEndpoint;
            InstanceConfigurationId = instanceConfigurationId;
            NodeTypeAppserver = nodeTypeAppserver;
            NodeTypeConnector = nodeTypeConnector;
            NodeTypeWorker = nodeTypeWorker;
            RefId = refId;
            Region = region;
            ResourceId = resourceId;
            Size = size;
            SizeResource = sizeResource;
            ZoneCount = zoneCount;
        }
    }
}
