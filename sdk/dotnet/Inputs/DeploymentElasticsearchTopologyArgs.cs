// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchTopologyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Autoscaling policy defining the maximum and / or minimum total size for this topology element. For more information refer to the `autoscaling` block.
        /// </summary>
        [Input("autoscaling")]
        public Input<Inputs.DeploymentElasticsearchTopologyAutoscalingArgs>? Autoscaling { get; set; }

        [Input("configs")]
        private InputList<Inputs.DeploymentElasticsearchTopologyConfigArgs>? _configs;

        /// <summary>
        /// Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchTopologyConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.DeploymentElasticsearchTopologyConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Unique topology identifier. It generally refers to an Elasticsearch data tier, such as `hot_content`, `warm`, `cold`, `coordinating`, `frozen`, `ml` or `master`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Default instance configuration of the deployment template. No need to change this value since Kibana has only one _instance type_.
        /// </summary>
        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

        [Input("nodeRoles")]
        private InputList<string>? _nodeRoles;
        public InputList<string> NodeRoles
        {
            get => _nodeRoles ?? (_nodeRoles = new InputList<string>());
            set => _nodeRoles = value;
        }

        /// <summary>
        /// The node type for the Elasticsearch cluster (data node).
        /// </summary>
        [Input("nodeTypeData")]
        public Input<string>? NodeTypeData { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch cluster (ingest node).
        /// </summary>
        [Input("nodeTypeIngest")]
        public Input<string>? NodeTypeIngest { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch cluster (master node).
        /// </summary>
        [Input("nodeTypeMaster")]
        public Input<string>? NodeTypeMaster { get; set; }

        /// <summary>
        /// The node type for the Elasticsearch cluster (machine learning node).
        /// </summary>
        [Input("nodeTypeMl")]
        public Input<string>? NodeTypeMl { get; set; }

        /// <summary>
        /// Amount in Gigabytes per topology element in the `"&lt;size in GB&gt;g"` notation. When omitted, it defaults to the deployment template value.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// Type of resource to which the size is assigned. Defaults to `"memory"`.
        /// </summary>
        [Input("sizeResource")]
        public Input<string>? SizeResource { get; set; }

        /// <summary>
        /// Number of zones the instance type of the Elasticsearch cluster will span. This is used to set or unset HA on an Elasticsearch node type. When omitted, it defaults to the deployment template value.
        /// </summary>
        [Input("zoneCount")]
        public Input<int>? ZoneCount { get; set; }

        public DeploymentElasticsearchTopologyArgs()
        {
        }
    }
}
