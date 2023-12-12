// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentElasticsearchTopologyAutoscaling {
    /**
     * @return Maximum size the tier can scale up to, e.g &#34;64g&#34;.
     * 
     */
    private String maxSize;
    /**
     * @return Resource type used when specifying the maximum size the tier can scale up to.
     * 
     */
    private String maxSizeResource;
    /**
     * @return Minimum size the tier can scale down to when bidirectional autoscaling is supported.
     * 
     */
    private String minSize;
    /**
     * @return Resource type used when specifying the minimum size the tier can scale down to when bidirectional autoscaling is supported.
     * 
     */
    private String minSizeResource;
    /**
     * @return An arbitrary JSON object overriding the default autoscaling policy. Don&#39;t set unless you really know what you are doing.
     * 
     */
    private String policyOverrideJson;

    private GetDeploymentElasticsearchTopologyAutoscaling() {}
    /**
     * @return Maximum size the tier can scale up to, e.g &#34;64g&#34;.
     * 
     */
    public String maxSize() {
        return this.maxSize;
    }
    /**
     * @return Resource type used when specifying the maximum size the tier can scale up to.
     * 
     */
    public String maxSizeResource() {
        return this.maxSizeResource;
    }
    /**
     * @return Minimum size the tier can scale down to when bidirectional autoscaling is supported.
     * 
     */
    public String minSize() {
        return this.minSize;
    }
    /**
     * @return Resource type used when specifying the minimum size the tier can scale down to when bidirectional autoscaling is supported.
     * 
     */
    public String minSizeResource() {
        return this.minSizeResource;
    }
    /**
     * @return An arbitrary JSON object overriding the default autoscaling policy. Don&#39;t set unless you really know what you are doing.
     * 
     */
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
            final var _resultValue = new GetDeploymentElasticsearchTopologyAutoscaling();
            _resultValue.maxSize = maxSize;
            _resultValue.maxSizeResource = maxSizeResource;
            _resultValue.minSize = minSize;
            _resultValue.minSizeResource = minSizeResource;
            _resultValue.policyOverrideJson = policyOverrideJson;
            return _resultValue;
        }
    }
}
