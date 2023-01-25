// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.DeploymentIntegrationsServerConfig;
import com.pulumi.ec.outputs.DeploymentIntegrationsServerTopology;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentIntegrationsServer {
    private @Nullable String apmHttpsEndpoint;
    /**
     * @return Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    private @Nullable DeploymentIntegrationsServerConfig config;
    /**
     * @return This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     * 
     */
    private @Nullable String elasticsearchClusterRefId;
    private @Nullable String fleetHttpsEndpoint;
    private @Nullable String httpEndpoint;
    private @Nullable String httpsEndpoint;
    /**
     * @return Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     * 
     */
    private @Nullable String refId;
    /**
     * @return Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    private @Nullable String region;
    private @Nullable String resourceId;
    /**
     * @return Can be set multiple times to compose complex topologies.
     * 
     */
    private @Nullable DeploymentIntegrationsServerTopology topology;

    private DeploymentIntegrationsServer() {}
    public Optional<String> apmHttpsEndpoint() {
        return Optional.ofNullable(this.apmHttpsEndpoint);
    }
    /**
     * @return Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    public Optional<DeploymentIntegrationsServerConfig> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     * 
     */
    public Optional<String> elasticsearchClusterRefId() {
        return Optional.ofNullable(this.elasticsearchClusterRefId);
    }
    public Optional<String> fleetHttpsEndpoint() {
        return Optional.ofNullable(this.fleetHttpsEndpoint);
    }
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    public Optional<String> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }
    /**
     * @return Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     * 
     */
    public Optional<String> refId() {
        return Optional.ofNullable(this.refId);
    }
    /**
     * @return Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return Can be set multiple times to compose complex topologies.
     * 
     */
    public Optional<DeploymentIntegrationsServerTopology> topology() {
        return Optional.ofNullable(this.topology);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentIntegrationsServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apmHttpsEndpoint;
        private @Nullable DeploymentIntegrationsServerConfig config;
        private @Nullable String elasticsearchClusterRefId;
        private @Nullable String fleetHttpsEndpoint;
        private @Nullable String httpEndpoint;
        private @Nullable String httpsEndpoint;
        private @Nullable String refId;
        private @Nullable String region;
        private @Nullable String resourceId;
        private @Nullable DeploymentIntegrationsServerTopology topology;
        public Builder() {}
        public Builder(DeploymentIntegrationsServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmHttpsEndpoint = defaults.apmHttpsEndpoint;
    	      this.config = defaults.config;
    	      this.elasticsearchClusterRefId = defaults.elasticsearchClusterRefId;
    	      this.fleetHttpsEndpoint = defaults.fleetHttpsEndpoint;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpsEndpoint = defaults.httpsEndpoint;
    	      this.refId = defaults.refId;
    	      this.region = defaults.region;
    	      this.resourceId = defaults.resourceId;
    	      this.topology = defaults.topology;
        }

        @CustomType.Setter
        public Builder apmHttpsEndpoint(@Nullable String apmHttpsEndpoint) {
            this.apmHttpsEndpoint = apmHttpsEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder config(@Nullable DeploymentIntegrationsServerConfig config) {
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder elasticsearchClusterRefId(@Nullable String elasticsearchClusterRefId) {
            this.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }
        @CustomType.Setter
        public Builder fleetHttpsEndpoint(@Nullable String fleetHttpsEndpoint) {
            this.fleetHttpsEndpoint = fleetHttpsEndpoint;
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
        public Builder topology(@Nullable DeploymentIntegrationsServerTopology topology) {
            this.topology = topology;
            return this;
        }
        public DeploymentIntegrationsServer build() {
            final var o = new DeploymentIntegrationsServer();
            o.apmHttpsEndpoint = apmHttpsEndpoint;
            o.config = config;
            o.elasticsearchClusterRefId = elasticsearchClusterRefId;
            o.fleetHttpsEndpoint = fleetHttpsEndpoint;
            o.httpEndpoint = httpEndpoint;
            o.httpsEndpoint = httpsEndpoint;
            o.refId = refId;
            o.region = region;
            o.resourceId = resourceId;
            o.topology = topology;
            return o;
        }
    }
}
