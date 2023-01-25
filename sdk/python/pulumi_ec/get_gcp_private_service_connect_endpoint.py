# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetGcpPrivateServiceConnectEndpointResult',
    'AwaitableGetGcpPrivateServiceConnectEndpointResult',
    'get_gcp_private_service_connect_endpoint',
    'get_gcp_private_service_connect_endpoint_output',
]

@pulumi.output_type
class GetGcpPrivateServiceConnectEndpointResult:
    """
    A collection of values returned by getGcpPrivateServiceConnectEndpoint.
    """
    def __init__(__self__, domain_name=None, id=None, region=None, service_attachment_uri=None):
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if service_attachment_uri and not isinstance(service_attachment_uri, str):
            raise TypeError("Expected argument 'service_attachment_uri' to be a str")
        pulumi.set(__self__, "service_attachment_uri", service_attachment_uri)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name to point towards the PSC endpoint.
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
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="serviceAttachmentUri")
    def service_attachment_uri(self) -> str:
        """
        The service attachment URI to attach the PSC endpoint to.
        """
        return pulumi.get(self, "service_attachment_uri")


class AwaitableGetGcpPrivateServiceConnectEndpointResult(GetGcpPrivateServiceConnectEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGcpPrivateServiceConnectEndpointResult(
            domain_name=self.domain_name,
            id=self.id,
            region=self.region,
            service_attachment_uri=self.service_attachment_uri)


def get_gcp_private_service_connect_endpoint(region: Optional[str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGcpPrivateServiceConnectEndpointResult:
    """
    Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).

    > **NOTE:** This data source provides data relevant to the Elasticsearch Service (ESS) only, and should not be used for ECE.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    us_central1 = ec.get_gcp_private_service_connect_endpoint(region="us-central1")
    ```


    :param str region: Region to retrieve the Private Link configuration for.
    """
    __args__ = dict()
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('ec:index/getGcpPrivateServiceConnectEndpoint:getGcpPrivateServiceConnectEndpoint', __args__, opts=opts, typ=GetGcpPrivateServiceConnectEndpointResult).value

    return AwaitableGetGcpPrivateServiceConnectEndpointResult(
        domain_name=__ret__.domain_name,
        id=__ret__.id,
        region=__ret__.region,
        service_attachment_uri=__ret__.service_attachment_uri)


@_utilities.lift_output_func(get_gcp_private_service_connect_endpoint)
def get_gcp_private_service_connect_endpoint_output(region: Optional[pulumi.Input[str]] = None,
                                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGcpPrivateServiceConnectEndpointResult]:
    """
    Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).

    > **NOTE:** This data source provides data relevant to the Elasticsearch Service (ESS) only, and should not be used for ECE.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_ec as ec

    us_central1 = ec.get_gcp_private_service_connect_endpoint(region="us-central1")
    ```


    :param str region: Region to retrieve the Private Link configuration for.
    """
    ...
