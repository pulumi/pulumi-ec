// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentEnterpriseSearchGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enterprise Search settings applied to all topologies unless overridden in the `topology` element.
        /// </summary>
        [Input("config")]
        public Input<Inputs.DeploymentEnterpriseSearchConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
        /// </summary>
        [Input("elasticsearchClusterRefId")]
        public Input<string>? ElasticsearchClusterRefId { get; set; }

        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        [Input("httpsEndpoint")]
        public Input<string>? HttpsEndpoint { get; set; }

        /// <summary>
        /// Can be set on the Enterprise Search resource. The default value `main-enterprise_search` is recommended.
        /// </summary>
        [Input("refId")]
        public Input<string>? RefId { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("topologies")]
        private InputList<Inputs.DeploymentEnterpriseSearchTopologyGetArgs>? _topologies;

        /// <summary>
        /// Can be set multiple times to compose complex topologies.
        /// </summary>
        public InputList<Inputs.DeploymentEnterpriseSearchTopologyGetArgs> Topologies
        {
            get => _topologies ?? (_topologies = new InputList<Inputs.DeploymentEnterpriseSearchTopologyGetArgs>());
            set => _topologies = value;
        }

        public DeploymentEnterpriseSearchGetArgs()
        {
        }
    }
}
