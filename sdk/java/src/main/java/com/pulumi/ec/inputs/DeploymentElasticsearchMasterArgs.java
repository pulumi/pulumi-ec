// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentElasticsearchMasterAutoscalingArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchMasterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchMasterArgs Empty = new DeploymentElasticsearchMasterArgs();

    /**
     * Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    @Import(name="autoscaling", required=true)
    private Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling;

    /**
     * @return Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    public Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling() {
        return this.autoscaling;
    }

    /**
     * Computed Instance Configuration ID of the topology element
     * 
     */
    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

    /**
     * @return Computed Instance Configuration ID of the topology element
     * 
     */
    public Optional<Output<String>> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }

    /**
     * The computed list of node roles for the current topology element
     * 
     */
    @Import(name="nodeRoles")
    private @Nullable Output<List<String>> nodeRoles;

    /**
     * @return The computed list of node roles for the current topology element
     * 
     */
    public Optional<Output<List<String>>> nodeRoles() {
        return Optional.ofNullable(this.nodeRoles);
    }

    /**
     * The node type for the Elasticsearch Topology element (data node)
     * 
     */
    @Import(name="nodeTypeData")
    private @Nullable Output<String> nodeTypeData;

    /**
     * @return The node type for the Elasticsearch Topology element (data node)
     * 
     */
    public Optional<Output<String>> nodeTypeData() {
        return Optional.ofNullable(this.nodeTypeData);
    }

    /**
     * The node type for the Elasticsearch Topology element (ingest node)
     * 
     */
    @Import(name="nodeTypeIngest")
    private @Nullable Output<String> nodeTypeIngest;

    /**
     * @return The node type for the Elasticsearch Topology element (ingest node)
     * 
     */
    public Optional<Output<String>> nodeTypeIngest() {
        return Optional.ofNullable(this.nodeTypeIngest);
    }

    /**
     * The node type for the Elasticsearch Topology element (master node)
     * 
     */
    @Import(name="nodeTypeMaster")
    private @Nullable Output<String> nodeTypeMaster;

    /**
     * @return The node type for the Elasticsearch Topology element (master node)
     * 
     */
    public Optional<Output<String>> nodeTypeMaster() {
        return Optional.ofNullable(this.nodeTypeMaster);
    }

    /**
     * The node type for the Elasticsearch Topology element (machine learning node)
     * 
     */
    @Import(name="nodeTypeMl")
    private @Nullable Output<String> nodeTypeMl;

    /**
     * @return The node type for the Elasticsearch Topology element (machine learning node)
     * 
     */
    public Optional<Output<String>> nodeTypeMl() {
        return Optional.ofNullable(this.nodeTypeMl);
    }

    /**
     * Amount of &#34;size_resource&#34; per node in the &#34;&lt;size in GB&gt;g&#34; notation
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return Amount of &#34;size_resource&#34; per node in the &#34;&lt;size in GB&gt;g&#34; notation
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Optional size type, defaults to &#34;memory&#34;.
     * 
     */
    @Import(name="sizeResource")
    private @Nullable Output<String> sizeResource;

    /**
     * @return Optional size type, defaults to &#34;memory&#34;.
     * 
     */
    public Optional<Output<String>> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }

    /**
     * Number of zones that the Elasticsearch cluster will span. This is used to set HA
     * 
     */
    @Import(name="zoneCount")
    private @Nullable Output<Integer> zoneCount;

    /**
     * @return Number of zones that the Elasticsearch cluster will span. This is used to set HA
     * 
     */
    public Optional<Output<Integer>> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    private DeploymentElasticsearchMasterArgs() {}

    private DeploymentElasticsearchMasterArgs(DeploymentElasticsearchMasterArgs $) {
        this.autoscaling = $.autoscaling;
        this.instanceConfigurationId = $.instanceConfigurationId;
        this.nodeRoles = $.nodeRoles;
        this.nodeTypeData = $.nodeTypeData;
        this.nodeTypeIngest = $.nodeTypeIngest;
        this.nodeTypeMaster = $.nodeTypeMaster;
        this.nodeTypeMl = $.nodeTypeMl;
        this.size = $.size;
        this.sizeResource = $.sizeResource;
        this.zoneCount = $.zoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchMasterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchMasterArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchMasterArgs();
        }

        public Builder(DeploymentElasticsearchMasterArgs defaults) {
            $ = new DeploymentElasticsearchMasterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(DeploymentElasticsearchMasterAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        /**
         * @param instanceConfigurationId Computed Instance Configuration ID of the topology element
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        /**
         * @param instanceConfigurationId Computed Instance Configuration ID of the topology element
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            return instanceConfigurationId(Output.of(instanceConfigurationId));
        }

        /**
         * @param nodeRoles The computed list of node roles for the current topology element
         * 
         * @return builder
         * 
         */
        public Builder nodeRoles(@Nullable Output<List<String>> nodeRoles) {
            $.nodeRoles = nodeRoles;
            return this;
        }

        /**
         * @param nodeRoles The computed list of node roles for the current topology element
         * 
         * @return builder
         * 
         */
        public Builder nodeRoles(List<String> nodeRoles) {
            return nodeRoles(Output.of(nodeRoles));
        }

        /**
         * @param nodeRoles The computed list of node roles for the current topology element
         * 
         * @return builder
         * 
         */
        public Builder nodeRoles(String... nodeRoles) {
            return nodeRoles(List.of(nodeRoles));
        }

        /**
         * @param nodeTypeData The node type for the Elasticsearch Topology element (data node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeData(@Nullable Output<String> nodeTypeData) {
            $.nodeTypeData = nodeTypeData;
            return this;
        }

        /**
         * @param nodeTypeData The node type for the Elasticsearch Topology element (data node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeData(String nodeTypeData) {
            return nodeTypeData(Output.of(nodeTypeData));
        }

        /**
         * @param nodeTypeIngest The node type for the Elasticsearch Topology element (ingest node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeIngest(@Nullable Output<String> nodeTypeIngest) {
            $.nodeTypeIngest = nodeTypeIngest;
            return this;
        }

        /**
         * @param nodeTypeIngest The node type for the Elasticsearch Topology element (ingest node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeIngest(String nodeTypeIngest) {
            return nodeTypeIngest(Output.of(nodeTypeIngest));
        }

        /**
         * @param nodeTypeMaster The node type for the Elasticsearch Topology element (master node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeMaster(@Nullable Output<String> nodeTypeMaster) {
            $.nodeTypeMaster = nodeTypeMaster;
            return this;
        }

        /**
         * @param nodeTypeMaster The node type for the Elasticsearch Topology element (master node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeMaster(String nodeTypeMaster) {
            return nodeTypeMaster(Output.of(nodeTypeMaster));
        }

        /**
         * @param nodeTypeMl The node type for the Elasticsearch Topology element (machine learning node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeMl(@Nullable Output<String> nodeTypeMl) {
            $.nodeTypeMl = nodeTypeMl;
            return this;
        }

        /**
         * @param nodeTypeMl The node type for the Elasticsearch Topology element (machine learning node)
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeMl(String nodeTypeMl) {
            return nodeTypeMl(Output.of(nodeTypeMl));
        }

        /**
         * @param size Amount of &#34;size_resource&#34; per node in the &#34;&lt;size in GB&gt;g&#34; notation
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Amount of &#34;size_resource&#34; per node in the &#34;&lt;size in GB&gt;g&#34; notation
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param sizeResource Optional size type, defaults to &#34;memory&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sizeResource(@Nullable Output<String> sizeResource) {
            $.sizeResource = sizeResource;
            return this;
        }

        /**
         * @param sizeResource Optional size type, defaults to &#34;memory&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sizeResource(String sizeResource) {
            return sizeResource(Output.of(sizeResource));
        }

        /**
         * @param zoneCount Number of zones that the Elasticsearch cluster will span. This is used to set HA
         * 
         * @return builder
         * 
         */
        public Builder zoneCount(@Nullable Output<Integer> zoneCount) {
            $.zoneCount = zoneCount;
            return this;
        }

        /**
         * @param zoneCount Number of zones that the Elasticsearch cluster will span. This is used to set HA
         * 
         * @return builder
         * 
         */
        public Builder zoneCount(Integer zoneCount) {
            return zoneCount(Output.of(zoneCount));
        }

        public DeploymentElasticsearchMasterArgs build() {
            if ($.autoscaling == null) {
                throw new MissingRequiredPropertyException("DeploymentElasticsearchMasterArgs", "autoscaling");
            }
            return $;
        }
    }

}
