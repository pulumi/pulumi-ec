// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable autoscaling. Defaults to the setting coming from the deployment template.
        /// </summary>
        [Input("autoscale")]
        public Input<bool>? Autoscale { get; set; }

        [Input("cloudId")]
        public Input<string>? CloudId { get; set; }

        /// <summary>
        /// 'cold' topology element
        /// </summary>
        [Input("cold")]
        public Input<Inputs.DeploymentElasticsearchColdGetArgs>? Cold { get; set; }

        /// <summary>
        /// Elasticsearch settings which will be applied to all topologies
        /// </summary>
        [Input("config")]
        public Input<Inputs.DeploymentElasticsearchConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// 'coordinating' topology element
        /// </summary>
        [Input("coordinating")]
        public Input<Inputs.DeploymentElasticsearchCoordinatingGetArgs>? Coordinating { get; set; }

        [Input("extensions")]
        private InputList<Inputs.DeploymentElasticsearchExtensionGetArgs>? _extensions;

        /// <summary>
        /// Optional Elasticsearch extensions such as custom bundles or plugins.
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchExtensionGetArgs> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<Inputs.DeploymentElasticsearchExtensionGetArgs>());
            set => _extensions = value;
        }

        /// <summary>
        /// 'frozen' topology element
        /// </summary>
        [Input("frozen")]
        public Input<Inputs.DeploymentElasticsearchFrozenGetArgs>? Frozen { get; set; }

        /// <summary>
        /// 'hot' topology element
        /// </summary>
        [Input("hot", required: true)]
        public Input<Inputs.DeploymentElasticsearchHotGetArgs> Hot { get; set; } = null!;

        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        [Input("httpsEndpoint")]
        public Input<string>? HttpsEndpoint { get; set; }

        [Input("keystoreContents")]
        private InputMap<Inputs.DeploymentElasticsearchKeystoreContentsGetArgs>? _keystoreContents;

        /// <summary>
        /// Keystore contents that are controlled by the deployment resource.
        /// </summary>
        public InputMap<Inputs.DeploymentElasticsearchKeystoreContentsGetArgs> KeystoreContents
        {
            get => _keystoreContents ?? (_keystoreContents = new InputMap<Inputs.DeploymentElasticsearchKeystoreContentsGetArgs>());
            set => _keystoreContents = value;
        }

        /// <summary>
        /// 'master' topology element
        /// </summary>
        [Input("master")]
        public Input<Inputs.DeploymentElasticsearchMasterGetArgs>? Master { get; set; }

        /// <summary>
        /// 'ml' topology element
        /// </summary>
        [Input("ml")]
        public Input<Inputs.DeploymentElasticsearchMlGetArgs>? Ml { get; set; }

        /// <summary>
        /// A human readable reference for the Elasticsearch resource. The default value `main-elasticsearch` is recommended.
        /// </summary>
        [Input("refId")]
        public Input<string>? RefId { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `"ece-region".
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("remoteClusters")]
        private InputList<Inputs.DeploymentElasticsearchRemoteClusterGetArgs>? _remoteClusters;

        /// <summary>
        /// Optional Elasticsearch remote clusters to configure for the Elasticsearch resource, can be set multiple times
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchRemoteClusterGetArgs> RemoteClusters
        {
            get => _remoteClusters ?? (_remoteClusters = new InputList<Inputs.DeploymentElasticsearchRemoteClusterGetArgs>());
            set => _remoteClusters = value;
        }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// (ECE only) Snapshot configuration settings for an Elasticsearch cluster.
        /// </summary>
        [Input("snapshot")]
        public Input<Inputs.DeploymentElasticsearchSnapshotGetArgs>? Snapshot { get; set; }

        [Input("snapshotSource")]
        public Input<Inputs.DeploymentElasticsearchSnapshotSourceGetArgs>? SnapshotSource { get; set; }

        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        [Input("trustAccounts")]
        private InputList<Inputs.DeploymentElasticsearchTrustAccountGetArgs>? _trustAccounts;
        public InputList<Inputs.DeploymentElasticsearchTrustAccountGetArgs> TrustAccounts
        {
            get => _trustAccounts ?? (_trustAccounts = new InputList<Inputs.DeploymentElasticsearchTrustAccountGetArgs>());
            set => _trustAccounts = value;
        }

        [Input("trustExternals")]
        private InputList<Inputs.DeploymentElasticsearchTrustExternalGetArgs>? _trustExternals;
        public InputList<Inputs.DeploymentElasticsearchTrustExternalGetArgs> TrustExternals
        {
            get => _trustExternals ?? (_trustExternals = new InputList<Inputs.DeploymentElasticsearchTrustExternalGetArgs>());
            set => _trustExternals = value;
        }

        [Input("warm")]
        public Input<Inputs.DeploymentElasticsearchWarmGetArgs>? Warm { get; set; }

        public DeploymentElasticsearchGetArgs()
        {
        }
        public static new DeploymentElasticsearchGetArgs Empty => new DeploymentElasticsearchGetArgs();
    }
}
