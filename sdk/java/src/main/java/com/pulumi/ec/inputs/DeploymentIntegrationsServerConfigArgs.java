// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentIntegrationsServerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentIntegrationsServerConfigArgs Empty = new DeploymentIntegrationsServerConfigArgs();

    /**
     * Enable debug mode for APM servers. Defaults to `false`.
     * 
     */
    @Import(name="debugEnabled")
    private @Nullable Output<Boolean> debugEnabled;

    /**
     * @return Enable debug mode for APM servers. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> debugEnabled() {
        return Optional.ofNullable(this.debugEnabled);
    }

    @Import(name="dockerImage")
    private @Nullable Output<String> dockerImage;

    public Optional<Output<String>> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    @Import(name="userSettingsJson")
    private @Nullable Output<String> userSettingsJson;

    /**
     * @return JSON-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<Output<String>> userSettingsJson() {
        return Optional.ofNullable(this.userSettingsJson);
    }

    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    @Import(name="userSettingsOverrideJson")
    private @Nullable Output<String> userSettingsOverrideJson;

    /**
     * @return JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<Output<String>> userSettingsOverrideJson() {
        return Optional.ofNullable(this.userSettingsOverrideJson);
    }

    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    @Import(name="userSettingsOverrideYaml")
    private @Nullable Output<String> userSettingsOverrideYaml;

    /**
     * @return YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<Output<String>> userSettingsOverrideYaml() {
        return Optional.ofNullable(this.userSettingsOverrideYaml);
    }

    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    @Import(name="userSettingsYaml")
    private @Nullable Output<String> userSettingsYaml;

    /**
     * @return YAML-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<Output<String>> userSettingsYaml() {
        return Optional.ofNullable(this.userSettingsYaml);
    }

    private DeploymentIntegrationsServerConfigArgs() {}

    private DeploymentIntegrationsServerConfigArgs(DeploymentIntegrationsServerConfigArgs $) {
        this.debugEnabled = $.debugEnabled;
        this.dockerImage = $.dockerImage;
        this.userSettingsJson = $.userSettingsJson;
        this.userSettingsOverrideJson = $.userSettingsOverrideJson;
        this.userSettingsOverrideYaml = $.userSettingsOverrideYaml;
        this.userSettingsYaml = $.userSettingsYaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentIntegrationsServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentIntegrationsServerConfigArgs $;

        public Builder() {
            $ = new DeploymentIntegrationsServerConfigArgs();
        }

        public Builder(DeploymentIntegrationsServerConfigArgs defaults) {
            $ = new DeploymentIntegrationsServerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param debugEnabled Enable debug mode for APM servers. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder debugEnabled(@Nullable Output<Boolean> debugEnabled) {
            $.debugEnabled = debugEnabled;
            return this;
        }

        /**
         * @param debugEnabled Enable debug mode for APM servers. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder debugEnabled(Boolean debugEnabled) {
            return debugEnabled(Output.of(debugEnabled));
        }

        public Builder dockerImage(@Nullable Output<String> dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        public Builder dockerImage(String dockerImage) {
            return dockerImage(Output.of(dockerImage));
        }

        /**
         * @param userSettingsJson JSON-formatted user level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsJson(@Nullable Output<String> userSettingsJson) {
            $.userSettingsJson = userSettingsJson;
            return this;
        }

        /**
         * @param userSettingsJson JSON-formatted user level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsJson(String userSettingsJson) {
            return userSettingsJson(Output.of(userSettingsJson));
        }

        /**
         * @param userSettingsOverrideJson JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideJson(@Nullable Output<String> userSettingsOverrideJson) {
            $.userSettingsOverrideJson = userSettingsOverrideJson;
            return this;
        }

        /**
         * @param userSettingsOverrideJson JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideJson(String userSettingsOverrideJson) {
            return userSettingsOverrideJson(Output.of(userSettingsOverrideJson));
        }

        /**
         * @param userSettingsOverrideYaml YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideYaml(@Nullable Output<String> userSettingsOverrideYaml) {
            $.userSettingsOverrideYaml = userSettingsOverrideYaml;
            return this;
        }

        /**
         * @param userSettingsOverrideYaml YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsOverrideYaml(String userSettingsOverrideYaml) {
            return userSettingsOverrideYaml(Output.of(userSettingsOverrideYaml));
        }

        /**
         * @param userSettingsYaml YAML-formatted user level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsYaml(@Nullable Output<String> userSettingsYaml) {
            $.userSettingsYaml = userSettingsYaml;
            return this;
        }

        /**
         * @param userSettingsYaml YAML-formatted user level `enterprise_search.yml` setting overrides.
         * 
         * @return builder
         * 
         */
        public Builder userSettingsYaml(String userSettingsYaml) {
            return userSettingsYaml(Output.of(userSettingsYaml));
        }

        public DeploymentIntegrationsServerConfigArgs build() {
            return $;
        }
    }

}
