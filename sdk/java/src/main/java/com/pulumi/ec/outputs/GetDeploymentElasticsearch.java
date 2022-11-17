// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentElasticsearchTopology;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentElasticsearch {
    private String autoscale;
    private String cloudId;
    /**
     * @return Overall health status of the deployment.
     * 
     */
    private Boolean healthy;
    private String httpEndpoint;
    private String httpsEndpoint;
    private String refId;
    private String resourceId;
    private String status;
    private List<GetDeploymentElasticsearchTopology> topologies;
    private String version;

    private GetDeploymentElasticsearch() {}
    public String autoscale() {
        return this.autoscale;
    }
    public String cloudId() {
        return this.cloudId;
    }
    /**
     * @return Overall health status of the deployment.
     * 
     */
    public Boolean healthy() {
        return this.healthy;
    }
    public String httpEndpoint() {
        return this.httpEndpoint;
    }
    public String httpsEndpoint() {
        return this.httpsEndpoint;
    }
    public String refId() {
        return this.refId;
    }
    public String resourceId() {
        return this.resourceId;
    }
    public String status() {
        return this.status;
    }
    public List<GetDeploymentElasticsearchTopology> topologies() {
        return this.topologies;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentElasticsearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoscale;
        private String cloudId;
        private Boolean healthy;
        private String httpEndpoint;
        private String httpsEndpoint;
        private String refId;
        private String resourceId;
        private String status;
        private List<GetDeploymentElasticsearchTopology> topologies;
        private String version;
        public Builder() {}
        public Builder(GetDeploymentElasticsearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscale = defaults.autoscale;
    	      this.cloudId = defaults.cloudId;
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
        public Builder autoscale(String autoscale) {
            this.autoscale = Objects.requireNonNull(autoscale);
            return this;
        }
        @CustomType.Setter
        public Builder cloudId(String cloudId) {
            this.cloudId = Objects.requireNonNull(cloudId);
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
        public Builder topologies(List<GetDeploymentElasticsearchTopology> topologies) {
            this.topologies = Objects.requireNonNull(topologies);
            return this;
        }
        public Builder topologies(GetDeploymentElasticsearchTopology... topologies) {
            return topologies(List.of(topologies));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDeploymentElasticsearch build() {
            final var o = new GetDeploymentElasticsearch();
            o.autoscale = autoscale;
            o.cloudId = cloudId;
            o.healthy = healthy;
            o.httpEndpoint = httpEndpoint;
            o.httpsEndpoint = httpsEndpoint;
            o.refId = refId;
            o.resourceId = resourceId;
            o.status = status;
            o.topologies = topologies;
            o.version = version;
            return o;
        }
    }
}
