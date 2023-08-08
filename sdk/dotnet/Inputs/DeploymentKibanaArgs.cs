// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentKibanaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally define the Kibana configuration options for the Kibana Server
        /// </summary>
        [Input("config")]
        public Input<Inputs.DeploymentKibanaConfigArgs>? Config { get; set; }

        [Input("elasticsearchClusterRefId")]
        public Input<string>? ElasticsearchClusterRefId { get; set; }

        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        [Input("httpsEndpoint")]
        public Input<string>? HttpsEndpoint { get; set; }

        [Input("instanceConfigurationId")]
        public Input<string>? InstanceConfigurationId { get; set; }

        [Input("refId")]
        public Input<string>? RefId { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `"ece-region".
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// Optional size type, defaults to "memory".
        /// </summary>
        [Input("sizeResource")]
        public Input<string>? SizeResource { get; set; }

        [Input("zoneCount")]
        public Input<int>? ZoneCount { get; set; }

        public DeploymentKibanaArgs()
        {
        }
        public static new DeploymentKibanaArgs Empty => new DeploymentKibanaArgs();
    }
}
