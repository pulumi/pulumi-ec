// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentKibanaTopology;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentKibana {
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    private String elasticsearchClusterRefId;
    /**
     * @return Kibana resource health status.
     * 
     */
    private Boolean healthy;
    /**
     * @return HTTP endpoint for the Kibana resource.
     * 
     */
    private String httpEndpoint;
    /**
     * @return HTTPS endpoint for the Kibana resource.
     * 
     */
    private String httpsEndpoint;
    /**
     * @return A locally-unique friendly alias for this Kibana resource.
     * 
     */
    private String refId;
    /**
     * @return The resource unique identifier.
     * 
     */
    private String resourceId;
    /**
     * @return Kibana resource status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    private String status;
    /**
     * @return Node topology element definition.
     * 
     */
    private List<GetDeploymentKibanaTopology> topologies;
    /**
     * @return Elastic stack version.
     * 
     */
    private String version;

    private GetDeploymentKibana() {}
    /**
     * @return A locally-unique friendly alias for an Elasticsearch resource in this deployment.
     * 
     */
    public String elasticsearchClusterRefId() {
        return this.elasticsearchClusterRefId;
    }
    /**
     * @return Kibana resource health status.
     * 
     */
    public Boolean healthy() {
        return this.healthy;
    }
    /**
     * @return HTTP endpoint for the Kibana resource.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * @return HTTPS endpoint for the Kibana resource.
     * 
     */
    public String httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * @return A locally-unique friendly alias for this Kibana resource.
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
     * @return Kibana resource status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Node topology element definition.
     * 
     */
    public List<GetDeploymentKibanaTopology> topologies() {
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

    public static Builder builder(GetDeploymentKibana defaults) {
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
        private List<GetDeploymentKibanaTopology> topologies;
        private String version;
        public Builder() {}
        public Builder(GetDeploymentKibana defaults) {
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
            this.elasticsearchClusterRefId = Objects.requireNonNull(elasticsearchClusterRefId);
            return this;
        }
        @CustomType.Setter
        public Builder healthy(Boolean healthy) {
            this.healthy = Objects.requireNonNull(healthy);
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(String httpEndpoint) {
            this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder httpsEndpoint(String httpsEndpoint) {
            this.httpsEndpoint = Objects.requireNonNull(httpsEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder refId(String refId) {
            this.refId = Objects.requireNonNull(refId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder topologies(List<GetDeploymentKibanaTopology> topologies) {
            this.topologies = Objects.requireNonNull(topologies);
            return this;
        }
        public Builder topologies(GetDeploymentKibanaTopology... topologies) {
            return topologies(List.of(topologies));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDeploymentKibana build() {
            final var _resultValue = new GetDeploymentKibana();
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
