// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.SecurityProjectArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.SecurityProjectState;
import com.pulumi.ec.outputs.SecurityProjectCredentials;
import com.pulumi.ec.outputs.SecurityProjectEndpoints;
import com.pulumi.ec.outputs.SecurityProjectMetadata;
import com.pulumi.ec.outputs.SecurityProjectProductType;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.ec.SecurityProject;
 * import com.pulumi.ec.SecurityProjectArgs;
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
 *         var myProject = new SecurityProject("myProject", SecurityProjectArgs.builder()
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
 * $ pulumi import ec:index/securityProject:SecurityProject id 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 * 
 */
@ResourceType(type="ec:index/securityProject:SecurityProject")
public class SecurityProject extends com.pulumi.resources.CustomResource {
    /**
     * admin features package (BYOK, BYOIDP, CCS, CCR)
     * 
     */
    @Export(name="adminFeaturesPackage", refs={String.class}, tree="[0]")
    private Output<String> adminFeaturesPackage;

    /**
     * @return admin features package (BYOK, BYOIDP, CCS, CCR)
     * 
     */
    public Output<String> adminFeaturesPackage() {
        return this.adminFeaturesPackage;
    }
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
    @Export(name="credentials", refs={SecurityProjectCredentials.class}, tree="[0]")
    private Output<SecurityProjectCredentials> credentials;

    /**
     * @return Basic auth credentials to access the Elasticsearch API.
     * 
     */
    public Output<SecurityProjectCredentials> credentials() {
        return this.credentials;
    }
    /**
     * The endpoints to access the different apps of the project.
     * 
     */
    @Export(name="endpoints", refs={SecurityProjectEndpoints.class}, tree="[0]")
    private Output<SecurityProjectEndpoints> endpoints;

    /**
     * @return The endpoints to access the different apps of the project.
     * 
     */
    public Output<SecurityProjectEndpoints> endpoints() {
        return this.endpoints;
    }
    /**
     * Additional details about the project.
     * 
     */
    @Export(name="metadata", refs={SecurityProjectMetadata.class}, tree="[0]")
    private Output<SecurityProjectMetadata> metadata;

    /**
     * @return Additional details about the project.
     * 
     */
    public Output<SecurityProjectMetadata> metadata() {
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
    @Export(name="productTypes", refs={List.class,SecurityProjectProductType.class}, tree="[0,1]")
    private Output<List<SecurityProjectProductType>> productTypes;

    public Output<List<SecurityProjectProductType>> productTypes() {
        return this.productTypes;
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
    public SecurityProject(java.lang.String name) {
        this(name, SecurityProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityProject(java.lang.String name, SecurityProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityProject(java.lang.String name, SecurityProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/securityProject:SecurityProject", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecurityProject(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/securityProject:SecurityProject", name, state, makeResourceOptions(options, id), false);
    }

    private static SecurityProjectArgs makeArgs(SecurityProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecurityProjectArgs.Empty : args;
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
    public static SecurityProject get(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityProject(name, id, state, options);
    }
}