// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchHotAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchHotAutoscalingArgs Empty = new DeploymentElasticsearchHotAutoscalingArgs();

    @Import(name="maxSize")
    private @Nullable Output<String> maxSize;

    public Optional<Output<String>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    @Import(name="maxSizeResource")
    private @Nullable Output<String> maxSizeResource;

    public Optional<Output<String>> maxSizeResource() {
        return Optional.ofNullable(this.maxSizeResource);
    }

    @Import(name="minSize")
    private @Nullable Output<String> minSize;

    public Optional<Output<String>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    @Import(name="minSizeResource")
    private @Nullable Output<String> minSizeResource;

    public Optional<Output<String>> minSizeResource() {
        return Optional.ofNullable(this.minSizeResource);
    }

    @Import(name="policyOverrideJson")
    private @Nullable Output<String> policyOverrideJson;

    public Optional<Output<String>> policyOverrideJson() {
        return Optional.ofNullable(this.policyOverrideJson);
    }

    private DeploymentElasticsearchHotAutoscalingArgs() {}

    private DeploymentElasticsearchHotAutoscalingArgs(DeploymentElasticsearchHotAutoscalingArgs $) {
        this.maxSize = $.maxSize;
        this.maxSizeResource = $.maxSizeResource;
        this.minSize = $.minSize;
        this.minSizeResource = $.minSizeResource;
        this.policyOverrideJson = $.policyOverrideJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchHotAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchHotAutoscalingArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchHotAutoscalingArgs();
        }

        public Builder(DeploymentElasticsearchHotAutoscalingArgs defaults) {
            $ = new DeploymentElasticsearchHotAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxSize(@Nullable Output<String> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(String maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder maxSizeResource(@Nullable Output<String> maxSizeResource) {
            $.maxSizeResource = maxSizeResource;
            return this;
        }

        public Builder maxSizeResource(String maxSizeResource) {
            return maxSizeResource(Output.of(maxSizeResource));
        }

        public Builder minSize(@Nullable Output<String> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(String minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder minSizeResource(@Nullable Output<String> minSizeResource) {
            $.minSizeResource = minSizeResource;
            return this;
        }

        public Builder minSizeResource(String minSizeResource) {
            return minSizeResource(Output.of(minSizeResource));
        }

        public Builder policyOverrideJson(@Nullable Output<String> policyOverrideJson) {
            $.policyOverrideJson = policyOverrideJson;
            return this;
        }

        public Builder policyOverrideJson(String policyOverrideJson) {
            return policyOverrideJson(Output.of(policyOverrideJson));
        }

        public DeploymentElasticsearchHotAutoscalingArgs build() {
            return $;
        }
    }

}
