// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages Elastic Cloud Enterprise snapshot repositories.
 *
 *   > **This resource can only be used with Elastic Cloud Enterprise** For Elastic Cloud SaaS please use the elasticstack_elasticsearch_snapshot_repository.
 *
 * ## Example Usage
 *
 * ### Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const _this = new ec.SnapshotRepository("this", {
 *     name: "my-snapshot-repository",
 *     generic: {
 *         type: "azure",
 *         settings: JSON.stringify({
 *             container: "my_container",
 *             client: "my_alternate_client",
 *             compress: false,
 *         }),
 *     },
 * });
 * ```
 *
 * ### GCS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const _this = new ec.SnapshotRepository("this", {
 *     name: "my-snapshot-repository",
 *     generic: {
 *         type: "gcs",
 *         settings: JSON.stringify({
 *             bucket: "my_bucket",
 *             client: "my_alternate_client",
 *             compress: false,
 *         }),
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * You can import snapshot repositories using the `name`, for example:
 *
 * ```sh
 * $ pulumi import ec:index/snapshotRepository:SnapshotRepository this my-snapshot-repository
 * ```
 */
export class SnapshotRepository extends pulumi.CustomResource {
    /**
     * Get an existing SnapshotRepository resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotRepositoryState, opts?: pulumi.CustomResourceOptions): SnapshotRepository {
        return new SnapshotRepository(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/snapshotRepository:SnapshotRepository';

    /**
     * Returns true if the given object is an instance of SnapshotRepository.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SnapshotRepository {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SnapshotRepository.__pulumiType;
    }

    /**
     * Generic repository settings.
     */
    public readonly generic!: pulumi.Output<outputs.SnapshotRepositoryGeneric | undefined>;
    /**
     * The name of the snapshot repository configuration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * S3 repository settings.
     */
    public readonly s3!: pulumi.Output<outputs.SnapshotRepositoryS3 | undefined>;

    /**
     * Create a SnapshotRepository resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SnapshotRepositoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotRepositoryArgs | SnapshotRepositoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotRepositoryState | undefined;
            resourceInputs["generic"] = state ? state.generic : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["s3"] = state ? state.s3 : undefined;
        } else {
            const args = argsOrState as SnapshotRepositoryArgs | undefined;
            resourceInputs["generic"] = args ? args.generic : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["s3"] = args ? args.s3 : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SnapshotRepository.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnapshotRepository resources.
 */
export interface SnapshotRepositoryState {
    /**
     * Generic repository settings.
     */
    generic?: pulumi.Input<inputs.SnapshotRepositoryGeneric>;
    /**
     * The name of the snapshot repository configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * S3 repository settings.
     */
    s3?: pulumi.Input<inputs.SnapshotRepositoryS3>;
}

/**
 * The set of arguments for constructing a SnapshotRepository resource.
 */
export interface SnapshotRepositoryArgs {
    /**
     * Generic repository settings.
     */
    generic?: pulumi.Input<inputs.SnapshotRepositoryGeneric>;
    /**
     * The name of the snapshot repository configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * S3 repository settings.
     */
    s3?: pulumi.Input<inputs.SnapshotRepositoryS3>;
}
