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
    public sealed class DeploymentEnterpriseSearchConfig
    {
        public readonly string? DockerImage;
        /// <summary>
        /// JSON-formatted user level `elasticsearch.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsJson;
        /// <summary>
        /// JSON-formatted admin (ECE) level `elasticsearch.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsOverrideJson;
        /// <summary>
        /// YAML-formatted admin (ECE) level `elasticsearch.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsOverrideYaml;
        /// <summary>
        /// YAML-formatted user level `elasticsearch.yml` setting overrides.
        /// </summary>
        public readonly string? UserSettingsYaml;

        [OutputConstructor]
        private DeploymentEnterpriseSearchConfig(
            string? dockerImage,

            string? userSettingsJson,

            string? userSettingsOverrideJson,

            string? userSettingsOverrideYaml,

            string? userSettingsYaml)
        {
            DockerImage = dockerImage;
            UserSettingsJson = userSettingsJson;
            UserSettingsOverrideJson = userSettingsOverrideJson;
            UserSettingsOverrideYaml = userSettingsOverrideYaml;
            UserSettingsYaml = userSettingsYaml;
        }
    }
}
