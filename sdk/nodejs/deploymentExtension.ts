// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides an Elastic Cloud extension resource, which allows extensions to be created, updated, and deleted.
 *
 * Extensions allow users of Elastic Cloud to use custom plugins, scripts, or dictionaries to enhance the core functionality of Elasticsearch. Before you install an extension, be sure to check out the supported and official [Elasticsearch plugins](https://www.elastic.co/guide/en/elasticsearch/plugins/current/index.html) already available.
 *
 * **Tip :** If you experience timeouts when uploading an extension through a slow network, you might need to increase the timeout setting.
 *
 * ## Example Usage
 * ### With extension file
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as crypto from "crypto";
 * import * as ec from "@pulumi/ec";
 * import * as fs from "fs";
 *
 * function computeFilebase64sha256(path string) string {
 * 	const fileData = Buffer.from(fs.readFileSync(path), 'binary')
 * 	return crypto.createHash('sha256').update(fileData).digest('hex')
 * }
 *
 * const filePath = "/path/to/plugin.zip";
 * const exampleExtension = new ec.DeploymentExtension("exampleExtension", {
 *     description: "my extension",
 *     version: "*",
 *     extensionType: "bundle",
 *     filePath: filePath,
 *     fileHash: computeFilebase64sha256(filePath),
 * });
 * ```
 * ### With download URL
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const exampleExtension = new ec.DeploymentExtension("exampleExtension", {
 *     description: "my extension",
 *     downloadUrl: "https://example.net",
 *     extensionType: "bundle",
 *     version: "*",
 * });
 * ```
 * ### Using extension in ec.Deployment
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const exampleExtension = new ec.DeploymentExtension("exampleExtension", {
 *     description: "my extension",
 *     version: "*",
 *     extensionType: "bundle",
 *     downloadUrl: "https://example.net",
 * });
 * const latest = ec.getStack({
 *     versionRegex: "latest",
 *     region: "us-east-1",
 * });
 * const withExtension = new ec.Deployment("withExtension", {
 *     region: "us-east-1",
 *     version: latest.then(latest => latest.version),
 *     deploymentTemplateId: "aws-io-optimized-v2",
 *     elasticsearch: {
 *         extensions: [{
 *             name: exampleExtension.name,
 *             type: "bundle",
 *             version: latest.then(latest => latest.version),
 *             url: exampleExtension.url,
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * You can import extensions using the `id`, for example
 *
 * ```sh
 *  $ pulumi import ec:index/deploymentExtension:DeploymentExtension name 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 */
export class DeploymentExtension extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentExtension resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentExtensionState, opts?: pulumi.CustomResourceOptions): DeploymentExtension {
        return new DeploymentExtension(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'ec:index/deploymentExtension:DeploymentExtension';

    /**
     * Returns true if the given object is an instance of DeploymentExtension.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentExtension {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentExtension.__pulumiType;
    }

    /**
     * Description of the extension.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The URL to download the extension archive.
     */
    public readonly downloadUrl!: pulumi.Output<string | undefined>;
    /**
     * `bundle` or `plugin` allowed. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     */
    public readonly extensionType!: pulumi.Output<string>;
    /**
     * Hash value of the file. If it is changed, the file is reuploaded.
     */
    public readonly fileHash!: pulumi.Output<string | undefined>;
    /**
     * File path of the extension uploaded.
     */
    public readonly filePath!: pulumi.Output<string | undefined>;
    /**
     * The datetime the extension was last modified.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * Name of the extension.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The extension file size in bytes.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;
    /**
     * The extension URL to be used in the plan.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    /**
     * Elastic stack version, a numeric version for plugins, e.g. 2.3.0 should be set. Major version e.g. 2.*, or wildcards e.g. * for bundles.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a DeploymentExtension resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentExtensionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentExtensionArgs | DeploymentExtensionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentExtensionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["downloadUrl"] = state ? state.downloadUrl : undefined;
            resourceInputs["extensionType"] = state ? state.extensionType : undefined;
            resourceInputs["fileHash"] = state ? state.fileHash : undefined;
            resourceInputs["filePath"] = state ? state.filePath : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as DeploymentExtensionArgs | undefined;
            if ((!args || args.extensionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'extensionType'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["downloadUrl"] = args ? args.downloadUrl : undefined;
            resourceInputs["extensionType"] = args ? args.extensionType : undefined;
            resourceInputs["fileHash"] = args ? args.fileHash : undefined;
            resourceInputs["filePath"] = args ? args.filePath : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["size"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentExtension.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeploymentExtension resources.
 */
export interface DeploymentExtensionState {
    /**
     * Description of the extension.
     */
    description?: pulumi.Input<string>;
    /**
     * The URL to download the extension archive.
     */
    downloadUrl?: pulumi.Input<string>;
    /**
     * `bundle` or `plugin` allowed. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     */
    extensionType?: pulumi.Input<string>;
    /**
     * Hash value of the file. If it is changed, the file is reuploaded.
     */
    fileHash?: pulumi.Input<string>;
    /**
     * File path of the extension uploaded.
     */
    filePath?: pulumi.Input<string>;
    /**
     * The datetime the extension was last modified.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * Name of the extension.
     */
    name?: pulumi.Input<string>;
    /**
     * The extension file size in bytes.
     */
    size?: pulumi.Input<number>;
    /**
     * The extension URL to be used in the plan.
     */
    url?: pulumi.Input<string>;
    /**
     * Elastic stack version, a numeric version for plugins, e.g. 2.3.0 should be set. Major version e.g. 2.*, or wildcards e.g. * for bundles.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeploymentExtension resource.
 */
export interface DeploymentExtensionArgs {
    /**
     * Description of the extension.
     */
    description?: pulumi.Input<string>;
    /**
     * The URL to download the extension archive.
     */
    downloadUrl?: pulumi.Input<string>;
    /**
     * `bundle` or `plugin` allowed. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     */
    extensionType: pulumi.Input<string>;
    /**
     * Hash value of the file. If it is changed, the file is reuploaded.
     */
    fileHash?: pulumi.Input<string>;
    /**
     * File path of the extension uploaded.
     */
    filePath?: pulumi.Input<string>;
    /**
     * Name of the extension.
     */
    name?: pulumi.Input<string>;
    /**
     * Elastic stack version, a numeric version for plugins, e.g. 2.3.0 should be set. Major version e.g. 2.*, or wildcards e.g. * for bundles.
     */
    version: pulumi.Input<string>;
}
