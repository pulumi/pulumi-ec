# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 apikey: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 verbose: Optional[pulumi.Input[bool]] = None,
                 verbose_credentials: Optional[pulumi.Input[bool]] = None,
                 verbose_file: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] apikey: API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
        :param pulumi.Input[str] endpoint: Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
        :param pulumi.Input[bool] insecure: Allow the provider to skip TLS validation on its outgoing HTTP calls.
        :param pulumi.Input[str] password: Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
               Private.
        :param pulumi.Input[str] timeout: Timeout used for individual HTTP calls. Defaults to "1m".
        :param pulumi.Input[str] username: Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
               Private.
        :param pulumi.Input[bool] verbose: When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
        :param pulumi.Input[bool] verbose_credentials: When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
        :param pulumi.Input[str] verbose_file: Timeout used for individual HTTP calls. Defaults to "1m".
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            apikey=apikey,
            endpoint=endpoint,
            insecure=insecure,
            password=password,
            timeout=timeout,
            username=username,
            verbose=verbose,
            verbose_credentials=verbose_credentials,
            verbose_file=verbose_file,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             apikey: Optional[pulumi.Input[str]] = None,
             endpoint: Optional[pulumi.Input[str]] = None,
             insecure: Optional[pulumi.Input[bool]] = None,
             password: Optional[pulumi.Input[str]] = None,
             timeout: Optional[pulumi.Input[str]] = None,
             username: Optional[pulumi.Input[str]] = None,
             verbose: Optional[pulumi.Input[bool]] = None,
             verbose_credentials: Optional[pulumi.Input[bool]] = None,
             verbose_file: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if apikey is not None:
            _setter("apikey", apikey)
        if endpoint is not None:
            _setter("endpoint", endpoint)
        if insecure is not None:
            _setter("insecure", insecure)
        if password is not None:
            _setter("password", password)
        if timeout is not None:
            _setter("timeout", timeout)
        if username is not None:
            _setter("username", username)
        if verbose is not None:
            _setter("verbose", verbose)
        if verbose_credentials is not None:
            _setter("verbose_credentials", verbose_credentials)
        if verbose_file is not None:
            _setter("verbose_file", verbose_file)

    @property
    @pulumi.getter
    def apikey(self) -> Optional[pulumi.Input[str]]:
        """
        API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
        """
        return pulumi.get(self, "apikey")

    @apikey.setter
    def apikey(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "apikey", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the provider to skip TLS validation on its outgoing HTTP calls.
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        Private.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[str]]:
        """
        Timeout used for individual HTTP calls. Defaults to "1m".
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        Private.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def verbose(self) -> Optional[pulumi.Input[bool]]:
        """
        When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
        """
        return pulumi.get(self, "verbose")

    @verbose.setter
    def verbose(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verbose", value)

    @property
    @pulumi.getter(name="verboseCredentials")
    def verbose_credentials(self) -> Optional[pulumi.Input[bool]]:
        """
        When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
        """
        return pulumi.get(self, "verbose_credentials")

    @verbose_credentials.setter
    def verbose_credentials(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verbose_credentials", value)

    @property
    @pulumi.getter(name="verboseFile")
    def verbose_file(self) -> Optional[pulumi.Input[str]]:
        """
        Timeout used for individual HTTP calls. Defaults to "1m".
        """
        return pulumi.get(self, "verbose_file")

    @verbose_file.setter
    def verbose_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "verbose_file", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apikey: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 verbose: Optional[pulumi.Input[bool]] = None,
                 verbose_credentials: Optional[pulumi.Input[bool]] = None,
                 verbose_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the ec package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] apikey: API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
        :param pulumi.Input[str] endpoint: Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
        :param pulumi.Input[bool] insecure: Allow the provider to skip TLS validation on its outgoing HTTP calls.
        :param pulumi.Input[str] password: Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
               Private.
        :param pulumi.Input[str] timeout: Timeout used for individual HTTP calls. Defaults to "1m".
        :param pulumi.Input[str] username: Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
               Private.
        :param pulumi.Input[bool] verbose: When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
        :param pulumi.Input[bool] verbose_credentials: When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
        :param pulumi.Input[str] verbose_file: Timeout used for individual HTTP calls. Defaults to "1m".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the ec package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 apikey: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 verbose: Optional[pulumi.Input[bool]] = None,
                 verbose_credentials: Optional[pulumi.Input[bool]] = None,
                 verbose_file: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["apikey"] = None if apikey is None else pulumi.Output.secret(apikey)
            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["insecure"] = pulumi.Output.from_input(insecure).apply(pulumi.runtime.to_json) if insecure is not None else None
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["timeout"] = timeout
            __props__.__dict__["username"] = username
            __props__.__dict__["verbose"] = pulumi.Output.from_input(verbose).apply(pulumi.runtime.to_json) if verbose is not None else None
            __props__.__dict__["verbose_credentials"] = pulumi.Output.from_input(verbose_credentials).apply(pulumi.runtime.to_json) if verbose_credentials is not None else None
            __props__.__dict__["verbose_file"] = verbose_file
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apikey", "password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'ec',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter
    def apikey(self) -> pulumi.Output[Optional[str]]:
        """
        API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
        """
        return pulumi.get(self, "apikey")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        Endpoint where the terraform provider will point to. Defaults to "https://api.elastic-cloud.com".
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        Private.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[Optional[str]]:
        """
        Timeout used for individual HTTP calls. Defaults to "1m".
        """
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        Private.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="verboseFile")
    def verbose_file(self) -> pulumi.Output[Optional[str]]:
        """
        Timeout used for individual HTTP calls. Defaults to "1m".
        """
        return pulumi.get(self, "verbose_file")

