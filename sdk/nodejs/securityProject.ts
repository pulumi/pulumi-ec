// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Technical preview
 *
 * This functionality is in technical preview and may be changed or removed in a future release.
 * Elastic will work to fix any issues, but features in technical preview are not subject to the support SLA of official GA features.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const myProject = new ec.SecurityProject("my_project", {
 *     name: "my_project",
 *     regionId: "aws-us-east-1",
 * });
 * ```
 *
 * ## Import
 *
 * Projects can be imported using the `id`, for example:
 *
 * ```sh
 * $ pulumi import ec:index/securityProject:SecurityProject id 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 */
export class SecurityProject extends pulumi.CustomResource {
    /**
     * Get an existing SecurityProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityProjectState, opts?: pulumi.CustomResourceOptions): SecurityProject {
        return new SecurityProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/securityProject:SecurityProject';

    /**
     * Returns true if the given object is an instance of SecurityProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityProject.__pulumiType;
    }

    /**
     * admin features package (BYOK, BYOIDP, CCS, CCR)
     */
    public readonly adminFeaturesPackage!: pulumi.Output<string>;
    /**
     * A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     */
    public readonly alias!: pulumi.Output<string>;
    /**
     * The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     */
    public /*out*/ readonly cloudId!: pulumi.Output<string>;
    /**
     * Basic auth credentials to access the Elasticsearch API.
     */
    public /*out*/ readonly credentials!: pulumi.Output<outputs.SecurityProjectCredentials>;
    /**
     * The endpoints to access the different apps of the project.
     */
    public /*out*/ readonly endpoints!: pulumi.Output<outputs.SecurityProjectEndpoints>;
    /**
     * Additional details about the project.
     */
    public /*out*/ readonly metadata!: pulumi.Output<outputs.SecurityProjectMetadata>;
    /**
     * Descriptive name for a project.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly productTypes!: pulumi.Output<outputs.SecurityProjectProductType[]>;
    /**
     * Unique human-readable identifier for a region in Elastic Cloud.
     */
    public readonly regionId!: pulumi.Output<string>;
    /**
     * the type of the project
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a SecurityProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityProjectArgs | SecurityProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityProjectState | undefined;
            resourceInputs["adminFeaturesPackage"] = state ? state.adminFeaturesPackage : undefined;
            resourceInputs["alias"] = state ? state.alias : undefined;
            resourceInputs["cloudId"] = state ? state.cloudId : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["productTypes"] = state ? state.productTypes : undefined;
            resourceInputs["regionId"] = state ? state.regionId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as SecurityProjectArgs | undefined;
            if ((!args || args.regionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regionId'");
            }
            resourceInputs["adminFeaturesPackage"] = args ? args.adminFeaturesPackage : undefined;
            resourceInputs["alias"] = args ? args.alias : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["productTypes"] = args ? args.productTypes : undefined;
            resourceInputs["regionId"] = args ? args.regionId : undefined;
            resourceInputs["cloudId"] = undefined /*out*/;
            resourceInputs["credentials"] = undefined /*out*/;
            resourceInputs["endpoints"] = undefined /*out*/;
            resourceInputs["metadata"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityProject resources.
 */
export interface SecurityProjectState {
    /**
     * admin features package (BYOK, BYOIDP, CCS, CCR)
     */
    adminFeaturesPackage?: pulumi.Input<string>;
    /**
     * A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     */
    alias?: pulumi.Input<string>;
    /**
     * The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     */
    cloudId?: pulumi.Input<string>;
    /**
     * Basic auth credentials to access the Elasticsearch API.
     */
    credentials?: pulumi.Input<inputs.SecurityProjectCredentials>;
    /**
     * The endpoints to access the different apps of the project.
     */
    endpoints?: pulumi.Input<inputs.SecurityProjectEndpoints>;
    /**
     * Additional details about the project.
     */
    metadata?: pulumi.Input<inputs.SecurityProjectMetadata>;
    /**
     * Descriptive name for a project.
     */
    name?: pulumi.Input<string>;
    productTypes?: pulumi.Input<pulumi.Input<inputs.SecurityProjectProductType>[]>;
    /**
     * Unique human-readable identifier for a region in Elastic Cloud.
     */
    regionId?: pulumi.Input<string>;
    /**
     * the type of the project
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityProject resource.
 */
export interface SecurityProjectArgs {
    /**
     * admin features package (BYOK, BYOIDP, CCS, CCR)
     */
    adminFeaturesPackage?: pulumi.Input<string>;
    /**
     * A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     */
    alias?: pulumi.Input<string>;
    /**
     * Descriptive name for a project.
     */
    name?: pulumi.Input<string>;
    productTypes?: pulumi.Input<pulumi.Input<inputs.SecurityProjectProductType>[]>;
    /**
     * Unique human-readable identifier for a region in Elastic Cloud.
     */
    regionId: pulumi.Input<string>;
}
