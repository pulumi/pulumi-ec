// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentApmArgs;
import com.pulumi.ec.inputs.DeploymentElasticsearchArgs;
import com.pulumi.ec.inputs.DeploymentEnterpriseSearchArgs;
import com.pulumi.ec.inputs.DeploymentIntegrationsServerArgs;
import com.pulumi.ec.inputs.DeploymentKibanaArgs;
import com.pulumi.ec.inputs.DeploymentObservabilityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Alias for this Cross Cluster Search binding
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return Alias for this Cross Cluster Search binding
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
     * 
     */
    @Import(name="apm")
    private @Nullable Output<DeploymentApmArgs> apm;

    /**
     * @return **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
     * 
     */
    public Optional<Output<DeploymentApmArgs>> apm() {
        return Optional.ofNullable(this.apm);
    }

    /**
     * Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    @Import(name="deploymentTemplateId", required=true)
    private Output<String> deploymentTemplateId;

    /**
     * @return Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     * 
     */
    public Output<String> deploymentTemplateId() {
        return this.deploymentTemplateId;
    }

    /**
     * Elasticsearch cluster definition
     * 
     */
    @Import(name="elasticsearch", required=true)
    private Output<DeploymentElasticsearchArgs> elasticsearch;

    /**
     * @return Elasticsearch cluster definition
     * 
     */
    public Output<DeploymentElasticsearchArgs> elasticsearch() {
        return this.elasticsearch;
    }

    /**
     * Enterprise Search cluster definition.
     * 
     */
    @Import(name="enterpriseSearch")
    private @Nullable Output<DeploymentEnterpriseSearchArgs> enterpriseSearch;

    /**
     * @return Enterprise Search cluster definition.
     * 
     */
    public Optional<Output<DeploymentEnterpriseSearchArgs>> enterpriseSearch() {
        return Optional.ofNullable(this.enterpriseSearch);
    }

    /**
     * Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
     * 
     */
    @Import(name="integrationsServer")
    private @Nullable Output<DeploymentIntegrationsServerArgs> integrationsServer;

    /**
     * @return Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
     * 
     */
    public Optional<Output<DeploymentIntegrationsServerArgs>> integrationsServer() {
        return Optional.ofNullable(this.integrationsServer);
    }

    /**
     * Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
     * block, since not doing so might cause issues when modifying or upgrading the deployment.
     * 
     */
    @Import(name="kibana")
    private @Nullable Output<DeploymentKibanaArgs> kibana;

    /**
     * @return Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
     * block, since not doing so might cause issues when modifying or upgrading the deployment.
     * 
     */
    public Optional<Output<DeploymentKibanaArgs>> kibana() {
        return Optional.ofNullable(this.kibana);
    }

    /**
     * Extension name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Extension name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
     * current deployment itself by setting observability.deployment_id to `self`.
     * 
     */
    @Import(name="observability")
    private @Nullable Output<DeploymentObservabilityArgs> observability;

    /**
     * @return Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
     * current deployment itself by setting observability.deployment_id to `self`.
     * 
     */
    public Optional<Output<DeploymentObservabilityArgs>> observability() {
        return Optional.ofNullable(this.observability);
    }

    /**
     * Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
     * installations, set to `&#34;ece-region&#34;.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
     * installations, set to `&#34;ece-region&#34;.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
     * returned as part of the error.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
     * returned as part of the error.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Explicitly resets the elasticsearch_password when true
     * 
     */
    @Import(name="resetElasticsearchPassword")
    private @Nullable Output<Boolean> resetElasticsearchPassword;

    /**
     * @return Explicitly resets the elasticsearch_password when true
     * 
     */
    public Optional<Output<Boolean>> resetElasticsearchPassword() {
        return Optional.ofNullable(this.resetElasticsearchPassword);
    }

    /**
     * Optional map of deployment tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Optional map of deployment tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * List of traffic filters rule identifiers that will be applied to the deployment.
     * 
     */
    @Import(name="trafficFilters")
    private @Nullable Output<List<String>> trafficFilters;

    /**
     * @return List of traffic filters rule identifiers that will be applied to the deployment.
     * 
     */
    public Optional<Output<List<String>>> trafficFilters() {
        return Optional.ofNullable(this.trafficFilters);
    }

    /**
     * Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.alias = $.alias;
        this.apm = $.apm;
        this.deploymentTemplateId = $.deploymentTemplateId;
        this.elasticsearch = $.elasticsearch;
        this.enterpriseSearch = $.enterpriseSearch;
        this.integrationsServer = $.integrationsServer;
        this.kibana = $.kibana;
        this.name = $.name;
        this.observability = $.observability;
        this.region = $.region;
        this.requestId = $.requestId;
        this.resetElasticsearchPassword = $.resetElasticsearchPassword;
        this.tags = $.tags;
        this.trafficFilters = $.trafficFilters;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias Alias for this Cross Cluster Search binding
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Alias for this Cross Cluster Search binding
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param apm **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
         * 
         * @return builder
         * 
         */
        public Builder apm(@Nullable Output<DeploymentApmArgs> apm) {
            $.apm = apm;
            return this;
        }

        /**
         * @param apm **DEPRECATED** APM cluster definition. This should only be used for deployments running a version lower than 8.0
         * 
         * @return builder
         * 
         */
        public Builder apm(DeploymentApmArgs apm) {
            return apm(Output.of(apm));
        }

        /**
         * @param deploymentTemplateId Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
         * 
         * @return builder
         * 
         */
        public Builder deploymentTemplateId(Output<String> deploymentTemplateId) {
            $.deploymentTemplateId = deploymentTemplateId;
            return this;
        }

        /**
         * @param deploymentTemplateId Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
         * 
         * @return builder
         * 
         */
        public Builder deploymentTemplateId(String deploymentTemplateId) {
            return deploymentTemplateId(Output.of(deploymentTemplateId));
        }

        /**
         * @param elasticsearch Elasticsearch cluster definition
         * 
         * @return builder
         * 
         */
        public Builder elasticsearch(Output<DeploymentElasticsearchArgs> elasticsearch) {
            $.elasticsearch = elasticsearch;
            return this;
        }

        /**
         * @param elasticsearch Elasticsearch cluster definition
         * 
         * @return builder
         * 
         */
        public Builder elasticsearch(DeploymentElasticsearchArgs elasticsearch) {
            return elasticsearch(Output.of(elasticsearch));
        }

        /**
         * @param enterpriseSearch Enterprise Search cluster definition.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSearch(@Nullable Output<DeploymentEnterpriseSearchArgs> enterpriseSearch) {
            $.enterpriseSearch = enterpriseSearch;
            return this;
        }

        /**
         * @param enterpriseSearch Enterprise Search cluster definition.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSearch(DeploymentEnterpriseSearchArgs enterpriseSearch) {
            return enterpriseSearch(Output.of(enterpriseSearch));
        }

        /**
         * @param integrationsServer Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
         * 
         * @return builder
         * 
         */
        public Builder integrationsServer(@Nullable Output<DeploymentIntegrationsServerArgs> integrationsServer) {
            $.integrationsServer = integrationsServer;
            return this;
        }

        /**
         * @param integrationsServer Integrations Server cluster definition. Integrations Server replaces `apm` in Stack versions &gt; 8.0
         * 
         * @return builder
         * 
         */
        public Builder integrationsServer(DeploymentIntegrationsServerArgs integrationsServer) {
            return integrationsServer(Output.of(integrationsServer));
        }

        /**
         * @param kibana Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
         * block, since not doing so might cause issues when modifying or upgrading the deployment.
         * 
         * @return builder
         * 
         */
        public Builder kibana(@Nullable Output<DeploymentKibanaArgs> kibana) {
            $.kibana = kibana;
            return this;
        }

        /**
         * @param kibana Kibana cluster definition. -&gt; **Note on disabling Kibana** While optional it is recommended deployments specify a Kibana
         * block, since not doing so might cause issues when modifying or upgrading the deployment.
         * 
         * @return builder
         * 
         */
        public Builder kibana(DeploymentKibanaArgs kibana) {
            return kibana(Output.of(kibana));
        }

        /**
         * @param name Extension name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Extension name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param observability Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
         * current deployment itself by setting observability.deployment_id to `self`.
         * 
         * @return builder
         * 
         */
        public Builder observability(@Nullable Output<DeploymentObservabilityArgs> observability) {
            $.observability = observability;
            return this;
        }

        /**
         * @param observability Observability settings that you can set to ship logs and metrics to a deployment. The target deployment can also be the
         * current deployment itself by setting observability.deployment_id to `self`.
         * 
         * @return builder
         * 
         */
        public Builder observability(DeploymentObservabilityArgs observability) {
            return observability(Output.of(observability));
        }

        /**
         * @param region Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
         * installations, set to `&#34;ece-region&#34;.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Elasticsearch Service (ESS) region where the deployment should be hosted. For Elastic Cloud Enterprise (ECE)
         * installations, set to `&#34;ece-region&#34;.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
         * returned as part of the error.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Request ID to set when you create the deployment. Use it only when previous attempts return an error and `request_id` is
         * returned as part of the error.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param resetElasticsearchPassword Explicitly resets the elasticsearch_password when true
         * 
         * @return builder
         * 
         */
        public Builder resetElasticsearchPassword(@Nullable Output<Boolean> resetElasticsearchPassword) {
            $.resetElasticsearchPassword = resetElasticsearchPassword;
            return this;
        }

        /**
         * @param resetElasticsearchPassword Explicitly resets the elasticsearch_password when true
         * 
         * @return builder
         * 
         */
        public Builder resetElasticsearchPassword(Boolean resetElasticsearchPassword) {
            return resetElasticsearchPassword(Output.of(resetElasticsearchPassword));
        }

        /**
         * @param tags Optional map of deployment tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional map of deployment tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param trafficFilters List of traffic filters rule identifiers that will be applied to the deployment.
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(@Nullable Output<List<String>> trafficFilters) {
            $.trafficFilters = trafficFilters;
            return this;
        }

        /**
         * @param trafficFilters List of traffic filters rule identifiers that will be applied to the deployment.
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(List<String> trafficFilters) {
            return trafficFilters(Output.of(trafficFilters));
        }

        /**
         * @param trafficFilters List of traffic filters rule identifiers that will be applied to the deployment.
         * 
         * @return builder
         * 
         */
        public Builder trafficFilters(String... trafficFilters) {
            return trafficFilters(List.of(trafficFilters));
        }

        /**
         * @param version Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DeploymentArgs build() {
            $.deploymentTemplateId = Objects.requireNonNull($.deploymentTemplateId, "expected parameter 'deploymentTemplateId' to be non-null");
            $.elasticsearch = Objects.requireNonNull($.elasticsearch, "expected parameter 'elasticsearch' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
