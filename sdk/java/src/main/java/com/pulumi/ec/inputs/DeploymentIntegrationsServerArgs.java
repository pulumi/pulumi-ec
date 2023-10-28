// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentIntegrationsServerConfigArgs;
import com.pulumi.ec.inputs.DeploymentIntegrationsServerEndpointsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentIntegrationsServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentIntegrationsServerArgs Empty = new DeploymentIntegrationsServerArgs();

    /**
     * Optionally define the Integrations Server configuration options for the IntegrationsServer Server
     * 
     */
    @Import(name="config")
    private @Nullable Output<DeploymentIntegrationsServerConfigArgs> config;

    /**
     * @return Optionally define the Integrations Server configuration options for the IntegrationsServer Server
     * 
     */
    public Optional<Output<DeploymentIntegrationsServerConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    @Import(name="elasticsearchClusterRefId")
    private @Nullable Output<String> elasticsearchClusterRefId;

    public Optional<Output<String>> elasticsearchClusterRefId() {
        return Optional.ofNullable(this.elasticsearchClusterRefId);
    }

    /**
     * URLs for the accessing the Fleet and APM API&#39;s within this Integrations Server resource.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<DeploymentIntegrationsServerEndpointsArgs> endpoints;

    /**
     * @return URLs for the accessing the Fleet and APM API&#39;s within this Integrations Server resource.
     * 
     */
    public Optional<Output<DeploymentIntegrationsServerEndpointsArgs>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    @Import(name="httpEndpoint")
    private @Nullable Output<String> httpEndpoint;

    public Optional<Output<String>> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    @Import(name="httpsEndpoint")
    private @Nullable Output<String> httpsEndpoint;

    public Optional<Output<String>> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }

    @Import(name="instanceConfigurationId")
    private @Nullable Output<String> instanceConfigurationId;

    public Optional<Output<String>> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }

    @Import(name="refId")
    private @Nullable Output<String> refId;

    public Optional<Output<String>> refId() {
        return Optional.ofNullable(this.refId);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
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

    private DeploymentIntegrationsServerArgs() {}

    private DeploymentIntegrationsServerArgs(DeploymentIntegrationsServerArgs $) {
        this.config = $.config;
        this.elasticsearchClusterRefId = $.elasticsearchClusterRefId;
        this.endpoints = $.endpoints;
        this.httpEndpoint = $.httpEndpoint;
        this.httpsEndpoint = $.httpsEndpoint;
        this.instanceConfigurationId = $.instanceConfigurationId;
        this.refId = $.refId;
        this.region = $.region;
        this.resourceId = $.resourceId;
        this.size = $.size;
        this.sizeResource = $.sizeResource;
        this.zoneCount = $.zoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentIntegrationsServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentIntegrationsServerArgs $;

        public Builder() {
            $ = new DeploymentIntegrationsServerArgs();
        }

        public Builder(DeploymentIntegrationsServerArgs defaults) {
            $ = new DeploymentIntegrationsServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Optionally define the Integrations Server configuration options for the IntegrationsServer Server
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<DeploymentIntegrationsServerConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Optionally define the Integrations Server configuration options for the IntegrationsServer Server
         * 
         * @return builder
         * 
         */
        public Builder config(DeploymentIntegrationsServerConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder elasticsearchClusterRefId(@Nullable Output<String> elasticsearchClusterRefId) {
            $.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }

        public Builder elasticsearchClusterRefId(String elasticsearchClusterRefId) {
            return elasticsearchClusterRefId(Output.of(elasticsearchClusterRefId));
        }

        /**
         * @param endpoints URLs for the accessing the Fleet and APM API&#39;s within this Integrations Server resource.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<DeploymentIntegrationsServerEndpointsArgs> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints URLs for the accessing the Fleet and APM API&#39;s within this Integrations Server resource.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(DeploymentIntegrationsServerEndpointsArgs endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder httpEndpoint(String httpEndpoint) {
            return httpEndpoint(Output.of(httpEndpoint));
        }

        public Builder httpsEndpoint(@Nullable Output<String> httpsEndpoint) {
            $.httpsEndpoint = httpsEndpoint;
            return this;
        }

        public Builder httpsEndpoint(String httpsEndpoint) {
            return httpsEndpoint(Output.of(httpsEndpoint));
        }

        public Builder instanceConfigurationId(@Nullable Output<String> instanceConfigurationId) {
            $.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        public Builder instanceConfigurationId(String instanceConfigurationId) {
            return instanceConfigurationId(Output.of(instanceConfigurationId));
        }

        public Builder refId(@Nullable Output<String> refId) {
            $.refId = refId;
            return this;
        }

        public Builder refId(String refId) {
            return refId(Output.of(refId));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
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

        public DeploymentIntegrationsServerArgs build() {
            return $;
        }
    }

}
