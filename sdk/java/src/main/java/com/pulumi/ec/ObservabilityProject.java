// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.ObservabilityProjectArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.ObservabilityProjectState;
import com.pulumi.ec.outputs.ObservabilityProjectCredentials;
import com.pulumi.ec.outputs.ObservabilityProjectEndpoints;
import com.pulumi.ec.outputs.ObservabilityProjectMetadata;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Technical preview
 * 
 * This functionality is in technical preview and may be changed or removed in a future release.
 * Elastic will work to fix any issues, but features in technical preview are not subject to the support SLA of official GA features.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.ObservabilityProject;
 * import com.pulumi.ec.ObservabilityProjectArgs;
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
 *         var myProject = new ObservabilityProject("myProject", ObservabilityProjectArgs.builder()
 *             .name("my_project")
 *             .regionId("aws-us-east-1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Projects can be imported using the `id`, for example:
 * 
 * ```sh
 * $ pulumi import ec:index/observabilityProject:ObservabilityProject id 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 * 
 */
@ResourceType(type="ec:index/observabilityProject:ObservabilityProject")
public class ObservabilityProject extends com.pulumi.resources.CustomResource {
    /**
     * A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     * 
     */
    @Export(name="alias", refs={String.class}, tree="[0]")
    private Output<String> alias;

    /**
     * @return A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     * 
     */
    @Export(name="cloudId", refs={String.class}, tree="[0]")
    private Output<String> cloudId;

    /**
     * @return The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     * 
     */
    public Output<String> cloudId() {
        return this.cloudId;
    }
    /**
     * Basic auth credentials to access the Elasticsearch API.
     * 
     */
    @Export(name="credentials", refs={ObservabilityProjectCredentials.class}, tree="[0]")
    private Output<ObservabilityProjectCredentials> credentials;

    /**
     * @return Basic auth credentials to access the Elasticsearch API.
     * 
     */
    public Output<ObservabilityProjectCredentials> credentials() {
        return this.credentials;
    }
    /**
     * The endpoints to access the different apps of the project.
     * 
     */
    @Export(name="endpoints", refs={ObservabilityProjectEndpoints.class}, tree="[0]")
    private Output<ObservabilityProjectEndpoints> endpoints;

    /**
     * @return The endpoints to access the different apps of the project.
     * 
     */
    public Output<ObservabilityProjectEndpoints> endpoints() {
        return this.endpoints;
    }
    /**
     * Additional details about the project.
     * 
     */
    @Export(name="metadata", refs={ObservabilityProjectMetadata.class}, tree="[0]")
    private Output<ObservabilityProjectMetadata> metadata;

    /**
     * @return Additional details about the project.
     * 
     */
    public Output<ObservabilityProjectMetadata> metadata() {
        return this.metadata;
    }
    /**
     * Descriptive name for a project.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Descriptive name for a project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique human-readable identifier for a region in Elastic Cloud.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return Unique human-readable identifier for a region in Elastic Cloud.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * the type of the project
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return the type of the project
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObservabilityProject(java.lang.String name) {
        this(name, ObservabilityProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObservabilityProject(java.lang.String name, ObservabilityProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObservabilityProject(java.lang.String name, ObservabilityProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/observabilityProject:ObservabilityProject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ObservabilityProject(java.lang.String name, Output<java.lang.String> id, @Nullable ObservabilityProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/observabilityProject:ObservabilityProject", name, state, makeResourceOptions(options, id), false);
    }

    private static ObservabilityProjectArgs makeArgs(ObservabilityProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ObservabilityProjectArgs.Empty : args;
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
    public static ObservabilityProject get(java.lang.String name, Output<java.lang.String> id, @Nullable ObservabilityProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObservabilityProject(name, id, state, options);
    }
}
