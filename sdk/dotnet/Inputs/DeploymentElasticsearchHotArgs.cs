// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchHotArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscaling", required: true)]
        public Input<Inputs.DeploymentElasticsearchHotAutoscalingArgs> Autoscaling { get; set; } = null!;

        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

        [Input("nodeRoles")]
        private InputList<string>? _nodeRoles;
        public InputList<string> NodeRoles
        {
            get => _nodeRoles ?? (_nodeRoles = new InputList<string>());
            set => _nodeRoles = value;
        }

        [Input("nodeTypeData")]
        public Input<string>? NodeTypeData { get; set; }

        [Input("nodeTypeIngest")]
        public Input<string>? NodeTypeIngest { get; set; }

        [Input("nodeTypeMaster")]
        public Input<string>? NodeTypeMaster { get; set; }

        [Input("nodeTypeMl")]
        public Input<string>? NodeTypeMl { get; set; }

        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("sizeResource")]
        public Input<string>? SizeResource { get; set; }

        [Input("zoneCount")]
        public Input<int>? ZoneCount { get; set; }

        public DeploymentElasticsearchHotArgs()
        {
        }
        public static new DeploymentElasticsearchHotArgs Empty => new DeploymentElasticsearchHotArgs();
    }
}
