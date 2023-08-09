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
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
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
    ///     // Create an Elastic Cloud deployment
    ///     var exampleKeystore = new ElasticCloud.Deployment("exampleKeystore", new()
    ///     {
    ///         Region = "us-east-1",
    ///         Version = latest.Apply(getStackResult =&gt; getStackResult.Version),
    ///         DeploymentTemplateId = "aws-io-optimized-v2",
    ///         Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///         {
    ///             Hot = new ElasticCloud.Inputs.DeploymentElasticsearchHotArgs
    ///             {
    ///                 Autoscaling = null,
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create the keystore secret entry
    ///     var gcsCredential = new ElasticCloud.DeploymentElasticsearchKeystore("gcsCredential", new()
    ///     {
    ///         DeploymentId = exampleKeystore.Id,
    ///         SettingName = "gcs.client.default.credentials_file",
    ///         Value = File.ReadAllText("service-account-key.json"),
    ///         AsFile = true,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Adding credentials to use GCS as a snapshot repository
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
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
    ///     // Create an Elastic Cloud deployment
    ///     var exampleKeystore = new ElasticCloud.Deployment("exampleKeystore", new()
    ///     {
    ///         Region = "us-east-1",
    ///         Version = latest.Apply(getStackResult =&gt; getStackResult.Version),
    ///         DeploymentTemplateId = "aws-io-optimized-v2",
    ///         Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///         {
    ///             Hot = new ElasticCloud.Inputs.DeploymentElasticsearchHotArgs
    ///             {
    ///                 Autoscaling = null,
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create the keystore secret entry
    ///     var gcsCredential = new ElasticCloud.DeploymentElasticsearchKeystore("gcsCredential", new()
    ///     {
    ///         DeploymentId = exampleKeystore.Id,
    ///         SettingName = "gcs.client.default.credentials_file",
    ///         Value = File.ReadAllText("service-account-key.json"),
    ///         AsFile = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource cannot be imported
    /// </summary>
    [ElasticCloudResourceType("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore")]
    public partial class DeploymentElasticsearchKeystore : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        /// </summary>
        [Output("asFile")]
        public Output<bool> AsFile { get; private set; } = null!;

        /// <summary>
        /// Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        /// </summary>
        [Output("deploymentId")]
        public Output<string> DeploymentId { get; private set; } = null!;

        /// <summary>
        /// Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        /// </summary>
        [Output("settingName")]
        public Output<string> SettingName { get; private set; } = null!;

        /// <summary>
        /// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a DeploymentElasticsearchKeystore resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeploymentElasticsearchKeystore(string name, DeploymentElasticsearchKeystoreArgs args, CustomResourceOptions? options = null)
            : base("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, args ?? new DeploymentElasticsearchKeystoreArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeploymentElasticsearchKeystore(string name, Input<string> id, DeploymentElasticsearchKeystoreState? state = null, CustomResourceOptions? options = null)
            : base("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DeploymentElasticsearchKeystore resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeploymentElasticsearchKeystore Get(string name, Input<string> id, DeploymentElasticsearchKeystoreState? state = null, CustomResourceOptions? options = null)
        {
            return new DeploymentElasticsearchKeystore(name, id, state, options);
        }
    }

    public sealed class DeploymentElasticsearchKeystoreArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        /// </summary>
        [Input("asFile")]
        public Input<bool>? AsFile { get; set; }

        /// <summary>
        /// Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        /// </summary>
        [Input("deploymentId", required: true)]
        public Input<string> DeploymentId { get; set; } = null!;

        /// <summary>
        /// Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        /// </summary>
        [Input("settingName", required: true)]
        public Input<string> SettingName { get; set; } = null!;

        [Input("value", required: true)]
        private Input<string>? _value;

        /// <summary>
        /// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
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

        public DeploymentElasticsearchKeystoreArgs()
        {
        }
        public static new DeploymentElasticsearchKeystoreArgs Empty => new DeploymentElasticsearchKeystoreArgs();
    }

    public sealed class DeploymentElasticsearchKeystoreState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        /// </summary>
        [Input("asFile")]
        public Input<bool>? AsFile { get; set; }

        /// <summary>
        /// Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        /// </summary>
        [Input("deploymentId")]
        public Input<string>? DeploymentId { get; set; }

        /// <summary>
        /// Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        /// </summary>
        [Input("settingName")]
        public Input<string>? SettingName { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
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

        public DeploymentElasticsearchKeystoreState()
        {
        }
        public static new DeploymentElasticsearchKeystoreState Empty => new DeploymentElasticsearchKeystoreState();
    }
}
