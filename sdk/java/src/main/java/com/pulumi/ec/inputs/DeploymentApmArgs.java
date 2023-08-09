// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentApmConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentApmArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentApmArgs Empty = new DeploymentApmArgs();

    /**
     * Optionally define the Apm configuration options for the APM Server
     * 
     */
    @Import(name="config")
    private @Nullable Output<DeploymentApmConfigArgs> config;

    /**
     * @return Optionally define the Apm configuration options for the APM Server
     * 
     */
    public Optional<Output<DeploymentApmConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    @Import(name="elasticsearchClusterRefId")
    private @Nullable Output<String> elasticsearchClusterRefId;

    public Optional<Output<String>> elasticsearchClusterRefId() {
        return Optional.ofNullable(this.elasticsearchClusterRefId);
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

    /**
     * Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `&#34;ece-region&#34;.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `&#34;ece-region&#34;.
     * 
     */
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

    private DeploymentApmArgs() {}

    private DeploymentApmArgs(DeploymentApmArgs $) {
        this.config = $.config;
        this.elasticsearchClusterRefId = $.elasticsearchClusterRefId;
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
    public static Builder builder(DeploymentApmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentApmArgs $;

        public Builder() {
            $ = new DeploymentApmArgs();
        }

        public Builder(DeploymentApmArgs defaults) {
            $ = new DeploymentApmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Optionally define the Apm configuration options for the APM Server
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<DeploymentApmConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Optionally define the Apm configuration options for the APM Server
         * 
         * @return builder
         * 
         */
        public Builder config(DeploymentApmConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder elasticsearchClusterRefId(@Nullable Output<String> elasticsearchClusterRefId) {
            $.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }

        public Builder elasticsearchClusterRefId(String elasticsearchClusterRefId) {
            return elasticsearchClusterRefId(Output.of(elasticsearchClusterRefId));
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

        /**
         * @param region Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `&#34;ece-region&#34;.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE) installations, set to `&#34;ece-region&#34;.
         * 
         * @return builder
         * 
         */
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

        public DeploymentApmArgs build() {
            return $;
        }
    }

}
