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
    /// ### Basic
    /// 
    /// ### With config
    /// 
    /// `es.yaml`
    /// 
    /// `deployment.tf`:
    /// 
    /// ### With autoscaling
    /// 
    /// ### With observability
    /// 
    /// It is possible to enable observability without using a second deployment, by storing the observability data in the current deployment. To enable this, set `deployment_id` to `self`.
    /// 
    /// ### With Cross Cluster Search settings
    /// 
    /// ## Import
    /// 
    /// ~&gt; **Note on deployment credentials** The `elastic` user credentials are only available whilst creating a deployment. Importing a deployment will not import the `elasticsearch_username` or `elasticsearch_password` attributes.
    /// 
    /// ~&gt; **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported.
    /// 
    /// ~&gt; **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported.
    /// 
    /// ~&gt; **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing.
    /// 
    /// Deployments can be imported using the `id`, for example:
    /// 
    /// ```sh
    /// $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
    /// ```
    /// </summary>
    [ElasticCloudResourceType("ec:index/deployment:Deployment")]
    public partial class Deployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Alias for this Cross Cluster Search binding
        /// </summary>
        [Output("alias")]
        public Output<string> Alias { get; private set; } = null!;

        /// <summary>
        /// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
        /// </summary>
        [Output("apm")]
        public Output<Outputs.DeploymentApm?> Apm { get; private set; } = null!;

        [Output("apmSecretToken")]
        public Output<string> ApmSecretToken { get; private set; } = null!;

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Output("deploymentTemplateId")]
        public Output<string> DeploymentTemplateId { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch cluster definition
        /// </summary>
        [Output("elasticsearch")]
        public Output<Outputs.DeploymentElasticsearch> Elasticsearch { get; private set; } = null!;

        /// <summary>
        /// Password for authenticating to the Elasticsearch resource. ~&gt; **Note on deployment credentials** The
        /// &lt;code&gt;elastic&lt;/code&gt; user credentials are only available whilst creating a deployment. Importing a deployment will not
        /// import the &lt;code&gt;elasticsearch_username&lt;/code&gt; or &lt;code&gt;elasticsearch_password&lt;/code&gt; attributes.
        /// </summary>
        [Output("elasticsearchPassword")]
        public Output<string> ElasticsearchPassword { get; private set; } = null!;

        /// <summary>
        /// Username for authenticating to the Elasticsearch resource.
        /// </summary>
        [Output("elasticsearchUsername")]
        public Output<string> ElasticsearchUsername { get; private set; } = null!;

        /// <summary>
        /// Enterprise Search cluster definition.
        /// </summary>
        [Output("enterpriseSearch")]
        public Output<Outputs.DeploymentEnterpriseSearch?> EnterpriseSearch { get; private set; } = null!;

        /// <summary>
        /// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
        /// </summary>
        [Output("integrationsServer")]
        public Output<Outputs.DeploymentIntegrationsServer?> IntegrationsServer { get; private set; } = null!;

        /// <summary>
        /// Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
        /// block, since not doing so might cause issues when modifying or upgrading the deployment.
        /// </summary>
        [Output("kibana")]
        public Output<Outputs.DeploymentKibana?> Kibana { get; private set; } = null!;

        /// <summary>
        /// Extension name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
        /// current deployment itself by setting observability.deployment_id to `self`.
        /// </summary>
        [Output("observability")]
        public Output<Outputs.DeploymentObservability?> Observability { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
        /// installations, set to `"ece-region".
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
        /// returned as part of the error.
        /// </summary>
        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// Explicitly resets the elasticsearch_password when true
        /// </summary>
        [Output("resetElasticsearchPassword")]
        public Output<bool?> ResetElasticsearchPassword { get; private set; } = null!;

        /// <summary>
        /// Optional map of deployment tags
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// List of traffic filters rule identifiers that will be applied to the deployment.
        /// </summary>
        [Output("trafficFilters")]
        public Output<ImmutableArray<string>> TrafficFilters { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Deployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Deployment(string name, DeploymentArgs args, CustomResourceOptions? options = null)
            : base("ec:index/deployment:Deployment", name, args ?? new DeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Deployment(string name, Input<string> id, DeploymentState? state = null, CustomResourceOptions? options = null)
            : base("ec:index/deployment:Deployment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "apmSecretToken",
                    "elasticsearchPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Deployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Deployment Get(string name, Input<string> id, DeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new Deployment(name, id, state, options);
        }
    }

    public sealed class DeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alias for this Cross Cluster Search binding
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
        /// </summary>
        [Input("apm")]
        public Input<Inputs.DeploymentApmArgs>? Apm { get; set; }

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Input("deploymentTemplateId", required: true)]
        public Input<string> DeploymentTemplateId { get; set; } = null!;

        /// <summary>
        /// Elasticsearch cluster definition
        /// </summary>
        [Input("elasticsearch", required: true)]
        public Input<Inputs.DeploymentElasticsearchArgs> Elasticsearch { get; set; } = null!;

        /// <summary>
        /// Enterprise Search cluster definition.
        /// </summary>
        [Input("enterpriseSearch")]
        public Input<Inputs.DeploymentEnterpriseSearchArgs>? EnterpriseSearch { get; set; }

        /// <summary>
        /// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
        /// </summary>
        [Input("integrationsServer")]
        public Input<Inputs.DeploymentIntegrationsServerArgs>? IntegrationsServer { get; set; }

        /// <summary>
        /// Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
        /// block, since not doing so might cause issues when modifying or upgrading the deployment.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.DeploymentKibanaArgs>? Kibana { get; set; }

        /// <summary>
        /// Extension name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
        /// current deployment itself by setting observability.deployment_id to `self`.
        /// </summary>
        [Input("observability")]
        public Input<Inputs.DeploymentObservabilityArgs>? Observability { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
        /// installations, set to `"ece-region".
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
        /// returned as part of the error.
        /// </summary>
        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// Explicitly resets the elasticsearch_password when true
        /// </summary>
        [Input("resetElasticsearchPassword")]
        public Input<bool>? ResetElasticsearchPassword { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Optional map of deployment tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("trafficFilters")]
        private InputList<string>? _trafficFilters;

        /// <summary>
        /// List of traffic filters rule identifiers that will be applied to the deployment.
        /// </summary>
        public InputList<string> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<string>());
            set => _trafficFilters = value;
        }

        /// <summary>
        /// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public DeploymentArgs()
        {
        }
        public static new DeploymentArgs Empty => new DeploymentArgs();
    }

    public sealed class DeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alias for this Cross Cluster Search binding
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
        /// </summary>
        [Input("apm")]
        public Input<Inputs.DeploymentApmGetArgs>? Apm { get; set; }

        [Input("apmSecretToken")]
        private Input<string>? _apmSecretToken;
        public Input<string>? ApmSecretToken
        {
            get => _apmSecretToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apmSecretToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Input("deploymentTemplateId")]
        public Input<string>? DeploymentTemplateId { get; set; }

        /// <summary>
        /// Elasticsearch cluster definition
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.DeploymentElasticsearchGetArgs>? Elasticsearch { get; set; }

        [Input("elasticsearchPassword")]
        private Input<string>? _elasticsearchPassword;

        /// <summary>
        /// Password for authenticating to the Elasticsearch resource. ~&gt; **Note on deployment credentials** The
        /// &lt;code&gt;elastic&lt;/code&gt; user credentials are only available whilst creating a deployment. Importing a deployment will not
        /// import the &lt;code&gt;elasticsearch_username&lt;/code&gt; or &lt;code&gt;elasticsearch_password&lt;/code&gt; attributes.
        /// </summary>
        public Input<string>? ElasticsearchPassword
        {
            get => _elasticsearchPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _elasticsearchPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username for authenticating to the Elasticsearch resource.
        /// </summary>
        [Input("elasticsearchUsername")]
        public Input<string>? ElasticsearchUsername { get; set; }

        /// <summary>
        /// Enterprise Search cluster definition.
        /// </summary>
        [Input("enterpriseSearch")]
        public Input<Inputs.DeploymentEnterpriseSearchGetArgs>? EnterpriseSearch { get; set; }

        /// <summary>
        /// Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
        /// </summary>
        [Input("integrationsServer")]
        public Input<Inputs.DeploymentIntegrationsServerGetArgs>? IntegrationsServer { get; set; }

        /// <summary>
        /// Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
        /// block, since not doing so might cause issues when modifying or upgrading the deployment.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.DeploymentKibanaGetArgs>? Kibana { get; set; }

        /// <summary>
        /// Extension name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
        /// current deployment itself by setting observability.deployment_id to `self`.
        /// </summary>
        [Input("observability")]
        public Input<Inputs.DeploymentObservabilityGetArgs>? Observability { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
        /// installations, set to `"ece-region".
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
        /// returned as part of the error.
        /// </summary>
        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// Explicitly resets the elasticsearch_password when true
        /// </summary>
        [Input("resetElasticsearchPassword")]
        public Input<bool>? ResetElasticsearchPassword { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Optional map of deployment tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("trafficFilters")]
        private InputList<string>? _trafficFilters;

        /// <summary>
        /// List of traffic filters rule identifiers that will be applied to the deployment.
        /// </summary>
        public InputList<string> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<string>());
            set => _trafficFilters = value;
        }

        /// <summary>
        /// Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DeploymentState()
        {
        }
        public static new DeploymentState Empty => new DeploymentState();
    }
}
