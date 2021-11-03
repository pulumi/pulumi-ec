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
    public sealed class GetDeploymentKibanaTopologyResult
    {
        public readonly string InstanceConfigurationId;
        public readonly string Size;
        public readonly string SizeResource;
        public readonly int ZoneCount;

        [OutputConstructor]
        private GetDeploymentKibanaTopologyResult(
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
