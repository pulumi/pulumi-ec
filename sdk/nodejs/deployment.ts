// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ~> **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported. ~> **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported. ~> **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing. Deployments can be imported using the `id`, for example
 *
 * ```sh
 *  $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 */
export class Deployment extends pulumi.CustomResource {
    /**
     * Get an existing Deployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentState, opts?: pulumi.CustomResourceOptions): Deployment {
        return new Deployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/deployment:Deployment';

    /**
     * Returns true if the given object is an instance of Deployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Deployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Deployment.__pulumiType;
    }

    /**
     * Deployment alias, affects the format of the resource URLs.
     */
    public readonly alias!: pulumi.Output<string>;
    /**
     * **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
     */
    public readonly apm!: pulumi.Output<outputs.DeploymentApm | undefined>;
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
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
     * * `observability.#.ref_id` - (Optional) Elasticsearch resource kind refId of the destination deployment.
     * * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
     * * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
     */
    public /*out*/ readonly apmSecretToken!: pulumi.Output<string>;
    /**
     * Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    public readonly deploymentTemplateId!: pulumi.Output<string>;
    /**
     * Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
     */
    public readonly elasticsearch!: pulumi.Output<outputs.DeploymentElasticsearch>;
    /**
     * Auto-generated Elasticsearch password.
     */
    public /*out*/ readonly elasticsearchPassword!: pulumi.Output<string>;
    /**
     * Auto-generated Elasticsearch username.
     */
    public /*out*/ readonly elasticsearchUsername!: pulumi.Output<string>;
    /**
     * Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
     */
    public readonly enterpriseSearch!: pulumi.Output<outputs.DeploymentEnterpriseSearch | undefined>;
    /**
     * Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
     */
    public readonly integrationsServer!: pulumi.Output<outputs.DeploymentIntegrationsServer | undefined>;
    /**
     * Kibana instance definition, can only be specified once.
     */
    public readonly kibana!: pulumi.Output<outputs.DeploymentKibana | undefined>;
    /**
     * Name of the deployment.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Observability settings that you can set to ship logs and metrics to a separate deployment.
     */
    public readonly observability!: pulumi.Output<outputs.DeploymentObservability | undefined>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
     */
    public readonly requestId!: pulumi.Output<string | undefined>;
    /**
     * Key value map of arbitrary string tags.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * List of traffic filter rule identifiers that will be applied to the deployment.
     */
    public readonly trafficFilters!: pulumi.Output<string[] | undefined>;
    /**
     * Elastic Stack version to use for all the deployment resources.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a Deployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentArgs | DeploymentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentState | undefined;
            resourceInputs["alias"] = state ? state.alias : undefined;
            resourceInputs["apm"] = state ? state.apm : undefined;
            resourceInputs["apmSecretToken"] = state ? state.apmSecretToken : undefined;
            resourceInputs["deploymentTemplateId"] = state ? state.deploymentTemplateId : undefined;
            resourceInputs["elasticsearch"] = state ? state.elasticsearch : undefined;
            resourceInputs["elasticsearchPassword"] = state ? state.elasticsearchPassword : undefined;
            resourceInputs["elasticsearchUsername"] = state ? state.elasticsearchUsername : undefined;
            resourceInputs["enterpriseSearch"] = state ? state.enterpriseSearch : undefined;
            resourceInputs["integrationsServer"] = state ? state.integrationsServer : undefined;
            resourceInputs["kibana"] = state ? state.kibana : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["observability"] = state ? state.observability : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["trafficFilters"] = state ? state.trafficFilters : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as DeploymentArgs | undefined;
            if ((!args || args.deploymentTemplateId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentTemplateId'");
            }
            if ((!args || args.elasticsearch === undefined) && !opts.urn) {
                throw new Error("Missing required property 'elasticsearch'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["alias"] = args ? args.alias : undefined;
            resourceInputs["apm"] = args ? args.apm : undefined;
            resourceInputs["deploymentTemplateId"] = args ? args.deploymentTemplateId : undefined;
            resourceInputs["elasticsearch"] = args ? args.elasticsearch : undefined;
            resourceInputs["enterpriseSearch"] = args ? args.enterpriseSearch : undefined;
            resourceInputs["integrationsServer"] = args ? args.integrationsServer : undefined;
            resourceInputs["kibana"] = args ? args.kibana : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["observability"] = args ? args.observability : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["requestId"] = args ? args.requestId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["trafficFilters"] = args ? args.trafficFilters : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["apmSecretToken"] = undefined /*out*/;
            resourceInputs["elasticsearchPassword"] = undefined /*out*/;
            resourceInputs["elasticsearchUsername"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Deployment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Deployment resources.
 */
export interface DeploymentState {
    /**
     * Deployment alias, affects the format of the resource URLs.
     */
    alias?: pulumi.Input<string>;
    /**
     * **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
     */
    apm?: pulumi.Input<inputs.DeploymentApm>;
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
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
     * * `observability.#.ref_id` - (Optional) Elasticsearch resource kind refId of the destination deployment.
     * * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
     * * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
     */
    apmSecretToken?: pulumi.Input<string>;
    /**
     * Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    deploymentTemplateId?: pulumi.Input<string>;
    /**
     * Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
     */
    elasticsearch?: pulumi.Input<inputs.DeploymentElasticsearch>;
    /**
     * Auto-generated Elasticsearch password.
     */
    elasticsearchPassword?: pulumi.Input<string>;
    /**
     * Auto-generated Elasticsearch username.
     */
    elasticsearchUsername?: pulumi.Input<string>;
    /**
     * Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
     */
    enterpriseSearch?: pulumi.Input<inputs.DeploymentEnterpriseSearch>;
    /**
     * Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
     */
    integrationsServer?: pulumi.Input<inputs.DeploymentIntegrationsServer>;
    /**
     * Kibana instance definition, can only be specified once.
     */
    kibana?: pulumi.Input<inputs.DeploymentKibana>;
    /**
     * Name of the deployment.
     */
    name?: pulumi.Input<string>;
    /**
     * Observability settings that you can set to ship logs and metrics to a separate deployment.
     */
    observability?: pulumi.Input<inputs.DeploymentObservability>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    /**
     * Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
     */
    requestId?: pulumi.Input<string>;
    /**
     * Key value map of arbitrary string tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of traffic filter rule identifiers that will be applied to the deployment.
     */
    trafficFilters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Elastic Stack version to use for all the deployment resources.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Deployment resource.
 */
export interface DeploymentArgs {
    /**
     * Deployment alias, affects the format of the resource URLs.
     */
    alias?: pulumi.Input<string>;
    /**
     * **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
     */
    apm?: pulumi.Input<inputs.DeploymentApm>;
    /**
     * Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    deploymentTemplateId: pulumi.Input<string>;
    /**
     * Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
     */
    elasticsearch: pulumi.Input<inputs.DeploymentElasticsearch>;
    /**
     * Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
     */
    enterpriseSearch?: pulumi.Input<inputs.DeploymentEnterpriseSearch>;
    /**
     * Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
     */
    integrationsServer?: pulumi.Input<inputs.DeploymentIntegrationsServer>;
    /**
     * Kibana instance definition, can only be specified once.
     */
    kibana?: pulumi.Input<inputs.DeploymentKibana>;
    /**
     * Name of the deployment.
     */
    name?: pulumi.Input<string>;
    /**
     * Observability settings that you can set to ship logs and metrics to a separate deployment.
     */
    observability?: pulumi.Input<inputs.DeploymentObservability>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: pulumi.Input<string>;
    /**
     * Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
     */
    requestId?: pulumi.Input<string>;
    /**
     * Key value map of arbitrary string tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of traffic filter rule identifiers that will be applied to the deployment.
     */
    trafficFilters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Elastic Stack version to use for all the deployment resources.
     */
    version: pulumi.Input<string>;
}
