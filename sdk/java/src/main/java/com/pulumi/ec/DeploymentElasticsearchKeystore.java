// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.DeploymentElasticsearchKeystoreArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.DeploymentElasticsearchKeystoreState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import com.pulumi.ec.DeploymentElasticsearchKeystore;
 * import com.pulumi.ec.DeploymentElasticsearchKeystoreArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
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
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex("latest")
 *             .region("us-east-1")
 *             .build());
 * 
 *         // Create an Elastic Cloud deployment
 *         var exampleKeystore = new Deployment("exampleKeystore", DeploymentArgs.builder()
 *             .region("us-east-1")
 *             .version(latest.version())
 *             .deploymentTemplateId("aws-io-optimized-v2")
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling(DeploymentElasticsearchHotAutoscalingArgs.builder()
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Create the keystore secret entry
 *         var gcsCredential = new DeploymentElasticsearchKeystore("gcsCredential", DeploymentElasticsearchKeystoreArgs.builder()
 *             .deploymentId(exampleKeystore.id())
 *             .settingName("gcs.client.default.credentials_file")
 *             .value(StdFunctions.file(FileArgs.builder()
 *                 .input("service-account-key.json")
 *                 .build()).result())
 *             .asFile(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Adding credentials to use GCS as a snapshot repository
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import com.pulumi.ec.DeploymentElasticsearchKeystore;
 * import com.pulumi.ec.DeploymentElasticsearchKeystoreArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
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
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex("latest")
 *             .region("us-east-1")
 *             .build());
 * 
 *         // Create an Elastic Cloud deployment
 *         var exampleKeystore = new Deployment("exampleKeystore", DeploymentArgs.builder()
 *             .region("us-east-1")
 *             .version(latest.version())
 *             .deploymentTemplateId("aws-io-optimized-v2")
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling(DeploymentElasticsearchHotAutoscalingArgs.builder()
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         // Create the keystore secret entry
 *         var gcsCredential = new DeploymentElasticsearchKeystore("gcsCredential", DeploymentElasticsearchKeystoreArgs.builder()
 *             .deploymentId(exampleKeystore.id())
 *             .settingName("gcs.client.default.credentials_file")
 *             .value(StdFunctions.file(FileArgs.builder()
 *                 .input("service-account-key.json")
 *                 .build()).result())
 *             .asFile(true)
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
 * This resource cannot be imported
 * 
 */
@ResourceType(type="ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore")
public class DeploymentElasticsearchKeystore extends com.pulumi.resources.CustomResource {
    /**
     * Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
     * 
     */
    @Export(name="asFile", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> asFile;

    /**
     * @return Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
     * 
     */
    public Output<Boolean> asFile() {
        return this.asFile;
    }
    /**
     * Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
     * 
     */
    @Export(name="deploymentId", refs={String.class}, tree="[0]")
    private Output<String> deploymentId;

    /**
     * @return Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
     * 
     */
    @Export(name="settingName", refs={String.class}, tree="[0]")
    private Output<String> settingName;

    /**
     * @return Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
     * 
     */
    public Output<String> settingName() {
        return this.settingName;
    }
    /**
     * Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentElasticsearchKeystore(java.lang.String name) {
        this(name, DeploymentElasticsearchKeystoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentElasticsearchKeystore(java.lang.String name, DeploymentElasticsearchKeystoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentElasticsearchKeystore(java.lang.String name, DeploymentElasticsearchKeystoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeploymentElasticsearchKeystore(java.lang.String name, Output<java.lang.String> id, @Nullable DeploymentElasticsearchKeystoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore", name, state, makeResourceOptions(options, id), false);
    }

    private static DeploymentElasticsearchKeystoreArgs makeArgs(DeploymentElasticsearchKeystoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeploymentElasticsearchKeystoreArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
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
    public static DeploymentElasticsearchKeystore get(java.lang.String name, Output<java.lang.String> id, @Nullable DeploymentElasticsearchKeystoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentElasticsearchKeystore(name, id, state, options);
    }
}
