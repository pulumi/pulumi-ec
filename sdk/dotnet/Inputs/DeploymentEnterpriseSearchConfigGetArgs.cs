// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentEnterpriseSearchConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("dockerImage")]
        public Input<string>? DockerImage { get; set; }

        /// <summary>
        /// JSON-formatted user level `elasticsearch.yml` setting overrides.
        /// </summary>
        [Input("userSettingsJson")]
        public Input<string>? UserSettingsJson { get; set; }

        /// <summary>
        /// JSON-formatted admin (ECE) level `elasticsearch.yml` setting overrides.
        /// </summary>
        [Input("userSettingsOverrideJson")]
        public Input<string>? UserSettingsOverrideJson { get; set; }

        /// <summary>
        /// YAML-formatted admin (ECE) level `elasticsearch.yml` setting overrides.
        /// </summary>
        [Input("userSettingsOverrideYaml")]
        public Input<string>? UserSettingsOverrideYaml { get; set; }

        /// <summary>
        /// YAML-formatted user level `elasticsearch.yml` setting overrides.
        /// </summary>
        [Input("userSettingsYaml")]
        public Input<string>? UserSettingsYaml { get; set; }

        public DeploymentEnterpriseSearchConfigGetArgs()
        {
        }
    }
}
