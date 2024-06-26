// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentElasticsearchTopologyAutoscaling;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentElasticsearchTopology {
    /**
     * @return Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    private List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings;
    /**
     * @return Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * 
     */
    private String instanceConfigurationId;
    /**
     * @return Defines the list of Elasticsearch node roles assigned to the topology element. This is supported from v7.10, and required from v8.
     * 
     */
    private List<String> nodeRoles;
    /**
     * @return Defines whether this node can hold data (\n\n).
     * 
     */
    private Boolean nodeTypeData;
    /**
     * @return Defines whether this node can run an ingest pipeline (\n\n).
     * 
     */
    private Boolean nodeTypeIngest;
    /**
     * @return Defines whether this node can be elected master (\n\n).
     * 
     */
    private Boolean nodeTypeMaster;
    /**
     * @return Defines whether this node can run ML jobs (\n\n).
     * 
     */
    private Boolean nodeTypeMl;
    /**
     * @return Amount of &#34;size_resource&#34; per topology element in Gigabytes. For example &#34;4g&#34;.
     * 
     */
    private String size;
    /**
     * @return Type of resource (&#34;memory&#34; or &#34;storage&#34;)
     * 
     */
    private String sizeResource;
    /**
     * @return Number of zones in which nodes will be placed.
     * 
     */
    private Integer zoneCount;

    private GetDeploymentElasticsearchTopology() {}
    /**
     * @return Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    public List<GetDeploymentElasticsearchTopologyAutoscaling> autoscalings() {
        return this.autoscalings;
    }
    /**
     * @return Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * 
     */
    public String instanceConfigurationId() {
        return this.instanceConfigurationId;
    }
    /**
     * @return Defines the list of Elasticsearch node roles assigned to the topology element. This is supported from v7.10, and required from v8.
     * 
     */
    public List<String> nodeRoles() {
        return this.nodeRoles;
    }
    /**
     * @return Defines whether this node can hold data (\n\n).
     * 
     */
    public Boolean nodeTypeData() {
        return this.nodeTypeData;
    }
    /**
     * @return Defines whether this node can run an ingest pipeline (\n\n).
     * 
     */
    public Boolean nodeTypeIngest() {
        return this.nodeTypeIngest;
    }
    /**
     * @return Defines whether this node can be elected master (\n\n).
     * 
     */
    public Boolean nodeTypeMaster() {
        return this.nodeTypeMaster;
    }
    /**
     * @return Defines whether this node can run ML jobs (\n\n).
     * 
     */
    public Boolean nodeTypeMl() {
        return this.nodeTypeMl;
    }
    /**
     * @return Amount of &#34;size_resource&#34; per topology element in Gigabytes. For example &#34;4g&#34;.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return Type of resource (&#34;memory&#34; or &#34;storage&#34;)
     * 
     */
    public String sizeResource() {
        return this.sizeResource;
    }
    /**
     * @return Number of zones in which nodes will be placed.
     * 
     */
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
        private Boolean nodeTypeMl;
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
            if (autoscalings == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "autoscalings");
            }
            this.autoscalings = autoscalings;
            return this;
        }
        public Builder autoscalings(GetDeploymentElasticsearchTopologyAutoscaling... autoscalings) {
            return autoscalings(List.of(autoscalings));
        }
        @CustomType.Setter
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            if (instanceConfigurationId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "instanceConfigurationId");
            }
            this.instanceConfigurationId = instanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeRoles(List<String> nodeRoles) {
            if (nodeRoles == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "nodeRoles");
            }
            this.nodeRoles = nodeRoles;
            return this;
        }
        public Builder nodeRoles(String... nodeRoles) {
            return nodeRoles(List.of(nodeRoles));
        }
        @CustomType.Setter
        public Builder nodeTypeData(Boolean nodeTypeData) {
            if (nodeTypeData == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "nodeTypeData");
            }
            this.nodeTypeData = nodeTypeData;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeIngest(Boolean nodeTypeIngest) {
            if (nodeTypeIngest == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "nodeTypeIngest");
            }
            this.nodeTypeIngest = nodeTypeIngest;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMaster(Boolean nodeTypeMaster) {
            if (nodeTypeMaster == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "nodeTypeMaster");
            }
            this.nodeTypeMaster = nodeTypeMaster;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeMl(Boolean nodeTypeMl) {
            if (nodeTypeMl == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "nodeTypeMl");
            }
            this.nodeTypeMl = nodeTypeMl;
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder sizeResource(String sizeResource) {
            if (sizeResource == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "sizeResource");
            }
            this.sizeResource = sizeResource;
            return this;
        }
        @CustomType.Setter
        public Builder zoneCount(Integer zoneCount) {
            if (zoneCount == null) {
              throw new MissingRequiredPropertyException("GetDeploymentElasticsearchTopology", "zoneCount");
            }
            this.zoneCount = zoneCount;
            return this;
        }
        public GetDeploymentElasticsearchTopology build() {
            final var _resultValue = new GetDeploymentElasticsearchTopology();
            _resultValue.autoscalings = autoscalings;
            _resultValue.instanceConfigurationId = instanceConfigurationId;
            _resultValue.nodeRoles = nodeRoles;
            _resultValue.nodeTypeData = nodeTypeData;
            _resultValue.nodeTypeIngest = nodeTypeIngest;
            _resultValue.nodeTypeMaster = nodeTypeMaster;
            _resultValue.nodeTypeMl = nodeTypeMl;
            _resultValue.size = size;
            _resultValue.sizeResource = sizeResource;
            _resultValue.zoneCount = zoneCount;
            return _resultValue;
        }
    }
}
