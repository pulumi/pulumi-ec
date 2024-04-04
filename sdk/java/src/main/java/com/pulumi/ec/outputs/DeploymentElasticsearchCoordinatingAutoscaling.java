// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchCoordinatingAutoscaling {
    /**
     * @return Enable or disable autoscaling. Defaults to the setting coming from the deployment template.
     * 
     */
    private @Nullable Boolean autoscale;
    /**
     * @return Maximum size value for the maximum autoscaling setting.
     * 
     */
    private @Nullable String maxSize;
    /**
     * @return Maximum resource type for the maximum autoscaling setting.
     * 
     */
    private @Nullable String maxSizeResource;
    /**
     * @return Minimum size value for the minimum autoscaling setting.
     * 
     */
    private @Nullable String minSize;
    /**
     * @return Minimum resource type for the minimum autoscaling setting.
     * 
     */
    private @Nullable String minSizeResource;
    /**
     * @return Computed policy overrides set directly via the API or other clients.
     * 
     */
    private @Nullable String policyOverrideJson;

    private DeploymentElasticsearchCoordinatingAutoscaling() {}
    /**
     * @return Enable or disable autoscaling. Defaults to the setting coming from the deployment template.
     * 
     */
    public Optional<Boolean> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    /**
     * @return Maximum size value for the maximum autoscaling setting.
     * 
     */
    public Optional<String> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    /**
     * @return Maximum resource type for the maximum autoscaling setting.
     * 
     */
    public Optional<String> maxSizeResource() {
        return Optional.ofNullable(this.maxSizeResource);
    }
    /**
     * @return Minimum size value for the minimum autoscaling setting.
     * 
     */
    public Optional<String> minSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * @return Minimum resource type for the minimum autoscaling setting.
     * 
     */
    public Optional<String> minSizeResource() {
        return Optional.ofNullable(this.minSizeResource);
    }
    /**
     * @return Computed policy overrides set directly via the API or other clients.
     * 
     */
    public Optional<String> policyOverrideJson() {
        return Optional.ofNullable(this.policyOverrideJson);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchCoordinatingAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoscale;
        private @Nullable String maxSize;
        private @Nullable String maxSizeResource;
        private @Nullable String minSize;
        private @Nullable String minSizeResource;
        private @Nullable String policyOverrideJson;
        public Builder() {}
        public Builder(DeploymentElasticsearchCoordinatingAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscale = defaults.autoscale;
    	      this.maxSize = defaults.maxSize;
    	      this.maxSizeResource = defaults.maxSizeResource;
    	      this.minSize = defaults.minSize;
    	      this.minSizeResource = defaults.minSizeResource;
    	      this.policyOverrideJson = defaults.policyOverrideJson;
        }

        @CustomType.Setter
        public Builder autoscale(@Nullable Boolean autoscale) {

            this.autoscale = autoscale;
            return this;
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
        public DeploymentElasticsearchCoordinatingAutoscaling build() {
            final var _resultValue = new DeploymentElasticsearchCoordinatingAutoscaling();
            _resultValue.autoscale = autoscale;
            _resultValue.maxSize = maxSize;
            _resultValue.maxSizeResource = maxSizeResource;
            _resultValue.minSize = minSize;
            _resultValue.minSizeResource = minSizeResource;
            _resultValue.policyOverrideJson = policyOverrideJson;
            return _resultValue;
        }
    }
}
