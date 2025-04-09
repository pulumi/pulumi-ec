// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.DeploymentExtensionArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.DeploymentExtensionState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Cloud extension resource, which allows extensions to be created, updated, and deleted.
 * 
 *   Extensions allow users of Elastic Cloud to use custom plugins, scripts, or dictionaries to enhance the core functionality of Elasticsearch. Before you install an extension, be sure to check out the supported and official [Elasticsearch plugins](https://www.elastic.co/guide/en/elasticsearch/plugins/current/index.html) already available.
 * 
 *   **Tip :** If you experience timeouts when uploading an extension through a slow network, you might need to increase the timeout setting.
 * 
 * ## Example Usage
 * 
 * ### With extension file
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With download URL
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Extensions can be imported using the `id`, for example:
 * 
 * ```sh
 * $ pulumi import ec:index/deploymentExtension:DeploymentExtension name 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 * 
 */
@ResourceType(type="ec:index/deploymentExtension:DeploymentExtension")
public class DeploymentExtension extends com.pulumi.resources.CustomResource {
    /**
     * Description for the extension
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description for the extension
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The URL to download the extension archive.
     * 
     */
    @Export(name="downloadUrl", refs={String.class}, tree="[0]")
    private Output<String> downloadUrl;

    /**
     * @return The URL to download the extension archive.
     * 
     */
    public Output<String> downloadUrl() {
        return this.downloadUrl;
    }
    /**
     * Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     * 
     */
    @Export(name="extensionType", refs={String.class}, tree="[0]")
    private Output<String> extensionType;

    /**
     * @return Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     * 
     */
    public Output<String> extensionType() {
        return this.extensionType;
    }
    /**
     * Hash value of the file. Triggers re-uploading the file on change.
     * 
     */
    @Export(name="fileHash", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fileHash;

    /**
     * @return Hash value of the file. Triggers re-uploading the file on change.
     * 
     */
    public Output<Optional<String>> fileHash() {
        return Codegen.optional(this.fileHash);
    }
    /**
     * Local file path to upload as the extension.
     * 
     */
    @Export(name="filePath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filePath;

    /**
     * @return Local file path to upload as the extension.
     * 
     */
    public Output<Optional<String>> filePath() {
        return Codegen.optional(this.filePath);
    }
    /**
     * The datatime the extension was last modified.
     * 
     */
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    /**
     * @return The datatime the extension was last modified.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * Name of the extension
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the extension
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The size of the extension file in bytes.
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return The size of the extension file in bytes.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The extension URL which will be used in the Elastic Cloud deployment plan.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The extension URL which will be used in the Elastic Cloud deployment plan.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentExtension(java.lang.String name) {
        this(name, DeploymentExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentExtension(java.lang.String name, DeploymentExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentExtension(java.lang.String name, DeploymentExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentExtension:DeploymentExtension", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeploymentExtension(java.lang.String name, Output<java.lang.String> id, @Nullable DeploymentExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentExtension:DeploymentExtension", name, state, makeResourceOptions(options, id), false);
    }

    private static DeploymentExtensionArgs makeArgs(DeploymentExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeploymentExtensionArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DeploymentExtension get(java.lang.String name, Output<java.lang.String> id, @Nullable DeploymentExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentExtension(name, id, state, options);
    }
}
