// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchHotAutoscalingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxSize")]
        public Input<string>? MaxSize { get; set; }

        [Input("maxSizeResource")]
        public Input<string>? MaxSizeResource { get; set; }

        [Input("minSize")]
        public Input<string>? MinSize { get; set; }

        [Input("minSizeResource")]
        public Input<string>? MinSizeResource { get; set; }

        [Input("policyOverrideJson")]
        public Input<string>? PolicyOverrideJson { get; set; }

        public DeploymentElasticsearchHotAutoscalingGetArgs()
        {
        }
        public static new DeploymentElasticsearchHotAutoscalingGetArgs Empty => new DeploymentElasticsearchHotAutoscalingGetArgs();
    }
}
