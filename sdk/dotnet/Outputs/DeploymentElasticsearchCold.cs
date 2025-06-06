// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class DeploymentElasticsearchCold
    {
        /// <summary>
        /// Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
        /// </summary>
        public readonly Outputs.DeploymentElasticsearchColdAutoscaling Autoscaling;
        /// <summary>
        /// Instance Configuration ID of the topology element
        /// </summary>
        public readonly string? InstanceConfigurationId;
        /// <summary>
        /// Instance Configuration version of the topology element
        /// </summary>
        public readonly int? InstanceConfigurationVersion;
        /// <summary>
        /// Latest Instance Configuration ID available on the deployment template for the topology element
        /// </summary>
        public readonly string? LatestInstanceConfigurationId;
        /// <summary>
        /// Latest version available for the Instance Configuration with the latest*instance*configuration_id
        /// </summary>
        public readonly int? LatestInstanceConfigurationVersion;
        /// <summary>
        /// The computed list of node roles for the current topology element
        /// </summary>
        public readonly ImmutableArray<string> NodeRoles;
        /// <summary>
        /// The node type for the Elasticsearch Topology element (data node)
        /// </summary>
        public readonly string? NodeTypeData;
        /// <summary>
        /// The node type for the Elasticsearch Topology element (ingest node)
        /// </summary>
        public readonly string? NodeTypeIngest;
        /// <summary>
        /// The node type for the Elasticsearch Topology element (master node)
        /// </summary>
        public readonly string? NodeTypeMaster;
        /// <summary>
        /// The node type for the Elasticsearch Topology element (machine learning node)
        /// </summary>
        public readonly string? NodeTypeMl;
        /// <summary>
        /// Amount of "size_resource" per node in the "\n\ng" notation
        /// </summary>
        public readonly string? Size;
        /// <summary>
        /// Size type, defaults to "memory".
        /// </summary>
        public readonly string? SizeResource;
        /// <summary>
        /// Number of zones that the Elasticsearch cluster will span. This is used to set HA
        /// </summary>
        public readonly int? ZoneCount;

        [OutputConstructor]
        private DeploymentElasticsearchCold(
            Outputs.DeploymentElasticsearchColdAutoscaling autoscaling,

            string? instanceConfigurationId,

            int? instanceConfigurationVersion,

            string? latestInstanceConfigurationId,

            int? latestInstanceConfigurationVersion,

            ImmutableArray<string> nodeRoles,

            string? nodeTypeData,

            string? nodeTypeIngest,

            string? nodeTypeMaster,

            string? nodeTypeMl,

            string? size,

            string? sizeResource,

            int? zoneCount)
        {
            Autoscaling = autoscaling;
            InstanceConfigurationId = instanceConfigurationId;
            InstanceConfigurationVersion = instanceConfigurationVersion;
            LatestInstanceConfigurationId = latestInstanceConfigurationId;
            LatestInstanceConfigurationVersion = latestInstanceConfigurationVersion;
            NodeRoles = nodeRoles;
            NodeTypeData = nodeTypeData;
            NodeTypeIngest = nodeTypeIngest;
            NodeTypeMaster = nodeTypeMaster;
            NodeTypeMl = nodeTypeMl;
            Size = size;
            SizeResource = sizeResource;
            ZoneCount = zoneCount;
        }
    }
}
