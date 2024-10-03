# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetAzurePrivatelinkEndpointResult',
    'AwaitableGetAzurePrivatelinkEndpointResult',
    'get_azure_privatelink_endpoint',
    'get_azure_privatelink_endpoint_output',
]

@pulumi.output_type
class GetAzurePrivatelinkEndpointResult:
    """
    A collection of values returned by getAzurePrivatelinkEndpoint.
    """
    def __init__(__self__, domain_name=None, id=None, region=None, service_alias=None):
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if service_alias and not isinstance(service_alias, str):
            raise TypeError("Expected argument 'service_alias' to be a str")
        pulumi.set(__self__, "service_alias", service_alias)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name to used in when configuring a private hosted zone in the VNet connection.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Region to retrieve the Private Link configuration for.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceAlias")
    def service_alias(self) -> str:
        """
        The service alias to establish a connection to.
        """
        return pulumi.get(self, "service_alias")


class AwaitableGetAzurePrivatelinkEndpointResult(GetAzurePrivatelinkEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAzurePrivatelinkEndpointResult(
            domain_name=self.domain_name,
            id=self.id,
            region=self.region,
            service_alias=self.service_alias)


def get_azure_privatelink_endpoint(region: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAzurePrivatelinkEndpointResult:
    """
    Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vnet.html).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    eastus = ec.get_azure_privatelink_endpoint(region="eastus")
    ```


    :param str region: Region to retrieve the Private Link configuration for.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('ec:index/getAzurePrivatelinkEndpoint:getAzurePrivatelinkEndpoint', __args__, opts=opts, typ=GetAzurePrivatelinkEndpointResult).value

    return AwaitableGetAzurePrivatelinkEndpointResult(
        domain_name=pulumi.get(__ret__, 'domain_name'),
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'),
        service_alias=pulumi.get(__ret__, 'service_alias'))
def get_azure_privatelink_endpoint_output(region: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAzurePrivatelinkEndpointResult]:
    """
    Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vnet.html).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    eastus = ec.get_azure_privatelink_endpoint(region="eastus")
    ```


    :param str region: Region to retrieve the Private Link configuration for.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('ec:index/getAzurePrivatelinkEndpoint:getAzurePrivatelinkEndpoint', __args__, opts=opts, typ=GetAzurePrivatelinkEndpointResult)
    return __ret__.apply(lambda __response__: GetAzurePrivatelinkEndpointResult(
        domain_name=pulumi.get(__response__, 'domain_name'),
        id=pulumi.get(__response__, 'id'),
        region=pulumi.get(__response__, 'region'),
        service_alias=pulumi.get(__response__, 'service_alias')))
