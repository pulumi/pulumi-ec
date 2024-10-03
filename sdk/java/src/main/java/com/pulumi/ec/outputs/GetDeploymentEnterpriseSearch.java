// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentEnterpriseSearchTopology;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentEnterpriseSearch {
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    private String elasticsearchClusterRefId;
    /**
     * @return Enterprise Search resource health status.
     * 
     */
    private Boolean healthy;
    /**
     * @return HTTP endpoint for the Enterprise Search resource.
     * 
     */
    private String httpEndpoint;
    /**
     * @return HTTPS endpoint for the Enterprise Search resource.
     * 
     */
    private String httpsEndpoint;
    /**
     * @return A locally-unique friendly alias for this Enterprise Search resource.
     * 
     */
    private String refId;
    /**
     * @return The resource unique identifier.
     * 
     */
    private String resourceId;
    /**
     * @return Enterprise Search resource status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    private String status;
    /**
     * @return Node topology element definition.
     * 
     */
    private List<GetDeploymentEnterpriseSearchTopology> topologies;
    /**
     * @return Elastic stack version.
     * 
     */
    private String version;

    private GetDeploymentEnterpriseSearch() {}
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    public String elasticsearchClusterRefId() {
        return this.elasticsearchClusterRefId;
    }
    /**
     * @return Enterprise Search resource health status.
     * 
     */
    public Boolean healthy() {
        return this.healthy;
    }
    /**
     * @return HTTP endpoint for the Enterprise Search resource.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * @return HTTPS endpoint for the Enterprise Search resource.
     * 
     */
    public String httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * @return A locally-unique friendly alias for this Enterprise Search resource.
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
     * @return Enterprise Search resource status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Node topology element definition.
     * 
     */
    public List<GetDeploymentEnterpriseSearchTopology> topologies() {
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

    public static Builder builder(GetDeploymentEnterpriseSearch defaults) {
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
        private List<GetDeploymentEnterpriseSearchTopology> topologies;
        private String version;
        public Builder() {}
        public Builder(GetDeploymentEnterpriseSearch defaults) {
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
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "elasticsearchClusterRefId");
            }
            this.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }
        @CustomType.Setter
        public Builder healthy(Boolean healthy) {
            if (healthy == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "healthy");
            }
            this.healthy = healthy;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(String httpEndpoint) {
            if (httpEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "httpEndpoint");
            }
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder httpsEndpoint(String httpsEndpoint) {
            if (httpsEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "httpsEndpoint");
            }
            this.httpsEndpoint = httpsEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder refId(String refId) {
            if (refId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "refId");
            }
            this.refId = refId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            if (resourceId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "resourceId");
            }
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder topologies(List<GetDeploymentEnterpriseSearchTopology> topologies) {
            if (topologies == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "topologies");
            }
            this.topologies = topologies;
            return this;
        }
        public Builder topologies(GetDeploymentEnterpriseSearchTopology... topologies) {
            return topologies(List.of(topologies));
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDeploymentEnterpriseSearch", "version");
            }
            this.version = version;
            return this;
        }
        public GetDeploymentEnterpriseSearch build() {
            final var _resultValue = new GetDeploymentEnterpriseSearch();
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