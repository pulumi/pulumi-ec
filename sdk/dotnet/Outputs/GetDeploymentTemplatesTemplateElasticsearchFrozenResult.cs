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
    public sealed class GetDeploymentTemplatesTemplateElasticsearchFrozenResult
    {
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchFrozenAutoscalingResult Autoscaling;
        public readonly ImmutableArray<string> AvailableSizes;
        public readonly string DefaultSize;
        public readonly string InstanceConfigurationId;
        public readonly double InstanceConfigurationVersion;
        public readonly string SizeResource;

        [OutputConstructor]
        private GetDeploymentTemplatesTemplateElasticsearchFrozenResult(
            Outputs.GetDeploymentTemplatesTemplateElasticsearchFrozenAutoscalingResult autoscaling,

            ImmutableArray<string> availableSizes,

            string defaultSize,

            string instanceConfigurationId,

            double instanceConfigurationVersion,

            string sizeResource)
        {
            Autoscaling = autoscaling;
            AvailableSizes = availableSizes;
            DefaultSize = defaultSize;
            InstanceConfigurationId = instanceConfigurationId;
            InstanceConfigurationVersion = instanceConfigurationVersion;
            SizeResource = sizeResource;
        }
    }
}
