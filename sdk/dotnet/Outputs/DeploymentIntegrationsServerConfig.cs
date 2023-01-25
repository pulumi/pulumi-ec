// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class DeploymentIntegrationsServerConfig
    {
        /// <summary>
        /// Enable debug mode for APM servers. Defaults to `false`.
        /// </summary>
        public readonly bool? DebugEnabled;
        public readonly string? DockerImage;
        /// <summary>
        /// JSON-formatted user level `enterprise_search.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsJson;
        /// <summary>
        /// JSON-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsOverrideJson;
        /// <summary>
        /// YAML-formatted admin (ECE) level `enterprise_search.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsOverrideYaml;
        /// <summary>
        /// YAML-formatted user level `enterprise_search.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsYaml;

        [OutputConstructor]
        private DeploymentIntegrationsServerConfig(
            bool? debugEnabled,

            string? dockerImage,

            string? userSettingsJson,

            string? userSettingsOverrideJson,

            string? userSettingsOverrideYaml,

            string? userSettingsYaml)
        {
            DebugEnabled = debugEnabled;
            DockerImage = dockerImage;
            UserSettingsJson = userSettingsJson;
            UserSettingsOverrideJson = userSettingsOverrideJson;
            UserSettingsOverrideYaml = userSettingsOverrideYaml;
            UserSettingsYaml = userSettingsYaml;
        }
    }
}
