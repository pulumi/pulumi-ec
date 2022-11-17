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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentsPlainArgs Empty = new GetDeploymentsPlainArgs();

    /**
     * **DEPRECATED** Filter by APM resource kind status or configuration.
     * * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.healthy` - Overall health status of the APM instances.
     * 
     */
    @Import(name="apm")
    private @Nullable GetDeploymentsApm apm;

    /**
     * @return **DEPRECATED** Filter by APM resource kind status or configuration.
     * * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.healthy` - Overall health status of the APM instances.
     * 
     */
    public Optional<GetDeploymentsApm> apm() {
        return Optional.ofNullable(this.apm);
    }

    /**
     * ID of the deployment template used to create the deployment.
     * 
     */
    @Import(name="deploymentTemplateId")
    private @Nullable String deploymentTemplateId;

    /**
     * @return ID of the deployment template used to create the deployment.
     * 
     */
    public Optional<String> deploymentTemplateId() {
        return Optional.ofNullable(this.deploymentTemplateId);
    }

    /**
     * Filter by Elasticsearch resource kind status or configuration.
     * * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
     * 
     */
    @Import(name="elasticsearch")
    private @Nullable GetDeploymentsElasticsearch elasticsearch;

    /**
     * @return Filter by Elasticsearch resource kind status or configuration.
     * * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
     * 
     */
    public Optional<GetDeploymentsElasticsearch> elasticsearch() {
        return Optional.ofNullable(this.elasticsearch);
    }

    /**
     * Filter by Enterprise Search resource kind status or configuration.
     * * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
     * 
     */
    @Import(name="enterpriseSearch")
    private @Nullable GetDeploymentsEnterpriseSearch enterpriseSearch;

    /**
     * @return Filter by Enterprise Search resource kind status or configuration.
     * * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
     * 
     */
    public Optional<GetDeploymentsEnterpriseSearch> enterpriseSearch() {
        return Optional.ofNullable(this.enterpriseSearch);
    }

    /**
     * Overall health status of the deployment.
     * 
     */
    @Import(name="healthy")
    private @Nullable String healthy;

    /**
     * @return Overall health status of the deployment.
     * 
     */
    public Optional<String> healthy() {
        return Optional.ofNullable(this.healthy);
    }

    /**
     * Filter by Integrations Server resource kind status or configuration.
     * * `integrations_server.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `integrations_server.#.version` - Elastic stack version.
     * * `integrations_server.#.healthy` - Overall health status of the Integrations Server instances.
     * 
     */
    @Import(name="integrationsServer")
    private @Nullable GetDeploymentsIntegrationsServer integrationsServer;

    /**
     * @return Filter by Integrations Server resource kind status or configuration.
     * * `integrations_server.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `integrations_server.#.version` - Elastic stack version.
     * * `integrations_server.#.healthy` - Overall health status of the Integrations Server instances.
     * 
     */
    public Optional<GetDeploymentsIntegrationsServer> integrationsServer() {
        return Optional.ofNullable(this.integrationsServer);
    }

    /**
     * Filter by Kibana resource kind status or configuration.
     * * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.healthy` - Overall health status of the Kibana instances.
     * 
     */
    @Import(name="kibana")
    private @Nullable GetDeploymentsKibana kibana;

    /**
     * @return Filter by Kibana resource kind status or configuration.
     * * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.healthy` - Overall health status of the Kibana instances.
     * 
     */
    public Optional<GetDeploymentsKibana> kibana() {
        return Optional.ofNullable(this.kibana);
    }

    /**
     * Prefix that one or several deployment names have in common.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return Prefix that one or several deployment names have in common.
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
     * Key value map of arbitrary string tags for the deployment.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key value map of arbitrary string tags for the deployment.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDeploymentsPlainArgs() {}

    private GetDeploymentsPlainArgs(GetDeploymentsPlainArgs $) {
        this.apm = $.apm;
        this.deploymentTemplateId = $.deploymentTemplateId;
        this.elasticsearch = $.elasticsearch;
        this.enterpriseSearch = $.enterpriseSearch;
        this.healthy = $.healthy;
        this.integrationsServer = $.integrationsServer;
        this.kibana = $.kibana;
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
         * @param apm **DEPRECATED** Filter by APM resource kind status or configuration.
         * * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
         * * `apm.#.version` - Elastic stack version.
         * * `apm.#.healthy` - Overall health status of the APM instances.
         * 
         * @return builder
         * 
         */
        public Builder apm(@Nullable GetDeploymentsApm apm) {
            $.apm = apm;
            return this;
        }

        /**
         * @param deploymentTemplateId ID of the deployment template used to create the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentTemplateId(@Nullable String deploymentTemplateId) {
            $.deploymentTemplateId = deploymentTemplateId;
            return this;
        }

        /**
         * @param elasticsearch Filter by Elasticsearch resource kind status or configuration.
         * * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
         * * `elasticsearch.#.version` - Elastic stack version.
         * * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearch(@Nullable GetDeploymentsElasticsearch elasticsearch) {
            $.elasticsearch = elasticsearch;
            return this;
        }

        /**
         * @param enterpriseSearch Filter by Enterprise Search resource kind status or configuration.
         * * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
         * * `enterprise_search.#.version` - Elastic stack version.
         * * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSearch(@Nullable GetDeploymentsEnterpriseSearch enterpriseSearch) {
            $.enterpriseSearch = enterpriseSearch;
            return this;
        }

        /**
         * @param healthy Overall health status of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder healthy(@Nullable String healthy) {
            $.healthy = healthy;
            return this;
        }

        /**
         * @param integrationsServer Filter by Integrations Server resource kind status or configuration.
         * * `integrations_server.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
         * * `integrations_server.#.version` - Elastic stack version.
         * * `integrations_server.#.healthy` - Overall health status of the Integrations Server instances.
         * 
         * @return builder
         * 
         */
        public Builder integrationsServer(@Nullable GetDeploymentsIntegrationsServer integrationsServer) {
            $.integrationsServer = integrationsServer;
            return this;
        }

        /**
         * @param kibana Filter by Kibana resource kind status or configuration.
         * * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
         * * `kibana.#.version` - Elastic stack version.
         * * `kibana.#.healthy` - Overall health status of the Kibana instances.
         * 
         * @return builder
         * 
         */
        public Builder kibana(@Nullable GetDeploymentsKibana kibana) {
            $.kibana = kibana;
            return this;
        }

        /**
         * @param namePrefix Prefix that one or several deployment names have in common.
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
         * @param tags Key value map of arbitrary string tags for the deployment.
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
