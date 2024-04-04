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
    /// Manages Elastic Cloud Enterprise snapshot repositories.
    /// 
    ///   &gt; **This resource can only be used with Elastic Cloud Enterprise** For Elastic Cloud SaaS please use the elasticstack_elasticsearch_snapshot_repository.
    /// 
    /// ## Example Usage
    /// 
    /// ### Azure
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new ElasticCloud.SnapshotRepository("this", new()
    ///     {
    ///         Generic = new ElasticCloud.Inputs.SnapshotRepositoryGenericArgs
    ///         {
    ///             Type = "azure",
    ///             Settings = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["container"] = "my_container",
    ///                 ["client"] = "my_alternate_client",
    ///                 ["compress"] = false,
    ///             }),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### GCS
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using ElasticCloud = Pulumi.ElasticCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new ElasticCloud.SnapshotRepository("this", new()
    ///     {
    ///         Generic = new ElasticCloud.Inputs.SnapshotRepositoryGenericArgs
    ///         {
    ///             Type = "gcs",
    ///             Settings = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["bucket"] = "my_bucket",
    ///                 ["client"] = "my_alternate_client",
    ///                 ["compress"] = false,
    ///             }),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// You can import snapshot repositories using the `name`, for example:
    /// 
    /// ```sh
    /// $ pulumi import ec:index/snapshotRepository:SnapshotRepository this my-snapshot-repository
    /// ```
    /// </summary>
    [ElasticCloudResourceType("ec:index/snapshotRepository:SnapshotRepository")]
    public partial class SnapshotRepository : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Generic repository settings.
        /// </summary>
        [Output("generic")]
        public Output<Outputs.SnapshotRepositoryGeneric?> Generic { get; private set; } = null!;

        /// <summary>
        /// The name of the snapshot repository configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// S3 repository settings.
        /// </summary>
        [Output("s3")]
        public Output<Outputs.SnapshotRepositoryS3?> S3 { get; private set; } = null!;


        /// <summary>
        /// Create a SnapshotRepository resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnapshotRepository(string name, SnapshotRepositoryArgs? args = null, CustomResourceOptions? options = null)
            : base("ec:index/snapshotRepository:SnapshotRepository", name, args ?? new SnapshotRepositoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnapshotRepository(string name, Input<string> id, SnapshotRepositoryState? state = null, CustomResourceOptions? options = null)
            : base("ec:index/snapshotRepository:SnapshotRepository", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SnapshotRepository resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnapshotRepository Get(string name, Input<string> id, SnapshotRepositoryState? state = null, CustomResourceOptions? options = null)
        {
            return new SnapshotRepository(name, id, state, options);
        }
    }

    public sealed class SnapshotRepositoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Generic repository settings.
        /// </summary>
        [Input("generic")]
        public Input<Inputs.SnapshotRepositoryGenericArgs>? Generic { get; set; }

        /// <summary>
        /// The name of the snapshot repository configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// S3 repository settings.
        /// </summary>
        [Input("s3")]
        public Input<Inputs.SnapshotRepositoryS3Args>? S3 { get; set; }

        public SnapshotRepositoryArgs()
        {
        }
        public static new SnapshotRepositoryArgs Empty => new SnapshotRepositoryArgs();
    }

    public sealed class SnapshotRepositoryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Generic repository settings.
        /// </summary>
        [Input("generic")]
        public Input<Inputs.SnapshotRepositoryGenericGetArgs>? Generic { get; set; }

        /// <summary>
        /// The name of the snapshot repository configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// S3 repository settings.
        /// </summary>
        [Input("s3")]
        public Input<Inputs.SnapshotRepositoryS3GetArgs>? S3 { get; set; }

        public SnapshotRepositoryState()
        {
        }
        public static new SnapshotRepositoryState Empty => new SnapshotRepositoryState();
    }
}
