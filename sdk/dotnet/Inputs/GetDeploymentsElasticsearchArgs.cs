// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class GetDeploymentsElasticsearchInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Overall health status of the resource instances.
        /// </summary>
        [Input("healthy")]
        public Input<string>? Healthy { get; set; }

        /// <summary>
        /// Resource kind status. Can be one of `initializing`, `stopping`, `stopped`, `rebooting`, `restarting`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Elastic stack version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GetDeploymentsElasticsearchInputArgs()
        {
        }
        public static new GetDeploymentsElasticsearchInputArgs Empty => new GetDeploymentsElasticsearchInputArgs();
    }
}
