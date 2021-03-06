// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud
{
    /// <summary>
    /// Provides an Elastic Cloud traffic filter resource, which allows traffic filter rules to be created, updated, and deleted. Traffic filter rules are used to limit inbound traffic to deployment resources.
    /// 
    /// ## Example Usage
    /// ### IP type
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var latest = Output.Create(ElasticCloud.GetStack.InvokeAsync(new ElasticCloud.GetStackArgs
    ///         {
    ///             VersionRegex = "latest",
    ///             Region = "us-east-1",
    ///         }));
    ///         var example = new ElasticCloud.DeploymentTrafficFilter("example", new ElasticCloud.DeploymentTrafficFilterArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Type = "ip",
    ///             Rules = 
    ///             {
    ///                 new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///                 {
    ///                     Source = "0.0.0.0/0",
    ///                 },
    ///             },
    ///         });
    ///         // Create an Elastic Cloud deployment
    ///         var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             TrafficFilters = 
    ///             {
    ///                 example.Id,
    ///             },
    ///             Elasticsearch = ,
    ///             Kibana = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Azure Private Link type
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var region = azure_australiaeast;
    ///         var latest = Output.Create(ElasticCloud.GetStack.InvokeAsync(new ElasticCloud.GetStackArgs
    ///         {
    ///             VersionRegex = "latest",
    ///             Region = region,
    ///         }));
    ///         var azure = new ElasticCloud.DeploymentTrafficFilter("azure", new ElasticCloud.DeploymentTrafficFilterArgs
    ///         {
    ///             Region = region,
    ///             Type = "azure_private_endpoint",
    ///             Rules = 
    ///             {
    ///                 new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///                 {
    ///                     AzureEndpointName = "my-azure-pl",
    ///                     AzureEndpointGuid = "78c64959-fd88-41cc-81ac-1cfcdb1ac32e",
    ///                 },
    ///             },
    ///         });
    ///         // Create an Elastic Cloud deployment
    ///         var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = region,
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "azure-io-optimized-v3",
    ///             TrafficFilters = 
    ///             {
    ///                 azure.Id,
    ///             },
    ///             Elasticsearch = ,
    ///             Kibana = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### GCP Private Service Connect type
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var region = asia_east1;
    ///         var latest = Output.Create(ElasticCloud.GetStack.InvokeAsync(new ElasticCloud.GetStackArgs
    ///         {
    ///             VersionRegex = "latest",
    ///             Region = region,
    ///         }));
    ///         var gcpPsc = new ElasticCloud.DeploymentTrafficFilter("gcpPsc", new ElasticCloud.DeploymentTrafficFilterArgs
    ///         {
    ///             Region = region,
    ///             Type = "gcp_private_service_connect_endpoint",
    ///             Rules = 
    ///             {
    ///                 new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///                 {
    ///                     Source = "18446744072646845332",
    ///                 },
    ///             },
    ///         });
    ///         // Create an Elastic Cloud deployment
    ///         var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = region,
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "gcp-storage-optimized",
    ///             TrafficFilters = 
    ///             {
    ///                 gcpPsc.Id,
    ///             },
    ///             Elasticsearch = ,
    ///             Kibana = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import traffic filters using the `id`, for example
    /// 
    /// ```sh
    ///  $ pulumi import ec:index/deploymentTrafficFilter:DeploymentTrafficFilter name 320b7b540dfc967a7a649c18e2fce4ed
    /// ```
    /// </summary>
    [ElasticCloudResourceType("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter")]
    public partial class DeploymentTrafficFilter : Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the ruleset.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// To automatically include the ruleset in the new deployments. Defaults to `false`.
        /// </summary>
        [Output("includeByDefault")]
        public Output<bool?> IncludeByDefault { get; private set; } = null!;

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Rule block, which can be specified multiple times for multiple rules.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.DeploymentTrafficFilterRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azure_private_endpoint"`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DeploymentTrafficFilter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeploymentTrafficFilter(string name, DeploymentTrafficFilterArgs args, CustomResourceOptions? options = null)
            : base("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, args ?? new DeploymentTrafficFilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeploymentTrafficFilter(string name, Input<string> id, DeploymentTrafficFilterState? state = null, CustomResourceOptions? options = null)
            : base("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeploymentTrafficFilter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeploymentTrafficFilter Get(string name, Input<string> id, DeploymentTrafficFilterState? state = null, CustomResourceOptions? options = null)
        {
            return new DeploymentTrafficFilter(name, id, state, options);
        }
    }

    public sealed class DeploymentTrafficFilterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the ruleset.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// To automatically include the ruleset in the new deployments. Defaults to `false`.
        /// </summary>
        [Input("includeByDefault")]
        public Input<bool>? IncludeByDefault { get; set; }

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("rules", required: true)]
        private InputList<Inputs.DeploymentTrafficFilterRuleArgs>? _rules;

        /// <summary>
        /// Rule block, which can be specified multiple times for multiple rules.
        /// </summary>
        public InputList<Inputs.DeploymentTrafficFilterRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DeploymentTrafficFilterRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azure_private_endpoint"`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeploymentTrafficFilterArgs()
        {
        }
    }

    public sealed class DeploymentTrafficFilterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the ruleset.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// To automatically include the ruleset in the new deployments. Defaults to `false`.
        /// </summary>
        [Input("includeByDefault")]
        public Input<bool>? IncludeByDefault { get; set; }

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("rules")]
        private InputList<Inputs.DeploymentTrafficFilterRuleGetArgs>? _rules;

        /// <summary>
        /// Rule block, which can be specified multiple times for multiple rules.
        /// </summary>
        public InputList<Inputs.DeploymentTrafficFilterRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DeploymentTrafficFilterRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azure_private_endpoint"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DeploymentTrafficFilterState()
        {
        }
    }
}
