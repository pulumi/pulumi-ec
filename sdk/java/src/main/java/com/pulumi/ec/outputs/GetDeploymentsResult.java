// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentsApm;
import com.pulumi.ec.outputs.GetDeploymentsDeployment;
import com.pulumi.ec.outputs.GetDeploymentsElasticsearch;
import com.pulumi.ec.outputs.GetDeploymentsEnterpriseSearch;
import com.pulumi.ec.outputs.GetDeploymentsIntegrationsServer;
import com.pulumi.ec.outputs.GetDeploymentsKibana;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeploymentsResult {
    /**
     * @return Filter by APM resource kind status or configuration.
     * 
     */
    private @Nullable List<GetDeploymentsApm> apms;
    /**
     * @return Filter the result set by the ID of the deployment template the deployment is based off.
     * 
     */
    private @Nullable String deploymentTemplateId;
    /**
     * @return List of deployments which match the specified query.
     * 
     */
    private List<GetDeploymentsDeployment> deployments;
    /**
     * @return Filter by Elasticsearch resource kind status or configuration.
     * 
     */
    private @Nullable List<GetDeploymentsElasticsearch> elasticsearches;
    /**
     * @return Filter by Enterprise Search resource kind status or configuration.
     * 
     */
    private @Nullable List<GetDeploymentsEnterpriseSearch> enterpriseSearches;
    /**
     * @return Filter the result set by their health status.
     * 
     */
    private @Nullable String healthy;
    /**
     * @return Unique identifier of this data source.
     * 
     */
    private String id;
    /**
     * @return Filter by Integrations Server resource kind status or configuration.
     * 
     */
    private @Nullable List<GetDeploymentsIntegrationsServer> integrationsServers;
    /**
     * @return Filter by Kibana resource kind status or configuration.
     * 
     */
    private @Nullable List<GetDeploymentsKibana> kibanas;
    /**
     * @return Prefix to filter the returned deployment list by.
     * 
     */
    private @Nullable String namePrefix;
    /**
     * @return The number of deployments actually returned.
     * 
     */
    private Integer returnCount;
    /**
     * @return The maximum number of deployments to return. Defaults to `100`.
     * 
     */
    private @Nullable Integer size;
    /**
     * @return Filter the result set by their assigned tags.
     * 
     */
    private @Nullable Map<String,String> tags;

    private GetDeploymentsResult() {}
    /**
     * @return Filter by APM resource kind status or configuration.
     * 
     */
    public List<GetDeploymentsApm> apms() {
        return this.apms == null ? List.of() : this.apms;
    }
    /**
     * @return Filter the result set by the ID of the deployment template the deployment is based off.
     * 
     */
    public Optional<String> deploymentTemplateId() {
        return Optional.ofNullable(this.deploymentTemplateId);
    }
    /**
     * @return List of deployments which match the specified query.
     * 
     */
    public List<GetDeploymentsDeployment> deployments() {
        return this.deployments;
    }
    /**
     * @return Filter by Elasticsearch resource kind status or configuration.
     * 
     */
    public List<GetDeploymentsElasticsearch> elasticsearches() {
        return this.elasticsearches == null ? List.of() : this.elasticsearches;
    }
    /**
     * @return Filter by Enterprise Search resource kind status or configuration.
     * 
     */
    public List<GetDeploymentsEnterpriseSearch> enterpriseSearches() {
        return this.enterpriseSearches == null ? List.of() : this.enterpriseSearches;
    }
    /**
     * @return Filter the result set by their health status.
     * 
     */
    public Optional<String> healthy() {
        return Optional.ofNullable(this.healthy);
    }
    /**
     * @return Unique identifier of this data source.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Filter by Integrations Server resource kind status or configuration.
     * 
     */
    public List<GetDeploymentsIntegrationsServer> integrationsServers() {
        return this.integrationsServers == null ? List.of() : this.integrationsServers;
    }
    /**
     * @return Filter by Kibana resource kind status or configuration.
     * 
     */
    public List<GetDeploymentsKibana> kibanas() {
        return this.kibanas == null ? List.of() : this.kibanas;
    }
    /**
     * @return Prefix to filter the returned deployment list by.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    /**
     * @return The number of deployments actually returned.
     * 
     */
    public Integer returnCount() {
        return this.returnCount;
    }
    /**
     * @return The maximum number of deployments to return. Defaults to `100`.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return Filter the result set by their assigned tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetDeploymentsApm> apms;
        private @Nullable String deploymentTemplateId;
        private List<GetDeploymentsDeployment> deployments;
        private @Nullable List<GetDeploymentsElasticsearch> elasticsearches;
        private @Nullable List<GetDeploymentsEnterpriseSearch> enterpriseSearches;
        private @Nullable String healthy;
        private String id;
        private @Nullable List<GetDeploymentsIntegrationsServer> integrationsServers;
        private @Nullable List<GetDeploymentsKibana> kibanas;
        private @Nullable String namePrefix;
        private Integer returnCount;
        private @Nullable Integer size;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetDeploymentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apms = defaults.apms;
    	      this.deploymentTemplateId = defaults.deploymentTemplateId;
    	      this.deployments = defaults.deployments;
    	      this.elasticsearches = defaults.elasticsearches;
    	      this.enterpriseSearches = defaults.enterpriseSearches;
    	      this.healthy = defaults.healthy;
    	      this.id = defaults.id;
    	      this.integrationsServers = defaults.integrationsServers;
    	      this.kibanas = defaults.kibanas;
    	      this.namePrefix = defaults.namePrefix;
    	      this.returnCount = defaults.returnCount;
    	      this.size = defaults.size;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder apms(@Nullable List<GetDeploymentsApm> apms) {

            this.apms = apms;
            return this;
        }
        public Builder apms(GetDeploymentsApm... apms) {
            return apms(List.of(apms));
        }
        @CustomType.Setter
        public Builder deploymentTemplateId(@Nullable String deploymentTemplateId) {

            this.deploymentTemplateId = deploymentTemplateId;
            return this;
        }
        @CustomType.Setter
        public Builder deployments(List<GetDeploymentsDeployment> deployments) {
            if (deployments == null) {
              throw new MissingRequiredPropertyException("GetDeploymentsResult", "deployments");
            }
            this.deployments = deployments;
            return this;
        }
        public Builder deployments(GetDeploymentsDeployment... deployments) {
            return deployments(List.of(deployments));
        }
        @CustomType.Setter
        public Builder elasticsearches(@Nullable List<GetDeploymentsElasticsearch> elasticsearches) {

            this.elasticsearches = elasticsearches;
            return this;
        }
        public Builder elasticsearches(GetDeploymentsElasticsearch... elasticsearches) {
            return elasticsearches(List.of(elasticsearches));
        }
        @CustomType.Setter
        public Builder enterpriseSearches(@Nullable List<GetDeploymentsEnterpriseSearch> enterpriseSearches) {

            this.enterpriseSearches = enterpriseSearches;
            return this;
        }
        public Builder enterpriseSearches(GetDeploymentsEnterpriseSearch... enterpriseSearches) {
            return enterpriseSearches(List.of(enterpriseSearches));
        }
        @CustomType.Setter
        public Builder healthy(@Nullable String healthy) {

            this.healthy = healthy;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeploymentsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder integrationsServers(@Nullable List<GetDeploymentsIntegrationsServer> integrationsServers) {

            this.integrationsServers = integrationsServers;
            return this;
        }
        public Builder integrationsServers(GetDeploymentsIntegrationsServer... integrationsServers) {
            return integrationsServers(List.of(integrationsServers));
        }
        @CustomType.Setter
        public Builder kibanas(@Nullable List<GetDeploymentsKibana> kibanas) {

            this.kibanas = kibanas;
            return this;
        }
        public Builder kibanas(GetDeploymentsKibana... kibanas) {
            return kibanas(List.of(kibanas));
        }
        @CustomType.Setter
        public Builder namePrefix(@Nullable String namePrefix) {

            this.namePrefix = namePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder returnCount(Integer returnCount) {
            if (returnCount == null) {
              throw new MissingRequiredPropertyException("GetDeploymentsResult", "returnCount");
            }
            this.returnCount = returnCount;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {

            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public GetDeploymentsResult build() {
            final var _resultValue = new GetDeploymentsResult();
            _resultValue.apms = apms;
            _resultValue.deploymentTemplateId = deploymentTemplateId;
            _resultValue.deployments = deployments;
            _resultValue.elasticsearches = elasticsearches;
            _resultValue.enterpriseSearches = enterpriseSearches;
            _resultValue.healthy = healthy;
            _resultValue.id = id;
            _resultValue.integrationsServers = integrationsServers;
            _resultValue.kibanas = kibanas;
            _resultValue.namePrefix = namePrefix;
            _resultValue.returnCount = returnCount;
            _resultValue.size = size;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
