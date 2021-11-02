// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const example = pulumi.output(ec.getDeployments({
 *     apm: {
 *         version: "7.9.1",
 *     },
 *     deploymentTemplateId: "azure-compute-optimized",
 *     elasticsearch: {
 *         healthy: "true",
 *     },
 *     enterpriseSearch: {
 *         healthy: "true",
 *     },
 *     kibana: {
 *         status: "started",
 *     },
 *     namePrefix: "test",
 *     size: 200,
 *     tags: {
 *         foo: "bar",
 *     },
 * }));
 * ```
 */
export function getDeployments(args?: GetDeploymentsArgs, opts?: pulumi.InvokeOptions): Promise<GetDeploymentsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("ec:index/getDeployments:getDeployments", {
        "apm": args.apm,
        "deploymentTemplateId": args.deploymentTemplateId,
        "elasticsearch": args.elasticsearch,
        "enterpriseSearch": args.enterpriseSearch,
        "healthy": args.healthy,
        "kibana": args.kibana,
        "namePrefix": args.namePrefix,
        "size": args.size,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeployments.
 */
export interface GetDeploymentsArgs {
    /**
     * Filter by APM resource kind status or configuration.
     * * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.healthy` - Overall health status of the APM instances.
     */
    apm?: inputs.GetDeploymentsApm;
    /**
     * ID of the deployment template used to create the deployment.
     */
    deploymentTemplateId?: string;
    /**
     * Filter by Elasticsearch resource kind status or configuration.
     * * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
     */
    elasticsearch?: inputs.GetDeploymentsElasticsearch;
    /**
     * Filter by Enterprise Search resource kind status or configuration.
     * * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
     */
    enterpriseSearch?: inputs.GetDeploymentsEnterpriseSearch;
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    /**
     * Filter by Kibana resource kind status or configuration.
     * * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.healthy` - Overall health status of the Kibana instances.
     */
    kibana?: inputs.GetDeploymentsKibana;
    /**
     * Prefix that one or several deployment names have in common.
     */
    namePrefix?: string;
    /**
     * The maximum number of deployments to return. Defaults to `100`.
     */
    size?: number;
    /**
     * Key value map of arbitrary string tags for the deployment.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getDeployments.
 */
export interface GetDeploymentsResult {
    readonly apm?: outputs.GetDeploymentsApm;
    readonly deploymentTemplateId?: string;
    /**
     * List of deployments which match the specified query.
     * * `deployments.#.deployment_id` - The deployment unique ID.
     * * `deployments.#.alias` - Deployment alias.
     * * `deployments.#.name` - The name of the deployment.
     * * `deployments.#.elasticsearch_resource_id` - The Elasticsearch resource unique ID.
     * * `deployments.#.elasticsearch_ref_id` - The Elasticsearch resource reference.
     * * `deployments.#.kibana_resource_id` - The Kibana resource unique ID.
     * * `deployments.#.kibana_ref_id` - The Kibana resource reference.
     * * `deployments.#.apm_resource_id` - The APM resource unique ID.
     * * `deployments.#.apm_ref_id` - The APM resource reference.
     * * `deployments.#.enterprise_search_resource_id` - The Enterprise Search resource unique ID.
     * * `deployments.#.enterprise_search_ref_id` - The Enterprise Search resource reference.
     */
    readonly deployments: outputs.GetDeploymentsDeployment[];
    readonly elasticsearch?: outputs.GetDeploymentsElasticsearch;
    readonly enterpriseSearch?: outputs.GetDeploymentsEnterpriseSearch;
    readonly healthy?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly kibana?: outputs.GetDeploymentsKibana;
    readonly namePrefix?: string;
    readonly returnCount: number;
    readonly size?: number;
    readonly tags?: {[key: string]: string};
}

export function getDeploymentsOutput(args?: GetDeploymentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeploymentsResult> {
    return pulumi.output(args).apply(a => getDeployments(a, opts))
}

/**
 * A collection of arguments for invoking getDeployments.
 */
export interface GetDeploymentsOutputArgs {
    /**
     * Filter by APM resource kind status or configuration.
     * * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.healthy` - Overall health status of the APM instances.
     */
    apm?: pulumi.Input<inputs.GetDeploymentsApmArgs>;
    /**
     * ID of the deployment template used to create the deployment.
     */
    deploymentTemplateId?: pulumi.Input<string>;
    /**
     * Filter by Elasticsearch resource kind status or configuration.
     * * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
     */
    elasticsearch?: pulumi.Input<inputs.GetDeploymentsElasticsearchArgs>;
    /**
     * Filter by Enterprise Search resource kind status or configuration.
     * * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
     */
    enterpriseSearch?: pulumi.Input<inputs.GetDeploymentsEnterpriseSearchArgs>;
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    /**
     * Filter by Kibana resource kind status or configuration.
     * * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.healthy` - Overall health status of the Kibana instances.
     */
    kibana?: pulumi.Input<inputs.GetDeploymentsKibanaArgs>;
    /**
     * Prefix that one or several deployment names have in common.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The maximum number of deployments to return. Defaults to `100`.
     */
    size?: pulumi.Input<number>;
    /**
     * Key value map of arbitrary string tags for the deployment.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
