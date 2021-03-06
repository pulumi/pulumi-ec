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
    public sealed class DeploymentElasticsearchTopologyAutoscaling
    {
        /// <summary>
        /// Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
        /// </summary>
        public readonly string? MaxSize;
        /// <summary>
        /// Defines the resource type the scale up will use (Defaults to `"memory"`).
        /// </summary>
        public readonly string? MaxSizeResource;
        /// <summary>
        /// Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
        /// </summary>
        public readonly string? MinSize;
        /// <summary>
        /// Defines the resource type the scale down will use (Defaults to `"memory"`).
        /// </summary>
        public readonly string? MinSizeResource;
        public readonly string? PolicyOverrideJson;

        [OutputConstructor]
        private DeploymentElasticsearchTopologyAutoscaling(
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
