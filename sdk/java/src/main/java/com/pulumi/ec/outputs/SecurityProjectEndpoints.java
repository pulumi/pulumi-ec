// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityProjectEndpoints {
    /**
     * @return The endpoint to access elasticsearch.
     * 
     */
    private @Nullable String elasticsearch;
    /**
     * @return The endpoint to access kibana.
     * 
     */
    private @Nullable String kibana;

    private SecurityProjectEndpoints() {}
    /**
     * @return The endpoint to access elasticsearch.
     * 
     */
    public Optional<String> elasticsearch() {
        return Optional.ofNullable(this.elasticsearch);
    }
    /**
     * @return The endpoint to access kibana.
     * 
     */
    public Optional<String> kibana() {
        return Optional.ofNullable(this.kibana);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProjectEndpoints defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String elasticsearch;
        private @Nullable String kibana;
        public Builder() {}
        public Builder(SecurityProjectEndpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.kibana = defaults.kibana;
        }

        @CustomType.Setter
        public Builder elasticsearch(@Nullable String elasticsearch) {

            this.elasticsearch = elasticsearch;
            return this;
        }
        @CustomType.Setter
        public Builder kibana(@Nullable String kibana) {

            this.kibana = kibana;
            return this;
        }
        public SecurityProjectEndpoints build() {
            final var _resultValue = new SecurityProjectEndpoints();
            _resultValue.elasticsearch = elasticsearch;
            _resultValue.kibana = kibana;
            return _resultValue;
        }
    }
}