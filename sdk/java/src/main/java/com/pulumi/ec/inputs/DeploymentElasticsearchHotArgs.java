// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentElasticsearchHotAutoscalingArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchHotArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchHotArgs Empty = new DeploymentElasticsearchHotArgs();

    /**
     * Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    @Import(name="autoscaling", required=true)
    private Output<DeploymentElasticsearchHotAutoscalingArgs> autoscaling;

    /**
     * @return Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
     * 
     */
    public Output<DeploymentElasticsearchHotAutoscalingArgs> autoscaling() {
        return this.autoscaling;
    }

    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

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

    @Import(name="size")
    private @Nullable Output<String> size;

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

    @Import(name="zoneCount")
    private @Nullable Output<Integer> zoneCount;

    public Optional<Output<Integer>> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    private DeploymentElasticsearchHotArgs() {}

    private DeploymentElasticsearchHotArgs(DeploymentElasticsearchHotArgs $) {
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
    public static Builder builder(DeploymentElasticsearchHotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchHotArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchHotArgs();
        }

        public Builder(DeploymentElasticsearchHotArgs defaults) {
            $ = new DeploymentElasticsearchHotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(Output<DeploymentElasticsearchHotAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling Optional Elasticsearch autoscaling settings, such a maximum and minimum size and resources.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(DeploymentElasticsearchHotAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

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

        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

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

        public Builder zoneCount(@Nullable Output<Integer> zoneCount) {
            $.zoneCount = zoneCount;
            return this;
        }

        public Builder zoneCount(Integer zoneCount) {
            return zoneCount(Output.of(zoneCount));
        }

        public DeploymentElasticsearchHotArgs build() {
            if ($.autoscaling == null) {
                throw new MissingRequiredPropertyException("DeploymentElasticsearchHotArgs", "autoscaling");
            }
            return $;
        }
    }

}
