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
        public readonly string Alias;
        public readonly string DeploymentId;
        public readonly string? RefId;
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
