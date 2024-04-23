// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchConfigArgs Empty = new DeploymentElasticsearchConfigArgs();

    /**
     * Overrides the docker image the Elasticsearch nodes will use. Note that this field will only work for internal users only.
     * 
     */
    @Import(name="dockerImage")
    private @Nullable Output<String> dockerImage;

    /**
     * @return Overrides the docker image the Elasticsearch nodes will use. Note that this field will only work for internal users only.
     * 
     */
    public Optional<Output<String>> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    /**
     * List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
     * 
     */
    @Import(name="plugins")
    private @Nullable Output<List<String>> plugins;

    /**
     * @return List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
     * 
     */
    public Optional<Output<List<String>>> plugins() {
        return Optional.ofNullable(this.plugins);
    }

    /**
     * JSON-formatted user level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    @Import(name="userSettingsJson")
    private @Nullable Output<String> userSettingsJson;

    /**
     * @return JSON-formatted user level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    public Optional<Output<String>> userSettingsJson() {
        return Optional.ofNullable(this.userSettingsJson);
    }

    /**
     * JSON-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    @Import(name="userSettingsOverrideJson")
    private @Nullable Output<String> userSettingsOverrideJson;

    /**
     * @return JSON-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    public Optional<Output<String>> userSettingsOverrideJson() {
        return Optional.ofNullable(this.userSettingsOverrideJson);
    }

    /**
     * YAML-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    @Import(name="userSettingsOverrideYaml")
    private @Nullable Output<String> userSettingsOverrideYaml;

    /**
     * @return YAML-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    public Optional<Output<String>> userSettingsOverrideYaml() {
        return Optional.ofNullable(this.userSettingsOverrideYaml);
    }

    /**
     * YAML-formatted user level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    @Import(name="userSettingsYaml")
    private @Nullable Output<String> userSettingsYaml;

    /**
     * @return YAML-formatted user level &#34;elasticsearch.yml&#34; setting overrides
     * 
     */
    public Optional<Output<String>> userSettingsYaml() {
        return Optional.ofNullable(this.userSettingsYaml);
    }

    private DeploymentElasticsearchConfigArgs() {}

    private DeploymentElasticsearchConfigArgs(DeploymentElasticsearchConfigArgs $) {
        this.dockerImage = $.dockerImage;
        this.plugins = $.plugins;
        this.userSettingsJson = $.userSettingsJson;
        this.userSettingsOverrideJson = $.userSettingsOverrideJson;
        this.userSettingsOverrideYaml = $.userSettingsOverrideYaml;
        this.userSettingsYaml = $.userSettingsYaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchConfigArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchConfigArgs();
        }

        public Builder(DeploymentElasticsearchConfigArgs defaults) {
            $ = new DeploymentElasticsearchConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dockerImage Overrides the docker image the Elasticsearch nodes will use. Note that this field will only work for internal users only.
         * 
         * @return builder
         * 
         */
        public Builder dockerImage(@Nullable Output<String> dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        /**
         * @param dockerImage Overrides the docker image the Elasticsearch nodes will use. Note that this field will only work for internal users only.
         * 
         * @return builder
         * 
         */
        public Builder dockerImage(String dockerImage) {
            return dockerImage(Output.of(dockerImage));
        }

        /**
         * @param plugins List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
         * 
         * @return builder
         * 
         */
        public Builder plugins(@Nullable Output<List<String>> plugins) {
            $.plugins = plugins;
            return this;
        }

        /**
         * @param plugins List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
         * 
         * @return builder
         * 
         */
        public Builder plugins(List<String> plugins) {
            return plugins(Output.of(plugins));
        }

        /**
         * @param plugins List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
         * 
         * @return builder
         * 
         */
        public Builder plugins(String... plugins) {
            return plugins(List.of(plugins));
        }

        /**
         * @param userSettingsJson JSON-formatted user level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsJson(@Nullable Output<String> userSettingsJson) {
            $.userSettingsJson = userSettingsJson;
            return this;
        }

        /**
         * @param userSettingsJson JSON-formatted user level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsJson(String userSettingsJson) {
            return userSettingsJson(Output.of(userSettingsJson));
        }

        /**
         * @param userSettingsOverrideJson JSON-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideJson(@Nullable Output<String> userSettingsOverrideJson) {
            $.userSettingsOverrideJson = userSettingsOverrideJson;
            return this;
        }

        /**
         * @param userSettingsOverrideJson JSON-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideJson(String userSettingsOverrideJson) {
            return userSettingsOverrideJson(Output.of(userSettingsOverrideJson));
        }

        /**
         * @param userSettingsOverrideYaml YAML-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideYaml(@Nullable Output<String> userSettingsOverrideYaml) {
            $.userSettingsOverrideYaml = userSettingsOverrideYaml;
            return this;
        }

        /**
         * @param userSettingsOverrideYaml YAML-formatted admin (ECE) level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideYaml(String userSettingsOverrideYaml) {
            return userSettingsOverrideYaml(Output.of(userSettingsOverrideYaml));
        }

        /**
         * @param userSettingsYaml YAML-formatted user level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsYaml(@Nullable Output<String> userSettingsYaml) {
            $.userSettingsYaml = userSettingsYaml;
            return this;
        }

        /**
         * @param userSettingsYaml YAML-formatted user level &#34;elasticsearch.yml&#34; setting overrides
         * 
         * @return builder
         * 
         */
        public Builder userSettingsYaml(String userSettingsYaml) {
            return userSettingsYaml(Output.of(userSettingsYaml));
        }

        public DeploymentElasticsearchConfigArgs build() {
            return $;
        }
    }

}
