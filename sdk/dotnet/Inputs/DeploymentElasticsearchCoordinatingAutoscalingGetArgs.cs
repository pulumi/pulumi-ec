// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchCoordinatingAutoscalingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this specific tier should be auto-scaled, overrides deployment-wide setting. Allowed for `ml` tier only.
        /// </summary>
        [Input("autoscale")]
        public Input<bool>? Autoscale { get; set; }

        /// <summary>
        /// Maximum size value for the maximum autoscaling setting.
        /// </summary>
        [Input("maxSize")]
        public Input<string>? MaxSize { get; set; }

        /// <summary>
        /// Maximum resource type for the maximum autoscaling setting.
        /// </summary>
        [Input("maxSizeResource")]
        public Input<string>? MaxSizeResource { get; set; }

        /// <summary>
        /// Minimum size value for the minimum autoscaling setting.
        /// </summary>
        [Input("minSize")]
        public Input<string>? MinSize { get; set; }

        /// <summary>
        /// Minimum resource type for the minimum autoscaling setting.
        /// </summary>
        [Input("minSizeResource")]
        public Input<string>? MinSizeResource { get; set; }

        /// <summary>
        /// Computed policy overrides set directly via the API or other clients.
        /// </summary>
        [Input("policyOverrideJson")]
        public Input<string>? PolicyOverrideJson { get; set; }

        public DeploymentElasticsearchCoordinatingAutoscalingGetArgs()
        {
        }
        public static new DeploymentElasticsearchCoordinatingAutoscalingGetArgs Empty => new DeploymentElasticsearchCoordinatingAutoscalingGetArgs();
    }
}
