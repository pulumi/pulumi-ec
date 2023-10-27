// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchKeystoreContentsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the secret is handled as a file. Otherwise, it's handled as a plain string.
        /// </summary>
        [Input("asFile")]
        public Input<bool>? AsFile { get; set; }

        [Input("value", required: true)]
        private Input<string>? _value;

        /// <summary>
        /// Secret value. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public DeploymentElasticsearchKeystoreContentsGetArgs()
        {
        }
        public static new DeploymentElasticsearchKeystoreContentsGetArgs Empty => new DeploymentElasticsearchKeystoreContentsGetArgs();
    }
}
