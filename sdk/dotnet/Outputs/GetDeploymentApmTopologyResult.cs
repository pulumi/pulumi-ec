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
    public sealed class GetDeploymentApmTopologyResult
    {
        /// <summary>
        /// Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        /// </summary>
        public readonly string InstanceConfigurationId;
        /// <summary>
        /// Amount of "size_resource" in Gigabytes. For example "4g".
        /// </summary>
        public readonly string Size;
        /// <summary>
        /// Type of resource ("memory" or "storage")
        /// </summary>
        public readonly string SizeResource;
        /// <summary>
        /// Number of zones in which nodes will be placed.
        /// </summary>
        public readonly int ZoneCount;

        [OutputConstructor]
        private GetDeploymentApmTopologyResult(
            string instanceConfigurationId,

            string size,

            string sizeResource,

            int zoneCount)
        {
            InstanceConfigurationId = instanceConfigurationId;
            Size = size;
            SizeResource = sizeResource;
            ZoneCount = zoneCount;
        }
    }
}