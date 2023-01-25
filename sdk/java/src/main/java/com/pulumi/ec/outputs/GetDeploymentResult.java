// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentApm;
import com.pulumi.ec.outputs.GetDeploymentElasticsearch;
import com.pulumi.ec.outputs.GetDeploymentEnterpriseSearch;
import com.pulumi.ec.outputs.GetDeploymentIntegrationsServer;
import com.pulumi.ec.outputs.GetDeploymentKibana;
import com.pulumi.ec.outputs.GetDeploymentObservability;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDeploymentResult {
    /**
     * @return Deployment alias.
     * 
     */
    private String alias;
    /**
     * @return Instance configuration of the APM type.
     * * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `apm.#.healthy` - Resource kind health status.
     * * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `apm.#.ref_id` - User specified ref_id for the resource kind.
     * * `apm.#.resource_id` - The resource unique identifier.
     * * `apm.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.topology` - Node topology element definition.
     * * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    private List<GetDeploymentApm> apms;
    /**
     * @return ID of the deployment template used to create the deployment.
     * 
     */
    private String deploymentTemplateId;
    /**
     * @return Instance configuration of the Elasticsearch resource kind.
     * * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
     * * `elasticsearch.#.healthy` - Resource kind health status.
     * * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
     * * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `elasticsearch.#.ref_id` - User specified ref_id for the resource kind.
     * * `elasticsearch.#.resource_id` - The resource unique identifier.
     * * `elasticsearch.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.topology` - Topology element definition.
     * * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (&gt;=7.10.0).
     * * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
     * 
     */
    private List<GetDeploymentElasticsearch> elasticsearches;
    /**
     * @return Instance configuration of the Enterprise Search type.
     * * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `enterprise_search.#.healthy` - Resource kind health status.
     * * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `enterprise_search.#.ref_id` - User specified ref_id for the resource kind.
     * * `enterprise_search.#.resource_id` - The resource unique identifier.
     * * `enterprise_search.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.topology` - Node topology element definition.
     * * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
     * * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
     * * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
     * 
     */
    private List<GetDeploymentEnterpriseSearch> enterpriseSearches;
    /**
     * @return Overall health status of the deployment.
     * 
     */
    private Boolean healthy;
    /**
     * @return The unique ID of the deployment.
     * 
     */
    private String id;
    /**
     * @return Instance configuration of the Integrations Server type.
     * * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `integrations_server.#.healthy` - Resource kind health status.
     * * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `integrations_server.#.ref_id` - User specified ref_id for the resource kind.
     * * `integrations_server.#.resource_id` - The resource unique identifier.
     * * `integrations_server.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `integrations_server.#.version` - Elastic stack version.
     * * `integrations_server.#.topology` - Node topology element definition.
     * * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    private List<GetDeploymentIntegrationsServer> integrationsServers;
    /**
     * @return Instance configuration of the Kibana type.
     * * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `kibana.#.healthy` - Resource kind health status.
     * * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `kibana.#.ref_id` - User specified ref_id for the resource kind.
     * * `kibana.#.resource_id` - The resource unique identifier.
     * * `kibana.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.topology` - Node topology element definition.
     * * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    private List<GetDeploymentKibana> kibanas;
    /**
     * @return The name of the deployment.
     * 
     */
    private String name;
    /**
     * @return Observability settings. Information about logs and metrics shipped to a dedicated deployment.
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
     * * `observability.#.ref_id` - Elasticsearch resource kind ref_id of the destination deployment.
     * * `observability.#.logs` - Defines whether logs are enabled or disabled.
     * * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
     * 
     */
    private List<GetDeploymentObservability> observabilities;
    /**
     * @return Region where the deployment can be found.
     * 
     */
    private String region;
    /**
     * @return Key value map of arbitrary string tags.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Traffic filter block, which contains a list of traffic filter rule identifiers.
     * 
     */
    private List<String> trafficFilters;

    private GetDeploymentResult() {}
    /**
     * @return Deployment alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return Instance configuration of the APM type.
     * * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `apm.#.healthy` - Resource kind health status.
     * * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `apm.#.ref_id` - User specified ref_id for the resource kind.
     * * `apm.#.resource_id` - The resource unique identifier.
     * * `apm.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `apm.#.version` - Elastic stack version.
     * * `apm.#.topology` - Node topology element definition.
     * * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    public List<GetDeploymentApm> apms() {
        return this.apms;
    }
    /**
     * @return ID of the deployment template used to create the deployment.
     * 
     */
    public String deploymentTemplateId() {
        return this.deploymentTemplateId;
    }
    /**
     * @return Instance configuration of the Elasticsearch resource kind.
     * * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
     * * `elasticsearch.#.healthy` - Resource kind health status.
     * * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
     * * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `elasticsearch.#.ref_id` - User specified ref_id for the resource kind.
     * * `elasticsearch.#.resource_id` - The resource unique identifier.
     * * `elasticsearch.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `elasticsearch.#.version` - Elastic stack version.
     * * `elasticsearch.#.topology` - Topology element definition.
     * * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (&gt;=7.10.0).
     * * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (&lt;7.10.0).
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
     * * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
     * 
     */
    public List<GetDeploymentElasticsearch> elasticsearches() {
        return this.elasticsearches;
    }
    /**
     * @return Instance configuration of the Enterprise Search type.
     * * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `enterprise_search.#.healthy` - Resource kind health status.
     * * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `enterprise_search.#.ref_id` - User specified ref_id for the resource kind.
     * * `enterprise_search.#.resource_id` - The resource unique identifier.
     * * `enterprise_search.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `enterprise_search.#.version` - Elastic stack version.
     * * `enterprise_search.#.topology` - Node topology element definition.
     * * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
     * * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
     * * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
     * 
     */
    public List<GetDeploymentEnterpriseSearch> enterpriseSearches() {
        return this.enterpriseSearches;
    }
    /**
     * @return Overall health status of the deployment.
     * 
     */
    public Boolean healthy() {
        return this.healthy;
    }
    /**
     * @return The unique ID of the deployment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Instance configuration of the Integrations Server type.
     * * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `integrations_server.#.healthy` - Resource kind health status.
     * * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `integrations_server.#.ref_id` - User specified ref_id for the resource kind.
     * * `integrations_server.#.resource_id` - The resource unique identifier.
     * * `integrations_server.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `integrations_server.#.version` - Elastic stack version.
     * * `integrations_server.#.topology` - Node topology element definition.
     * * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    public List<GetDeploymentIntegrationsServer> integrationsServers() {
        return this.integrationsServers;
    }
    /**
     * @return Instance configuration of the Kibana type.
     * * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
     * * `kibana.#.healthy` - Resource kind health status.
     * * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
     * * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
     * * `kibana.#.ref_id` - User specified ref_id for the resource kind.
     * * `kibana.#.resource_id` - The resource unique identifier.
     * * `kibana.#.status` - Resource kind status (for example, &#34;started&#34;, &#34;stopped&#34;, etc).
     * * `kibana.#.version` - Elastic stack version.
     * * `kibana.#.topology` - Node topology element definition.
     * * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
     * * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the &#34;&lt;size in GB&gt;g&#34; notation.
     * * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
     * 
     */
    public List<GetDeploymentKibana> kibanas() {
        return this.kibanas;
    }
    /**
     * @return The name of the deployment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Observability settings. Information about logs and metrics shipped to a dedicated deployment.
     * * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
     * * `observability.#.ref_id` - Elasticsearch resource kind ref_id of the destination deployment.
     * * `observability.#.logs` - Defines whether logs are enabled or disabled.
     * * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
     * 
     */
    public List<GetDeploymentObservability> observabilities() {
        return this.observabilities;
    }
    /**
     * @return Region where the deployment can be found.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Key value map of arbitrary string tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Traffic filter block, which contains a list of traffic filter rule identifiers.
     * 
     */
    public List<String> trafficFilters() {
        return this.trafficFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alias;
        private List<GetDeploymentApm> apms;
        private String deploymentTemplateId;
        private List<GetDeploymentElasticsearch> elasticsearches;
        private List<GetDeploymentEnterpriseSearch> enterpriseSearches;
        private Boolean healthy;
        private String id;
        private List<GetDeploymentIntegrationsServer> integrationsServers;
        private List<GetDeploymentKibana> kibanas;
        private String name;
        private List<GetDeploymentObservability> observabilities;
        private String region;
        private Map<String,String> tags;
        private List<String> trafficFilters;
        public Builder() {}
        public Builder(GetDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.apms = defaults.apms;
    	      this.deploymentTemplateId = defaults.deploymentTemplateId;
    	      this.elasticsearches = defaults.elasticsearches;
    	      this.enterpriseSearches = defaults.enterpriseSearches;
    	      this.healthy = defaults.healthy;
    	      this.id = defaults.id;
    	      this.integrationsServers = defaults.integrationsServers;
    	      this.kibanas = defaults.kibanas;
    	      this.name = defaults.name;
    	      this.observabilities = defaults.observabilities;
    	      this.region = defaults.region;
    	      this.tags = defaults.tags;
    	      this.trafficFilters = defaults.trafficFilters;
        }

        @CustomType.Setter
        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        @CustomType.Setter
        public Builder apms(List<GetDeploymentApm> apms) {
            this.apms = Objects.requireNonNull(apms);
            return this;
        }
        public Builder apms(GetDeploymentApm... apms) {
            return apms(List.of(apms));
        }
        @CustomType.Setter
        public Builder deploymentTemplateId(String deploymentTemplateId) {
            this.deploymentTemplateId = Objects.requireNonNull(deploymentTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder elasticsearches(List<GetDeploymentElasticsearch> elasticsearches) {
            this.elasticsearches = Objects.requireNonNull(elasticsearches);
            return this;
        }
        public Builder elasticsearches(GetDeploymentElasticsearch... elasticsearches) {
            return elasticsearches(List.of(elasticsearches));
        }
        @CustomType.Setter
        public Builder enterpriseSearches(List<GetDeploymentEnterpriseSearch> enterpriseSearches) {
            this.enterpriseSearches = Objects.requireNonNull(enterpriseSearches);
            return this;
        }
        public Builder enterpriseSearches(GetDeploymentEnterpriseSearch... enterpriseSearches) {
            return enterpriseSearches(List.of(enterpriseSearches));
        }
        @CustomType.Setter
        public Builder healthy(Boolean healthy) {
            this.healthy = Objects.requireNonNull(healthy);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder integrationsServers(List<GetDeploymentIntegrationsServer> integrationsServers) {
            this.integrationsServers = Objects.requireNonNull(integrationsServers);
            return this;
        }
        public Builder integrationsServers(GetDeploymentIntegrationsServer... integrationsServers) {
            return integrationsServers(List.of(integrationsServers));
        }
        @CustomType.Setter
        public Builder kibanas(List<GetDeploymentKibana> kibanas) {
            this.kibanas = Objects.requireNonNull(kibanas);
            return this;
        }
        public Builder kibanas(GetDeploymentKibana... kibanas) {
            return kibanas(List.of(kibanas));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder observabilities(List<GetDeploymentObservability> observabilities) {
            this.observabilities = Objects.requireNonNull(observabilities);
            return this;
        }
        public Builder observabilities(GetDeploymentObservability... observabilities) {
            return observabilities(List.of(observabilities));
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder trafficFilters(List<String> trafficFilters) {
            this.trafficFilters = Objects.requireNonNull(trafficFilters);
            return this;
        }
        public Builder trafficFilters(String... trafficFilters) {
            return trafficFilters(List.of(trafficFilters));
        }
        public GetDeploymentResult build() {
            final var o = new GetDeploymentResult();
            o.alias = alias;
            o.apms = apms;
            o.deploymentTemplateId = deploymentTemplateId;
            o.elasticsearches = elasticsearches;
            o.enterpriseSearches = enterpriseSearches;
            o.healthy = healthy;
            o.id = id;
            o.integrationsServers = integrationsServers;
            o.kibanas = kibanas;
            o.name = name;
            o.observabilities = observabilities;
            o.region = region;
            o.tags = tags;
            o.trafficFilters = trafficFilters;
            return o;
        }
    }
}
