// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchTopologyAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchTopologyAutoscalingArgs Empty = new DeploymentElasticsearchTopologyAutoscalingArgs();

    /**
     * Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<String> maxSize;

    /**
     * @return Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
     * 
     */
    public Optional<Output<String>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * Defines the resource type the scale up will use (Defaults to `&#34;memory&#34;`).
     * 
     */
    @Import(name="maxSizeResource")
    private @Nullable Output<String> maxSizeResource;

    /**
     * @return Defines the resource type the scale up will use (Defaults to `&#34;memory&#34;`).
     * 
     */
    public Optional<Output<String>> maxSizeResource() {
        return Optional.ofNullable(this.maxSizeResource);
    }

    /**
     * Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<String> minSize;

    /**
     * @return Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
     * 
     */
    public Optional<Output<String>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Defines the resource type the scale down will use (Defaults to `&#34;memory&#34;`).
     * 
     */
    @Import(name="minSizeResource")
    private @Nullable Output<String> minSizeResource;

    /**
     * @return Defines the resource type the scale down will use (Defaults to `&#34;memory&#34;`).
     * 
     */
    public Optional<Output<String>> minSizeResource() {
        return Optional.ofNullable(this.minSizeResource);
    }

    @Import(name="policyOverrideJson")
    private @Nullable Output<String> policyOverrideJson;

    public Optional<Output<String>> policyOverrideJson() {
        return Optional.ofNullable(this.policyOverrideJson);
    }

    private DeploymentElasticsearchTopologyAutoscalingArgs() {}

    private DeploymentElasticsearchTopologyAutoscalingArgs(DeploymentElasticsearchTopologyAutoscalingArgs $) {
        this.maxSize = $.maxSize;
        this.maxSizeResource = $.maxSizeResource;
        this.minSize = $.minSize;
        this.minSizeResource = $.minSizeResource;
        this.policyOverrideJson = $.policyOverrideJson;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchTopologyAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchTopologyAutoscalingArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchTopologyAutoscalingArgs();
        }

        public Builder(DeploymentElasticsearchTopologyAutoscalingArgs defaults) {
            $ = new DeploymentElasticsearchTopologyAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxSize Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<String> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(String maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param maxSizeResource Defines the resource type the scale up will use (Defaults to `&#34;memory&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder maxSizeResource(@Nullable Output<String> maxSizeResource) {
            $.maxSizeResource = maxSizeResource;
            return this;
        }

        /**
         * @param maxSizeResource Defines the resource type the scale up will use (Defaults to `&#34;memory&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder maxSizeResource(String maxSizeResource) {
            return maxSizeResource(Output.of(maxSizeResource));
        }

        /**
         * @param minSize Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<String> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
         * 
         * @return builder
         * 
         */
        public Builder minSize(String minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param minSizeResource Defines the resource type the scale down will use (Defaults to `&#34;memory&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder minSizeResource(@Nullable Output<String> minSizeResource) {
            $.minSizeResource = minSizeResource;
            return this;
        }

        /**
         * @param minSizeResource Defines the resource type the scale down will use (Defaults to `&#34;memory&#34;`).
         * 
         * @return builder
         * 
         */
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

        public DeploymentElasticsearchTopologyAutoscalingArgs build() {
            return $;
        }
    }

}