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
    public sealed class DeploymentElasticsearchCoordinatingAutoscaling
    {
        public readonly string? MaxSize;
        public readonly string? MaxSizeResource;
        public readonly string? MinSize;
        public readonly string? MinSizeResource;
        public readonly string? PolicyOverrideJson;

        [OutputConstructor]
        private DeploymentElasticsearchCoordinatingAutoscaling(
            string? maxSize,

            string? maxSizeResource,

            string? minSize,

            string? minSizeResource,

            string? policyOverrideJson)
        {
            MaxSize = maxSize;
            MaxSizeResource = maxSizeResource;
            MinSize = minSize;
            MinSizeResource = minSizeResource;
            PolicyOverrideJson = policyOverrideJson;
        }
    }
}
