// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentApmConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("debugEnabled")]
        public Input<bool>? DebugEnabled { get; set; }

        [Input("dockerImage")]
        public Input<string>? DockerImage { get; set; }

        [Input("userSettingsJson")]
        public Input<string>? UserSettingsJson { get; set; }

        [Input("userSettingsOverrideJson")]
        public Input<string>? UserSettingsOverrideJson { get; set; }

        [Input("userSettingsOverrideYaml")]
        public Input<string>? UserSettingsOverrideYaml { get; set; }

        [Input("userSettingsYaml")]
        public Input<string>? UserSettingsYaml { get; set; }

        public DeploymentApmConfigGetArgs()
        {
        }
        public static new DeploymentApmConfigGetArgs Empty => new DeploymentApmConfigGetArgs();
    }
}
