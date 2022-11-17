// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentElasticsearchTopologyAutoscaling {
    private String maxSize;
    private String maxSizeResource;
    private String minSize;
    private String minSizeResource;
    private String policyOverrideJson;

    private GetDeploymentElasticsearchTopologyAutoscaling() {}
    public String maxSize() {
        return this.maxSize;
    }
    public String maxSizeResource() {
        return this.maxSizeResource;
    }
    public String minSize() {
        return this.minSize;
    }
    public String minSizeResource() {
        return this.minSizeResource;
    }
    public String policyOverrideJson() {
        return this.policyOverrideJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentElasticsearchTopologyAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maxSize;
        private String maxSizeResource;
        private String minSize;
        private String minSizeResource;
        private String policyOverrideJson;
        public Builder() {}
        public Builder(GetDeploymentElasticsearchTopologyAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSize = defaults.maxSize;
    	      this.maxSizeResource = defaults.maxSizeResource;
    	      this.minSize = defaults.minSize;
    	      this.minSizeResource = defaults.minSizeResource;
    	      this.policyOverrideJson = defaults.policyOverrideJson;
        }

        @CustomType.Setter
        public Builder maxSize(String maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        @CustomType.Setter
        public Builder maxSizeResource(String maxSizeResource) {
            this.maxSizeResource = Objects.requireNonNull(maxSizeResource);
            return this;
        }
        @CustomType.Setter
        public Builder minSize(String minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        @CustomType.Setter
        public Builder minSizeResource(String minSizeResource) {
            this.minSizeResource = Objects.requireNonNull(minSizeResource);
            return this;
        }
        @CustomType.Setter
        public Builder policyOverrideJson(String policyOverrideJson) {
            this.policyOverrideJson = Objects.requireNonNull(policyOverrideJson);
            return this;
        }
        public GetDeploymentElasticsearchTopologyAutoscaling build() {
            final var o = new GetDeploymentElasticsearchTopologyAutoscaling();
            o.maxSize = maxSize;
            o.maxSizeResource = maxSizeResource;
            o.minSize = minSize;
            o.minSizeResource = minSizeResource;
            o.policyOverrideJson = policyOverrideJson;
            return o;
        }
    }
}
