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
    public sealed class GetDeploymentElasticsearchTopologyAutoscalingResult
    {
        /// <summary>
        /// Maximum size the tier can scale up to, e.g "64g".
        /// </summary>
        public readonly string MaxSize;
        /// <summary>
        /// Resource type used when specifying the maximum size the tier can scale up to.
        /// </summary>
        public readonly string MaxSizeResource;
        /// <summary>
        /// Minimum size the tier can scale down to when bidirectional autoscaling is supported.
        /// </summary>
        public readonly string MinSize;
        /// <summary>
        /// Resource type used when specifying the minimum size the tier can scale down to when bidirectional autoscaling is supported.
        /// </summary>
        public readonly string MinSizeResource;
        /// <summary>
        /// An arbitrary JSON object overriding the default autoscaling policy. Don't set unless you really know what you are doing.
        /// </summary>
        public readonly string PolicyOverrideJson;

        [OutputConstructor]
        private GetDeploymentElasticsearchTopologyAutoscalingResult(
            string maxSize,

            string maxSizeResource,

            string minSize,

            string minSizeResource,

            string policyOverrideJson)
        {
            MaxSize = maxSize;
            MaxSizeResource = maxSizeResource;
            MinSize = minSize;
            MinSizeResource = minSizeResource;
            PolicyOverrideJson = policyOverrideJson;
        }
    }
}
