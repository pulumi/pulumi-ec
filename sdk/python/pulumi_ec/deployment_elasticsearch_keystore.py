# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['DeploymentElasticsearchKeystoreArgs', 'DeploymentElasticsearchKeystore']

@pulumi.input_type
class DeploymentElasticsearchKeystoreArgs:
    def __init__(__self__, *,
                 deployment_id: pulumi.Input[builtins.str],
                 setting_name: pulumi.Input[builtins.str],
                 value: pulumi.Input[builtins.str],
                 as_file: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a DeploymentElasticsearchKeystore resource.
        :param pulumi.Input[builtins.str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[builtins.str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[builtins.str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        :param pulumi.Input[builtins.bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        pulumi.set(__self__, "deployment_id", deployment_id)
        pulumi.set(__self__, "setting_name", setting_name)
        pulumi.set(__self__, "value", value)
        if as_file is not None:
            pulumi.set(__self__, "as_file", as_file)

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> pulumi.Input[builtins.str]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @deployment_id.setter
    def deployment_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "deployment_id", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Input[builtins.str]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "setting_name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[builtins.str]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="asFile")
    def as_file(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @as_file.setter
    def as_file(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "as_file", value)


@pulumi.input_type
class _DeploymentElasticsearchKeystoreState:
    def __init__(__self__, *,
                 as_file: Optional[pulumi.Input[builtins.bool]] = None,
                 deployment_id: Optional[pulumi.Input[builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[builtins.str]] = None,
                 value: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering DeploymentElasticsearchKeystore resources.
        :param pulumi.Input[builtins.bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[builtins.str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[builtins.str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[builtins.str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
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
    def as_file(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @as_file.setter
    def as_file(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "as_file", value)

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @deployment_id.setter
    def deployment_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "deployment_id", value)

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @setting_name.setter
    def setting_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "setting_name", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "value", value)


class DeploymentElasticsearchKeystore(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_file: Optional[pulumi.Input[builtins.bool]] = None,
                 deployment_id: Optional[pulumi.Input[builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[builtins.str]] = None,
                 value: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_ec as ec
        import pulumi_std as std

        latest = ec.get_stack(version_regex="latest",
            region="us-east-1")
        # Create an Elastic Cloud deployment
        example_keystore = ec.Deployment("example_keystore",
            region="us-east-1",
            version=latest.version,
            deployment_template_id="aws-io-optimized-v2",
            elasticsearch={
                "hot": {
                    "autoscaling": {},
                },
            })
        # Create the keystore secret entry
        gcs_credential = ec.DeploymentElasticsearchKeystore("gcs_credential",
            deployment_id=example_keystore.id,
            setting_name="gcs.client.default.credentials_file",
            value=std.file(input="service-account-key.json").result,
            as_file=True)
        ```

        ### Adding credentials to use GCS as a snapshot repository

        ```python
        import pulumi
        import pulumi_ec as ec
        import pulumi_std as std

        latest = ec.get_stack(version_regex="latest",
            region="us-east-1")
        # Create an Elastic Cloud deployment
        example_keystore = ec.Deployment("example_keystore",
            region="us-east-1",
            version=latest.version,
            deployment_template_id="aws-io-optimized-v2",
            elasticsearch={
                "hot": {
                    "autoscaling": {},
                },
            })
        # Create the keystore secret entry
        gcs_credential = ec.DeploymentElasticsearchKeystore("gcs_credential",
            deployment_id=example_keystore.id,
            setting_name="gcs.client.default.credentials_file",
            value=std.file(input="service-account-key.json").result,
            as_file=True)
        ```

        ## Import

        This resource cannot be imported

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[builtins.str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[builtins.str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[builtins.str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeploymentElasticsearchKeystoreArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Basic

        ```python
        import pulumi
        import pulumi_ec as ec
        import pulumi_std as std

        latest = ec.get_stack(version_regex="latest",
            region="us-east-1")
        # Create an Elastic Cloud deployment
        example_keystore = ec.Deployment("example_keystore",
            region="us-east-1",
            version=latest.version,
            deployment_template_id="aws-io-optimized-v2",
            elasticsearch={
                "hot": {
                    "autoscaling": {},
                },
            })
        # Create the keystore secret entry
        gcs_credential = ec.DeploymentElasticsearchKeystore("gcs_credential",
            deployment_id=example_keystore.id,
            setting_name="gcs.client.default.credentials_file",
            value=std.file(input="service-account-key.json").result,
            as_file=True)
        ```

        ### Adding credentials to use GCS as a snapshot repository

        ```python
        import pulumi
        import pulumi_ec as ec
        import pulumi_std as std

        latest = ec.get_stack(version_regex="latest",
            region="us-east-1")
        # Create an Elastic Cloud deployment
        example_keystore = ec.Deployment("example_keystore",
            region="us-east-1",
            version=latest.version,
            deployment_template_id="aws-io-optimized-v2",
            elasticsearch={
                "hot": {
                    "autoscaling": {},
                },
            })
        # Create the keystore secret entry
        gcs_credential = ec.DeploymentElasticsearchKeystore("gcs_credential",
            deployment_id=example_keystore.id,
            setting_name="gcs.client.default.credentials_file",
            value=std.file(input="service-account-key.json").result,
            as_file=True)
        ```

        ## Import

        This resource cannot be imported

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
                 as_file: Optional[pulumi.Input[builtins.bool]] = None,
                 deployment_id: Optional[pulumi.Input[builtins.str]] = None,
                 setting_name: Optional[pulumi.Input[builtins.str]] = None,
                 value: Optional[pulumi.Input[builtins.str]] = None,
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
            as_file: Optional[pulumi.Input[builtins.bool]] = None,
            deployment_id: Optional[pulumi.Input[builtins.str]] = None,
            setting_name: Optional[pulumi.Input[builtins.str]] = None,
            value: Optional[pulumi.Input[builtins.str]] = None) -> 'DeploymentElasticsearchKeystore':
        """
        Get an existing DeploymentElasticsearchKeystore resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] as_file: Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        :param pulumi.Input[builtins.str] deployment_id: Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        :param pulumi.Input[builtins.str] setting_name: Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        :param pulumi.Input[builtins.str] value: Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
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
    def as_file(self) -> pulumi.Output[builtins.bool]:
        """
        Indicates the the remote keystore setting should be stored as a file. The default is false, which stores the keystore setting as string when value is a plain string.
        """
        return pulumi.get(self, "as_file")

    @property
    @pulumi.getter(name="deploymentId")
    def deployment_id(self) -> pulumi.Output[builtins.str]:
        """
        Deployment ID of the Deployment that holds the Elasticsearch cluster where the keystore setting will be written to.
        """
        return pulumi.get(self, "deployment_id")

    @property
    @pulumi.getter(name="settingName")
    def setting_name(self) -> pulumi.Output[builtins.str]:
        """
        Name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
        """
        return pulumi.get(self, "setting_name")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[builtins.str]:
        """
        Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
        """
        return pulumi.get(self, "value")

