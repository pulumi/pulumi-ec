// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about an existing Elastic Cloud deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const example = ec.getDeployment({
 *     id: "f759065e5e64e9f3546f6c44f2743893",
 * });
 * ```
 */
export function getDeployment(args: GetDeploymentArgs, opts?: pulumi.InvokeOptions): Promise<GetDeploymentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ec:index/getDeployment:getDeployment", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeployment.
 */
export interface GetDeploymentArgs {
    /**
     * The ID of an existing Elastic Cloud deployment.
     */
    id: string;
}

/**
 * A collection of values returned by getDeployment.
 */
export interface GetDeploymentResult {
    /**
     * Deployment alias.
     */
    readonly alias: string;
    /**
     * Instance configuration of the APM type.
     * * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `apm.#.healthy` - Resource kind health status.
     * * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `apm.#.ref_id` - User specified refId for the resource kind.
     * * `apm.#.resource_id` - The resource unique identifier.
     * * `apm.#.status` - Resource kind status (for example, "started", "stopped", etc).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.topology` - Node topology element definition.
     * * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
     * * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     */
    readonly apms: outputs.GetDeploymentApm[];
    /**
     * ID of the deployment template used to create the deployment.
     */
    readonly deploymentTemplateId: string;
    /**
     * Instance configuration of the Elasticsearch resource kind.
     * * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
     * * `elasticsearch.#.healthy` - Resource kind health status.
     * * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
     * * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `elasticsearch.#.ref_id` - User specified refId for the resource kind.
     * * `elasticsearch.#.resource_id` - The resource unique identifier.
     * * `elasticsearch.#.status` - Resource kind status (for example, "started", "stopped", etc).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.topology` - Topology element definition.
     * * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
     * * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (>=7.10.0).
     * * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (<7.10.0).
     * * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (<7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (<7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (<7.10.0).
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
     */
    readonly elasticsearches: outputs.GetDeploymentElasticsearch[];
    /**
     * Instance configuration of the Enterprise Search type.
     * * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `enterprise_search.#.healthy` - Resource kind health status.
     * * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `enterprise_search.#.ref_id` - User specified refId for the resource kind.
     * * `enterprise_search.#.resource_id` - The resource unique identifier.
     * * `enterprise_search.#.status` - Resource kind status (for example, "started", "stopped", etc).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.topology` - Node topology element definition.
     * * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
     * * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
     * * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
     * * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
     */
    readonly enterpriseSearches: outputs.GetDeploymentEnterpriseSearch[];
    /**
     * Overall health status of the deployment.
     */
    readonly healthy: boolean;
    /**
     * The unique ID of the deployment.
     */
    readonly id: string;
    /**
     * Instance configuration of the Integrations Server type.
     * * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `integrations_server.#.healthy` - Resource kind health status.
     * * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `integrations_server.#.ref_id` - User specified refId for the resource kind.
     * * `integrations_server.#.resource_id` - The resource unique identifier.
     * * `integrations_server.#.status` - Resource kind status (for example, "started", "stopped", etc).
     * * `integrations_server.#.version` - Elastic stack version.
     * * `integrations_server.#.topology` - Node topology element definition.
     * * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
     * * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     */
    readonly integrationsServers: outputs.GetDeploymentIntegrationsServer[];
    /**
     * Instance configuration of the Kibana type.
     * * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `kibana.#.healthy` - Resource kind health status.
     * * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `kibana.#.ref_id` - User specified refId for the resource kind.
     * * `kibana.#.resource_id` - The resource unique identifier.
     * * `kibana.#.status` - Resource kind status (for example, "started", "stopped", etc).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.topology` - Node topology element definition.
     * * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
     * * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     */
    readonly kibanas: outputs.GetDeploymentKibana[];
    /**
     * The name of the deployment.
     */
    readonly name: string;
    /**
     * Observability settings. Information about logs and metrics shipped to a dedicated deployment.
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
     * * `observability.#.ref_id` - Elasticsearch resource kind refId of the destination deployment.
     * * `observability.#.logs` - Defines whether logs are enabled or disabled.
     * * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
     */
    readonly observabilities: outputs.GetDeploymentObservability[];
    /**
     * Region where the deployment can be found.
     */
    readonly region: string;
    /**
     * Key value map of arbitrary string tags.
     */
    readonly tags: {[key: string]: string};
    /**
     * Traffic filter block, which contains a list of traffic filter rule identifiers.
     */
    readonly trafficFilters: string[];
}
/**
 * Use this data source to retrieve information about an existing Elastic Cloud deployment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const example = ec.getDeployment({
 *     id: "f759065e5e64e9f3546f6c44f2743893",
 * });
 * ```
 */
export function getDeploymentOutput(args: GetDeploymentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeploymentResult> {
    return pulumi.output(args).apply((a: any) => getDeployment(a, opts))
}

/**
 * A collection of arguments for invoking getDeployment.
 */
export interface GetDeploymentOutputArgs {
    /**
     * The ID of an existing Elastic Cloud deployment.
     */
    id: pulumi.Input<string>;
}
