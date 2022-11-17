// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentElasticsearchTopologyAutoscaling;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeploymentElasticsearchTopology {
    private List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings;
    private String instanceConfigurationId;
    private List<String> nodeRoles;
    private Boolean nodeTypeData;
    private Boolean nodeTypeIngest;
    private Boolean nodeTypeMaster;
    private @Nullable Boolean nodeTypeMl;
    private String size;
    private String sizeResource;
    private Integer zoneCount;

    private GetDeploymentElasticsearchTopology() {}
    public List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings() {
        return this.autoscalings;
    }
    public String instanceConfigurationId() {
        return this.instanceConfigurationId;
    }
    public List<String> nodeRoles() {
        return this.nodeRoles;
    }
    public Boolean nodeTypeData() {
        return this.nodeTypeData;
    }
    public Boolean nodeTypeIngest() {
        return this.nodeTypeIngest;
    }
    public Boolean nodeTypeMaster() {
        return this.nodeTypeMaster;
    }
    public Optional<Boolean> nodeTypeMl() {
        return Optional.ofNullable(this.nodeTypeMl);
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

    public static Builder builder(GetDeploymentElasticsearchTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings;
        private String instanceConfigurationId;
        private List<String> nodeRoles;
        private Boolean nodeTypeData;
        private Boolean nodeTypeIngest;
        private Boolean nodeTypeMaster;
        private @Nullable Boolean nodeTypeMl;
        private String size;
        private String sizeResource;
        private Integer zoneCount;
        public Builder() {}
        public Builder(GetDeploymentElasticsearchTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalings = defaults.autoscalings;
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
        public Builder autoscalings(List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings) {
            this.autoscalings = Objects.requireNonNull(autoscalings);
            return this;
        }
        public Builder autoscalings(GetDeploymentElasticsearchTopologyAutoscaling... autoscalings) {
            return autoscalings(List.of(autoscalings));
        }
        @CustomType.Setter
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = Objects.requireNonNull(instanceConfigurationId);
            return this;
        }
        @CustomType.Setter
        public Builder nodeRoles(List<String> nodeRoles) {
            this.nodeRoles = Objects.requireNonNull(nodeRoles);
            return this;
        }
        public Builder nodeRoles(String... nodeRoles) {
            return nodeRoles(List.of(nodeRoles));
        }
        @CustomType.Setter
        public Builder nodeTypeData(Boolean nodeTypeData) {
            this.nodeTypeData = Objects.requireNonNull(nodeTypeData);
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeIngest(Boolean nodeTypeIngest) {
            this.nodeTypeIngest = Objects.requireNonNull(nodeTypeIngest);
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMaster(Boolean nodeTypeMaster) {
            this.nodeTypeMaster = Objects.requireNonNull(nodeTypeMaster);
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMl(@Nullable Boolean nodeTypeMl) {
            this.nodeTypeMl = nodeTypeMl;
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
        public GetDeploymentElasticsearchTopology build() {
            final var o = new GetDeploymentElasticsearchTopology();
            o.autoscalings = autoscalings;
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
