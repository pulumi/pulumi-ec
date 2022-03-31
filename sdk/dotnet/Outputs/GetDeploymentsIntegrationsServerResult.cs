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
    public sealed class GetDeploymentsIntegrationsServerResult
    {
        /// <summary>
        /// Overall health status of the deployment.
        /// </summary>
        public readonly string? Healthy;
        public readonly string? Status;
        public readonly string? Version;

        [OutputConstructor]
        private GetDeploymentsIntegrationsServerResult(
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