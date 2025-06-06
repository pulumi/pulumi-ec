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
    public sealed class GetDeploymentTemplatesTemplateElasticsearchWarmAutoscalingResult
    {
        public readonly bool Autoscale;
        public readonly string MaxSize;
        public readonly string MaxSizeResource;
        public readonly string MinSize;
        public readonly string MinSizeResource;

        [OutputConstructor]
        private GetDeploymentTemplatesTemplateElasticsearchWarmAutoscalingResult(
            bool autoscale,

            string maxSize,

            string maxSizeResource,

            string minSize,

            string minSizeResource)
        {
            Autoscale = autoscale;
            MaxSize = maxSize;
            MaxSizeResource = maxSizeResource;
            MinSize = minSize;
            MinSizeResource = minSizeResource;
        }
    }
}
