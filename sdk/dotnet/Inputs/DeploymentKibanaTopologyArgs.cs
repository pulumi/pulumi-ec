// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentKibanaTopologyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default instance configuration of the deployment template. No need to change this value since Kibana has only one _instance type_.
        /// </summary>
        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

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

        public DeploymentKibanaTopologyArgs()
        {
        }
    }
}
