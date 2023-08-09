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
 * ### With extension file
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.DeploymentExtension;
 * import com.pulumi.ec.DeploymentExtensionArgs;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var filePath = &#34;/path/to/plugin.zip&#34;;
 * 
 *         var exampleExtension = new DeploymentExtension(&#34;exampleExtension&#34;, DeploymentExtensionArgs.builder()        
 *             .description(&#34;my extension&#34;)
 *             .version(&#34;*&#34;)
 *             .extensionType(&#34;bundle&#34;)
 *             .filePath(filePath)
 *             .fileHash(computeFileBase64Sha256(filePath))
 *             .build());
 * 
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var withExtension = new Deployment(&#34;withExtension&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling()
 *                     .build())
 *                 .extension(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With download URL
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.DeploymentExtension;
 * import com.pulumi.ec.DeploymentExtensionArgs;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleExtension = new DeploymentExtension(&#34;exampleExtension&#34;, DeploymentExtensionArgs.builder()        
 *             .description(&#34;my extension&#34;)
 *             .version(&#34;*&#34;)
 *             .extensionType(&#34;bundle&#34;)
 *             .downloadUrl(&#34;https://example.net&#34;)
 *             .build());
 * 
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var withExtension = new Deployment(&#34;withExtension&#34;, DeploymentArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling()
 *                     .build())
 *                 .extension(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Extensions can be imported using the `id`, for example
 * 
 * ```sh
 *  $ pulumi import ec:index/deploymentExtension:DeploymentExtension name 320b7b540dfc967a7a649c18e2fce4ed
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
    public DeploymentExtension(String name) {
        this(name, DeploymentExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentExtension(String name, DeploymentExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentExtension(String name, DeploymentExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentExtension:DeploymentExtension", name, args == null ? DeploymentExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentExtension(String name, Output<String> id, @Nullable DeploymentExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentExtension:DeploymentExtension", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static DeploymentExtension get(String name, Output<String> id, @Nullable DeploymentExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentExtension(name, id, state, options);
    }
}
