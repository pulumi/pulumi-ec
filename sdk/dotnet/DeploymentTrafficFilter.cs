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
    /// ## Example Usage
    /// 
    /// ### IP based traffic filter
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var latest = ElasticCloud.GetStack.Invoke(new()
    ///     {
    ///         VersionRegex = "latest",
    ///         Region = "us-east-1",
    ///     });
    /// 
    ///     var example = new ElasticCloud.DeploymentTrafficFilter("example", new()
    ///     {
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
    ///     // Create an Elastic Cloud deployment
    ///     var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new()
    ///     {
    ///         Region = "us-east-1",
    ///         Version = latest.Apply(getStackResult =&gt; getStackResult.Version),
    ///         DeploymentTemplateId = "aws-io-optimized-v2",
    ///         TrafficFilters = new[]
    ///         {
    ///             example.Id,
    ///         },
    ///         Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///         {
    ///             Hot = new ElasticCloud.Inputs.DeploymentElasticsearchHotArgs
    ///             {
    ///                 Autoscaling = null,
    ///             },
    ///         },
    ///         Kibana = null,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Azure Private Link traffic filter
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var region = azure_australiaeast;
    /// 
    ///     var latest = ElasticCloud.GetStack.Invoke(new()
    ///     {
    ///         VersionRegex = "latest",
    ///         Region = region,
    ///     });
    /// 
    ///     var azure = new ElasticCloud.DeploymentTrafficFilter("azure", new()
    ///     {
    ///         Region = region,
    ///         Type = "azure_private_endpoint",
    ///         Rules = new[]
    ///         {
    ///             new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///             {
    ///                 AzureEndpointName = "my-azure-pl",
    ///                 AzureEndpointGuid = "78c64959-fd88-41cc-81ac-1cfcdb1ac32e",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create an Elastic Cloud deployment
    ///     var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new()
    ///     {
    ///         Region = region,
    ///         Version = latest.Apply(getStackResult =&gt; getStackResult.Version),
    ///         DeploymentTemplateId = "azure-io-optimized-v3",
    ///         TrafficFilters = new[]
    ///         {
    ///             azure.Id,
    ///         },
    ///         Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///         {
    ///             Hot = new ElasticCloud.Inputs.DeploymentElasticsearchHotArgs
    ///             {
    ///                 Autoscaling = null,
    ///             },
    ///         },
    ///         Kibana = null,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ###GCP Private Service Connect traffic filter
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var region = asia_east1;
    /// 
    ///     var latest = ElasticCloud.GetStack.Invoke(new()
    ///     {
    ///         VersionRegex = "latest",
    ///         Region = region,
    ///     });
    /// 
    ///     var gcpPsc = new ElasticCloud.DeploymentTrafficFilter("gcpPsc", new()
    ///     {
    ///         Region = region,
    ///         Type = "gcp_private_service_connect_endpoint",
    ///         Rules = new[]
    ///         {
    ///             new ElasticCloud.Inputs.DeploymentTrafficFilterRuleArgs
    ///             {
    ///                 Source = "18446744072646845332",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create an Elastic Cloud deployment
    ///     var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new()
    ///     {
    ///         Region = region,
    ///         Version = latest.Apply(getStackResult =&gt; getStackResult.Version),
    ///         DeploymentTemplateId = "gcp-storage-optimized",
    ///         TrafficFilters = new[]
    ///         {
    ///             gcpPsc.Id,
    ///         },
    ///         Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///         {
    ///             Hot = new ElasticCloud.Inputs.DeploymentElasticsearchHotArgs
    ///             {
    ///                 Autoscaling = null,
    ///             },
    ///         },
    ///         Kibana = null,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Traffic filters can be imported using the `id`, for example:
    /// 
    /// ```sh
    /// $ pulumi import ec:index/deploymentTrafficFilter:DeploymentTrafficFilter name 320b7b540dfc967a7a649c18e2fce4ed
    /// ```
    /// </summary>
    [ElasticCloudResourceType("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter")]
    public partial class DeploymentTrafficFilter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of this individual rule
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
        /// </summary>
        [Output("includeByDefault")]
        public Output<bool> IncludeByDefault { get; private set; } = null!;

        /// <summary>
        /// Name of the ruleset
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Set of rules, which the ruleset is made of.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.DeploymentTrafficFilterRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Type of the ruleset. It can be `ip`, `vpce`, `azure_private_endpoint`, or `gcp_private_service_connect_endpoint`
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

    public sealed class DeploymentTrafficFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of this individual rule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
        /// </summary>
        [Input("includeByDefault")]
        public Input<bool>? IncludeByDefault { get; set; }

        /// <summary>
        /// Name of the ruleset
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.DeploymentTrafficFilterRuleArgs>? _rules;

        /// <summary>
        /// Set of rules, which the ruleset is made of.
        /// </summary>
        public InputList<Inputs.DeploymentTrafficFilterRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DeploymentTrafficFilterRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Type of the ruleset. It can be `ip`, `vpce`, `azure_private_endpoint`, or `gcp_private_service_connect_endpoint`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeploymentTrafficFilterArgs()
        {
        }
        public static new DeploymentTrafficFilterArgs Empty => new DeploymentTrafficFilterArgs();
    }

    public sealed class DeploymentTrafficFilterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of this individual rule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
        /// </summary>
        [Input("includeByDefault")]
        public Input<bool>? IncludeByDefault { get; set; }

        /// <summary>
        /// Name of the ruleset
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Filter region, the ruleset can only be attached to deployments in the specific region
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("rules")]
        private InputList<Inputs.DeploymentTrafficFilterRuleGetArgs>? _rules;

        /// <summary>
        /// Set of rules, which the ruleset is made of.
        /// </summary>
        public InputList<Inputs.DeploymentTrafficFilterRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DeploymentTrafficFilterRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Type of the ruleset. It can be `ip`, `vpce`, `azure_private_endpoint`, or `gcp_private_service_connect_endpoint`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DeploymentTrafficFilterState()
        {
        }
        public static new DeploymentTrafficFilterState Empty => new DeploymentTrafficFilterState();
    }
}
