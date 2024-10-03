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
        /// <summary>
        /// Optionally override the docker image the Enterprise Search nodes will use. Note that this field will only work for internal users only.
        /// </summary>
        public readonly string? DockerImage;
        /// <summary>
        /// An arbitrary JSON object allowing (non-admin) cluster owners to set their parameters (only one of this and 'user*settings*yaml' is allowed), provided they are on the whitelist ('user*settings*whitelist') and not on the blacklist ('user*settings*blacklist'). (This field together with 'user*settings*override*' and 'system_settings' defines the total set of resource settings)
        /// </summary>
        public readonly string? UserSettingsJson;
        /// <summary>
        /// An arbitrary JSON object allowing ECE admins owners to set clusters' parameters (only one of this and 'user*settings*override*yaml' is allowed), ie in addition to the documented 'system*settings'. (This field together with 'system*settings' and 'user*settings*' defines the total set of resource settings)
        /// </summary>
        public readonly string? UserSettingsOverrideJson;
        /// <summary>
        /// An arbitrary YAML object allowing ECE admins owners to set clusters' parameters (only one of this and 'user*settings*override*json' is allowed), ie in addition to the documented 'system*settings'. (This field together with 'system*settings' and 'user*settings*' defines the total set of resource settings)
        /// </summary>
        public readonly string? UserSettingsOverrideYaml;
        /// <summary>
        /// An arbitrary YAML object allowing (non-admin) cluster owners to set their parameters (only one of this and 'user*settings*json' is allowed), provided they are on the whitelist ('user*settings*whitelist') and not on the blacklist ('user*settings*blacklist'). (These field together with 'user*settings*override*' and 'system_settings' defines the total set of resource settings)
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