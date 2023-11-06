# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetStackResult',
    'AwaitableGetStackResult',
    'get_stack',
    'get_stack_output',
]

@pulumi.output_type
class GetStackResult:
    """
    A collection of values returned by getStack.
    """
    def __init__(__self__, accessible=None, allowlisted=None, apms=None, elasticsearches=None, enterprise_searches=None, id=None, kibanas=None, lock=None, min_upgradable_from=None, region=None, upgradable_tos=None, version=None, version_regex=None):
        if accessible and not isinstance(accessible, bool):
            raise TypeError("Expected argument 'accessible' to be a bool")
        pulumi.set(__self__, "accessible", accessible)
        if allowlisted and not isinstance(allowlisted, bool):
            raise TypeError("Expected argument 'allowlisted' to be a bool")
        pulumi.set(__self__, "allowlisted", allowlisted)
        if apms and not isinstance(apms, list):
            raise TypeError("Expected argument 'apms' to be a list")
        pulumi.set(__self__, "apms", apms)
        if elasticsearches and not isinstance(elasticsearches, list):
            raise TypeError("Expected argument 'elasticsearches' to be a list")
        pulumi.set(__self__, "elasticsearches", elasticsearches)
        if enterprise_searches and not isinstance(enterprise_searches, list):
            raise TypeError("Expected argument 'enterprise_searches' to be a list")
        pulumi.set(__self__, "enterprise_searches", enterprise_searches)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kibanas and not isinstance(kibanas, list):
            raise TypeError("Expected argument 'kibanas' to be a list")
        pulumi.set(__self__, "kibanas", kibanas)
        if lock and not isinstance(lock, bool):
            raise TypeError("Expected argument 'lock' to be a bool")
        pulumi.set(__self__, "lock", lock)
        if min_upgradable_from and not isinstance(min_upgradable_from, str):
            raise TypeError("Expected argument 'min_upgradable_from' to be a str")
        pulumi.set(__self__, "min_upgradable_from", min_upgradable_from)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if upgradable_tos and not isinstance(upgradable_tos, list):
            raise TypeError("Expected argument 'upgradable_tos' to be a list")
        pulumi.set(__self__, "upgradable_tos", upgradable_tos)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if version_regex and not isinstance(version_regex, str):
            raise TypeError("Expected argument 'version_regex' to be a str")
        pulumi.set(__self__, "version_regex", version_regex)

    @property
    @pulumi.getter
    def accessible(self) -> bool:
        """
        To have this version accessible/not accessible by the calling user. This is only relevant for Elasticsearch Service (ESS), not for ECE.
        """
        return pulumi.get(self, "accessible")

    @property
    @pulumi.getter
    def allowlisted(self) -> bool:
        """
        To include/not include this version in the `allowlist`. This is only relevant for Elasticsearch Service (ESS), not for ECE.
        """
        return pulumi.get(self, "allowlisted")

    @property
    @pulumi.getter
    def apms(self) -> Sequence['outputs.GetStackApmResult']:
        """
        Information for APM workloads on this stack version.
        """
        return pulumi.get(self, "apms")

    @property
    @pulumi.getter
    def elasticsearches(self) -> Sequence['outputs.GetStackElasticsearchResult']:
        """
        Information for Elasticsearch workloads on this stack version.
        """
        return pulumi.get(self, "elasticsearches")

    @property
    @pulumi.getter(name="enterpriseSearches")
    def enterprise_searches(self) -> Sequence['outputs.GetStackEnterpriseSearchResult']:
        """
        Information for Enterprise Search workloads on this stack version.
        """
        return pulumi.get(self, "enterprise_searches")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique identifier of this data source.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kibanas(self) -> Sequence['outputs.GetStackKibanaResult']:
        """
        Information for Kibana workloads on this stack version.
        """
        return pulumi.get(self, "kibanas")

    @property
    @pulumi.getter
    def lock(self) -> Optional[bool]:
        """
        Lock the `latest` `version_regex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
        """
        return pulumi.get(self, "lock")

    @property
    @pulumi.getter(name="minUpgradableFrom")
    def min_upgradable_from(self) -> str:
        """
        The minimum stack version which can be upgraded to this stack version.
        """
        return pulumi.get(self, "min_upgradable_from")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="upgradableTos")
    def upgradable_tos(self) -> Sequence[str]:
        """
        A list of stack versions which this stack version can be upgraded to.
        """
        return pulumi.get(self, "upgradable_tos")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        The stack version
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="versionRegex")
    def version_regex(self) -> str:
        """
        Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
        """
        return pulumi.get(self, "version_regex")


class AwaitableGetStackResult(GetStackResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStackResult(
            accessible=self.accessible,
            allowlisted=self.allowlisted,
            apms=self.apms,
            elasticsearches=self.elasticsearches,
            enterprise_searches=self.enterprise_searches,
            id=self.id,
            kibanas=self.kibanas,
            lock=self.lock,
            min_upgradable_from=self.min_upgradable_from,
            region=self.region,
            upgradable_tos=self.upgradable_tos,
            version=self.version,
            version_regex=self.version_regex)


def get_stack(lock: Optional[bool] = None,
              region: Optional[str] = None,
              version_regex: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStackResult:
    """
    Use this data source to retrieve information about an existing Elastic Cloud stack.

      > **Note on regions** Before you start, you might want to check the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions available in Elasticsearch Service (ESS).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    latest = ec.get_stack(lock=True,
        region="us-east-1",
        version_regex="latest")
    latest_patch = ec.get_stack(region="us-east-1",
        version_regex="7.9.?")
    ```


    :param bool lock: Lock the `latest` `version_regex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
    :param str region: Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
    :param str version_regex: Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
    """
    __args__ = dict()
    __args__['lock'] = lock
    __args__['region'] = region
    __args__['versionRegex'] = version_regex
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('ec:index/getStack:getStack', __args__, opts=opts, typ=GetStackResult).value

    return AwaitableGetStackResult(
        accessible=pulumi.get(__ret__, 'accessible'),
        allowlisted=pulumi.get(__ret__, 'allowlisted'),
        apms=pulumi.get(__ret__, 'apms'),
        elasticsearches=pulumi.get(__ret__, 'elasticsearches'),
        enterprise_searches=pulumi.get(__ret__, 'enterprise_searches'),
        id=pulumi.get(__ret__, 'id'),
        kibanas=pulumi.get(__ret__, 'kibanas'),
        lock=pulumi.get(__ret__, 'lock'),
        min_upgradable_from=pulumi.get(__ret__, 'min_upgradable_from'),
        region=pulumi.get(__ret__, 'region'),
        upgradable_tos=pulumi.get(__ret__, 'upgradable_tos'),
        version=pulumi.get(__ret__, 'version'),
        version_regex=pulumi.get(__ret__, 'version_regex'))


@_utilities.lift_output_func(get_stack)
def get_stack_output(lock: Optional[pulumi.Input[Optional[bool]]] = None,
                     region: Optional[pulumi.Input[str]] = None,
                     version_regex: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStackResult]:
    """
    Use this data source to retrieve information about an existing Elastic Cloud stack.

      > **Note on regions** Before you start, you might want to check the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions available in Elasticsearch Service (ESS).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    latest = ec.get_stack(lock=True,
        region="us-east-1",
        version_regex="latest")
    latest_patch = ec.get_stack(region="us-east-1",
        version_regex="7.9.?")
    ```


    :param bool lock: Lock the `latest` `version_regex` obtained, so that the new stack release doesn't cascade the changes down to the deployments. It can be changed at any time.
    :param str region: Region where the stack pack is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`.
    :param str version_regex: Regex to filter the available stacks. Can be any valid regex expression, when multiple stacks are matched through a regex, the latest version is returned. `latest` is also accepted to obtain the latest available stack version.
    """
    ...
