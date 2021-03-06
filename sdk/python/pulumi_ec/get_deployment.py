# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetDeploymentResult',
    'AwaitableGetDeploymentResult',
    'get_deployment',
    'get_deployment_output',
]

@pulumi.output_type
class GetDeploymentResult:
    """
    A collection of values returned by getDeployment.
    """
    def __init__(__self__, alias=None, apms=None, deployment_template_id=None, elasticsearches=None, enterprise_searches=None, healthy=None, id=None, integrations_servers=None, kibanas=None, name=None, observabilities=None, region=None, tags=None, traffic_filters=None):
        if alias and not isinstance(alias, str):
            raise TypeError("Expected argument 'alias' to be a str")
        pulumi.set(__self__, "alias", alias)
        if apms and not isinstance(apms, list):
            raise TypeError("Expected argument 'apms' to be a list")
        pulumi.set(__self__, "apms", apms)
        if deployment_template_id and not isinstance(deployment_template_id, str):
            raise TypeError("Expected argument 'deployment_template_id' to be a str")
        pulumi.set(__self__, "deployment_template_id", deployment_template_id)
        if elasticsearches and not isinstance(elasticsearches, list):
            raise TypeError("Expected argument 'elasticsearches' to be a list")
        pulumi.set(__self__, "elasticsearches", elasticsearches)
        if enterprise_searches and not isinstance(enterprise_searches, list):
            raise TypeError("Expected argument 'enterprise_searches' to be a list")
        pulumi.set(__self__, "enterprise_searches", enterprise_searches)
        if healthy and not isinstance(healthy, bool):
            raise TypeError("Expected argument 'healthy' to be a bool")
        pulumi.set(__self__, "healthy", healthy)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integrations_servers and not isinstance(integrations_servers, list):
            raise TypeError("Expected argument 'integrations_servers' to be a list")
        pulumi.set(__self__, "integrations_servers", integrations_servers)
        if kibanas and not isinstance(kibanas, list):
            raise TypeError("Expected argument 'kibanas' to be a list")
        pulumi.set(__self__, "kibanas", kibanas)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if observabilities and not isinstance(observabilities, list):
            raise TypeError("Expected argument 'observabilities' to be a list")
        pulumi.set(__self__, "observabilities", observabilities)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if traffic_filters and not isinstance(traffic_filters, list):
            raise TypeError("Expected argument 'traffic_filters' to be a list")
        pulumi.set(__self__, "traffic_filters", traffic_filters)

    @property
    @pulumi.getter
    def alias(self) -> str:
        """
        Deployment alias.
        """
        return pulumi.get(self, "alias")

    @property
    @pulumi.getter
    def apms(self) -> Sequence['outputs.GetDeploymentApmResult']:
        """
        Instance configuration of the APM type.
        * `apm.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        * `apm.#.healthy` - Resource kind health status.
        * `apm.#.http_endpoint` - HTTP endpoint for the resource kind.
        * `apm.#.https_endpoint` - HTTPS endpoint for the resource kind.
        * `apm.#.ref_id` - User specified ref_id for the resource kind.
        * `apm.#.resource_id` - The resource unique identifier.
        * `apm.#.status` - Resource kind status (for example, "started", "stopped", etc).
        * `apm.#.version` - Elastic stack version.
        * `apm.#.topology` - Node topology element definition.
        * `apm.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        * `apm.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
        * `apm.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        """
        return pulumi.get(self, "apms")

    @property
    @pulumi.getter(name="deploymentTemplateId")
    def deployment_template_id(self) -> str:
        """
        ID of the deployment template used to create the deployment.
        """
        return pulumi.get(self, "deployment_template_id")

    @property
    @pulumi.getter
    def elasticsearches(self) -> Sequence['outputs.GetDeploymentElasticsearchResult']:
        """
        Instance configuration of the Elasticsearch resource kind.
        * `elasticsearch.#.autoscale` - Whether or not Elasticsearch autoscaling is enabled.
        * `elasticsearch.#.healthy` - Resource kind health status.
        * `elasticsearch.#.cloud_id` - The encoded Elasticsearch credentials to use in Beats or Logstash. See [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html) for more information.
        * `elasticsearch.#.http_endpoint` - HTTP endpoint for the resource kind.
        * `elasticsearch.#.https_endpoint` - HTTPS endpoint for the resource kind.
        * `elasticsearch.#.ref_id` - User specified ref_id for the resource kind.
        * `elasticsearch.#.resource_id` - The resource unique identifier.
        * `elasticsearch.#.status` - Resource kind status (for example, "started", "stopped", etc).
        * `elasticsearch.#.version` - Elastic stack version.
        * `elasticsearch.#.topology` - Topology element definition.
        * `elasticsearch.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        * `elasticsearch.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
        * `elasticsearch.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        * `elasticsearch.#.topology.#.node_roles` - Defines the list of Elasticsearch node roles assigned to the topology element (>=7.10.0).
        * `elasticsearch.#.topology.#.node_type_data` - Defines whether this node can hold data (<7.10.0).
        * `elasticsearch.#.topology.#.node_type_master` - Defines whether this node can be elected master (<7.10.0).
        * `elasticsearch.#.topology.#.node_type_ingest` - Defines whether this node can run an ingest pipeline (<7.10.0).
        * `elasticsearch.#.topology.#.node_type_ml` - Defines whether this node can run ML jobs (<7.10.0).
        * `elasticsearch.#.topology.#.autoscaling.#.max_size` - The maximum size for the scale up policy.
        * `elasticsearch.#.topology.#.autoscaling.#.max_size_resource` - The maximum size resource for the scale up policy.
        * `elasticsearch.#.topology.#.autoscaling.#.min_size` - The minimum size for the scale down policy.
        * `elasticsearch.#.topology.#.autoscaling.#.min_size_resource` - The minimum size for the scale down policy.
        * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - The advanced policy overrides for the autoscaling policy.
        """
        return pulumi.get(self, "elasticsearches")

    @property
    @pulumi.getter(name="enterpriseSearches")
    def enterprise_searches(self) -> Sequence['outputs.GetDeploymentEnterpriseSearchResult']:
        """
        Instance configuration of the Enterprise Search type.
        * `enterprise_search.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        * `enterprise_search.#.healthy` - Resource kind health status.
        * `enterprise_search.#.http_endpoint` - HTTP endpoint for the resource kind.
        * `enterprise_search.#.https_endpoint` - HTTPS endpoint for the resource kind.
        * `enterprise_search.#.ref_id` - User specified ref_id for the resource kind.
        * `enterprise_search.#.resource_id` - The resource unique identifier.
        * `enterprise_search.#.status` - Resource kind status (for example, "started", "stopped", etc).
        * `enterprise_search.#.version` - Elastic stack version.
        * `enterprise_search.#.topology` - Node topology element definition.
        * `enterprise_search.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        * `enterprise_search.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
        * `enterprise_search.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        * `enterprise_search.#.topology.#.node_type_appserver` - Defines whether this instance should run as application/API server.
        * `enterprise_search.#.topology.#.node_type_connector` - Defines whether this instance should run as connector.
        * `enterprise_search.#.topology.#.node_type_worker` - Defines whether this instance should run as background worker.
        """
        return pulumi.get(self, "enterprise_searches")

    @property
    @pulumi.getter
    def healthy(self) -> bool:
        """
        Overall health status of the deployment.
        """
        return pulumi.get(self, "healthy")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of the deployment.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationsServers")
    def integrations_servers(self) -> Sequence['outputs.GetDeploymentIntegrationsServerResult']:
        """
        Instance configuration of the Integrations Server type.
        * `integrations_server.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        * `integrations_server.#.healthy` - Resource kind health status.
        * `integrations_server.#.http_endpoint` - HTTP endpoint for the resource kind.
        * `integrations_server.#.https_endpoint` - HTTPS endpoint for the resource kind.
        * `integrations_server.#.ref_id` - User specified ref_id for the resource kind.
        * `integrations_server.#.resource_id` - The resource unique identifier.
        * `integrations_server.#.status` - Resource kind status (for example, "started", "stopped", etc).
        * `integrations_server.#.version` - Elastic stack version.
        * `integrations_server.#.topology` - Node topology element definition.
        * `integrations_server.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        * `integrations_server.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
        * `integrations_server.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        """
        return pulumi.get(self, "integrations_servers")

    @property
    @pulumi.getter
    def kibanas(self) -> Sequence['outputs.GetDeploymentKibanaResult']:
        """
        Instance configuration of the Kibana type.
        * `kibana.#.elasticsearch_cluster_ref_id` - The user-specified ID of the Elasticsearch cluster to which this resource kind will link.
        * `kibana.#.healthy` - Resource kind health status.
        * `kibana.#.http_endpoint` - HTTP endpoint for the resource kind.
        * `kibana.#.https_endpoint` - HTTPS endpoint for the resource kind.
        * `kibana.#.ref_id` - User specified ref_id for the resource kind.
        * `kibana.#.resource_id` - The resource unique identifier.
        * `kibana.#.status` - Resource kind status (for example, "started", "stopped", etc).
        * `kibana.#.version` - Elastic stack version.
        * `kibana.#.topology` - Node topology element definition.
        * `kibana.#.topology.#.instance_configuration_id` - Controls the allocation of this topology element as well as allowed sizes and node_types. It needs to match the ID of an existing instance configuration.
        * `kibana.#.topology.#.size` - Amount of memory (RAM) per topology element in the "<size in GB>g" notation.
        * `kibana.#.topology.#.zone_count` - Number of zones in which nodes will be placed.
        """
        return pulumi.get(self, "kibanas")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the deployment.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def observabilities(self) -> Sequence['outputs.GetDeploymentObservabilityResult']:
        return pulumi.get(self, "observabilities")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Region where the deployment can be found.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="trafficFilters")
    def traffic_filters(self) -> Sequence[str]:
        """
        Traffic filter block, which contains a list of traffic filter rule identifiers.
        * `tags` Key value map of arbitrary string tags.
        * `observability` Observability settings. Information about logs and metrics shipped to a dedicated deployment.
        * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
        * `observability.#.ref_id` - Elasticsearch resource kind ref_id of the destination deployment.
        * `observability.#.logs` - Defines whether logs are enabled or disabled.
        * `observability.#.metrics` - Defines whether metrics are enabled or disabled.
        """
        return pulumi.get(self, "traffic_filters")


class AwaitableGetDeploymentResult(GetDeploymentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeploymentResult(
            alias=self.alias,
            apms=self.apms,
            deployment_template_id=self.deployment_template_id,
            elasticsearches=self.elasticsearches,
            enterprise_searches=self.enterprise_searches,
            healthy=self.healthy,
            id=self.id,
            integrations_servers=self.integrations_servers,
            kibanas=self.kibanas,
            name=self.name,
            observabilities=self.observabilities,
            region=self.region,
            tags=self.tags,
            traffic_filters=self.traffic_filters)


def get_deployment(id: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeploymentResult:
    """
    Use this data source to retrieve information about an existing Elastic Cloud deployment.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    example = ec.get_deployment(id="f759065e5e64e9f3546f6c44f2743893")
    ```


    :param str id: The ID of an existing Elastic Cloud deployment.
    """
    __args__ = dict()
    __args__['id'] = id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('ec:index/getDeployment:getDeployment', __args__, opts=opts, typ=GetDeploymentResult).value

    return AwaitableGetDeploymentResult(
        alias=__ret__.alias,
        apms=__ret__.apms,
        deployment_template_id=__ret__.deployment_template_id,
        elasticsearches=__ret__.elasticsearches,
        enterprise_searches=__ret__.enterprise_searches,
        healthy=__ret__.healthy,
        id=__ret__.id,
        integrations_servers=__ret__.integrations_servers,
        kibanas=__ret__.kibanas,
        name=__ret__.name,
        observabilities=__ret__.observabilities,
        region=__ret__.region,
        tags=__ret__.tags,
        traffic_filters=__ret__.traffic_filters)


@_utilities.lift_output_func(get_deployment)
def get_deployment_output(id: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeploymentResult]:
    """
    Use this data source to retrieve information about an existing Elastic Cloud deployment.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    example = ec.get_deployment(id="f759065e5e64e9f3546f6c44f2743893")
    ```


    :param str id: The ID of an existing Elastic Cloud deployment.
    """
    ...
