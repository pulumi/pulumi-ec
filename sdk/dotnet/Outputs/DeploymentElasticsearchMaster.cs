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
    public sealed class DeploymentElasticsearchMaster
    {
        /// <summary>
        /// Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
        /// </summary>
        public readonly Outputs.DeploymentElasticsearchMasterAutoscaling Autoscaling;
        public readonly string? InstanceConfigurationId;
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
        public readonly string? Size;
        /// <summary>
        /// Optional size type, defaults to "memory".
        /// </summary>
        public readonly string? SizeResource;
        public readonly int? ZoneCount;

        [OutputConstructor]
        private DeploymentElasticsearchMaster(
            Outputs.DeploymentElasticsearchMasterAutoscaling autoscaling,

            string? instanceConfigurationId,

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
