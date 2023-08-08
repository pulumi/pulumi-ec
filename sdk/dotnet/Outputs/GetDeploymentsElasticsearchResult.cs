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
    public sealed class GetDeploymentsElasticsearchResult
    {
        /// <summary>
        /// Overall health status of the resource instances.
        /// </summary>
        public readonly string? Healthy;
        /// <summary>
        /// Resource kind status. Can be one of `initializing`, `stopping`, `stopped`, `rebooting`, `restarting`.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// Elastic stack version.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GetDeploymentsElasticsearchResult(
            string? healthy,

            string? status,

            string? version)
        {
            Healthy = healthy;
            Status = status;
            Version = version;
        }
    }
}
