// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.ElasticCloud
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("ec");

        private static readonly __Value<string?> _apikey = new __Value<string?>(() => __config.Get("apikey"));
        /// <summary>
        /// API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
        /// </summary>
        public static string? Apikey
        {
            get => _apikey.Get();
            set => _apikey.Set(value);
        }

        private static readonly __Value<string?> _endpoint = new __Value<string?>(() => __config.Get("endpoint"));
        public static string? Endpoint
        {
            get => _endpoint.Get();
            set => _endpoint.Set(value);
        }

        private static readonly __Value<bool?> _insecure = new __Value<bool?>(() => __config.GetBoolean("insecure"));
        /// <summary>
        /// Allow the provider to skip TLS validation on its outgoing HTTP calls.
        /// </summary>
        public static bool? Insecure
        {
            get => _insecure.Get();
            set => _insecure.Set(value);
        }

        private static readonly __Value<string?> _password = new __Value<string?>(() => __config.Get("password"));
        /// <summary>
        /// Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        /// Private.
        /// </summary>
        public static string? Password
        {
            get => _password.Get();
            set => _password.Set(value);
        }

        private static readonly __Value<string?> _timeout = new __Value<string?>(() => __config.Get("timeout"));
        /// <summary>
        /// Timeout used for individual HTTP calls. Defaults to "1m".
        /// </summary>
        public static string? Timeout
        {
            get => _timeout.Get();
            set => _timeout.Set(value);
        }

        private static readonly __Value<string?> _username = new __Value<string?>(() => __config.Get("username"));
        /// <summary>
        /// Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
        /// Private.
        /// </summary>
        public static string? Username
        {
            get => _username.Get();
            set => _username.Set(value);
        }

        private static readonly __Value<bool?> _verbose = new __Value<bool?>(() => __config.GetBoolean("verbose"));
        /// <summary>
        /// When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
        /// </summary>
        public static bool? Verbose
        {
            get => _verbose.Get();
            set => _verbose.Set(value);
        }

        private static readonly __Value<bool?> _verboseCredentials = new __Value<bool?>(() => __config.GetBoolean("verboseCredentials"));
        /// <summary>
        /// When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
        /// </summary>
        public static bool? VerboseCredentials
        {
            get => _verboseCredentials.Get();
            set => _verboseCredentials.Set(value);
        }

        private static readonly __Value<string?> _verboseFile = new __Value<string?>(() => __config.Get("verboseFile"));
        /// <summary>
        /// Timeout used for individual HTTP calls. Defaults to "1m".
        /// </summary>
        public static string? VerboseFile
        {
            get => _verboseFile.Get();
            set => _verboseFile.Set(value);
        }

    }
}
