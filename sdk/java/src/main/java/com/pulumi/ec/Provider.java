// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.ec.ProviderArgs;
import com.pulumi.ec.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the ec package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:ec")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     * 
     */
    @Export(name="apikey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apikey;

    /**
     * @return API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     * 
     */
    public Output<Optional<String>> apikey() {
        return Codegen.optional(this.apikey);
    }
    /**
     * Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    @Export(name="timeout", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeout;

    /**
     * @return Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    public Output<Optional<String>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    @Export(name="verboseFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> verboseFile;

    /**
     * @return Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    public Output<Optional<String>> verboseFile() {
        return Codegen.optional(this.verboseFile);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("ec", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apikey",
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
