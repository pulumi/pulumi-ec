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
    /**
     * @return Optionally override the docker image the APM nodes will use. This option will not work in ESS customers and should only be changed if you know what you&#39;re doing.
     * 
     */
    private @Nullable String dockerImage;
    /**
     * @return An arbitrary JSON object allowing (non-admin) cluster owners to set their parameters (only one of this and &#39;user*settings*yaml&#39; is allowed), provided they are on the whitelist (&#39;user*settings*whitelist&#39;) and not on the blacklist (&#39;user*settings*blacklist&#39;). (This field together with &#39;user*settings*override*&#39; and &#39;system_settings&#39; defines the total set of resource settings)
     * 
     */
    private @Nullable String userSettingsJson;
    /**
     * @return An arbitrary JSON object allowing ECE admins owners to set clusters&#39; parameters (only one of this and &#39;user*settings*override*yaml&#39; is allowed), ie in addition to the documented &#39;system*settings&#39;. (This field together with &#39;system*settings&#39; and &#39;user*settings*&#39; defines the total set of resource settings)
     * 
     */
    private @Nullable String userSettingsOverrideJson;
    /**
     * @return An arbitrary YAML object allowing ECE admins owners to set clusters&#39; parameters (only one of this and &#39;user*settings*override*json&#39; is allowed), ie in addition to the documented &#39;system*settings&#39;. (This field together with &#39;system*settings&#39; and &#39;user*settings*&#39; defines the total set of resource settings)
     * 
     */
    private @Nullable String userSettingsOverrideYaml;
    /**
     * @return An arbitrary YAML object allowing (non-admin) cluster owners to set their parameters (only one of this and &#39;user*settings*json&#39; is allowed), provided they are on the whitelist (&#39;user*settings*whitelist&#39;) and not on the blacklist (&#39;user*settings*blacklist&#39;). (These field together with &#39;user*settings*override*&#39; and &#39;system_settings&#39; defines the total set of resource settings)
     * 
     */
    private @Nullable String userSettingsYaml;

    private DeploymentKibanaConfig() {}
    /**
     * @return Optionally override the docker image the APM nodes will use. This option will not work in ESS customers and should only be changed if you know what you&#39;re doing.
     * 
     */
    public Optional<String> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }
    /**
     * @return An arbitrary JSON object allowing (non-admin) cluster owners to set their parameters (only one of this and &#39;user*settings*yaml&#39; is allowed), provided they are on the whitelist (&#39;user*settings*whitelist&#39;) and not on the blacklist (&#39;user*settings*blacklist&#39;). (This field together with &#39;user*settings*override*&#39; and &#39;system_settings&#39; defines the total set of resource settings)
     * 
     */
    public Optional<String> userSettingsJson() {
        return Optional.ofNullable(this.userSettingsJson);
    }
    /**
     * @return An arbitrary JSON object allowing ECE admins owners to set clusters&#39; parameters (only one of this and &#39;user*settings*override*yaml&#39; is allowed), ie in addition to the documented &#39;system*settings&#39;. (This field together with &#39;system*settings&#39; and &#39;user*settings*&#39; defines the total set of resource settings)
     * 
     */
    public Optional<String> userSettingsOverrideJson() {
        return Optional.ofNullable(this.userSettingsOverrideJson);
    }
    /**
     * @return An arbitrary YAML object allowing ECE admins owners to set clusters&#39; parameters (only one of this and &#39;user*settings*override*json&#39; is allowed), ie in addition to the documented &#39;system*settings&#39;. (This field together with &#39;system*settings&#39; and &#39;user*settings*&#39; defines the total set of resource settings)
     * 
     */
    public Optional<String> userSettingsOverrideYaml() {
        return Optional.ofNullable(this.userSettingsOverrideYaml);
    }
    /**
     * @return An arbitrary YAML object allowing (non-admin) cluster owners to set their parameters (only one of this and &#39;user*settings*json&#39; is allowed), provided they are on the whitelist (&#39;user*settings*whitelist&#39;) and not on the blacklist (&#39;user*settings*blacklist&#39;). (These field together with &#39;user*settings*override*&#39; and &#39;system_settings&#39; defines the total set of resource settings)
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
