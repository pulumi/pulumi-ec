// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentIntegrationsServerConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optionally enable debug mode for Integrations Server instances - defaults to false
        /// </summary>
        [Input("debugEnabled")]
        public Input<bool>? DebugEnabled { get; set; }

        /// <summary>
        /// Optionally override the docker image the Integrations Server nodes will use. Note that this field will only work for internal users only.
        /// </summary>
        [Input("dockerImage")]
        public Input<string>? DockerImage { get; set; }

        /// <summary>
        /// An arbitrary JSON object allowing (non-admin) cluster owners to set their parameters (only one of this and 'user*settings*yaml' is allowed), provided they are on the whitelist ('user*settings*whitelist') and not on the blacklist ('user*settings*blacklist'). (This field together with 'user*settings*override*' and 'system_settings' defines the total set of resource settings)
        /// </summary>
        [Input("userSettingsJson")]
        public Input<string>? UserSettingsJson { get; set; }

        /// <summary>
        /// An arbitrary JSON object allowing ECE admins owners to set clusters' parameters (only one of this and 'user*settings*override*yaml' is allowed), ie in addition to the documented 'system*settings'. (This field together with 'system*settings' and 'user*settings*' defines the total set of resource settings)
        /// </summary>
        [Input("userSettingsOverrideJson")]
        public Input<string>? UserSettingsOverrideJson { get; set; }

        /// <summary>
        /// An arbitrary YAML object allowing ECE admins owners to set clusters' parameters (only one of this and 'user*settings*override*json' is allowed), ie in addition to the documented 'system*settings'. (This field together with 'system*settings' and 'user*settings*' defines the total set of resource settings)
        /// </summary>
        [Input("userSettingsOverrideYaml")]
        public Input<string>? UserSettingsOverrideYaml { get; set; }

        /// <summary>
        /// An arbitrary YAML object allowing (non-admin) cluster owners to set their parameters (only one of this and 'user*settings*json' is allowed), provided they are on the whitelist ('user*settings*whitelist') and not on the blacklist ('user*settings*blacklist'). (These field together with 'user*settings*override*' and 'system_settings' defines the total set of resource settings)
        /// </summary>
        [Input("userSettingsYaml")]
        public Input<string>? UserSettingsYaml { get; set; }

        public DeploymentIntegrationsServerConfigGetArgs()
        {
        }
        public static new DeploymentIntegrationsServerConfigGetArgs Empty => new DeploymentIntegrationsServerConfigGetArgs();
    }
}
