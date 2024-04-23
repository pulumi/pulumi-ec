// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchMlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
        /// </summary>
        [Input("autoscaling", required: true)]
        public Input<Inputs.DeploymentElasticsearchMlAutoscalingArgs> Autoscaling { get; set; } = null!;

        /// <summary>
        /// Instance Configuration ID of the topology element
        /// </summary>
        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

        /// <summary>
        /// Instance Configuration version of the topology element
        /// </summary>
        [Input("instanceConfigurationVersion")]
        public Input<int>? InstanceConfigurationVersion { get; set; }

        /// <summary>
        /// Latest Instance Configuration ID available on the deployment template for the topology element
        /// </summary>
        [Input("latestInstanceConfigurationId")]
        public Input<string>? LatestInstanceConfigurationId { get; set; }

        /// <summary>
        /// Latest version available for the Instance Configuration with the latest*instance*configuration_id
        /// </summary>
        [Input("latestInstanceConfigurationVersion")]
        public Input<int>? LatestInstanceConfigurationVersion { get; set; }

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

        /// <summary>
        /// Amount of "size_resource" per node in the "\n\ng" notation
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// Size type, defaults to "memory".
        /// </summary>
        [Input("sizeResource")]
        public Input<string>? SizeResource { get; set; }

        /// <summary>
        /// Number of zones that the Elasticsearch cluster will span. This is used to set HA
        /// </summary>
        [Input("zoneCount")]
        public Input<int>? ZoneCount { get; set; }

        public DeploymentElasticsearchMlArgs()
        {
        }
        public static new DeploymentElasticsearchMlArgs Empty => new DeploymentElasticsearchMlArgs();
    }
}
