# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DeploymentElasticsearchKeystoreArgs', 'DeploymentElasticsearchKeystore']

@pulumi.input_type
class DeploymentElasticsearchKeystoreArgs:
    def __init__(__self__, *,
                 deployment_id: pulumi.Input[str],
                 setting_name: pulumi.Input[str],
                 value: pulumi.Input[str],
                 as_file: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DeploymentElasticsearchKeystore resource.
        :param pulumi.Input[str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        :param pulumi.Input[bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        pulumi.set(__self__, "deployment_id", deployment_id)
        pulumi.set(__self__, "setting_name", setting_name)
        pulumi.set(__self__, "value", value)
        if as_file is not None:
            pulumi.set(__self__, "as_file", as_file)

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> pulumi.Input[str]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @deployment_id.setter
    def deployment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "deployment_id", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Input[str]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "setting_name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="asFile")
    def as_file(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @as_file.setter
    def as_file(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "as_file", value)


@pulumi.input_type
class _DeploymentElasticsearchKeystoreState:
    def __init__(__self__, *,
                 as_file: Optional[pulumi.Input[bool]] = None,
                 deployment_id: Optional[pulumi.Input[str]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DeploymentElasticsearchKeystore resources.
        :param pulumi.Input[bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        if as_file is not None:
            pulumi.set(__self__, "as_file", as_file)
        if deployment_id is not None:
            pulumi.set(__self__, "deployment_id", deployment_id)
        if setting_name is not None:
            pulumi.set(__self__, "setting_name", setting_name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="asFile")
    def as_file(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @as_file.setter
    def as_file(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "as_file", value)

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @deployment_id.setter
    def deployment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deployment_id", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "setting_name", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class DeploymentElasticsearchKeystore(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_file: Optional[pulumi.Input[bool]] = None,
                 deployment_id: Optional[pulumi.Input[str]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeploymentElasticsearchKeystoreArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param DeploymentElasticsearchKeystoreArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeploymentElasticsearchKeystoreArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_file: Optional[pulumi.Input[bool]] = None,
                 deployment_id: Optional[pulumi.Input[str]] = None,
                 setting_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeploymentElasticsearchKeystoreArgs.__new__(DeploymentElasticsearchKeystoreArgs)

            __props__.__dict__["as_file"] = as_file
            if deployment_id is None and not opts.urn:
                raise TypeError("Missing required property 'deployment_id'")
            __props__.__dict__["deployment_id"] = deployment_id
            if setting_name is None and not opts.urn:
                raise TypeError("Missing required property 'setting_name'")
            __props__.__dict__["setting_name"] = setting_name
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DeploymentElasticsearchKeystore, __self__).__init__(
            'ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            as_file: Optional[pulumi.Input[bool]] = None,
            deployment_id: Optional[pulumi.Input[str]] = None,
            setting_name: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'DeploymentElasticsearchKeystore':
        """
        Get an existing DeploymentElasticsearchKeystore resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeploymentElasticsearchKeystoreState.__new__(_DeploymentElasticsearchKeystoreState)

        __props__.__dict__["as_file"] = as_file
        __props__.__dict__["deployment_id"] = deployment_id
        __props__.__dict__["setting_name"] = setting_name
        __props__.__dict__["value"] = value
        return DeploymentElasticsearchKeystore(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="asFile")
    def as_file(self) -> pulumi.Output[bool]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> pulumi.Output[str]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Output[str]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

