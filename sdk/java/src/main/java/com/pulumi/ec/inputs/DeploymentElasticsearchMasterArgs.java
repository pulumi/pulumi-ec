// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentElasticsearchMasterAutoscalingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchMasterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchMasterArgs Empty = new DeploymentElasticsearchMasterArgs();

    @Import(name="autoscaling", required=true)
    private Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling;

    public Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling() {
        return this.autoscaling;
    }

    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

    public Optional<Output<String>> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }

    @Import(name="nodeRoles")
    private @Nullable Output<List<String>> nodeRoles;

    public Optional<Output<List<String>>> nodeRoles() {
        return Optional.ofNullable(this.nodeRoles);
    }

    @Import(name="nodeTypeData")
    private @Nullable Output<String> nodeTypeData;

    public Optional<Output<String>> nodeTypeData() {
        return Optional.ofNullable(this.nodeTypeData);
    }

    @Import(name="nodeTypeIngest")
    private @Nullable Output<String> nodeTypeIngest;

    public Optional<Output<String>> nodeTypeIngest() {
        return Optional.ofNullable(this.nodeTypeIngest);
    }

    @Import(name="nodeTypeMaster")
    private @Nullable Output<String> nodeTypeMaster;

    public Optional<Output<String>> nodeTypeMaster() {
        return Optional.ofNullable(this.nodeTypeMaster);
    }

    @Import(name="nodeTypeMl")
    private @Nullable Output<String> nodeTypeMl;

    public Optional<Output<String>> nodeTypeMl() {
        return Optional.ofNullable(this.nodeTypeMl);
    }

    @Import(name="size")
    private @Nullable Output<String> size;

    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="sizeResource")
    private @Nullable Output<String> sizeResource;

    public Optional<Output<String>> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }

    @Import(name="zoneCount")
    private @Nullable Output<Integer> zoneCount;

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

        public Builder autoscaling(Output<DeploymentElasticsearchMasterAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        public Builder autoscaling(DeploymentElasticsearchMasterAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        public Builder instanceConfigurationId(String instanceConfigurationId) {
            return instanceConfigurationId(Output.of(instanceConfigurationId));
        }

        public Builder nodeRoles(@Nullable Output<List<String>> nodeRoles) {
            $.nodeRoles = nodeRoles;
            return this;
        }

        public Builder nodeRoles(List<String> nodeRoles) {
            return nodeRoles(Output.of(nodeRoles));
        }

        public Builder nodeRoles(String... nodeRoles) {
            return nodeRoles(List.of(nodeRoles));
        }

        public Builder nodeTypeData(@Nullable Output<String> nodeTypeData) {
            $.nodeTypeData = nodeTypeData;
            return this;
        }

        public Builder nodeTypeData(String nodeTypeData) {
            return nodeTypeData(Output.of(nodeTypeData));
        }

        public Builder nodeTypeIngest(@Nullable Output<String> nodeTypeIngest) {
            $.nodeTypeIngest = nodeTypeIngest;
            return this;
        }

        public Builder nodeTypeIngest(String nodeTypeIngest) {
            return nodeTypeIngest(Output.of(nodeTypeIngest));
        }

        public Builder nodeTypeMaster(@Nullable Output<String> nodeTypeMaster) {
            $.nodeTypeMaster = nodeTypeMaster;
            return this;
        }

        public Builder nodeTypeMaster(String nodeTypeMaster) {
            return nodeTypeMaster(Output.of(nodeTypeMaster));
        }

        public Builder nodeTypeMl(@Nullable Output<String> nodeTypeMl) {
            $.nodeTypeMl = nodeTypeMl;
            return this;
        }

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

        public Builder sizeResource(@Nullable Output<String> sizeResource) {
            $.sizeResource = sizeResource;
            return this;
        }

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

        public DeploymentElasticsearchMasterArgs build() {
            $.autoscaling = Objects.requireNonNull($.autoscaling, "expected parameter 'autoscaling' to be non-null");
            return $;
        }
    }

}
