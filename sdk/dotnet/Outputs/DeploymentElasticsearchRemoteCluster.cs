// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class DeploymentElasticsearchRemoteCluster
    {
        /// <summary>
        /// Alias for the Cross Cluster Search binding.
        /// </summary>
        public readonly string Alias;
        /// <summary>
        /// Remote deployment ID.
        /// </summary>
        public readonly string DeploymentId;
        /// <summary>
        /// Remote Elasticsearch `ref_id`. The default value `main-elasticsearch` is recommended.
        /// </summary>
        public readonly string? RefId;
        /// <summary>
        /// If true, skip the cluster during search when disconnected. Defaults to `false`.
        /// </summary>
        public readonly bool? SkipUnavailable;

        [OutputConstructor]
        private DeploymentElasticsearchRemoteCluster(
            string alias,

            string deploymentId,

            string? refId,

            bool? skipUnavailable)
        {
            Alias = alias;
            DeploymentId = deploymentId;
            RefId = refId;
            SkipUnavailable = skipUnavailable;
        }
    }
}
