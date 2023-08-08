// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchHotAutoscaling {
    private @Nullable String maxSize;
    private @Nullable String maxSizeResource;
    private @Nullable String minSize;
    private @Nullable String minSizeResource;
    private @Nullable String policyOverrideJson;

    private DeploymentElasticsearchHotAutoscaling() {}
    public Optional<String> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    public Optional<String> maxSizeResource() {
        return Optional.ofNullable(this.maxSizeResource);
    }
    public Optional<String> minSize() {
        return Optional.ofNullable(this.minSize);
    }
    public Optional<String> minSizeResource() {
        return Optional.ofNullable(this.minSizeResource);
    }
    public Optional<String> policyOverrideJson() {
        return Optional.ofNullable(this.policyOverrideJson);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchHotAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxSize;
        private @Nullable String maxSizeResource;
        private @Nullable String minSize;
        private @Nullable String minSizeResource;
        private @Nullable String policyOverrideJson;
        public Builder() {}
        public Builder(DeploymentElasticsearchHotAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSize = defaults.maxSize;
    	      this.maxSizeResource = defaults.maxSizeResource;
    	      this.minSize = defaults.minSize;
    	      this.minSizeResource = defaults.minSizeResource;
    	      this.policyOverrideJson = defaults.policyOverrideJson;
        }

        @CustomType.Setter
        public Builder maxSize(@Nullable String maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        @CustomType.Setter
        public Builder maxSizeResource(@Nullable String maxSizeResource) {
            this.maxSizeResource = maxSizeResource;
            return this;
        }
        @CustomType.Setter
        public Builder minSize(@Nullable String minSize) {
            this.minSize = minSize;
            return this;
        }
        @CustomType.Setter
        public Builder minSizeResource(@Nullable String minSizeResource) {
            this.minSizeResource = minSizeResource;
            return this;
        }
        @CustomType.Setter
        public Builder policyOverrideJson(@Nullable String policyOverrideJson) {
            this.policyOverrideJson = policyOverrideJson;
            return this;
        }
        public DeploymentElasticsearchHotAutoscaling build() {
            final var o = new DeploymentElasticsearchHotAutoscaling();
            o.maxSize = maxSize;
            o.maxSizeResource = maxSizeResource;
            o.minSize = minSize;
            o.minSizeResource = minSizeResource;
            o.policyOverrideJson = policyOverrideJson;
            return o;
        }
    }
}
