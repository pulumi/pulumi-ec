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
    public sealed class DeploymentKibanaTopology
    {
        /// <summary>
        /// Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        public readonly string? InstanceConfigurationId;
        /// <summary>
        /// Amount of memory (RAM) per `topology` element in the "&lt;size in GB&gt;g" notation. When omitted, it defaults to the deployment template value.
        /// </summary>
        public readonly string? Size;
        /// <summary>
        /// Type of resource to which the size is assigned. Defaults to `"memory"`.
        /// </summary>
        public readonly string? SizeResource;
        /// <summary>
        /// Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
        /// </summary>
        public readonly int? ZoneCount;

        [OutputConstructor]
        private DeploymentKibanaTopology(
            string? instanceConfigurationId,

            string? size,

            string? sizeResource,

            int? zoneCount)
        {
            InstanceConfigurationId = instanceConfigurationId;
            Size = size;
            SizeResource = sizeResource;
            ZoneCount = zoneCount;
        }
    }
}
