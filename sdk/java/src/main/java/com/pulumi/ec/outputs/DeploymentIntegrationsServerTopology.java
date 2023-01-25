// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentIntegrationsServerTopology {
    /**
     * @return Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    private @Nullable String instanceConfigurationId;
    /**
     * @return Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
     * 
     */
    private @Nullable String size;
    /**
     * @return Type of resource to which the size is assigned. Defaults to `&#34;memory&#34;`.
     * 
     */
    private @Nullable String sizeResource;
    /**
     * @return Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     * 
     */
    private @Nullable Integer zoneCount;

    private DeploymentIntegrationsServerTopology() {}
    /**
     * @return Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    public Optional<String> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }
    /**
     * @return Amount of memory (RAM) per `topology` element in the &#34;&lt;size in GB&gt;g&#34; notation. When omitted, it defaults to the deployment template value.
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
     * @return Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     * 
     */
    public Optional<Integer> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentIntegrationsServerTopology defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceConfigurationId;
        private @Nullable String size;
        private @Nullable String sizeResource;
        private @Nullable Integer zoneCount;
        public Builder() {}
        public Builder(DeploymentIntegrationsServerTopology defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceConfigurationId = defaults.instanceConfigurationId;
    	      this.size = defaults.size;
    	      this.sizeResource = defaults.sizeResource;
    	      this.zoneCount = defaults.zoneCount;
        }

        @CustomType.Setter
        public Builder instanceConfigurationId(@Nullable String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
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
        public DeploymentIntegrationsServerTopology build() {
            final var o = new DeploymentIntegrationsServerTopology();
            o.instanceConfigurationId = instanceConfigurationId;
            o.size = size;
            o.sizeResource = sizeResource;
            o.zoneCount = zoneCount;
            return o;
        }
    }
}
