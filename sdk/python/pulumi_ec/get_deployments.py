# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetDeploymentsResult',
    'AwaitableGetDeploymentsResult',
    'get_deployments',
    'get_deployments_output',
]

@pulumi.output_type
class GetDeploymentsResult:
    """
    A collection of values returned by getDeployments.
    """
    def __init__(__self__, apms=None, deployment_template_id=None, deployments=None, elasticsearches=None, enterprise_searches=None, healthy=None, id=None, integrations_servers=None, kibanas=None, name=None, name_prefix=None, return_count=None, size=None, tags=None):
        if apms and not isinstance(apms, list):
            raise TypeError("Expected argument 'apms' to be a list")
        pulumi.set(__self__, "apms", apms)
        if deployment_template_id and not isinstance(deployment_template_id, str):
            raise TypeError("Expected argument 'deployment_template_id' to be a str")
        pulumi.set(__self__, "deployment_template_id", deployment_template_id)
        if deployments and not isinstance(deployments, list):
            raise TypeError("Expected argument 'deployments' to be a list")
        pulumi.set(__self__, "deployments", deployments)
        if elasticsearches and not isinstance(elasticsearches, list):
            raise TypeError("Expected argument 'elasticsearches' to be a list")
        pulumi.set(__self__, "elasticsearches", elasticsearches)
        if enterprise_searches and not isinstance(enterprise_searches, list):
            raise TypeError("Expected argument 'enterprise_searches' to be a list")
        pulumi.set(__self__, "enterprise_searches", enterprise_searches)
        if healthy and not isinstance(healthy, str):
            raise TypeError("Expected argument 'healthy' to be a str")
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
        if name_prefix and not isinstance(name_prefix, str):
            raise TypeError("Expected argument 'name_prefix' to be a str")
        pulumi.set(__self__, "name_prefix", name_prefix)
        if return_count and not isinstance(return_count, int):
            raise TypeError("Expected argument 'return_count' to be a int")
        pulumi.set(__self__, "return_count", return_count)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def apms(self) -> Optional[Sequence['outputs.GetDeploymentsApmResult']]:
        """
        Filter by APM resource kind status or configuration.
        """
        return pulumi.get(self, "apms")

    @property
    @pulumi.getter(name="deploymentTemplateId")
    def deployment_template_id(self) -> Optional[str]:
        """
        Filter the result set by the ID of the deployment template the deployment is based off.
        """
        return pulumi.get(self, "deployment_template_id")

    @property
    @pulumi.getter
    def deployments(self) -> Sequence['outputs.GetDeploymentsDeploymentResult']:
        """
        List of deployments which match the specified query.
        """
        return pulumi.get(self, "deployments")

    @property
    @pulumi.getter
    def elasticsearches(self) -> Optional[Sequence['outputs.GetDeploymentsElasticsearchResult']]:
        """
        Filter by Elasticsearch resource kind status or configuration.
        """
        return pulumi.get(self, "elasticsearches")

    @property
    @pulumi.getter(name="enterpriseSearches")
    def enterprise_searches(self) -> Optional[Sequence['outputs.GetDeploymentsEnterpriseSearchResult']]:
        """
        Filter by Enterprise Search resource kind status or configuration.
        """
        return pulumi.get(self, "enterprise_searches")

    @property
    @pulumi.getter
    def healthy(self) -> Optional[str]:
        """
        Filter the result set by their health status.
        """
        return pulumi.get(self, "healthy")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique identifier of this data source.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationsServers")
    def integrations_servers(self) -> Optional[Sequence['outputs.GetDeploymentsIntegrationsServerResult']]:
        """
        Filter by Integrations Server resource kind status or configuration.
        """
        return pulumi.get(self, "integrations_servers")

    @property
    @pulumi.getter
    def kibanas(self) -> Optional[Sequence['outputs.GetDeploymentsKibanaResult']]:
        """
        Filter by Kibana resource kind status or configuration.
        """
        return pulumi.get(self, "kibanas")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Filter the result by the full deployment name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[str]:
        """
        Prefix to filter the returned deployment list by.
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="returnCount")
    def return_count(self) -> int:
        """
        The number of deployments actually returned.
        """
        return pulumi.get(self, "return_count")

    @property
    @pulumi.getter
    def size(self) -> Optional[int]:
        """
        The maximum number of deployments to return. Defaults to `100`.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        Filter the result set by their assigned tags.
        """
        return pulumi.get(self, "tags")


class AwaitableGetDeploymentsResult(GetDeploymentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeploymentsResult(
            apms=self.apms,
            deployment_template_id=self.deployment_template_id,
            deployments=self.deployments,
            elasticsearches=self.elasticsearches,
            enterprise_searches=self.enterprise_searches,
            healthy=self.healthy,
            id=self.id,
            integrations_servers=self.integrations_servers,
            kibanas=self.kibanas,
            name=self.name,
            name_prefix=self.name_prefix,
            return_count=self.return_count,
            size=self.size,
            tags=self.tags)


def get_deployments(apms: Optional[Sequence[pulumi.InputType['GetDeploymentsApmArgs']]] = None,
                    deployment_template_id: Optional[str] = None,
                    elasticsearches: Optional[Sequence[pulumi.InputType['GetDeploymentsElasticsearchArgs']]] = None,
                    enterprise_searches: Optional[Sequence[pulumi.InputType['GetDeploymentsEnterpriseSearchArgs']]] = None,
                    healthy: Optional[str] = None,
                    integrations_servers: Optional[Sequence[pulumi.InputType['GetDeploymentsIntegrationsServerArgs']]] = None,
                    kibanas: Optional[Sequence[pulumi.InputType['GetDeploymentsKibanaArgs']]] = None,
                    name: Optional[str] = None,
                    name_prefix: Optional[str] = None,
                    size: Optional[int] = None,
                    tags: Optional[Mapping[str, str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeploymentsResult:
    """
    Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_ec as ec

    example = ec.get_deployments(name_prefix="test",
        deployment_template_id="azure-compute-optimized",
        size=200,
        tags={
            "foo": "bar",
        },
        elasticsearches=[ec.GetDeploymentsElasticsearchArgs(
            healthy="true",
        )],
        kibanas=[ec.GetDeploymentsKibanaArgs(
            status="started",
        )],
        integrations_servers=[ec.GetDeploymentsIntegrationsServerArgs(
            version="8.0.0",
        )],
        enterprise_searches=[ec.GetDeploymentsEnterpriseSearchArgs(
            healthy="true",
        )])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetDeploymentsApmArgs']] apms: Filter by APM resource kind status or configuration.
    :param str deployment_template_id: Filter the result set by the ID of the deployment template the deployment is based off.
    :param Sequence[pulumi.InputType['GetDeploymentsElasticsearchArgs']] elasticsearches: Filter by Elasticsearch resource kind status or configuration.
    :param Sequence[pulumi.InputType['GetDeploymentsEnterpriseSearchArgs']] enterprise_searches: Filter by Enterprise Search resource kind status or configuration.
    :param str healthy: Overall health status of the resource instances.
    :param Sequence[pulumi.InputType['GetDeploymentsIntegrationsServerArgs']] integrations_servers: Filter by Integrations Server resource kind status or configuration.
    :param Sequence[pulumi.InputType['GetDeploymentsKibanaArgs']] kibanas: Filter by Kibana resource kind status or configuration.
    :param str name: The name of the deployment.
    :param str name_prefix: Prefix to filter the returned deployment list by.
    :param int size: The maximum number of deployments to return. Defaults to `100`.
    :param Mapping[str, str] tags: Filter the result set by their assigned tags.
    """
    __args__ = dict()
    __args__['apms'] = apms
    __args__['deploymentTemplateId'] = deployment_template_id
    __args__['elasticsearches'] = elasticsearches
    __args__['enterpriseSearches'] = enterprise_searches
    __args__['healthy'] = healthy
    __args__['integrationsServers'] = integrations_servers
    __args__['kibanas'] = kibanas
    __args__['name'] = name
    __args__['namePrefix'] = name_prefix
    __args__['size'] = size
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('ec:index/getDeployments:getDeployments', __args__, opts=opts, typ=GetDeploymentsResult).value

    return AwaitableGetDeploymentsResult(
        apms=pulumi.get(__ret__, 'apms'),
        deployment_template_id=pulumi.get(__ret__, 'deployment_template_id'),
        deployments=pulumi.get(__ret__, 'deployments'),
        elasticsearches=pulumi.get(__ret__, 'elasticsearches'),
        enterprise_searches=pulumi.get(__ret__, 'enterprise_searches'),
        healthy=pulumi.get(__ret__, 'healthy'),
        id=pulumi.get(__ret__, 'id'),
        integrations_servers=pulumi.get(__ret__, 'integrations_servers'),
        kibanas=pulumi.get(__ret__, 'kibanas'),
        name=pulumi.get(__ret__, 'name'),
        name_prefix=pulumi.get(__ret__, 'name_prefix'),
        return_count=pulumi.get(__ret__, 'return_count'),
        size=pulumi.get(__ret__, 'size'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_deployments)
def get_deployments_output(apms: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDeploymentsApmArgs']]]]] = None,
                           deployment_template_id: Optional[pulumi.Input[Optional[str]]] = None,
                           elasticsearches: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDeploymentsElasticsearchArgs']]]]] = None,
                           enterprise_searches: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDeploymentsEnterpriseSearchArgs']]]]] = None,
                           healthy: Optional[pulumi.Input[Optional[str]]] = None,
                           integrations_servers: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDeploymentsIntegrationsServerArgs']]]]] = None,
                           kibanas: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDeploymentsKibanaArgs']]]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           name_prefix: Optional[pulumi.Input[Optional[str]]] = None,
                           size: Optional[pulumi.Input[Optional[int]]] = None,
                           tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeploymentsResult]:
    """
    Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_ec as ec

    example = ec.get_deployments(name_prefix="test",
        deployment_template_id="azure-compute-optimized",
        size=200,
        tags={
            "foo": "bar",
        },
        elasticsearches=[ec.GetDeploymentsElasticsearchArgs(
            healthy="true",
        )],
        kibanas=[ec.GetDeploymentsKibanaArgs(
            status="started",
        )],
        integrations_servers=[ec.GetDeploymentsIntegrationsServerArgs(
            version="8.0.0",
        )],
        enterprise_searches=[ec.GetDeploymentsEnterpriseSearchArgs(
            healthy="true",
        )])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetDeploymentsApmArgs']] apms: Filter by APM resource kind status or configuration.
    :param str deployment_template_id: Filter the result set by the ID of the deployment template the deployment is based off.
    :param Sequence[pulumi.InputType['GetDeploymentsElasticsearchArgs']] elasticsearches: Filter by Elasticsearch resource kind status or configuration.
    :param Sequence[pulumi.InputType['GetDeploymentsEnterpriseSearchArgs']] enterprise_searches: Filter by Enterprise Search resource kind status or configuration.
    :param str healthy: Overall health status of the resource instances.
    :param Sequence[pulumi.InputType['GetDeploymentsIntegrationsServerArgs']] integrations_servers: Filter by Integrations Server resource kind status or configuration.
    :param Sequence[pulumi.InputType['GetDeploymentsKibanaArgs']] kibanas: Filter by Kibana resource kind status or configuration.
    :param str name: The name of the deployment.
    :param str name_prefix: Prefix to filter the returned deployment list by.
    :param int size: The maximum number of deployments to return. Defaults to `100`.
    :param Mapping[str, str] tags: Filter the result set by their assigned tags.
    """
    ...
