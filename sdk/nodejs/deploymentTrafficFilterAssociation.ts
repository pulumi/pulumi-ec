// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const exampleDeployment = ec.getDeployment({
 *     id: "320b7b540dfc967a7a649c18e2fce4ed",
 * });
 * const exampleDeploymentTrafficFilter = new ec.DeploymentTrafficFilter("exampleDeploymentTrafficFilter", {
 *     region: "us-east-1",
 *     type: "ip",
 *     rules: [{
 *         source: "0.0.0.0/0",
 *     }],
 * });
 * const exampleDeploymentTrafficFilterAssociation = new ec.DeploymentTrafficFilterAssociation("exampleDeploymentTrafficFilterAssociation", {
 *     trafficFilterId: exampleDeploymentTrafficFilter.id,
 *     deploymentId: ec_deployment.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Import is not supported on this resource.
 */
export class DeploymentTrafficFilterAssociation extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentTrafficFilterAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentTrafficFilterAssociationState, opts?: pulumi.CustomResourceOptions): DeploymentTrafficFilterAssociation {
        return new DeploymentTrafficFilterAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation';

    /**
     * Returns true if the given object is an instance of DeploymentTrafficFilterAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentTrafficFilterAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentTrafficFilterAssociation.__pulumiType;
    }

    /**
     * Deployment ID of the deployment to which the traffic filter rule is attached.
     */
    public readonly deploymentId!: pulumi.Output<string>;
    /**
     * Traffic filter ID of the rule to use for the attachment.
     */
    public readonly trafficFilterId!: pulumi.Output<string>;

    /**
     * Create a DeploymentTrafficFilterAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentTrafficFilterAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentTrafficFilterAssociationArgs | DeploymentTrafficFilterAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentTrafficFilterAssociationState | undefined;
            resourceInputs["deploymentId"] = state ? state.deploymentId : undefined;
            resourceInputs["trafficFilterId"] = state ? state.trafficFilterId : undefined;
        } else {
            const args = argsOrState as DeploymentTrafficFilterAssociationArgs | undefined;
            if ((!args || args.deploymentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentId'");
            }
            if ((!args || args.trafficFilterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trafficFilterId'");
            }
            resourceInputs["deploymentId"] = args ? args.deploymentId : undefined;
            resourceInputs["trafficFilterId"] = args ? args.trafficFilterId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentTrafficFilterAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeploymentTrafficFilterAssociation resources.
 */
export interface DeploymentTrafficFilterAssociationState {
    /**
     * Deployment ID of the deployment to which the traffic filter rule is attached.
     */
    deploymentId?: pulumi.Input<string>;
    /**
     * Traffic filter ID of the rule to use for the attachment.
     */
    trafficFilterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeploymentTrafficFilterAssociation resource.
 */
export interface DeploymentTrafficFilterAssociationArgs {
    /**
     * Deployment ID of the deployment to which the traffic filter rule is attached.
     */
    deploymentId: pulumi.Input<string>;
    /**
     * Traffic filter ID of the rule to use for the attachment.
     */
    trafficFilterId: pulumi.Input<string>;
}
