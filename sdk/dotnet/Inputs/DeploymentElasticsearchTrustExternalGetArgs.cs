// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchTrustExternalGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the the trust relationship with external entities (remote environments, remote accounts...).
        /// </summary>
        [Input("relationshipId", required: true)]
        public Input<string> RelationshipId { get; set; } = null!;

        /// <summary>
        /// If true, all clusters in this account will by default be trusted and the `trust_allowlist` is ignored.
        /// </summary>
        [Input("trustAll", required: true)]
        public Input<bool> TrustAll { get; set; } = null!;

        [Input("trustAllowlists")]
        private InputList<string>? _trustAllowlists;

        /// <summary>
        /// The list of clusters to trust. Only used when `trust_all` is `false`.
        /// </summary>
        public InputList<string> TrustAllowlists
        {
            get => _trustAllowlists ?? (_trustAllowlists = new InputList<string>());
            set => _trustAllowlists = value;
        }

        public DeploymentElasticsearchTrustExternalGetArgs()
        {
        }
    }
}
