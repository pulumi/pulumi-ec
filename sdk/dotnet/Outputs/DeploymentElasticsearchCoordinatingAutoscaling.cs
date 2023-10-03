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
        /// <summary>
        /// Maximum size value for the maximum autoscaling setting.
        /// </summary>
        public readonly string? MaxSize;
        /// <summary>
        /// Maximum resource type for the maximum autoscaling setting.
        /// </summary>
        public readonly string? MaxSizeResource;
        /// <summary>
        /// Minimum size value for the minimum autoscaling setting.
        /// </summary>
        public readonly string? MinSize;
        /// <summary>
        /// Minimum resource type for the minimum autoscaling setting.
        /// </summary>
        public readonly string? MinSizeResource;
        /// <summary>
        /// Computed policy overrides set directly via the API or other clients.
        /// </summary>
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
