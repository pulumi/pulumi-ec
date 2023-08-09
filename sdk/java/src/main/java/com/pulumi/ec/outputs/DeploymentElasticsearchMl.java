// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.DeploymentElasticsearchMlAutoscaling;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchMl {
    private DeploymentElasticsearchMlAutoscaling autoscaling;
    private @Nullable String instanceConfigurationId;
    private @Nullable List<String> nodeRoles;
    private @Nullable String nodeTypeData;
    private @Nullable String nodeTypeIngest;
    private @Nullable String nodeTypeMaster;
    private @Nullable String nodeTypeMl;
    private @Nullable String size;
    private @Nullable String sizeResource;
    private @Nullable Integer zoneCount;

    private DeploymentElasticsearchMl() {}
    public DeploymentElasticsearchMlAutoscaling autoscaling() {
        return this.autoscaling;
    }
    public Optional<String> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }
    public List<String> nodeRoles() {
        return this.nodeRoles == null ? List.of() : this.nodeRoles;
    }
    public Optional<String> nodeTypeData() {
        return Optional.ofNullable(this.nodeTypeData);
    }
    public Optional<String> nodeTypeIngest() {
        return Optional.ofNullable(this.nodeTypeIngest);
    }
    public Optional<String> nodeTypeMaster() {
        return Optional.ofNullable(this.nodeTypeMaster);
    }
    public Optional<String> nodeTypeMl() {
        return Optional.ofNullable(this.nodeTypeMl);
    }
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }
    public Optional<Integer> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchMl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DeploymentElasticsearchMlAutoscaling autoscaling;
        private @Nullable String instanceConfigurationId;
        private @Nullable List<String> nodeRoles;
        private @Nullable String nodeTypeData;
        private @Nullable String nodeTypeIngest;
        private @Nullable String nodeTypeMaster;
        private @Nullable String nodeTypeMl;
        private @Nullable String size;
        private @Nullable String sizeResource;
        private @Nullable Integer zoneCount;
        public Builder() {}
        public Builder(DeploymentElasticsearchMl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.instanceConfigurationId = defaults.instanceConfigurationId;
    	      this.nodeRoles = defaults.nodeRoles;
    	      this.nodeTypeData = defaults.nodeTypeData;
    	      this.nodeTypeIngest = defaults.nodeTypeIngest;
    	      this.nodeTypeMaster = defaults.nodeTypeMaster;
    	      this.nodeTypeMl = defaults.nodeTypeMl;
    	      this.size = defaults.size;
    	      this.sizeResource = defaults.sizeResource;
    	      this.zoneCount = defaults.zoneCount;
        }

        @CustomType.Setter
        public Builder autoscaling(DeploymentElasticsearchMlAutoscaling autoscaling) {
            this.autoscaling = Objects.requireNonNull(autoscaling);
            return this;
        }
        @CustomType.Setter
        public Builder instanceConfigurationId(@Nullable String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeRoles(@Nullable List<String> nodeRoles) {
            this.nodeRoles = nodeRoles;
            return this;
        }
        public Builder nodeRoles(String... nodeRoles) {
            return nodeRoles(List.of(nodeRoles));
        }
        @CustomType.Setter
        public Builder nodeTypeData(@Nullable String nodeTypeData) {
            this.nodeTypeData = nodeTypeData;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeIngest(@Nullable String nodeTypeIngest) {
            this.nodeTypeIngest = nodeTypeIngest;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMaster(@Nullable String nodeTypeMaster) {
            this.nodeTypeMaster = nodeTypeMaster;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMl(@Nullable String nodeTypeMl) {
            this.nodeTypeMl = nodeTypeMl;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder sizeResource(@Nullable String sizeResource) {
            this.sizeResource = sizeResource;
            return this;
        }
        @CustomType.Setter
        public Builder zoneCount(@Nullable Integer zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public DeploymentElasticsearchMl build() {
            final var o = new DeploymentElasticsearchMl();
            o.autoscaling = autoscaling;
            o.instanceConfigurationId = instanceConfigurationId;
            o.nodeRoles = nodeRoles;
            o.nodeTypeData = nodeTypeData;
            o.nodeTypeIngest = nodeTypeIngest;
            o.nodeTypeMaster = nodeTypeMaster;
            o.nodeTypeMl = nodeTypeMl;
            o.size = size;
            o.sizeResource = sizeResource;
            o.zoneCount = zoneCount;
            return o;
        }
    }
}
