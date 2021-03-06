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
    ///         var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             Elasticsearch = ,
    ///             Kibana = ,
    ///             IntegrationsServer = ,
    ///             EnterpriseSearch = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Tiered deployment with Autoscaling enabled
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
    ///         var exampleMinimal = new ElasticCloud.Deployment("exampleMinimal", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///             {
    ///                 Autoscale = "true",
    ///                 Topologies = 
    ///                 {
    ///                     new ElasticCloud.Inputs.DeploymentElasticsearchTopologyArgs
    ///                     {
    ///                         Id = "cold",
    ///                         Size = "8g",
    ///                     },
    ///                     new ElasticCloud.Inputs.DeploymentElasticsearchTopologyArgs
    ///                     {
    ///                         Id = "hot_content",
    ///                         Size = "8g",
    ///                         Autoscaling = ,
    ///                     },
    ///                     new ElasticCloud.Inputs.DeploymentElasticsearchTopologyArgs
    ///                     {
    ///                         Id = "warm",
    ///                         Size = "16g",
    ///                     },
    ///                 },
    ///             },
    ///             Kibana = ,
    ///             IntegrationsServer = ,
    ///             EnterpriseSearch = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### With observability settings
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
    ///         var exampleObservability = new ElasticCloud.Deployment("exampleObservability", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             Elasticsearch = ,
    ///             Kibana = ,
    ///             Observability = new ElasticCloud.Inputs.DeploymentObservabilityArgs
    ///             {
    ///                 DeploymentId = ec_deployment.Example_minimal.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### With Cross Cluster Search settings
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
    ///         var sourceDeployment = new ElasticCloud.Deployment("sourceDeployment", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///             {
    ///                 Topologies = 
    ///                 {
    ///                     new ElasticCloud.Inputs.DeploymentElasticsearchTopologyArgs
    ///                     {
    ///                         Id = "hot_content",
    ///                         Size = "1g",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var ccs = new ElasticCloud.Deployment("ccs", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-cross-cluster-search-v2",
    ///             Elasticsearch = new ElasticCloud.Inputs.DeploymentElasticsearchArgs
    ///             {
    ///                 RemoteClusters = 
    ///                 {
    ///                     new ElasticCloud.Inputs.DeploymentElasticsearchRemoteClusterArgs
    ///                     {
    ///                         DeploymentId = sourceDeployment.Id,
    ///                         Alias = sourceDeployment.Name,
    ///                         RefId = sourceDeployment.Elasticsearch.Apply(elasticsearch =&gt; elasticsearch.RefId),
    ///                     },
    ///                 },
    ///             },
    ///             Kibana = ,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### With tags
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
    ///         var withTags = new ElasticCloud.Deployment("withTags", new ElasticCloud.DeploymentArgs
    ///         {
    ///             Region = "us-east-1",
    ///             Version = latest.Apply(latest =&gt; latest.Version),
    ///             DeploymentTemplateId = "aws-io-optimized-v2",
    ///             Elasticsearch = ,
    ///             Tags = 
    ///             {
    ///                 { "owner", "elastic cloud" },
    ///                 { "component", "search" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ~&gt; **Note on deployment credentials** The `elastic` user credentials are only available whilst creating a deployment. Importing a deployment will not import the `elasticsearch_username` or `elasticsearch_password` attributes. ~&gt; **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported. ~&gt; **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported. ~&gt; **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing. Deployments can be imported using the `id`, for example
    /// 
    /// ```sh
    ///  $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
    /// ```
    /// </summary>
    [ElasticCloudResourceType("ec:index/deployment:Deployment")]
    public partial class Deployment : Pulumi.CustomResource
    {
        /// <summary>
        /// Deployment alias, affects the format of the resource URLs.
        /// </summary>
        [Output("alias")]
        public Output<string> Alias { get; private set; } = null!;

        /// <summary>
        /// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
        /// </summary>
        [Output("apm")]
        public Output<Outputs.DeploymentApm?> Apm { get; private set; } = null!;

        /// <summary>
        /// Auto-generated APM secret_token, empty unless an `apm` resource is specified.
        /// * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
        /// * `elasticsearch.#.region` - Elasticsearch region.
        /// * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
        /// * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
        /// * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
        /// * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
        /// * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
        /// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
        /// * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
        /// * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
        /// * `kibana.#.resource_id` - Kibana resource unique identifier.
        /// * `kibana.#.region` - Kibana region.
        /// * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
        /// * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
        /// * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
        /// * `integrations_server.#.region` - Integrations Server region.
        /// * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
        /// * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
        /// * `apm.#.resource_id` - APM resource unique identifier.
        /// * `apm.#.region` - APM region.
        /// * `apm.#.http_endpoint` - APM resource HTTP endpoint.
        /// * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
        /// * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
        /// * `enterprise_search.#.region` - Enterprise Search region.
        /// * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
        /// * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
        /// * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
        /// * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
        /// * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
        /// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
        /// * `observability.#.ref_id` - (Optional) Elasticsearch resource kind ref_id of the destination deployment.
        /// * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
        /// * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
        /// </summary>
        [Output("apmSecretToken")]
        public Output<string> ApmSecretToken { get; private set; } = null!;

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Output("deploymentTemplateId")]
        public Output<string> DeploymentTemplateId { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
        /// </summary>
        [Output("elasticsearch")]
        public Output<Outputs.DeploymentElasticsearch> Elasticsearch { get; private set; } = null!;

        /// <summary>
        /// Auto-generated Elasticsearch password.
        /// </summary>
        [Output("elasticsearchPassword")]
        public Output<string> ElasticsearchPassword { get; private set; } = null!;

        /// <summary>
        /// Auto-generated Elasticsearch username.
        /// </summary>
        [Output("elasticsearchUsername")]
        public Output<string> ElasticsearchUsername { get; private set; } = null!;

        /// <summary>
        /// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
        /// </summary>
        [Output("enterpriseSearch")]
        public Output<Outputs.DeploymentEnterpriseSearch?> EnterpriseSearch { get; private set; } = null!;

        /// <summary>
        /// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
        /// </summary>
        [Output("integrationsServer")]
        public Output<Outputs.DeploymentIntegrationsServer?> IntegrationsServer { get; private set; } = null!;

        /// <summary>
        /// Kibana instance definition, can only be specified once.
        /// </summary>
        [Output("kibana")]
        public Output<Outputs.DeploymentKibana?> Kibana { get; private set; } = null!;

        /// <summary>
        /// Name of the deployment.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a separate deployment.
        /// </summary>
        [Output("observability")]
        public Output<Outputs.DeploymentObservability?> Observability { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is returned as part of the error.
        /// </summary>
        [Output("requestId")]
        public Output<string?> RequestId { get; private set; } = null!;

        /// <summary>
        /// Key value map of arbitrary string tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// List of traffic filter rule identifiers that will be applied to the deployment.
        /// </summary>
        [Output("trafficFilters")]
        public Output<ImmutableArray<string>> TrafficFilters { get; private set; } = null!;

        /// <summary>
        /// Elastic Stack version to use for all the deployment resources.
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

    public sealed class DeploymentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deployment alias, affects the format of the resource URLs.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
        /// </summary>
        [Input("apm")]
        public Input<Inputs.DeploymentApmArgs>? Apm { get; set; }

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Input("deploymentTemplateId", required: true)]
        public Input<string> DeploymentTemplateId { get; set; } = null!;

        /// <summary>
        /// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
        /// </summary>
        [Input("elasticsearch", required: true)]
        public Input<Inputs.DeploymentElasticsearchArgs> Elasticsearch { get; set; } = null!;

        /// <summary>
        /// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
        /// </summary>
        [Input("enterpriseSearch")]
        public Input<Inputs.DeploymentEnterpriseSearchArgs>? EnterpriseSearch { get; set; }

        /// <summary>
        /// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
        /// </summary>
        [Input("integrationsServer")]
        public Input<Inputs.DeploymentIntegrationsServerArgs>? IntegrationsServer { get; set; }

        /// <summary>
        /// Kibana instance definition, can only be specified once.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.DeploymentKibanaArgs>? Kibana { get; set; }

        /// <summary>
        /// Name of the deployment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a separate deployment.
        /// </summary>
        [Input("observability")]
        public Input<Inputs.DeploymentObservabilityArgs>? Observability { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is returned as part of the error.
        /// </summary>
        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key value map of arbitrary string tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("trafficFilters")]
        private InputList<string>? _trafficFilters;

        /// <summary>
        /// List of traffic filter rule identifiers that will be applied to the deployment.
        /// </summary>
        public InputList<string> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<string>());
            set => _trafficFilters = value;
        }

        /// <summary>
        /// Elastic Stack version to use for all the deployment resources.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public DeploymentArgs()
        {
        }
    }

    public sealed class DeploymentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deployment alias, affects the format of the resource URLs.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
        /// </summary>
        [Input("apm")]
        public Input<Inputs.DeploymentApmGetArgs>? Apm { get; set; }

        /// <summary>
        /// Auto-generated APM secret_token, empty unless an `apm` resource is specified.
        /// * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
        /// * `elasticsearch.#.region` - Elasticsearch region.
        /// * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
        /// * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
        /// * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
        /// * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
        /// * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
        /// * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
        /// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
        /// * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
        /// * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
        /// * `kibana.#.resource_id` - Kibana resource unique identifier.
        /// * `kibana.#.region` - Kibana region.
        /// * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
        /// * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
        /// * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
        /// * `integrations_server.#.region` - Integrations Server region.
        /// * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
        /// * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
        /// * `apm.#.resource_id` - APM resource unique identifier.
        /// * `apm.#.region` - APM region.
        /// * `apm.#.http_endpoint` - APM resource HTTP endpoint.
        /// * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
        /// * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
        /// * `enterprise_search.#.region` - Enterprise Search region.
        /// * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
        /// * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
        /// * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
        /// * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
        /// * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
        /// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
        /// * `observability.#.ref_id` - (Optional) Elasticsearch resource kind ref_id of the destination deployment.
        /// * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
        /// * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
        /// </summary>
        [Input("apmSecretToken")]
        public Input<string>? ApmSecretToken { get; set; }

        /// <summary>
        /// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
        /// </summary>
        [Input("deploymentTemplateId")]
        public Input<string>? DeploymentTemplateId { get; set; }

        /// <summary>
        /// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.DeploymentElasticsearchGetArgs>? Elasticsearch { get; set; }

        /// <summary>
        /// Auto-generated Elasticsearch password.
        /// </summary>
        [Input("elasticsearchPassword")]
        public Input<string>? ElasticsearchPassword { get; set; }

        /// <summary>
        /// Auto-generated Elasticsearch username.
        /// </summary>
        [Input("elasticsearchUsername")]
        public Input<string>? ElasticsearchUsername { get; set; }

        /// <summary>
        /// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
        /// </summary>
        [Input("enterpriseSearch")]
        public Input<Inputs.DeploymentEnterpriseSearchGetArgs>? EnterpriseSearch { get; set; }

        /// <summary>
        /// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
        /// </summary>
        [Input("integrationsServer")]
        public Input<Inputs.DeploymentIntegrationsServerGetArgs>? IntegrationsServer { get; set; }

        /// <summary>
        /// Kibana instance definition, can only be specified once.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.DeploymentKibanaGetArgs>? Kibana { get; set; }

        /// <summary>
        /// Name of the deployment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Observability settings that you can set to ship logs and metrics to a separate deployment.
        /// </summary>
        [Input("observability")]
        public Input<Inputs.DeploymentObservabilityGetArgs>? Observability { get; set; }

        /// <summary>
        /// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is returned as part of the error.
        /// </summary>
        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key value map of arbitrary string tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("trafficFilters")]
        private InputList<string>? _trafficFilters;

        /// <summary>
        /// List of traffic filter rule identifiers that will be applied to the deployment.
        /// </summary>
        public InputList<string> TrafficFilters
        {
            get => _trafficFilters ?? (_trafficFilters = new InputList<string>());
            set => _trafficFilters = value;
        }

        /// <summary>
        /// Elastic Stack version to use for all the deployment resources.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DeploymentState()
        {
        }
    }
}
