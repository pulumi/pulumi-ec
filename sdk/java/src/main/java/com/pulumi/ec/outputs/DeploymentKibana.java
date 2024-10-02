// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.DeploymentKibanaConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentKibana {
    /**
     * @return Optionally define the Kibana configuration options for the Kibana Server
     * 
     */
    private @Nullable DeploymentKibanaConfig config;
    private @Nullable String elasticsearchClusterRefId;
    private @Nullable String httpEndpoint;
    private @Nullable String httpsEndpoint;
    private @Nullable String instanceConfigurationId;
    private @Nullable Integer instanceConfigurationVersion;
    private @Nullable String latestInstanceConfigurationId;
    private @Nullable Integer latestInstanceConfigurationVersion;
    private @Nullable String refId;
    private @Nullable String region;
    private @Nullable String resourceId;
    private @Nullable String size;
    /**
     * @return Optional size type, defaults to &#34;memory&#34;.
     * 
     */
    private @Nullable String sizeResource;
    private @Nullable Integer zoneCount;

    private DeploymentKibana() {}
    /**
     * @return Optionally define the Kibana configuration options for the Kibana Server
     * 
     */
    public Optional<DeploymentKibanaConfig> config() {
        return Optional.ofNullable(this.config);
    }
    public Optional<String> elasticsearchClusterRefId() {
        return Optional.ofNullable(this.elasticsearchClusterRefId);
    }
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    public Optional<String> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }
    public Optional<String> instanceConfigurationId() {
        return Optional.ofNullable(this.instanceConfigurationId);
    }
    public Optional<Integer> instanceConfigurationVersion() {
        return Optional.ofNullable(this.instanceConfigurationVersion);
    }
    public Optional<String> latestInstanceConfigurationId() {
        return Optional.ofNullable(this.latestInstanceConfigurationId);
    }
    public Optional<Integer> latestInstanceConfigurationVersion() {
        return Optional.ofNullable(this.latestInstanceConfigurationVersion);
    }
    public Optional<String> refId() {
        return Optional.ofNullable(this.refId);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return Optional size type, defaults to &#34;memory&#34;.
     * 
     */
    public Optional<String> sizeResource() {
        return Optional.ofNullable(this.sizeResource);
    }
    public Optional<Integer> zoneCount() {
        return Optional.ofNullable(this.zoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentKibana defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeploymentKibanaConfig config;
        private @Nullable String elasticsearchClusterRefId;
        private @Nullable String httpEndpoint;
        private @Nullable String httpsEndpoint;
        private @Nullable String instanceConfigurationId;
        private @Nullable Integer instanceConfigurationVersion;
        private @Nullable String latestInstanceConfigurationId;
        private @Nullable Integer latestInstanceConfigurationVersion;
        private @Nullable String refId;
        private @Nullable String region;
        private @Nullable String resourceId;
        private @Nullable String size;
        private @Nullable String sizeResource;
        private @Nullable Integer zoneCount;
        public Builder() {}
        public Builder(DeploymentKibana defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.elasticsearchClusterRefId = defaults.elasticsearchClusterRefId;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpsEndpoint = defaults.httpsEndpoint;
    	      this.instanceConfigurationId = defaults.instanceConfigurationId;
    	      this.instanceConfigurationVersion = defaults.instanceConfigurationVersion;
    	      this.latestInstanceConfigurationId = defaults.latestInstanceConfigurationId;
    	      this.latestInstanceConfigurationVersion = defaults.latestInstanceConfigurationVersion;
    	      this.refId = defaults.refId;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.size = defaults.size;
    	      this.sizeResource = defaults.sizeResource;
    	      this.zoneCount = defaults.zoneCount;
        }

        @CustomType.Setter
        public Builder config(@Nullable DeploymentKibanaConfig config) {

            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder elasticsearchClusterRefId(@Nullable String elasticsearchClusterRefId) {

            this.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(@Nullable String httpEndpoint) {

            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpsEndpoint(@Nullable String httpsEndpoint) {

            this.httpsEndpoint = httpsEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder instanceConfigurationId(@Nullable String instanceConfigurationId) {

            this.instanceConfigurationId = instanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceConfigurationVersion(@Nullable Integer instanceConfigurationVersion) {

            this.instanceConfigurationVersion = instanceConfigurationVersion;
            return this;
        }
        @CustomType.Setter
        public Builder latestInstanceConfigurationId(@Nullable String latestInstanceConfigurationId) {

            this.latestInstanceConfigurationId = latestInstanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder latestInstanceConfigurationVersion(@Nullable Integer latestInstanceConfigurationVersion) {

            this.latestInstanceConfigurationVersion = latestInstanceConfigurationVersion;
            return this;
        }
        @CustomType.Setter
        public Builder refId(@Nullable String refId) {

            this.refId = refId;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(@Nullable String resourceId) {

            this.resourceId = resourceId;
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
        public DeploymentKibana build() {
            final var _resultValue = new DeploymentKibana();
            _resultValue.config = config;
            _resultValue.elasticsearchClusterRefId = elasticsearchClusterRefId;
            _resultValue.httpEndpoint = httpEndpoint;
            _resultValue.httpsEndpoint = httpsEndpoint;
            _resultValue.instanceConfigurationId = instanceConfigurationId;
            _resultValue.instanceConfigurationVersion = instanceConfigurationVersion;
            _resultValue.latestInstanceConfigurationId = latestInstanceConfigurationId;
            _resultValue.latestInstanceConfigurationVersion = latestInstanceConfigurationVersion;
            _resultValue.refId = refId;
            _resultValue.region = region;
            _resultValue.resourceId = resourceId;
            _resultValue.size = size;
            _resultValue.sizeResource = sizeResource;
            _resultValue.zoneCount = zoneCount;
            return _resultValue;
        }
    }
}