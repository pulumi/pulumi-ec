// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.SnapshotRepositoryArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.SnapshotRepositoryState;
import com.pulumi.ec.outputs.SnapshotRepositoryGeneric;
import com.pulumi.ec.outputs.SnapshotRepositoryS3;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages Elastic Cloud Enterprise snapshot repositories.
 * 
 *   &gt; **This resource can only be used with Elastic Cloud Enterprise** For Elastic Cloud SaaS please use the elasticstack_elasticsearch_snapshot_repository.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.SnapshotRepository;
 * import com.pulumi.ec.SnapshotRepositoryArgs;
 * import com.pulumi.ec.inputs.SnapshotRepositoryS3Args;
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
 *         var this_ = new SnapshotRepository(&#34;this&#34;, SnapshotRepositoryArgs.builder()        
 *             .s3(SnapshotRepositoryS3Args.builder()
 *                 .access_key(&#34;my-access-key&#34;)
 *                 .bucket(&#34;my-bucket&#34;)
 *                 .secret_key(&#34;my-secret-key&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You can import snapshot repositories using the `name`, for example:
 * 
 * ```sh
 * $ pulumi import ec:index/snapshotRepository:SnapshotRepository this my-snapshot-repository
 * ```
 * 
 */
@ResourceType(type="ec:index/snapshotRepository:SnapshotRepository")
public class SnapshotRepository extends com.pulumi.resources.CustomResource {
    /**
     * Generic repository settings.
     * 
     */
    @Export(name="generic", refs={SnapshotRepositoryGeneric.class}, tree="[0]")
    private Output</* @Nullable */ SnapshotRepositoryGeneric> generic;

    /**
     * @return Generic repository settings.
     * 
     */
    public Output<Optional<SnapshotRepositoryGeneric>> generic() {
        return Codegen.optional(this.generic);
    }
    /**
     * The name of the snapshot repository configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the snapshot repository configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * S3 repository settings.
     * 
     */
    @Export(name="s3", refs={SnapshotRepositoryS3.class}, tree="[0]")
    private Output</* @Nullable */ SnapshotRepositoryS3> s3;

    /**
     * @return S3 repository settings.
     * 
     */
    public Output<Optional<SnapshotRepositoryS3>> s3() {
        return Codegen.optional(this.s3);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotRepository(String name) {
        this(name, SnapshotRepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotRepository(String name, @Nullable SnapshotRepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotRepository(String name, @Nullable SnapshotRepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/snapshotRepository:SnapshotRepository", name, args == null ? SnapshotRepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SnapshotRepository(String name, Output<String> id, @Nullable SnapshotRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/snapshotRepository:SnapshotRepository", name, state, makeResourceOptions(options, id));
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
    public static SnapshotRepository get(String name, Output<String> id, @Nullable SnapshotRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotRepository(name, id, state, options);
    }
}
