// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable or disable autoscaling. Defaults to the setting coming from the deployment template.
        /// </summary>
        [Input("autoscale")]
        public Input<bool>? Autoscale { get; set; }

        /// <summary>
        /// The encoded Elasticsearch credentials to use in Beats or Logstash
        /// </summary>
        [Input("cloudId")]
        public Input<string>? CloudId { get; set; }

        /// <summary>
        /// 'cold' topology element
        /// </summary>
        [Input("cold")]
        public Input<Inputs.DeploymentElasticsearchColdArgs>? Cold { get; set; }

        /// <summary>
        /// Elasticsearch settings which will be applied to all topologies
        /// </summary>
        [Input("config")]
        public Input<Inputs.DeploymentElasticsearchConfigArgs>? Config { get; set; }

        /// <summary>
        /// 'coordinating' topology element
        /// </summary>
        [Input("coordinating")]
        public Input<Inputs.DeploymentElasticsearchCoordinatingArgs>? Coordinating { get; set; }

        [Input("extensions")]
        private InputList<Inputs.DeploymentElasticsearchExtensionArgs>? _extensions;

        /// <summary>
        /// Optional Elasticsearch extensions such as custom bundles or plugins.
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchExtensionArgs> Extensions
        {
            get => _extensions ?? (_extensions = new InputList<Inputs.DeploymentElasticsearchExtensionArgs>());
            set => _extensions = value;
        }

        /// <summary>
        /// 'frozen' topology element
        /// </summary>
        [Input("frozen")]
        public Input<Inputs.DeploymentElasticsearchFrozenArgs>? Frozen { get; set; }

        /// <summary>
        /// 'hot' topology element
        /// </summary>
        [Input("hot", required: true)]
        public Input<Inputs.DeploymentElasticsearchHotArgs> Hot { get; set; } = null!;

        /// <summary>
        /// The Elasticsearch resource HTTP endpoint
        /// </summary>
        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        /// <summary>
        /// The Elasticsearch resource HTTPs endpoint
        /// </summary>
        [Input("httpsEndpoint")]
        public Input<string>? HttpsEndpoint { get; set; }

        [Input("keystoreContents")]
        private InputMap<Inputs.DeploymentElasticsearchKeystoreContentsArgs>? _keystoreContents;

        /// <summary>
        /// Keystore contents that are controlled by the deployment resource.
        /// </summary>
        public InputMap<Inputs.DeploymentElasticsearchKeystoreContentsArgs> KeystoreContents
        {
            get => _keystoreContents ?? (_keystoreContents = new InputMap<Inputs.DeploymentElasticsearchKeystoreContentsArgs>());
            set => _keystoreContents = value;
        }

        /// <summary>
        /// 'master' topology element
        /// </summary>
        [Input("master")]
        public Input<Inputs.DeploymentElasticsearchMasterArgs>? Master { get; set; }

        /// <summary>
        /// 'ml' topology element
        /// </summary>
        [Input("ml")]
        public Input<Inputs.DeploymentElasticsearchMlArgs>? Ml { get; set; }

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
        private InputList<Inputs.DeploymentElasticsearchRemoteClusterArgs>? _remoteClusters;

        /// <summary>
        /// Optional Elasticsearch remote clusters to configure for the Elasticsearch resource, can be set multiple times
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchRemoteClusterArgs> RemoteClusters
        {
            get => _remoteClusters ?? (_remoteClusters = new InputList<Inputs.DeploymentElasticsearchRemoteClusterArgs>());
            set => _remoteClusters = value;
        }

        /// <summary>
        /// The Elasticsearch resource unique identifier
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// (ECE only) Snapshot configuration settings for an Elasticsearch cluster.
        /// </summary>
        [Input("snapshot")]
        public Input<Inputs.DeploymentElasticsearchSnapshotArgs>? Snapshot { get; set; }

        [Input("snapshotSource")]
        public Input<Inputs.DeploymentElasticsearchSnapshotSourceArgs>? SnapshotSource { get; set; }

        /// <summary>
        /// Configuration strategy type autodetect, grow_and_shrink, rolling_grow_and_shrink, rolling_all
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        [Input("trustAccounts")]
        private InputList<Inputs.DeploymentElasticsearchTrustAccountArgs>? _trustAccounts;

        /// <summary>
        /// Optional Elasticsearch account trust settings.
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchTrustAccountArgs> TrustAccounts
        {
            get => _trustAccounts ?? (_trustAccounts = new InputList<Inputs.DeploymentElasticsearchTrustAccountArgs>());
            set => _trustAccounts = value;
        }

        [Input("trustExternals")]
        private InputList<Inputs.DeploymentElasticsearchTrustExternalArgs>? _trustExternals;

        /// <summary>
        /// Optional Elasticsearch external trust settings.
        /// </summary>
        public InputList<Inputs.DeploymentElasticsearchTrustExternalArgs> TrustExternals
        {
            get => _trustExternals ?? (_trustExternals = new InputList<Inputs.DeploymentElasticsearchTrustExternalArgs>());
            set => _trustExternals = value;
        }

        /// <summary>
        /// 'warm' topology element
        /// </summary>
        [Input("warm")]
        public Input<Inputs.DeploymentElasticsearchWarmArgs>? Warm { get; set; }

        public DeploymentElasticsearchArgs()
        {
        }
        public static new DeploymentElasticsearchArgs Empty => new DeploymentElasticsearchArgs();
    }
}
