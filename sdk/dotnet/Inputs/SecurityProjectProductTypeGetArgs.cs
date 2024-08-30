// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class SecurityProjectProductTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the Security Solution product line.
        /// </summary>
        [Input("productLine", required: true)]
        public Input<string> ProductLine { get; set; } = null!;

        /// <summary>
        /// The identifier of the Security Solution product tier.
        /// </summary>
        [Input("productTier", required: true)]
        public Input<string> ProductTier { get; set; } = null!;

        public SecurityProjectProductTypeGetArgs()
        {
        }
        public static new SecurityProjectProductTypeGetArgs Empty => new SecurityProjectProductTypeGetArgs();
    }
}
