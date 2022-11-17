// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentApmTopology {
    private String instanceConfigurationId;
    private String size;
    private String sizeResource;
    private Integer zoneCount;

    private GetDeploymentApmTopology() {}
    public String instanceConfigurationId() {
        return this.instanceConfigurationId;
    }
    public String size() {
        return this.size;
    }
    public String sizeResource() {
        return this.sizeResource;
    }
    public Integer zoneCount() {
        return this.zoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentApmTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceConfigurationId;
        private String size;
        private String sizeResource;
        private Integer zoneCount;
        public Builder() {}
        public Builder(GetDeploymentApmTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceConfigurationId = defaults.instanceConfigurationId;
    	      this.size = defaults.size;
    	      this.sizeResource = defaults.sizeResource;
    	      this.zoneCount = defaults.zoneCount;
        }

        @CustomType.Setter
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = Objects.requireNonNull(instanceConfigurationId);
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder sizeResource(String sizeResource) {
            this.sizeResource = Objects.requireNonNull(sizeResource);
            return this;
        }
        @CustomType.Setter
        public Builder zoneCount(Integer zoneCount) {
            this.zoneCount = Objects.requireNonNull(zoneCount);
            return this;
        }
        public GetDeploymentApmTopology build() {
            final var o = new GetDeploymentApmTopology();
            o.instanceConfigurationId = instanceConfigurationId;
            o.size = size;
            o.sizeResource = sizeResource;
            o.zoneCount = zoneCount;
            return o;
        }
    }
}
