// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DeploymentApm {
    /**
     * APM settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: outputs.DeploymentApmConfig;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: string;
    httpEndpoint: string;
    httpsEndpoint: string;
    /**
     * Can be set on the APM resource. The default value `main-apm` is recommended.
     */
    refId?: string;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: string;
    resourceId: string;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology: outputs.DeploymentApmTopology;
}

export interface DeploymentApmConfig {
    /**
     * Enable debug mode for APM servers. Defaults to `false`.
     */
    debugEnabled?: boolean;
    dockerImage?: string;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: string;
}

export interface DeploymentApmTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId: string;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size: string;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: string;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount: number;
}

export interface DeploymentElasticsearch {
    /**
     * Enable or disable autoscaling. Defaults to the setting coming from the deployment template. Accepted values are `"true"` or `"false"`.
     */
    autoscale: string;
    cloudId: string;
    /**
     * Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: outputs.DeploymentElasticsearchConfig;
    /**
     * Custom Elasticsearch bundles or plugins. Can be set multiple times.
     */
    extensions?: outputs.DeploymentElasticsearchExtension[];
    httpEndpoint: string;
    httpsEndpoint: string;
    /**
     * Can be set on the Elasticsearch resource. The default value `main-elasticsearch` is recommended.
     */
    refId?: string;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: string;
    /**
     * Elasticsearch remote clusters to configure for the Elasticsearch resource. Can be set multiple times.
     */
    remoteClusters?: outputs.DeploymentElasticsearchRemoteCluster[];
    resourceId: string;
    /**
     * Restores data from a snapshot of another deployment.
     */
    snapshotSource?: outputs.DeploymentElasticsearchSnapshotSource;
    /**
     * Choose the configuration strategy used to apply the changes.
     */
    strategy?: outputs.DeploymentElasticsearchStrategy;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topologies: outputs.DeploymentElasticsearchTopology[];
    /**
     * The trust relationships with other ESS accounts.
     */
    trustAccounts: outputs.DeploymentElasticsearchTrustAccount[];
    /**
     * The trust relationship with external entities (remote environments, remote accounts...).
     */
    trustExternals: outputs.DeploymentElasticsearchTrustExternal[];
}

export interface DeploymentElasticsearchConfig {
    dockerImage?: string;
    /**
     * List of Elasticsearch supported plugins. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html).
     */
    plugins?: string[];
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: string;
}

export interface DeploymentElasticsearchExtension {
    /**
     * Extension name.
     */
    name: string;
    /**
     * Extension type, only `bundle` or `plugin` are supported.
     */
    type: string;
    /**
     * Bundle or plugin URL, the extension URL can be obtained from the `ec_deployment_extension.<name>.url` attribute or the API and cannot be a random HTTP address that is hosted elsewhere.
     */
    url: string;
    /**
     * Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
     */
    version: string;
}

export interface DeploymentElasticsearchRemoteCluster {
    /**
     * Alias for the Cross Cluster Search binding.
     */
    alias: string;
    /**
     * Remote deployment ID.
     */
    deploymentId: string;
    /**
     * Remote Elasticsearch `refId`. The default value `main-elasticsearch` is recommended.
     */
    refId?: string;
    /**
     * If true, skip the cluster during search when disconnected. Defaults to `false`.
     */
    skipUnavailable?: boolean;
}

export interface DeploymentElasticsearchSnapshotSource {
    /**
     * Name of the snapshot to restore. Use `__latest_success__` to get the most recent successful snapshot (Defaults to `__latest_success__`).
     */
    snapshotName?: string;
    /**
     * ID of the Elasticsearch cluster, not to be confused with the deployment ID, that will be used as the source of the snapshot. The Elasticsearch cluster must be in the same region and must have a compatible version of the Elastic Stack.
     */
    sourceElasticsearchClusterId: string;
}

export interface DeploymentElasticsearchStrategy {
    /**
     * Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rollingAll].
     */
    type: string;
}

export interface DeploymentElasticsearchTopology {
    /**
     * Autoscaling policy defining the maximum and / or minimum total size for this topology element. For more information refer to the `autoscaling` block.
     */
    autoscaling: outputs.DeploymentElasticsearchTopologyAutoscaling;
    /**
     * Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     */
    configs: outputs.DeploymentElasticsearchTopologyConfig[];
    /**
     * Unique topology identifier. It generally refers to an Elasticsearch data tier, such as `hotContent`, `warm`, `cold`, `coordinating`, `frozen`, `ml` or `master`.
     */
    id: string;
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId: string;
    nodeRoles: string[];
    /**
     * The node type for the Elasticsearch cluster (data node).
     */
    nodeTypeData: string;
    /**
     * The node type for the Elasticsearch cluster (ingest node).
     */
    nodeTypeIngest: string;
    /**
     * The node type for the Elasticsearch cluster (master node).
     */
    nodeTypeMaster: string;
    /**
     * The node type for the Elasticsearch cluster (machine learning node).
     */
    nodeTypeMl: string;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size: string;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: string;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount: number;
}

export interface DeploymentElasticsearchTopologyAutoscaling {
    /**
     * Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
     */
    maxSize: string;
    /**
     * Defines the resource type the scale up will use (Defaults to `"memory"`).
     */
    maxSizeResource: string;
    /**
     * Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
     */
    minSize: string;
    /**
     * Defines the resource type the scale down will use (Defaults to `"memory"`).
     */
    minSizeResource: string;
    policyOverrideJson: string;
}

export interface DeploymentElasticsearchTopologyConfig {
    /**
     * List of Elasticsearch supported plugins. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html).
     */
    plugins: string[];
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml: string;
}

export interface DeploymentElasticsearchTrustAccount {
    /**
     * The account identifier to establish the new trust with.
     */
    accountId: string;
    /**
     * If true, all clusters in this account will by default be trusted and the `trustAllowlist` is ignored.
     */
    trustAll: boolean;
    /**
     * The list of clusters to trust. Only used when `trustAll` is `false`.
     */
    trustAllowlists?: string[];
}

export interface DeploymentElasticsearchTrustExternal {
    /**
     * Identifier of the the trust relationship with external entities (remote environments, remote accounts...).
     */
    relationshipId: string;
    /**
     * If true, all clusters in this external entity will be trusted and the `trustAllowlist` is ignored.
     */
    trustAll: boolean;
    /**
     * The list of clusters to trust. Only used when `trustAll` is `false`.
     */
    trustAllowlists?: string[];
}

export interface DeploymentEnterpriseSearch {
    /**
     * Enterprise Search settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: outputs.DeploymentEnterpriseSearchConfig;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: string;
    httpEndpoint: string;
    httpsEndpoint: string;
    /**
     * Can be set on the Enterprise Search resource. The default value `main-enterprise_search` is recommended.
     */
    refId?: string;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: string;
    resourceId: string;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology: outputs.DeploymentEnterpriseSearchTopology;
}

export interface DeploymentEnterpriseSearchConfig {
    dockerImage?: string;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: string;
}

export interface DeploymentEnterpriseSearchTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId: string;
    nodeTypeAppserver: boolean;
    nodeTypeConnector: boolean;
    nodeTypeWorker: boolean;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size: string;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: string;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount: number;
}

export interface DeploymentIntegrationsServer {
    apmHttpsEndpoint: string;
    /**
     * Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: outputs.DeploymentIntegrationsServerConfig;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: string;
    fleetHttpsEndpoint: string;
    httpEndpoint: string;
    httpsEndpoint: string;
    /**
     * Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     */
    refId?: string;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: string;
    resourceId: string;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology: outputs.DeploymentIntegrationsServerTopology;
}

export interface DeploymentIntegrationsServerConfig {
    /**
     * Enable debug mode for APM servers. Defaults to `false`.
     */
    debugEnabled?: boolean;
    dockerImage?: string;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: string;
}

export interface DeploymentIntegrationsServerTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId: string;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size: string;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: string;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount: number;
}

export interface DeploymentKibana {
    /**
     * Kibana settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: outputs.DeploymentKibanaConfig;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: string;
    httpEndpoint: string;
    httpsEndpoint: string;
    /**
     * Can be set on the Kibana resource. The default value `main-kibana` is recommended.
     */
    refId?: string;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region: string;
    resourceId: string;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology: outputs.DeploymentKibanaTopology;
}

export interface DeploymentKibanaConfig {
    dockerImage?: string;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: string;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: string;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: string;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: string;
}

export interface DeploymentKibanaTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId: string;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size: string;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: string;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount: number;
}

export interface DeploymentObservability {
    /**
     * Remote deployment ID.
     */
    deploymentId: string;
    logs?: boolean;
    metrics?: boolean;
    /**
     * Can be set on the Elasticsearch resource. The default value `main-elasticsearch` is recommended.
     */
    refId: string;
}

export interface DeploymentTrafficFilterRule {
    /**
     * Azure endpoint GUID. Only applicable when the ruleset type is set to `"azurePrivateEndpoint"`.
     */
    azureEndpointGuid?: string;
    /**
     * Azure endpoint name. Only applicable when the ruleset type is set to `"azurePrivateEndpoint"`.
     */
    azureEndpointName?: string;
    /**
     * Description of this individual rule.
     */
    description?: string;
    /**
     * The ruleset ID.
     */
    id: string;
    /**
     * traffic filter source: IP address, CIDR mask, or VPC endpoint ID, **only required** when the type is not `"azurePrivateEndpoint"`.
     */
    source?: string;
}

export interface GetDeploymentApm {
    elasticsearchClusterRefId: string;
    /**
     * Overall health status of the deployment.
     */
    healthy: boolean;
    httpEndpoint: string;
    httpsEndpoint: string;
    refId: string;
    resourceId: string;
    status: string;
    topologies: outputs.GetDeploymentApmTopology[];
    version: string;
}

export interface GetDeploymentApmTopology {
    instanceConfigurationId: string;
    size: string;
    sizeResource: string;
    zoneCount: number;
}

export interface GetDeploymentElasticsearch {
    autoscale: string;
    cloudId: string;
    /**
     * Overall health status of the deployment.
     */
    healthy: boolean;
    httpEndpoint: string;
    httpsEndpoint: string;
    refId: string;
    resourceId: string;
    status: string;
    topologies: outputs.GetDeploymentElasticsearchTopology[];
    version: string;
}

export interface GetDeploymentElasticsearchTopology {
    autoscalings: outputs.GetDeploymentElasticsearchTopologyAutoscaling[];
    instanceConfigurationId: string;
    nodeRoles: string[];
    nodeTypeData: boolean;
    nodeTypeIngest: boolean;
    nodeTypeMaster: boolean;
    nodeTypeMl?: boolean;
    size: string;
    sizeResource: string;
    zoneCount: number;
}

export interface GetDeploymentElasticsearchTopologyAutoscaling {
    maxSize: string;
    maxSizeResource: string;
    minSize: string;
    minSizeResource: string;
    policyOverrideJson: string;
}

export interface GetDeploymentEnterpriseSearch {
    elasticsearchClusterRefId: string;
    /**
     * Overall health status of the deployment.
     */
    healthy: boolean;
    httpEndpoint: string;
    httpsEndpoint: string;
    refId: string;
    resourceId: string;
    status: string;
    topologies: outputs.GetDeploymentEnterpriseSearchTopology[];
    version: string;
}

export interface GetDeploymentEnterpriseSearchTopology {
    instanceConfigurationId: string;
    nodeTypeAppserver: boolean;
    nodeTypeConnector: boolean;
    nodeTypeWorker: boolean;
    size: string;
    sizeResource: string;
    zoneCount: number;
}

export interface GetDeploymentIntegrationsServer {
    elasticsearchClusterRefId: string;
    /**
     * Overall health status of the deployment.
     */
    healthy: boolean;
    httpEndpoint: string;
    httpsEndpoint: string;
    refId: string;
    resourceId: string;
    status: string;
    topologies: outputs.GetDeploymentIntegrationsServerTopology[];
    version: string;
}

export interface GetDeploymentIntegrationsServerTopology {
    instanceConfigurationId: string;
    size: string;
    sizeResource: string;
    zoneCount: number;
}

export interface GetDeploymentKibana {
    elasticsearchClusterRefId: string;
    /**
     * Overall health status of the deployment.
     */
    healthy: boolean;
    httpEndpoint: string;
    httpsEndpoint: string;
    refId: string;
    resourceId: string;
    status: string;
    topologies: outputs.GetDeploymentKibanaTopology[];
    version: string;
}

export interface GetDeploymentKibanaTopology {
    instanceConfigurationId: string;
    size: string;
    sizeResource: string;
    zoneCount: number;
}

export interface GetDeploymentObservability {
    deploymentId: string;
    logs: boolean;
    metrics: boolean;
    refId: string;
}

export interface GetDeploymentsApm {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsDeployment {
    alias: string;
    apmRefId: string;
    apmResourceId: string;
    deploymentId: string;
    elasticsearchRefId: string;
    elasticsearchResourceId: string;
    enterpriseSearchRefId: string;
    enterpriseSearchResourceId: string;
    integrationsServerRefId: string;
    integrationsServerResourceId: string;
    kibanaRefId: string;
    kibanaResourceId: string;
    name: string;
}

export interface GetDeploymentsElasticsearch {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsEnterpriseSearch {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsIntegrationsServer {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsKibana {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetStackApm {
    capacityConstraintsMax: number;
    capacityConstraintsMin: number;
    compatibleNodeTypes: string[];
    defaultPlugins: string[];
    denylists: string[];
    dockerImage: string;
    plugins: string[];
}

export interface GetStackElasticsearch {
    capacityConstraintsMax: number;
    capacityConstraintsMin: number;
    compatibleNodeTypes: string[];
    defaultPlugins: string[];
    denylists: string[];
    dockerImage: string;
    plugins: string[];
}

export interface GetStackEnterpriseSearch {
    capacityConstraintsMax: number;
    capacityConstraintsMin: number;
    compatibleNodeTypes: string[];
    defaultPlugins: string[];
    denylists: string[];
    dockerImage: string;
    plugins: string[];
}

export interface GetStackKibana {
    capacityConstraintsMax: number;
    capacityConstraintsMin: number;
    compatibleNodeTypes: string[];
    defaultPlugins: string[];
    denylists: string[];
    dockerImage: string;
    plugins: string[];
}

