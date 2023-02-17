// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.DeploymentArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.DeploymentState;
import com.pulumi.ec.outputs.DeploymentApm;
import com.pulumi.ec.outputs.DeploymentElasticsearch;
import com.pulumi.ec.outputs.DeploymentEnterpriseSearch;
import com.pulumi.ec.outputs.DeploymentIntegrationsServer;
import com.pulumi.ec.outputs.DeploymentKibana;
import com.pulumi.ec.outputs.DeploymentObservability;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
 * import com.pulumi.ec.inputs.DeploymentIntegrationsServerArgs;
 * import com.pulumi.ec.inputs.DeploymentEnterpriseSearchArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var exampleMinimal = new Deployment(&#34;exampleMinimal&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch()
 *             .kibana()
 *             .integrationsServer()
 *             .enterpriseSearch()
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Tiered deployment with Autoscaling enabled
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
 * import com.pulumi.ec.inputs.DeploymentIntegrationsServerArgs;
 * import com.pulumi.ec.inputs.DeploymentEnterpriseSearchArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var exampleMinimal = new Deployment(&#34;exampleMinimal&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .autoscale(&#34;true&#34;)
 *                 .topologies(                
 *                     DeploymentElasticsearchTopologyArgs.builder()
 *                         .id(&#34;cold&#34;)
 *                         .build(),
 *                     DeploymentElasticsearchTopologyArgs.builder()
 *                         .id(&#34;frozen&#34;)
 *                         .build(),
 *                     DeploymentElasticsearchTopologyArgs.builder()
 *                         .id(&#34;hot_content&#34;)
 *                         .size(&#34;8g&#34;)
 *                         .autoscaling(DeploymentElasticsearchTopologyAutoscalingArgs.builder()
 *                             .maxSize(&#34;128g&#34;)
 *                             .maxSizeResource(&#34;memory&#34;)
 *                             .build())
 *                         .build(),
 *                     DeploymentElasticsearchTopologyArgs.builder()
 *                         .id(&#34;ml&#34;)
 *                         .build(),
 *                     DeploymentElasticsearchTopologyArgs.builder()
 *                         .id(&#34;warm&#34;)
 *                         .build())
 *                 .build())
 *             .kibana()
 *             .integrationsServer()
 *             .enterpriseSearch()
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With observability settings
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
 * import com.pulumi.ec.inputs.DeploymentObservabilityArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var exampleObservability = new Deployment(&#34;exampleObservability&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch()
 *             .kibana()
 *             .observability(DeploymentObservabilityArgs.builder()
 *                 .deploymentId(ec_deployment.example_minimal().id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * It is possible to enable observability without using a second deployment, by storing the observability data in the current deployment. To enable this, set `deployment_id` to `self`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *     }
 * }
 * ```
 * ### With Cross Cluster Search settings
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var sourceDeployment = new Deployment(&#34;sourceDeployment&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .topologies(DeploymentElasticsearchTopologyArgs.builder()
 *                     .id(&#34;hot_content&#34;)
 *                     .size(&#34;1g&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var ccs = new Deployment(&#34;ccs&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-cross-cluster-search-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .remoteClusters(DeploymentElasticsearchRemoteClusterArgs.builder()
 *                     .deploymentId(sourceDeployment.id())
 *                     .alias(sourceDeployment.name())
 *                     .refId(sourceDeployment.elasticsearch().applyValue(elasticsearch -&gt; elasticsearch.refId()))
 *                     .build())
 *                 .build())
 *             .kibana()
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With tags
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var withTags = new Deployment(&#34;withTags&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch()
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;owner&#34;, &#34;elastic cloud&#34;),
 *                 Map.entry(&#34;component&#34;, &#34;search&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With configuration strategy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchStrategyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var withTags = new Deployment(&#34;withTags&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .strategy(DeploymentElasticsearchStrategyArgs.builder()
 *                     .type(&#34;rolling_all&#34;)
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;owner&#34;, &#34;elastic cloud&#34;),
 *                 Map.entry(&#34;component&#34;, &#34;search&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ~&gt; **Note on deployment credentials** The `elastic` user credentials are only available whilst creating a deployment. Importing a deployment will not import the `elasticsearch_username` or `elasticsearch_password` attributes. ~&gt; **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported. ~&gt; **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported. ~&gt; **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing. Deployments can be imported using the `id`, for example
 * 
 * ```sh
 *  $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 * 
 */
@ResourceType(type="ec:index/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Deployment alias, affects the format of the resource URLs.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return Deployment alias, affects the format of the resource URLs.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
     * 
     */
    @Export(name="apm", type=DeploymentApm.class, parameters={})
    private Output</* @Nullable */ DeploymentApm> apm;

    /**
     * @return **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
     * 
     */
    public Output<Optional<DeploymentApm>> apm() {
        return Codegen.optional(this.apm);
    }
    /**
     * Auto-generated APM secret_token, empty unless an `apm` resource is specified.
     * * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
     * * `elasticsearch.#.region` - Elasticsearch region.
     * * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
     * * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
     * * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
     * * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
     * * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
     * * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
     * * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
     * * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
     * * `kibana.#.resource_id` - Kibana resource unique identifier.
     * * `kibana.#.region` - Kibana region.
     * * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
     * * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
     * * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
     * * `integrations_server.#.region` - Integrations Server region.
     * * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
     * * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
     * * `integrations_server.#.fleet_https_endpoint` - HTTPs endpoint for Fleet Server.
     * * `integrations_server.#.apm_https_endpoint` - HTTPs endpoint for APM Server.
     * * `apm.#.resource_id` - APM resource unique identifier.
     * * `apm.#.region` - APM region.
     * * `apm.#.http_endpoint` - APM resource HTTP endpoint.
     * * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
     * * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
     * * `enterprise_search.#.region` - Enterprise Search region.
     * * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
     * * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
     * * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
     * * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
     * * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics. Use `self` as destination deployment ID to target the current deployment.
     * * `observability.#.ref_id` - (Optional) Elasticsearch resource kind ref_id of the destination deployment.
     * * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
     * * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
     * 
     */
    @Export(name="apmSecretToken", type=String.class, parameters={})
    private Output<String> apmSecretToken;

    /**
     * @return Auto-generated APM secret_token, empty unless an `apm` resource is specified.
     * * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
     * * `elasticsearch.#.region` - Elasticsearch region.
     * * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
     * * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
     * * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
     * * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
     * * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
     * * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
     * * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
     * * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
     * * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
     * * `kibana.#.resource_id` - Kibana resource unique identifier.
     * * `kibana.#.region` - Kibana region.
     * * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
     * * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
     * * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
     * * `integrations_server.#.region` - Integrations Server region.
     * * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
     * * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
     * * `integrations_server.#.fleet_https_endpoint` - HTTPs endpoint for Fleet Server.
     * * `integrations_server.#.apm_https_endpoint` - HTTPs endpoint for APM Server.
     * * `apm.#.resource_id` - APM resource unique identifier.
     * * `apm.#.region` - APM region.
     * * `apm.#.http_endpoint` - APM resource HTTP endpoint.
     * * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
     * * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
     * * `enterprise_search.#.region` - Enterprise Search region.
     * * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
     * * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
     * * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
     * * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
     * * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics. Use `self` as destination deployment ID to target the current deployment.
     * * `observability.#.ref_id` - (Optional) Elasticsearch resource kind ref_id of the destination deployment.
     * * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
     * * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
     * 
     */
    public Output<String> apmSecretToken() {
        return this.apmSecretToken;
    }
    /**
     * Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    @Export(name="deploymentTemplateId", type=String.class, parameters={})
    private Output<String> deploymentTemplateId;

    /**
     * @return Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    public Output<String> deploymentTemplateId() {
        return this.deploymentTemplateId;
    }
    /**
     * Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
     * 
     */
    @Export(name="elasticsearch", type=DeploymentElasticsearch.class, parameters={})
    private Output<DeploymentElasticsearch> elasticsearch;

    /**
     * @return Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
     * 
     */
    public Output<DeploymentElasticsearch> elasticsearch() {
        return this.elasticsearch;
    }
    /**
     * Auto-generated Elasticsearch password.
     * 
     */
    @Export(name="elasticsearchPassword", type=String.class, parameters={})
    private Output<String> elasticsearchPassword;

    /**
     * @return Auto-generated Elasticsearch password.
     * 
     */
    public Output<String> elasticsearchPassword() {
        return this.elasticsearchPassword;
    }
    /**
     * Auto-generated Elasticsearch username.
     * 
     */
    @Export(name="elasticsearchUsername", type=String.class, parameters={})
    private Output<String> elasticsearchUsername;

    /**
     * @return Auto-generated Elasticsearch username.
     * 
     */
    public Output<String> elasticsearchUsername() {
        return this.elasticsearchUsername;
    }
    /**
     * Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
     * 
     */
    @Export(name="enterpriseSearch", type=DeploymentEnterpriseSearch.class, parameters={})
    private Output</* @Nullable */ DeploymentEnterpriseSearch> enterpriseSearch;

    /**
     * @return Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
     * 
     */
    public Output<Optional<DeploymentEnterpriseSearch>> enterpriseSearch() {
        return Codegen.optional(this.enterpriseSearch);
    }
    /**
     * Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
     * 
     */
    @Export(name="integrationsServer", type=DeploymentIntegrationsServer.class, parameters={})
    private Output</* @Nullable */ DeploymentIntegrationsServer> integrationsServer;

    /**
     * @return Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
     * 
     */
    public Output<Optional<DeploymentIntegrationsServer>> integrationsServer() {
        return Codegen.optional(this.integrationsServer);
    }
    /**
     * Kibana instance definition, can only be specified once.
     * 
     */
    @Export(name="kibana", type=DeploymentKibana.class, parameters={})
    private Output</* @Nullable */ DeploymentKibana> kibana;

    /**
     * @return Kibana instance definition, can only be specified once.
     * 
     */
    public Output<Optional<DeploymentKibana>> kibana() {
        return Codegen.optional(this.kibana);
    }
    /**
     * Name of the deployment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the deployment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the current deployment itself.
     * 
     */
    @Export(name="observability", type=DeploymentObservability.class, parameters={})
    private Output</* @Nullable */ DeploymentObservability> observability;

    /**
     * @return Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the current deployment itself.
     * 
     */
    public Output<Optional<DeploymentObservability>> observability() {
        return Codegen.optional(this.observability);
    }
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is returned as part of the error.
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is returned as part of the error.
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Key value map of arbitrary string tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key value map of arbitrary string tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * List of traffic filter rule identifiers that will be applied to the deployment.
     * 
     */
    @Export(name="trafficFilters", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> trafficFilters;

    /**
     * @return List of traffic filter rule identifiers that will be applied to the deployment.
     * 
     */
    public Output<Optional<List<String>>> trafficFilters() {
        return Codegen.optional(this.trafficFilters);
    }
    /**
     * Elastic Stack version to use for all the deployment resources.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Elastic Stack version to use for all the deployment resources.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deployment:Deployment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apmSecretToken",
                "elasticsearchPassword"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}