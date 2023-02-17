// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentApmTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentApmTopologyArgs Empty = new DeploymentApmTopologyArgs();

    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

    /**
     * @return Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    public Optional<Output<String>> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }

    /**
     * Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
     * 
     */
    @Import(name="sizeResource")
    private @Nullable Output<String> sizeResource;

    /**
     * @return Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
     * 
     */
    public Optional<Output<String>> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }

    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     * 
     */
    @Import(name="zoneCount")
    private @Nullable Output<Integer> zoneCount;

    /**
     * @return Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     * 
     */
    public Optional<Output<Integer>> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    private DeploymentApmTopologyArgs() {}

    private DeploymentApmTopologyArgs(DeploymentApmTopologyArgs $) {
        this.instanceConfigurationId = $.instanceConfigurationId;
        this.size = $.size;
        this.sizeResource = $.sizeResource;
        this.zoneCount = $.zoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentApmTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentApmTopologyArgs $;

        public Builder() {
            $ = new DeploymentApmTopologyArgs();
        }

        public Builder(DeploymentApmTopologyArgs defaults) {
            $ = new DeploymentApmTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceConfigurationId Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        /**
         * @param instanceConfigurationId Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
         * 
         * @return builder
         * 
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            return instanceConfigurationId(Output.of(instanceConfigurationId));
        }

        /**
         * @param size Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param sizeResource Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sizeResource(@Nullable Output<String> sizeResource) {
            $.sizeResource = sizeResource;
            return this;
        }

        /**
         * @param sizeResource Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sizeResource(String sizeResource) {
            return sizeResource(Output.of(sizeResource));
        }

        /**
         * @param zoneCount Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
         * 
         * @return builder
         * 
         */
        public Builder zoneCount(@Nullable Output<Integer> zoneCount) {
            $.zoneCount = zoneCount;
            return this;
        }

        /**
         * @param zoneCount Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
         * 
         * @return builder
         * 
         */
        public Builder zoneCount(Integer zoneCount) {
            return zoneCount(Output.of(zoneCount));
        }

        public DeploymentApmTopologyArgs build() {
            return $;
        }
    }

}