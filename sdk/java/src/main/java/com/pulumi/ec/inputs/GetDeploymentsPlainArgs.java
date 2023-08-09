// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.GetDeploymentsApm;
import com.pulumi.ec.inputs.GetDeploymentsElasticsearch;
import com.pulumi.ec.inputs.GetDeploymentsEnterpriseSearch;
import com.pulumi.ec.inputs.GetDeploymentsIntegrationsServer;
import com.pulumi.ec.inputs.GetDeploymentsKibana;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentsPlainArgs Empty = new GetDeploymentsPlainArgs();

    /**
     * Filter by APM resource kind status or configuration.
     * 
     */
    @Import(name="apms")
    private @Nullable List<GetDeploymentsApm> apms;

    /**
     * @return Filter by APM resource kind status or configuration.
     * 
     */
    public Optional<List<GetDeploymentsApm>> apms() {
        return Optional.ofNullable(this.apms);
    }

    /**
     * Filter the result set by the ID of the deployment template the deployment is based off.
     * 
     */
    @Import(name="deploymentTemplateId")
    private @Nullable String deploymentTemplateId;

    /**
     * @return Filter the result set by the ID of the deployment template the deployment is based off.
     * 
     */
    public Optional<String> deploymentTemplateId() {
        return Optional.ofNullable(this.deploymentTemplateId);
    }

    /**
     * Filter by Elasticsearch resource kind status or configuration.
     * 
     */
    @Import(name="elasticsearches")
    private @Nullable List<GetDeploymentsElasticsearch> elasticsearches;

    /**
     * @return Filter by Elasticsearch resource kind status or configuration.
     * 
     */
    public Optional<List<GetDeploymentsElasticsearch>> elasticsearches() {
        return Optional.ofNullable(this.elasticsearches);
    }

    /**
     * Filter by Enterprise Search resource kind status or configuration.
     * 
     */
    @Import(name="enterpriseSearches")
    private @Nullable List<GetDeploymentsEnterpriseSearch> enterpriseSearches;

    /**
     * @return Filter by Enterprise Search resource kind status or configuration.
     * 
     */
    public Optional<List<GetDeploymentsEnterpriseSearch>> enterpriseSearches() {
        return Optional.ofNullable(this.enterpriseSearches);
    }

    /**
     * Filter the result set by their health status.
     * 
     */
    @Import(name="healthy")
    private @Nullable String healthy;

    /**
     * @return Filter the result set by their health status.
     * 
     */
    public Optional<String> healthy() {
        return Optional.ofNullable(this.healthy);
    }

    /**
     * Filter by Integrations Server resource kind status or configuration.
     * 
     */
    @Import(name="integrationsServers")
    private @Nullable List<GetDeploymentsIntegrationsServer> integrationsServers;

    /**
     * @return Filter by Integrations Server resource kind status or configuration.
     * 
     */
    public Optional<List<GetDeploymentsIntegrationsServer>> integrationsServers() {
        return Optional.ofNullable(this.integrationsServers);
    }

    /**
     * Filter by Kibana resource kind status or configuration.
     * 
     */
    @Import(name="kibanas")
    private @Nullable List<GetDeploymentsKibana> kibanas;

    /**
     * @return Filter by Kibana resource kind status or configuration.
     * 
     */
    public Optional<List<GetDeploymentsKibana>> kibanas() {
        return Optional.ofNullable(this.kibanas);
    }

    /**
     * Prefix to filter the returned deployment list by.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return Prefix to filter the returned deployment list by.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The maximum number of deployments to return. Defaults to `100`.
     * 
     */
    @Import(name="size")
    private @Nullable Integer size;

    /**
     * @return The maximum number of deployments to return. Defaults to `100`.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Filter the result set by their assigned tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Filter the result set by their assigned tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDeploymentsPlainArgs() {}

    private GetDeploymentsPlainArgs(GetDeploymentsPlainArgs $) {
        this.apms = $.apms;
        this.deploymentTemplateId = $.deploymentTemplateId;
        this.elasticsearches = $.elasticsearches;
        this.enterpriseSearches = $.enterpriseSearches;
        this.healthy = $.healthy;
        this.integrationsServers = $.integrationsServers;
        this.kibanas = $.kibanas;
        this.namePrefix = $.namePrefix;
        this.size = $.size;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentsPlainArgs $;

        public Builder() {
            $ = new GetDeploymentsPlainArgs();
        }

        public Builder(GetDeploymentsPlainArgs defaults) {
            $ = new GetDeploymentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apms Filter by APM resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder apms(@Nullable List<GetDeploymentsApm> apms) {
            $.apms = apms;
            return this;
        }

        /**
         * @param apms Filter by APM resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder apms(GetDeploymentsApm... apms) {
            return apms(List.of(apms));
        }

        /**
         * @param deploymentTemplateId Filter the result set by the ID of the deployment template the deployment is based off.
         * 
         * @return builder
         * 
         */
        public Builder deploymentTemplateId(@Nullable String deploymentTemplateId) {
            $.deploymentTemplateId = deploymentTemplateId;
            return this;
        }

        /**
         * @param elasticsearches Filter by Elasticsearch resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearches(@Nullable List<GetDeploymentsElasticsearch> elasticsearches) {
            $.elasticsearches = elasticsearches;
            return this;
        }

        /**
         * @param elasticsearches Filter by Elasticsearch resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearches(GetDeploymentsElasticsearch... elasticsearches) {
            return elasticsearches(List.of(elasticsearches));
        }

        /**
         * @param enterpriseSearches Filter by Enterprise Search resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSearches(@Nullable List<GetDeploymentsEnterpriseSearch> enterpriseSearches) {
            $.enterpriseSearches = enterpriseSearches;
            return this;
        }

        /**
         * @param enterpriseSearches Filter by Enterprise Search resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSearches(GetDeploymentsEnterpriseSearch... enterpriseSearches) {
            return enterpriseSearches(List.of(enterpriseSearches));
        }

        /**
         * @param healthy Filter the result set by their health status.
         * 
         * @return builder
         * 
         */
        public Builder healthy(@Nullable String healthy) {
            $.healthy = healthy;
            return this;
        }

        /**
         * @param integrationsServers Filter by Integrations Server resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder integrationsServers(@Nullable List<GetDeploymentsIntegrationsServer> integrationsServers) {
            $.integrationsServers = integrationsServers;
            return this;
        }

        /**
         * @param integrationsServers Filter by Integrations Server resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder integrationsServers(GetDeploymentsIntegrationsServer... integrationsServers) {
            return integrationsServers(List.of(integrationsServers));
        }

        /**
         * @param kibanas Filter by Kibana resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder kibanas(@Nullable List<GetDeploymentsKibana> kibanas) {
            $.kibanas = kibanas;
            return this;
        }

        /**
         * @param kibanas Filter by Kibana resource kind status or configuration.
         * 
         * @return builder
         * 
         */
        public Builder kibanas(GetDeploymentsKibana... kibanas) {
            return kibanas(List.of(kibanas));
        }

        /**
         * @param namePrefix Prefix to filter the returned deployment list by.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param size The maximum number of deployments to return. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Integer size) {
            $.size = size;
            return this;
        }

        /**
         * @param tags Filter the result set by their assigned tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDeploymentsPlainArgs build() {
            return $;
        }
    }

}
