// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to filter for an existing traffic filter that has been created via one of the provided filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const name = ec.getTrafficFilter({
 *     name: "example-filter",
 * });
 * const id = ec.getTrafficFilter({
 *     id: "41d275439f884ce89359039e53eac516",
 * });
 * const region = ec.getTrafficFilter({
 *     region: "us-east-1",
 * });
 * ```
 */
export function getTrafficFilter(args?: GetTrafficFilterArgs, opts?: pulumi.InvokeOptions): Promise<GetTrafficFilterResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ec:index/getTrafficFilter:getTrafficFilter", {
        "id": args.id,
        "name": args.name,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getTrafficFilter.
 */
export interface GetTrafficFilterArgs {
    /**
     * The ID of the ruleset
     */
    id?: string;
    /**
     * The name of the ruleset.
     */
    name?: string;
    /**
     * The ruleset can be attached only to deployments in the specific region.
     */
    region?: string;
}

/**
 * A collection of values returned by getTrafficFilter.
 */
export interface GetTrafficFilterResult {
    /**
     * The id of the traffic filter to select.
     */
    readonly id?: string;
    /**
     * The exact name of the traffic filter to select.
     */
    readonly name?: string;
    /**
     * Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
     */
    readonly region?: string;
    /**
     * An individual ruleset
     */
    readonly rulesets: outputs.GetTrafficFilterRuleset[];
}
/**
 * Use this data source to filter for an existing traffic filter that has been created via one of the provided filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const name = ec.getTrafficFilter({
 *     name: "example-filter",
 * });
 * const id = ec.getTrafficFilter({
 *     id: "41d275439f884ce89359039e53eac516",
 * });
 * const region = ec.getTrafficFilter({
 *     region: "us-east-1",
 * });
 * ```
 */
export function getTrafficFilterOutput(args?: GetTrafficFilterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTrafficFilterResult> {
    return pulumi.output(args).apply((a: any) => getTrafficFilter(a, opts))
}

/**
 * A collection of arguments for invoking getTrafficFilter.
 */
export interface GetTrafficFilterOutputArgs {
    /**
     * The ID of the ruleset
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * The ruleset can be attached only to deployments in the specific region.
     */
    region?: pulumi.Input<string>;
}
