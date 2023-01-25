// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DeploymentApm {
    /**
     * APM settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: pulumi.Input<inputs.DeploymentApmConfig>;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: pulumi.Input<string>;
    httpEndpoint?: pulumi.Input<string>;
    httpsEndpoint?: pulumi.Input<string>;
    /**
     * Can be set on the APM resource. The default value `main-apm` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology?: pulumi.Input<inputs.DeploymentApmTopology>;
}

export interface DeploymentApmConfig {
    /**
     * Enable debug mode for APM servers. Defaults to `false`.
     */
    debugEnabled?: pulumi.Input<boolean>;
    dockerImage?: pulumi.Input<string>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentApmTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId?: pulumi.Input<string>;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size?: pulumi.Input<string>;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: pulumi.Input<string>;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount?: pulumi.Input<number>;
}

export interface DeploymentElasticsearch {
    /**
     * Enable or disable autoscaling. Defaults to the setting coming from the deployment template. Accepted values are `"true"` or `"false"`.
     */
    autoscale?: pulumi.Input<string>;
    cloudId?: pulumi.Input<string>;
    /**
     * Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: pulumi.Input<inputs.DeploymentElasticsearchConfig>;
    /**
     * Custom Elasticsearch bundles or plugins. Can be set multiple times.
     */
    extensions?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchExtension>[]>;
    httpEndpoint?: pulumi.Input<string>;
    httpsEndpoint?: pulumi.Input<string>;
    /**
     * Can be set on the Elasticsearch resource. The default value `main-elasticsearch` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    /**
     * Elasticsearch remote clusters to configure for the Elasticsearch resource. Can be set multiple times.
     */
    remoteClusters?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchRemoteCluster>[]>;
    resourceId?: pulumi.Input<string>;
    /**
     * Restores data from a snapshot of another deployment.
     */
    snapshotSource?: pulumi.Input<inputs.DeploymentElasticsearchSnapshotSource>;
    /**
     * Choose the configuration strategy used to apply the changes.
     */
    strategy?: pulumi.Input<inputs.DeploymentElasticsearchStrategy>;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topologies?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchTopology>[]>;
    /**
     * The trust relationships with other ESS accounts.
     */
    trustAccounts?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchTrustAccount>[]>;
    /**
     * The trust relationship with external entities (remote environments, remote accounts...).
     */
    trustExternals?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchTrustExternal>[]>;
}

export interface DeploymentElasticsearchConfig {
    dockerImage?: pulumi.Input<string>;
    /**
     * List of Elasticsearch supported plugins. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html).
     */
    plugins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentElasticsearchExtension {
    /**
     * Extension name.
     */
    name: pulumi.Input<string>;
    /**
     * Extension type, only `bundle` or `plugin` are supported.
     */
    type: pulumi.Input<string>;
    /**
     * Bundle or plugin URL, the extension URL can be obtained from the `ec_deployment_extension.<name>.url` attribute or the API and cannot be a random HTTP address that is hosted elsewhere.
     */
    url: pulumi.Input<string>;
    /**
     * Elasticsearch compatibility version. Bundles should specify major or minor versions with wildcards, such as `7.*` or `*` but **plugins must use full version notation down to the patch level**, such as `7.10.1` and wildcards are not allowed.
     */
    version: pulumi.Input<string>;
}

export interface DeploymentElasticsearchRemoteCluster {
    /**
     * Alias for the Cross Cluster Search binding.
     */
    alias: pulumi.Input<string>;
    /**
     * Remote deployment ID.
     */
    deploymentId: pulumi.Input<string>;
    /**
     * Remote Elasticsearch `refId`. The default value `main-elasticsearch` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * If true, skip the cluster during search when disconnected. Defaults to `false`.
     */
    skipUnavailable?: pulumi.Input<boolean>;
}

export interface DeploymentElasticsearchSnapshotSource {
    /**
     * Name of the snapshot to restore. Use `__latest_success__` to get the most recent successful snapshot (Defaults to `__latest_success__`).
     */
    snapshotName?: pulumi.Input<string>;
    /**
     * ID of the Elasticsearch cluster, not to be confused with the deployment ID, that will be used as the source of the snapshot. The Elasticsearch cluster must be in the same region and must have a compatible version of the Elastic Stack.
     */
    sourceElasticsearchClusterId: pulumi.Input<string>;
}

export interface DeploymentElasticsearchStrategy {
    /**
     * Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rollingAll].
     */
    type: pulumi.Input<string>;
}

export interface DeploymentElasticsearchTopology {
    /**
     * Autoscaling policy defining the maximum and / or minimum total size for this topology element. For more information refer to the `autoscaling` block.
     */
    autoscaling?: pulumi.Input<inputs.DeploymentElasticsearchTopologyAutoscaling>;
    /**
     * Elasticsearch settings applied to all topologies unless overridden in the `topology` element.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.DeploymentElasticsearchTopologyConfig>[]>;
    /**
     * Unique topology identifier. It generally refers to an Elasticsearch data tier, such as `hotContent`, `warm`, `cold`, `coordinating`, `frozen`, `ml` or `master`.
     */
    id: pulumi.Input<string>;
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId?: pulumi.Input<string>;
    nodeRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The node type for the Elasticsearch cluster (data node).
     */
    nodeTypeData?: pulumi.Input<string>;
    /**
     * The node type for the Elasticsearch cluster (ingest node).
     */
    nodeTypeIngest?: pulumi.Input<string>;
    /**
     * The node type for the Elasticsearch cluster (master node).
     */
    nodeTypeMaster?: pulumi.Input<string>;
    /**
     * The node type for the Elasticsearch cluster (machine learning node).
     */
    nodeTypeMl?: pulumi.Input<string>;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size?: pulumi.Input<string>;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: pulumi.Input<string>;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount?: pulumi.Input<number>;
}

export interface DeploymentElasticsearchTopologyAutoscaling {
    /**
     * Defines the maximum size the deployment will scale up to. When set, scaling up will be enabled. All tiers should support this option.
     */
    maxSize?: pulumi.Input<string>;
    /**
     * Defines the resource type the scale up will use (Defaults to `"memory"`).
     */
    maxSizeResource?: pulumi.Input<string>;
    /**
     * Defines the minimum size the deployment will scale down to. When set, scale down will be enabled, please note that not all the tiers support this option.
     */
    minSize?: pulumi.Input<string>;
    /**
     * Defines the resource type the scale down will use (Defaults to `"memory"`).
     */
    minSizeResource?: pulumi.Input<string>;
    policyOverrideJson?: pulumi.Input<string>;
}

export interface DeploymentElasticsearchTopologyConfig {
    /**
     * List of Elasticsearch supported plugins. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html).
     */
    plugins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentElasticsearchTrustAccount {
    /**
     * The account identifier to establish the new trust with.
     */
    accountId: pulumi.Input<string>;
    /**
     * If true, all clusters in this account will by default be trusted and the `trustAllowlist` is ignored.
     */
    trustAll: pulumi.Input<boolean>;
    /**
     * The list of clusters to trust. Only used when `trustAll` is `false`.
     */
    trustAllowlists?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DeploymentElasticsearchTrustExternal {
    /**
     * Identifier of the the trust relationship with external entities (remote environments, remote accounts...).
     */
    relationshipId: pulumi.Input<string>;
    /**
     * If true, all clusters in this external entity will be trusted and the `trustAllowlist` is ignored.
     */
    trustAll: pulumi.Input<boolean>;
    /**
     * The list of clusters to trust. Only used when `trustAll` is `false`.
     */
    trustAllowlists?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DeploymentEnterpriseSearch {
    /**
     * Enterprise Search settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: pulumi.Input<inputs.DeploymentEnterpriseSearchConfig>;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: pulumi.Input<string>;
    httpEndpoint?: pulumi.Input<string>;
    httpsEndpoint?: pulumi.Input<string>;
    /**
     * Can be set on the Enterprise Search resource. The default value `main-enterprise_search` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology?: pulumi.Input<inputs.DeploymentEnterpriseSearchTopology>;
}

export interface DeploymentEnterpriseSearchConfig {
    dockerImage?: pulumi.Input<string>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentEnterpriseSearchTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId?: pulumi.Input<string>;
    nodeTypeAppserver?: pulumi.Input<boolean>;
    nodeTypeConnector?: pulumi.Input<boolean>;
    nodeTypeWorker?: pulumi.Input<boolean>;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size?: pulumi.Input<string>;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: pulumi.Input<string>;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount?: pulumi.Input<number>;
}

export interface DeploymentIntegrationsServer {
    apmHttpsEndpoint?: pulumi.Input<string>;
    /**
     * Integrations Server settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: pulumi.Input<inputs.DeploymentIntegrationsServerConfig>;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: pulumi.Input<string>;
    fleetHttpsEndpoint?: pulumi.Input<string>;
    httpEndpoint?: pulumi.Input<string>;
    httpsEndpoint?: pulumi.Input<string>;
    /**
     * Can be set on the Integrations Server resource. The default value `main-integrations_server` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology?: pulumi.Input<inputs.DeploymentIntegrationsServerTopology>;
}

export interface DeploymentIntegrationsServerConfig {
    /**
     * Enable debug mode for APM servers. Defaults to `false`.
     */
    debugEnabled?: pulumi.Input<boolean>;
    dockerImage?: pulumi.Input<string>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentIntegrationsServerTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId?: pulumi.Input<string>;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size?: pulumi.Input<string>;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: pulumi.Input<string>;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount?: pulumi.Input<number>;
}

export interface DeploymentKibana {
    /**
     * Kibana settings applied to all topologies unless overridden in the `topology` element.
     */
    config?: pulumi.Input<inputs.DeploymentKibanaConfig>;
    /**
     * This field references the `refId` of the deployment Elasticsearch cluster. The default value `main-elasticsearch` is recommended.
     */
    elasticsearchClusterRefId?: pulumi.Input<string>;
    httpEndpoint?: pulumi.Input<string>;
    httpsEndpoint?: pulumi.Input<string>;
    /**
     * Can be set on the Kibana resource. The default value `main-kibana` is recommended.
     */
    refId?: pulumi.Input<string>;
    /**
     * Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
     */
    region?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    /**
     * Can be set multiple times to compose complex topologies.
     */
    topology?: pulumi.Input<inputs.DeploymentKibanaTopology>;
}

export interface DeploymentKibanaConfig {
    dockerImage?: pulumi.Input<string>;
    /**
     * JSON-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsJson?: pulumi.Input<string>;
    /**
     * JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideJson?: pulumi.Input<string>;
    /**
     * YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
     */
    userSettingsOverrideYaml?: pulumi.Input<string>;
    /**
     * YAML-formatted user level `enterprise_search.yml` setting overrides.
     */
    userSettingsYaml?: pulumi.Input<string>;
}

export interface DeploymentKibanaTopology {
    /**
     * Default instance configuration of the deployment template. To change it, use the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
     */
    instanceConfigurationId?: pulumi.Input<string>;
    /**
     * Amount of memory (RAM) per `topology` element in the "<size in GB>g" notation. When omitted, it defaults to the deployment template value.
     */
    size?: pulumi.Input<string>;
    /**
     * Type of resource to which the size is assigned. Defaults to `"memory"`.
     */
    sizeResource?: pulumi.Input<string>;
    /**
     * Number of zones that the Enterprise Search deployment will span. This is used to set HA. When omitted, it defaults to the deployment template value.
     */
    zoneCount?: pulumi.Input<number>;
}

export interface DeploymentObservability {
    /**
     * Remote deployment ID.
     */
    deploymentId: pulumi.Input<string>;
    logs?: pulumi.Input<boolean>;
    metrics?: pulumi.Input<boolean>;
    /**
     * Can be set on the Elasticsearch resource. The default value `main-elasticsearch` is recommended.
     */
    refId?: pulumi.Input<string>;
}

export interface DeploymentTrafficFilterRule {
    /**
     * Azure endpoint GUID. Only applicable when the ruleset type is set to `"azurePrivateEndpoint"`.
     */
    azureEndpointGuid?: pulumi.Input<string>;
    /**
     * Azure endpoint name. Only applicable when the ruleset type is set to `"azurePrivateEndpoint"`.
     */
    azureEndpointName?: pulumi.Input<string>;
    /**
     * Description of this individual rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The ruleset ID.
     */
    id?: pulumi.Input<string>;
    /**
     * traffic filter source: IP address, CIDR mask, or VPC endpoint ID, **only required** when the type is not `"azurePrivateEndpoint"`.
     */
    source?: pulumi.Input<string>;
}

export interface GetDeploymentsApm {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsApmArgs {
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
}

export interface GetDeploymentsElasticsearch {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsElasticsearchArgs {
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
}

export interface GetDeploymentsEnterpriseSearch {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsEnterpriseSearchArgs {
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
}

export interface GetDeploymentsIntegrationsServer {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsIntegrationsServerArgs {
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
}

export interface GetDeploymentsKibana {
    /**
     * Overall health status of the deployment.
     */
    healthy?: string;
    status?: string;
    version?: string;
}

export interface GetDeploymentsKibanaArgs {
    /**
     * Overall health status of the deployment.
     */
    healthy?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
}

