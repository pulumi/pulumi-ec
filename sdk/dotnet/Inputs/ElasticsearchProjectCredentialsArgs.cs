// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class ElasticsearchProjectCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Basic auth password that can be used to access the Elasticsearch API.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Basic auth username that can be used to access the Elasticsearch API.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ElasticsearchProjectCredentialsArgs()
        {
        }
        public static new ElasticsearchProjectCredentialsArgs Empty => new ElasticsearchProjectCredentialsArgs();
    }
}
