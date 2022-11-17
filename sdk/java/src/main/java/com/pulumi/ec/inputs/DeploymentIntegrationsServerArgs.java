// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentIntegrationsServerConfigArgs;
import com.pulumi.ec.inputs.DeploymentIntegrationsServerTopologyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentIntegrationsServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentIntegrationsServerArgs Empty = new DeploymentIntegrationsServerArgs();

    /**
     * Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    @Import(name="config")
    private @Nullable Output<DeploymentIntegrationsServerConfigArgs> config;

    /**
     * @return Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     * 
     */
    public Optional<Output<DeploymentIntegrationsServerConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     * 
     */
    @Import(name="elasticsearchClusterRefId")
    private @Nullable Output<String> elasticsearchClusterRefId;

    /**
     * @return This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     * 
     */
    public Optional<Output<String>> elasticsearchClusterRefId() {
        return Optional.ofNullable(this.elasticsearchClusterRefId);
    }

    @Import(name="httpEndpoint")
    private @Nullable Output<String> httpEndpoint;

    public Optional<Output<String>> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    @Import(name="httpsEndpoint")
    private @Nullable Output<String> httpsEndpoint;

    public Optional<Output<String>> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }

    /**
     * Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     * 
     */
    @Import(name="refId")
    private @Nullable Output<String> refId;

    /**
     * @return Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     * 
     */
    public Optional<Output<String>> refId() {
        return Optional.ofNullable(this.refId);
    }

    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Can be set multiple times to compose complex topologies.
     * 
     */
    @Import(name="topologies")
    private @Nullable Output<List<DeploymentIntegrationsServerTopologyArgs>> topologies;

    /**
     * @return Can be set multiple times to compose complex topologies.
     * 
     */
    public Optional<Output<List<DeploymentIntegrationsServerTopologyArgs>>> topologies() {
        return Optional.ofNullable(this.topologies);
    }

    private DeploymentIntegrationsServerArgs() {}

    private DeploymentIntegrationsServerArgs(DeploymentIntegrationsServerArgs $) {
        this.config = $.config;
        this.elasticsearchClusterRefId = $.elasticsearchClusterRefId;
        this.httpEndpoint = $.httpEndpoint;
        this.httpsEndpoint = $.httpsEndpoint;
        this.refId = $.refId;
        this.region = $.region;
        this.resourceId = $.resourceId;
        this.topologies = $.topologies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentIntegrationsServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentIntegrationsServerArgs $;

        public Builder() {
            $ = new DeploymentIntegrationsServerArgs();
        }

        public Builder(DeploymentIntegrationsServerArgs defaults) {
            $ = new DeploymentIntegrationsServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Integrations Server settings applied to all topologies unless overridden in the `topology` element.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<DeploymentIntegrationsServerConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Integrations Server settings applied to all topologies unless overridden in the `topology` element.
         * 
         * @return builder
         * 
         */
        public Builder config(DeploymentIntegrationsServerConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param elasticsearchClusterRefId This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchClusterRefId(@Nullable Output<String> elasticsearchClusterRefId) {
            $.elasticsearchClusterRefId = elasticsearchClusterRefId;
            return this;
        }

        /**
         * @param elasticsearchClusterRefId This field references the `ref_id` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchClusterRefId(String elasticsearchClusterRefId) {
            return elasticsearchClusterRefId(Output.of(elasticsearchClusterRefId));
        }

        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder httpEndpoint(String httpEndpoint) {
            return httpEndpoint(Output.of(httpEndpoint));
        }

        public Builder httpsEndpoint(@Nullable Output<String> httpsEndpoint) {
            $.httpsEndpoint = httpsEndpoint;
            return this;
        }

        public Builder httpsEndpoint(String httpsEndpoint) {
            return httpsEndpoint(Output.of(httpsEndpoint));
        }

        /**
         * @param refId Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
         * 
         * @return builder
         * 
         */
        public Builder refId(@Nullable Output<String> refId) {
            $.refId = refId;
            return this;
        }

        /**
         * @param refId Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
         * 
         * @return builder
         * 
         */
        public Builder refId(String refId) {
            return refId(Output.of(refId));
        }

        /**
         * @param region Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `&#34;ece-region&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param topologies Can be set multiple times to compose complex topologies.
         * 
         * @return builder
         * 
         */
        public Builder topologies(@Nullable Output<List<DeploymentIntegrationsServerTopologyArgs>> topologies) {
            $.topologies = topologies;
            return this;
        }

        /**
         * @param topologies Can be set multiple times to compose complex topologies.
         * 
         * @return builder
         * 
         */
        public Builder topologies(List<DeploymentIntegrationsServerTopologyArgs> topologies) {
            return topologies(Output.of(topologies));
        }

        /**
         * @param topologies Can be set multiple times to compose complex topologies.
         * 
         * @return builder
         * 
         */
        public Builder topologies(DeploymentIntegrationsServerTopologyArgs... topologies) {
            return topologies(List.of(topologies));
        }

        public DeploymentIntegrationsServerArgs build() {
            return $;
        }
    }

}
