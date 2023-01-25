// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides an Elastic Cloud traffic filter resource, which allows traffic filter rules to be created, updated, and deleted. Traffic filter rules are used to limit inbound traffic to deployment resources.
 *
 * ## Example Usage
 * ### IP type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const latest = ec.getStack({
 *     versionRegex: "latest",
 *     region: "us-east-1",
 * });
 * const example = new ec.DeploymentTrafficFilter("example", {
 *     region: "us-east-1",
 *     type: "ip",
 *     rules: [{
 *         source: "0.0.0.0/0",
 *     }],
 * });
 * // Create an Elastic Cloud deployment
 * const exampleMinimal = new ec.Deployment("exampleMinimal", {
 *     region: "us-east-1",
 *     version: latest.then(latest => latest.version),
 *     deploymentTemplateId: "aws-io-optimized-v2",
 *     trafficFilters: [example.id],
 *     elasticsearch: {},
 *     kibana: {},
 * });
 * ```
 * ### Azure Private Link type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const region = azure_australiaeast;
 * const latest = ec.getStack({
 *     versionRegex: "latest",
 *     region: region,
 * });
 * const azure = new ec.DeploymentTrafficFilter("azure", {
 *     region: region,
 *     type: "azure_private_endpoint",
 *     rules: [{
 *         azureEndpointName: "my-azure-pl",
 *         azureEndpointGuid: "78c64959-fd88-41cc-81ac-1cfcdb1ac32e",
 *     }],
 * });
 * // Create an Elastic Cloud deployment
 * const exampleMinimal = new ec.Deployment("exampleMinimal", {
 *     region: region,
 *     version: latest.then(latest => latest.version),
 *     deploymentTemplateId: "azure-io-optimized-v3",
 *     trafficFilters: [azure.id],
 *     elasticsearch: {},
 *     kibana: {},
 * });
 * ```
 * ### GCP Private Service Connect type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const region = asia_east1;
 * const latest = ec.getStack({
 *     versionRegex: "latest",
 *     region: region,
 * });
 * const gcpPsc = new ec.DeploymentTrafficFilter("gcpPsc", {
 *     region: region,
 *     type: "gcp_private_service_connect_endpoint",
 *     rules: [{
 *         source: "18446744072646845332",
 *     }],
 * });
 * // Create an Elastic Cloud deployment
 * const exampleMinimal = new ec.Deployment("exampleMinimal", {
 *     region: region,
 *     version: latest.then(latest => latest.version),
 *     deploymentTemplateId: "gcp-storage-optimized",
 *     trafficFilters: [gcpPsc.id],
 *     elasticsearch: {},
 *     kibana: {},
 * });
 * ```
 *
 * ## Import
 *
 * You can import traffic filters using the `id`, for example
 *
 * ```sh
 *  $ pulumi import ec:index/deploymentTrafficFilter:DeploymentTrafficFilter name 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 */
export class DeploymentTrafficFilter extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentTrafficFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentTrafficFilterState, opts?: pulumi.CustomResourceOptions): DeploymentTrafficFilter {
        return new DeploymentTrafficFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/deploymentTrafficFilter:DeploymentTrafficFilter';

    /**
     * Returns true if the given object is an instance of DeploymentTrafficFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentTrafficFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentTrafficFilter.__pulumiType;
    }

    /**
     * Description of the ruleset.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * To automatically include the ruleset in the new deployments. Defaults to `false`.
     */
    public readonly includeByDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Filter region, the ruleset can only be attached to deployments in the specific region.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Rule block, which can be specified multiple times for multiple rules.
     */
    public readonly rules!: pulumi.Output<outputs.DeploymentTrafficFilterRule[]>;
    /**
     * Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azurePrivateEndpoint"`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DeploymentTrafficFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentTrafficFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentTrafficFilterArgs | DeploymentTrafficFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentTrafficFilterState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["includeByDefault"] = state ? state.includeByDefault : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DeploymentTrafficFilterArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["includeByDefault"] = args ? args.includeByDefault : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentTrafficFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeploymentTrafficFilter resources.
 */
export interface DeploymentTrafficFilterState {
    /**
     * Description of the ruleset.
     */
    description?: pulumi.Input<string>;
    /**
     * To automatically include the ruleset in the new deployments. Defaults to `false`.
     */
    includeByDefault?: pulumi.Input<boolean>;
    /**
     * Name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * Filter region, the ruleset can only be attached to deployments in the specific region.
     */
    region?: pulumi.Input<string>;
    /**
     * Rule block, which can be specified multiple times for multiple rules.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.DeploymentTrafficFilterRule>[]>;
    /**
     * Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azurePrivateEndpoint"`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeploymentTrafficFilter resource.
 */
export interface DeploymentTrafficFilterArgs {
    /**
     * Description of the ruleset.
     */
    description?: pulumi.Input<string>;
    /**
     * To automatically include the ruleset in the new deployments. Defaults to `false`.
     */
    includeByDefault?: pulumi.Input<boolean>;
    /**
     * Name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * Filter region, the ruleset can only be attached to deployments in the specific region.
     */
    region: pulumi.Input<string>;
    /**
     * Rule block, which can be specified multiple times for multiple rules.
     */
    rules: pulumi.Input<pulumi.Input<inputs.DeploymentTrafficFilterRule>[]>;
    /**
     * Type of the ruleset.  It can be `"ip"`, `"vpce"` or `"azurePrivateEndpoint"`.
     */
    type: pulumi.Input<string>;
}
