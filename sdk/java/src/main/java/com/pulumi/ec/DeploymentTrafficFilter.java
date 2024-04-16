// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.DeploymentTrafficFilterArgs;
import com.pulumi.ec.Utilities;
import com.pulumi.ec.inputs.DeploymentTrafficFilterState;
import com.pulumi.ec.outputs.DeploymentTrafficFilterRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### IP based traffic filter
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.DeploymentTrafficFilter;
 * import com.pulumi.ec.DeploymentTrafficFilterArgs;
 * import com.pulumi.ec.inputs.DeploymentTrafficFilterRuleArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
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
 *             .versionRegex(&#34;latest&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var example = new DeploymentTrafficFilter(&#34;example&#34;, DeploymentTrafficFilterArgs.builder()        
 *             .name(&#34;my traffic filter name&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .type(&#34;ip&#34;)
 *             .rules(DeploymentTrafficFilterRuleArgs.builder()
 *                 .source(&#34;0.0.0.0/0&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Create an Elastic Cloud deployment
 *         var exampleMinimal = new Deployment(&#34;exampleMinimal&#34;, DeploymentArgs.builder()        
 *             .name(&#34;my_example_deployment&#34;)
 *             .region(&#34;us-east-1&#34;)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;aws-io-optimized-v2&#34;)
 *             .trafficFilters(example.id())
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling()
 *                     .build())
 *                 .build())
 *             .kibana()
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Azure Private Link traffic filter
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.DeploymentTrafficFilter;
 * import com.pulumi.ec.DeploymentTrafficFilterArgs;
 * import com.pulumi.ec.inputs.DeploymentTrafficFilterRuleArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
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
 *         final var region = azure_australiaeast;
 * 
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(region)
 *             .build());
 * 
 *         var azure = new DeploymentTrafficFilter(&#34;azure&#34;, DeploymentTrafficFilterArgs.builder()        
 *             .name(&#34;my traffic filter name&#34;)
 *             .region(region)
 *             .type(&#34;azure_private_endpoint&#34;)
 *             .rules(DeploymentTrafficFilterRuleArgs.builder()
 *                 .azureEndpointName(&#34;my-azure-pl&#34;)
 *                 .azureEndpointGuid(&#34;78c64959-fd88-41cc-81ac-1cfcdb1ac32e&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Create an Elastic Cloud deployment
 *         var exampleMinimal = new Deployment(&#34;exampleMinimal&#34;, DeploymentArgs.builder()        
 *             .name(&#34;my_example_deployment&#34;)
 *             .region(region)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;azure-io-optimized-v3&#34;)
 *             .trafficFilters(azure.id())
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling()
 *                     .build())
 *                 .build())
 *             .kibana()
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ###GCP Private Service Connect traffic filter
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.ec.EcFunctions;
 * import com.pulumi.ec.inputs.GetStackArgs;
 * import com.pulumi.ec.DeploymentTrafficFilter;
 * import com.pulumi.ec.DeploymentTrafficFilterArgs;
 * import com.pulumi.ec.inputs.DeploymentTrafficFilterRuleArgs;
 * import com.pulumi.ec.Deployment;
 * import com.pulumi.ec.DeploymentArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotArgs;
 * import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
 * import com.pulumi.ec.inputs.DeploymentKibanaArgs;
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
 *         final var region = asia_east1;
 * 
 *         final var latest = EcFunctions.getStack(GetStackArgs.builder()
 *             .versionRegex(&#34;latest&#34;)
 *             .region(region)
 *             .build());
 * 
 *         var gcpPsc = new DeploymentTrafficFilter(&#34;gcpPsc&#34;, DeploymentTrafficFilterArgs.builder()        
 *             .name(&#34;my traffic filter name&#34;)
 *             .region(region)
 *             .type(&#34;gcp_private_service_connect_endpoint&#34;)
 *             .rules(DeploymentTrafficFilterRuleArgs.builder()
 *                 .source(&#34;18446744072646845332&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Create an Elastic Cloud deployment
 *         var exampleMinimal = new Deployment(&#34;exampleMinimal&#34;, DeploymentArgs.builder()        
 *             .name(&#34;my_example_deployment&#34;)
 *             .region(region)
 *             .version(latest.applyValue(getStackResult -&gt; getStackResult.version()))
 *             .deploymentTemplateId(&#34;gcp-storage-optimized&#34;)
 *             .trafficFilters(gcpPsc.id())
 *             .elasticsearch(DeploymentElasticsearchArgs.builder()
 *                 .hot(DeploymentElasticsearchHotArgs.builder()
 *                     .autoscaling()
 *                     .build())
 *                 .build())
 *             .kibana()
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Traffic filters can be imported using the `id`, for example:
 * 
 * ```sh
 * $ pulumi import ec:index/deploymentTrafficFilter:DeploymentTrafficFilter name 320b7b540dfc967a7a649c18e2fce4ed
 * ```
 * 
 */
@ResourceType(type="ec:index/deploymentTrafficFilter:DeploymentTrafficFilter")
public class DeploymentTrafficFilter extends com.pulumi.resources.CustomResource {
    /**
     * Description of this individual rule
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this individual rule
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
     * 
     */
    @Export(name="includeByDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> includeByDefault;

    /**
     * @return Indicates that the ruleset should be automatically included in new deployments (Defaults to false)
     * 
     */
    public Output<Boolean> includeByDefault() {
        return this.includeByDefault;
    }
    /**
     * Name of the ruleset
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the ruleset
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Filter region, the ruleset can only be attached to deployments in the specific region
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Filter region, the ruleset can only be attached to deployments in the specific region
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Set of rules, which the ruleset is made of.
     * 
     */
    @Export(name="rules", refs={List.class,DeploymentTrafficFilterRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DeploymentTrafficFilterRule>> rules;

    /**
     * @return Set of rules, which the ruleset is made of.
     * 
     */
    public Output<Optional<List<DeploymentTrafficFilterRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Type of the ruleset. It can be `ip`, `vpce`, `azure_private_endpoint`, or `gcp_private_service_connect_endpoint`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the ruleset. It can be `ip`, `vpce`, `azure_private_endpoint`, or `gcp_private_service_connect_endpoint`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentTrafficFilter(String name) {
        this(name, DeploymentTrafficFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentTrafficFilter(String name, DeploymentTrafficFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentTrafficFilter(String name, DeploymentTrafficFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, args == null ? DeploymentTrafficFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentTrafficFilter(String name, Output<String> id, @Nullable DeploymentTrafficFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec:index/deploymentTrafficFilter:DeploymentTrafficFilter", name, state, makeResourceOptions(options, id));
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
    public static DeploymentTrafficFilter get(String name, Output<String> id, @Nullable DeploymentTrafficFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentTrafficFilter(name, id, state, options);
    }
}
