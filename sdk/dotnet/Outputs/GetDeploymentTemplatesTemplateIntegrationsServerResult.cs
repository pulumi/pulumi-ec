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
    public sealed class GetDeploymentTemplatesTemplateIntegrationsServerResult
    {
        public readonly ImmutableArray<string> AvailableSizes;
        public readonly string DefaultSize;
        public readonly string InstanceConfigurationId;
        public readonly double InstanceConfigurationVersion;
        public readonly string SizeResource;

        [OutputConstructor]
        private GetDeploymentTemplatesTemplateIntegrationsServerResult(
            ImmutableArray<string> availableSizes,

            string defaultSize,

            string instanceConfigurationId,

            double instanceConfigurationVersion,

            string sizeResource)
        {
            AvailableSizes = availableSizes;
            DefaultSize = defaultSize;
            InstanceConfigurationId = instanceConfigurationId;
            InstanceConfigurationVersion = instanceConfigurationVersion;
            SizeResource = sizeResource;
        }
    }
}
