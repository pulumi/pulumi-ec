// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentKibanaConfig {
    private @Nullable String dockerImage;
    /**
     * @return JSON-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    private @Nullable String userSettingsJson;
    /**
     * @return JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    private @Nullable String userSettingsOverrideJson;
    /**
     * @return YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    private @Nullable String userSettingsOverrideYaml;
    /**
     * @return YAML-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    private @Nullable String userSettingsYaml;

    private DeploymentKibanaConfig() {}
    public Optional<String> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }
    /**
     * @return JSON-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<String> userSettingsJson() {
        return Optional.ofNullable(this.userSettingsJson);
    }
    /**
     * @return JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<String> userSettingsOverrideJson() {
        return Optional.ofNullable(this.userSettingsOverrideJson);
    }
    /**
     * @return YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<String> userSettingsOverrideYaml() {
        return Optional.ofNullable(this.userSettingsOverrideYaml);
    }
    /**
     * @return YAML-formatted user level `enterprise_search.yml` setting overrides.
     * 
     */
    public Optional<String> userSettingsYaml() {
        return Optional.ofNullable(this.userSettingsYaml);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentKibanaConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dockerImage;
        private @Nullable String userSettingsJson;
        private @Nullable String userSettingsOverrideJson;
        private @Nullable String userSettingsOverrideYaml;
        private @Nullable String userSettingsYaml;
        public Builder() {}
        public Builder(DeploymentKibanaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerImage = defaults.dockerImage;
    	      this.userSettingsJson = defaults.userSettingsJson;
    	      this.userSettingsOverrideJson = defaults.userSettingsOverrideJson;
    	      this.userSettingsOverrideYaml = defaults.userSettingsOverrideYaml;
    	      this.userSettingsYaml = defaults.userSettingsYaml;
        }

        @CustomType.Setter
        public Builder dockerImage(@Nullable String dockerImage) {
            this.dockerImage = dockerImage;
            return this;
        }
        @CustomType.Setter
        public Builder userSettingsJson(@Nullable String userSettingsJson) {
            this.userSettingsJson = userSettingsJson;
            return this;
        }
        @CustomType.Setter
        public Builder userSettingsOverrideJson(@Nullable String userSettingsOverrideJson) {
            this.userSettingsOverrideJson = userSettingsOverrideJson;
            return this;
        }
        @CustomType.Setter
        public Builder userSettingsOverrideYaml(@Nullable String userSettingsOverrideYaml) {
            this.userSettingsOverrideYaml = userSettingsOverrideYaml;
            return this;
        }
        @CustomType.Setter
        public Builder userSettingsYaml(@Nullable String userSettingsYaml) {
            this.userSettingsYaml = userSettingsYaml;
            return this;
        }
        public DeploymentKibanaConfig build() {
            final var o = new DeploymentKibanaConfig();
            o.dockerImage = dockerImage;
            o.userSettingsJson = userSettingsJson;
            o.userSettingsOverrideJson = userSettingsOverrideJson;
            o.userSettingsOverrideYaml = userSettingsOverrideYaml;
            o.userSettingsYaml = userSettingsYaml;
            return o;
        }
    }
}
