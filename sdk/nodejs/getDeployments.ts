// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const example = ec.getDeployments({
 *     deploymentTemplateId: "azure-compute-optimized",
 *     elasticsearches: [{
 *         healthy: "true",
 *     }],
 *     enterpriseSearches: [{
 *         healthy: "true",
 *     }],
 *     integrationsServers: [{
 *         version: "8.0.0",
 *     }],
 *     kibanas: [{
 *         status: "started",
 *     }],
 *     namePrefix: "test",
 *     size: 200,
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDeployments(args?: GetDeploymentsArgs, opts?: pulumi.InvokeOptions): Promise<GetDeploymentsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ec:index/getDeployments:getDeployments", {
        "apms": args.apms,
        "deploymentTemplateId": args.deploymentTemplateId,
        "elasticsearches": args.elasticsearches,
        "enterpriseSearches": args.enterpriseSearches,
        "healthy": args.healthy,
        "integrationsServers": args.integrationsServers,
        "kibanas": args.kibanas,
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
     */
    apms?: inputs.GetDeploymentsApm[];
    /**
     * Filter the result set by the ID of the deployment template the deployment is based off.
     */
    deploymentTemplateId?: string;
    /**
     * Filter by Elasticsearch resource kind status or configuration.
     */
    elasticsearches?: inputs.GetDeploymentsElasticsearch[];
    /**
     * Filter by Enterprise Search resource kind status or configuration.
     */
    enterpriseSearches?: inputs.GetDeploymentsEnterpriseSearch[];
    /**
     * Overall health status of the resource instances.
     */
    healthy?: string;
    /**
     * Filter by Integrations Server resource kind status or configuration.
     */
    integrationsServers?: inputs.GetDeploymentsIntegrationsServer[];
    /**
     * Filter by Kibana resource kind status or configuration.
     */
    kibanas?: inputs.GetDeploymentsKibana[];
    /**
     * Prefix to filter the returned deployment list by.
     */
    namePrefix?: string;
    /**
     * The maximum number of deployments to return. Defaults to `100`.
     */
    size?: number;
    /**
     * Filter the result set by their assigned tags.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getDeployments.
 */
export interface GetDeploymentsResult {
    /**
     * Filter by APM resource kind status or configuration.
     */
    readonly apms?: outputs.GetDeploymentsApm[];
    /**
     * Filter the result set by the ID of the deployment template the deployment is based off.
     */
    readonly deploymentTemplateId?: string;
    /**
     * List of deployments which match the specified query.
     */
    readonly deployments: outputs.GetDeploymentsDeployment[];
    /**
     * Filter by Elasticsearch resource kind status or configuration.
     */
    readonly elasticsearches?: outputs.GetDeploymentsElasticsearch[];
    /**
     * Filter by Enterprise Search resource kind status or configuration.
     */
    readonly enterpriseSearches?: outputs.GetDeploymentsEnterpriseSearch[];
    /**
     * Filter the result set by their health status.
     */
    readonly healthy?: string;
    /**
     * Unique identifier of this data source.
     */
    readonly id: string;
    /**
     * Filter by Integrations Server resource kind status or configuration.
     */
    readonly integrationsServers?: outputs.GetDeploymentsIntegrationsServer[];
    /**
     * Filter by Kibana resource kind status or configuration.
     */
    readonly kibanas?: outputs.GetDeploymentsKibana[];
    /**
     * Prefix to filter the returned deployment list by.
     */
    readonly namePrefix?: string;
    /**
     * The number of deployments actually returned.
     */
    readonly returnCount: number;
    /**
     * The maximum number of deployments to return. Defaults to `100`.
     */
    readonly size?: number;
    /**
     * Filter the result set by their assigned tags.
     */
    readonly tags?: {[key: string]: string};
}
/**
 * Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const example = ec.getDeployments({
 *     deploymentTemplateId: "azure-compute-optimized",
 *     elasticsearches: [{
 *         healthy: "true",
 *     }],
 *     enterpriseSearches: [{
 *         healthy: "true",
 *     }],
 *     integrationsServers: [{
 *         version: "8.0.0",
 *     }],
 *     kibanas: [{
 *         status: "started",
 *     }],
 *     namePrefix: "test",
 *     size: 200,
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDeploymentsOutput(args?: GetDeploymentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeploymentsResult> {
    return pulumi.output(args).apply((a: any) => getDeployments(a, opts))
}

/**
 * A collection of arguments for invoking getDeployments.
 */
export interface GetDeploymentsOutputArgs {
    /**
     * Filter by APM resource kind status or configuration.
     */
    apms?: pulumi.Input<pulumi.Input<inputs.GetDeploymentsApmArgs>[]>;
    /**
     * Filter the result set by the ID of the deployment template the deployment is based off.
     */
    deploymentTemplateId?: pulumi.Input<string>;
    /**
     * Filter by Elasticsearch resource kind status or configuration.
     */
    elasticsearches?: pulumi.Input<pulumi.Input<inputs.GetDeploymentsElasticsearchArgs>[]>;
    /**
     * Filter by Enterprise Search resource kind status or configuration.
     */
    enterpriseSearches?: pulumi.Input<pulumi.Input<inputs.GetDeploymentsEnterpriseSearchArgs>[]>;
    /**
     * Overall health status of the resource instances.
     */
    healthy?: pulumi.Input<string>;
    /**
     * Filter by Integrations Server resource kind status or configuration.
     */
    integrationsServers?: pulumi.Input<pulumi.Input<inputs.GetDeploymentsIntegrationsServerArgs>[]>;
    /**
     * Filter by Kibana resource kind status or configuration.
     */
    kibanas?: pulumi.Input<pulumi.Input<inputs.GetDeploymentsKibanaArgs>[]>;
    /**
     * Prefix to filter the returned deployment list by.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The maximum number of deployments to return. Defaults to `100`.
     */
    size?: pulumi.Input<number>;
    /**
     * Filter the result set by their assigned tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
