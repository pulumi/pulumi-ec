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

__all__ = [
    'GetTrafficFilterResult',
    'AwaitableGetTrafficFilterResult',
    'get_traffic_filter',
    'get_traffic_filter_output',
]

@pulumi.output_type
class GetTrafficFilterResult:
    """
    A collection of values returned by getTrafficFilter.
    """
    def __init__(__self__, id=None, name=None, region=None, rulesets=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if rulesets and not isinstance(rulesets, list):
            raise TypeError("Expected argument 'rulesets' to be a list")
        pulumi.set(__self__, "rulesets", rulesets)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        """
        The id of the traffic filter to select.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The exact name of the traffic filter to select.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        """
        Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def rulesets(self) -> Sequence['outputs.GetTrafficFilterRulesetResult']:
        """
        An individual ruleset
        """
        return pulumi.get(self, "rulesets")


class AwaitableGetTrafficFilterResult(GetTrafficFilterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTrafficFilterResult(
            id=self.id,
            name=self.name,
            region=self.region,
            rulesets=self.rulesets)


def get_traffic_filter(id: Optional[str] = None,
                       name: Optional[str] = None,
                       region: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTrafficFilterResult:
    """
    Use this data source to filter for an existing traffic filter that has been created via one of the provided filters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    name = ec.get_traffic_filter(name="example-filter")
    id = ec.get_traffic_filter(id="41d275439f884ce89359039e53eac516")
    region = ec.get_traffic_filter(region="us-east-1")
    ```


    :param str id: The id of the traffic filter to select.
    :param str name: The exact name of the traffic filter to select.
    :param str region: Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('ec:index/getTrafficFilter:getTrafficFilter', __args__, opts=opts, typ=GetTrafficFilterResult).value

    return AwaitableGetTrafficFilterResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        region=pulumi.get(__ret__, 'region'),
        rulesets=pulumi.get(__ret__, 'rulesets'))


@_utilities.lift_output_func(get_traffic_filter)
def get_traffic_filter_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                              name: Optional[pulumi.Input[Optional[str]]] = None,
                              region: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTrafficFilterResult]:
    """
    Use this data source to filter for an existing traffic filter that has been created via one of the provided filters.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    name = ec.get_traffic_filter(name="example-filter")
    id = ec.get_traffic_filter(id="41d275439f884ce89359039e53eac516")
    region = ec.get_traffic_filter(region="us-east-1")
    ```


    :param str id: The id of the traffic filter to select.
    :param str name: The exact name of the traffic filter to select.
    :param str region: Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
    """
    ...
