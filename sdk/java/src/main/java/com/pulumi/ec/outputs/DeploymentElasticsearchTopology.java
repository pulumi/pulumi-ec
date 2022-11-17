// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.DeploymentElasticsearchTopologyAutoscaling;
import com.pulumi.ec.outputs.DeploymentElasticsearchTopologyConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchTopology {
    /**
     * @return Autoscaling policy defining the maximum and / or minimum total size for this topology element. For more information refer to the `autoscaling` block.
     * 
     */
    private @Nullable DeploymentElasticsearchTopologyAutoscaling autoscaling;
    /**
     * @return Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    private @Nullable List<DeploymentElasticsearchTopologyConfig> configs;
    /**
     * @return Unique topology identifier. It generally refers to an Elasticsearch data tier, such as `hot_content`, `warm`, `cold`, `coordinating`, `frozen`, `ml` or `master`.
     * 
     */
    private String id;
    /**
     * @return Default instance configuration of the deployment template. No need to change this value since Kibana has only one _instance type_.
     * 
     */
    private @Nullable String instanceConfigurationId;
    private @Nullable List<String> nodeRoles;
    /**
     * @return The node type for the Elasticsearch cluster (data node).
     * 
     */
    private @Nullable String nodeTypeData;
    /**
     * @return The node type for the Elasticsearch cluster (ingest node).
     * 
     */
    private @Nullable String nodeTypeIngest;
    /**
     * @return The node type for the Elasticsearch cluster (master node).
     * 
     */
    private @Nullable String nodeTypeMaster;
    /**
     * @return The node type for the Elasticsearch cluster (machine learning node).
     * 
     */
    private @Nullable String nodeTypeMl;
    /**
     * @return Amount in Gigabytes per topology element in the `&#34;&lt;size in GB&gt;g&#34;` notation. When omitted, it defaults to the deployment template value.
     * 
     */
    private @Nullable String size;
    /**
     * @return Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
     * 
     */
    private @Nullable String sizeResource;
    /**
     * @return Number of zones the instance type of the Elasticsearch cluster will span. This is used to set or unset HA on an Elasticsearch node type. When omitted, it defaults to the deployment template value.
     * 
     */
    private @Nullable Integer zoneCount;

    private DeploymentElasticsearchTopology() {}
    /**
     * @return Autoscaling policy defining the maximum and / or minimum total size for this topology element. For more information refer to the `autoscaling` block.
     * 
     */
    public Optional<DeploymentElasticsearchTopologyAutoscaling> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * @return Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    public List<DeploymentElasticsearchTopologyConfig> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    /**
     * @return Unique topology identifier. It generally refers to an Elasticsearch data tier, such as `hot_content`, `warm`, `cold`, `coordinating`, `frozen`, `ml` or `master`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Default instance configuration of the deployment template. No need to change this value since Kibana has only one _instance type_.
     * 
     */
    public Optional<String> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }
    public List<String> nodeRoles() {
        return this.nodeRoles == null ? List.of() : this.nodeRoles;
    }
    /**
     * @return The node type for the Elasticsearch cluster (data node).
     * 
     */
    public Optional<String> nodeTypeData() {
        return Optional.ofNullable(this.nodeTypeData);
    }
    /**
     * @return The node type for the Elasticsearch cluster (ingest node).
     * 
     */
    public Optional<String> nodeTypeIngest() {
        return Optional.ofNullable(this.nodeTypeIngest);
    }
    /**
     * @return The node type for the Elasticsearch cluster (master node).
     * 
     */
    public Optional<String> nodeTypeMaster() {
        return Optional.ofNullable(this.nodeTypeMaster);
    }
    /**
     * @return The node type for the Elasticsearch cluster (machine learning node).
     * 
     */
    public Optional<String> nodeTypeMl() {
        return Optional.ofNullable(this.nodeTypeMl);
    }
    /**
     * @return Amount in Gigabytes per topology element in the `&#34;&lt;size in GB&gt;g&#34;` notation. When omitted, it defaults to the deployment template value.
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
     * 
     */
    public Optional<String> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }
    /**
     * @return Number of zones the instance type of the Elasticsearch cluster will span. This is used to set or unset HA on an Elasticsearch node type. When omitted, it defaults to the deployment template value.
     * 
     */
    public Optional<Integer> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeploymentElasticsearchTopologyAutoscaling autoscaling;
        private @Nullable List<DeploymentElasticsearchTopologyConfig> configs;
        private String id;
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
        public Builder(DeploymentElasticsearchTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.configs = defaults.configs;
    	      this.id = defaults.id;
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
        public Builder autoscaling(@Nullable DeploymentElasticsearchTopologyAutoscaling autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder configs(@Nullable List<DeploymentElasticsearchTopologyConfig> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(DeploymentElasticsearchTopologyConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public DeploymentElasticsearchTopology build() {
            final var o = new DeploymentElasticsearchTopology();
            o.autoscaling = autoscaling;
            o.configs = configs;
            o.id = id;
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
