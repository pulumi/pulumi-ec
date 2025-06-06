// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = ElasticCloud.GetDeployment.Invoke(new()
    ///     {
    ///         Id = "320b7b540dfc967a7a649c18e2fce4ed",
    ///     });
    /// 
    ///     var exampleDeploymentTrafficFilter = new ElasticCloud.DeploymentTrafficFilter("example", new()
    ///     {
    ///         Name = "my traffic filter name",
    ///         Region = "us-east-1",
    ///         Type = "ip",
    ///         Rules = new[]
    ///         {
    ///             new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///             {
    ///                 Source = "0.0.0.0/0",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleDeploymentTrafficFilterAssociation = new ElasticCloud.DeploymentTrafficFilterAssociation("example", new()
    ///     {
    ///         TrafficFilterId = exampleDeploymentTrafficFilter.Id,
    ///         DeploymentId = exampleEcDeployment.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import is not supported on this resource
    /// </summary>
    [ElasticCloudResourceType("ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation")]
    public partial class DeploymentTrafficFilterAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Required deployment ID where the traffic filter will be associated
        /// </summary>
        [Output("deploymentId")]
        public Output<string> DeploymentId { get; private set; } = null!;

        /// <summary>
        /// Required traffic filter ruleset ID to tie to a deployment
        /// </summary>
        [Output("trafficFilterId")]
        public Output<string> TrafficFilterId { get; private set; } = null!;


        /// <summary>
        /// Create a DeploymentTrafficFilterAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeploymentTrafficFilterAssociation(string name, DeploymentTrafficFilterAssociationArgs args, CustomResourceOptions? options = null)
            : base("ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation", name, args ?? new DeploymentTrafficFilterAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeploymentTrafficFilterAssociation(string name, Input<string> id, DeploymentTrafficFilterAssociationState? state = null, CustomResourceOptions? options = null)
            : base("ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DeploymentTrafficFilterAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeploymentTrafficFilterAssociation Get(string name, Input<string> id, DeploymentTrafficFilterAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new DeploymentTrafficFilterAssociation(name, id, state, options);
        }
    }

    public sealed class DeploymentTrafficFilterAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required deployment ID where the traffic filter will be associated
        /// </summary>
        [Input("deploymentId", required: true)]
        public Input<string> DeploymentId { get; set; } = null!;

        /// <summary>
        /// Required traffic filter ruleset ID to tie to a deployment
        /// </summary>
        [Input("trafficFilterId", required: true)]
        public Input<string> TrafficFilterId { get; set; } = null!;

        public DeploymentTrafficFilterAssociationArgs()
        {
        }
        public static new DeploymentTrafficFilterAssociationArgs Empty => new DeploymentTrafficFilterAssociationArgs();
    }

    public sealed class DeploymentTrafficFilterAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required deployment ID where the traffic filter will be associated
        /// </summary>
        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        /// <summary>
        /// Required traffic filter ruleset ID to tie to a deployment
        /// </summary>
        [Input("trafficFilterId")]
        public Input<string>? TrafficFilterId { get; set; }

        public DeploymentTrafficFilterAssociationState()
        {
        }
        public static new DeploymentTrafficFilterAssociationState Empty => new DeploymentTrafficFilterAssociationState();
    }
}
