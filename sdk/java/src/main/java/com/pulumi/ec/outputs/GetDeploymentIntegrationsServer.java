// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentIntegrationsServerTopology;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentIntegrationsServer {
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    private String elasticsearchClusterRefId;
    /**
     * @return Resource kind health status.
     * 
     */
    private Boolean healthy;
    /**
     * @return HTTP endpoint for the resource kind.
     * 
     */
    private String httpEndpoint;
    /**
     * @return HTTPS endpoint for the resource kind.
     * 
     */
    private String httpsEndpoint;
    /**
     * @return A locally-unique friendly alias for this Integrations Server resource.
     * 
     */
    private String refId;
    /**
     * @return The resource unique identifier.
     * 
     */
    private String resourceId;
    /**
     * @return Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    private String status;
    /**
     * @return Node topology element definition.
     * 
     */
    private List<GetDeploymentIntegrationsServerTopology> topologies;
    /**
     * @return Elastic stack version.
     * 
     */
    private String version;

    private GetDeploymentIntegrationsServer() {}
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    public String elasticsearchClusterRefId() {
        return this.elasticsearchClusterRefId;
    }
    /**
     * @return Resource kind health status.
     * 
     */
    public Boolean healthy() {
        return this.healthy;
    }
    /**
     * @return HTTP endpoint for the resource kind.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * @return HTTPS endpoint for the resource kind.
     * 
     */
    public String httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * @return A locally-unique friendly alias for this Integrations Server resource.
     * 
     */
    public String refId() {
        return this.refId;
    }
    /**
     * @return The resource unique identifier.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Node topology element definition.
     * 
     */
    public List<GetDeploymentIntegrationsServerTopology> topologies() {
        return this.topologies;
    }
    /**
     * @return Elastic stack version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentIntegrationsServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String elasticsearchClusterRefId;
        private Boolean healthy;
        private String httpEndpoint;
        private String httpsEndpoint;
        private String refId;
        private String resourceId;
        private String status;
        private List<GetDeploymentIntegrationsServerTopology> topologies;
        private String version;
        public Builder() {}
        public Builder(GetDeploymentIntegrationsServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticsearchClusterRefId = defaults.elasticsearchClusterRefId;
    	      this.healthy = defaults.healthy;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpsEndpoint = defaults.httpsEndpoint;
    	      this.refId = defaults.refId;
    	      this.resourceId = defaults.resourceId;
    	      this.status = defaults.status;
    	      this.topologies = defaults.topologies;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder elasticsearchClusterRefId(String elasticsearchClusterRefId) {
            if (elasticsearchClusterRefId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "elasticsearchClusterRefId");
            }
            this.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }
        @CustomType.Setter
        public Builder healthy(Boolean healthy) {
            if (healthy == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "healthy");
            }
            this.healthy = healthy;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(String httpEndpoint) {
            if (httpEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "httpEndpoint");
            }
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpsEndpoint(String httpsEndpoint) {
            if (httpsEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "httpsEndpoint");
            }
            this.httpsEndpoint = httpsEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder refId(String refId) {
            if (refId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "refId");
            }
            this.refId = refId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            if (resourceId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "resourceId");
            }
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder topologies(List<GetDeploymentIntegrationsServerTopology> topologies) {
            if (topologies == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "topologies");
            }
            this.topologies = topologies;
            return this;
        }
        public Builder topologies(GetDeploymentIntegrationsServerTopology... topologies) {
            return topologies(List.of(topologies));
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDeploymentIntegrationsServer", "version");
            }
            this.version = version;
            return this;
        }
        public GetDeploymentIntegrationsServer build() {
            final var _resultValue = new GetDeploymentIntegrationsServer();
            _resultValue.elasticsearchClusterRefId = elasticsearchClusterRefId;
            _resultValue.healthy = healthy;
            _resultValue.httpEndpoint = httpEndpoint;
            _resultValue.httpsEndpoint = httpsEndpoint;
            _resultValue.refId = refId;
            _resultValue.resourceId = resourceId;
            _resultValue.status = status;
            _resultValue.topologies = topologies;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
