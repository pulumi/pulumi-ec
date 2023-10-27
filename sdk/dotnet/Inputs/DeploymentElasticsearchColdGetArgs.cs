// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchColdGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
        /// </summary>
        [Input("autoscaling", required: true)]
        public Input<Inputs.DeploymentElasticsearchColdAutoscalingGetArgs> Autoscaling { get; set; } = null!;

        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

        [Input("nodeRoles")]
        private InputList<string>? _nodeRoles;

        /// <summary>
        /// The computed list of node roles for the current topology element
        /// </summary>
        public InputList<string> NodeRoles
        {
            get => _nodeRoles ?? (_nodeRoles = new InputList<string>());
            set => _nodeRoles = value;
        }

        /// <summary>
        /// The node type for the Elasticsearch Topology element (data node)
        /// </summary>
        [Input("nodeTypeData")]
        public Input<string>? NodeTypeData { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch Topology element (ingest node)
        /// </summary>
        [Input("nodeTypeIngest")]
        public Input<string>? NodeTypeIngest { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch Topology element (master node)
        /// </summary>
        [Input("nodeTypeMaster")]
        public Input<string>? NodeTypeMaster { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch Topology element (machine learning node)
        /// </summary>
        [Input("nodeTypeMl")]
        public Input<string>? NodeTypeMl { get; set; }

        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// Optional size type, defaults to "memory".
        /// </summary>
        [Input("sizeResource")]
        public Input<string>? SizeResource { get; set; }

        [Input("zoneCount")]
        public Input<int>? ZoneCount { get; set; }

        public DeploymentElasticsearchColdGetArgs()
        {
        }
        public static new DeploymentElasticsearchColdGetArgs Empty => new DeploymentElasticsearchColdGetArgs();
    }
}
