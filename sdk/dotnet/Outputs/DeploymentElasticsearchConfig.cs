// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Outputs
{

    [OutputType]
    public sealed class DeploymentElasticsearchConfig
    {
        /// <summary>
        /// Overrides the docker image the Elasticsearch nodes will use. Note that this field will only work for internal users only.
        /// </summary>
        public readonly string? DockerImage;
        /// <summary>
        /// List of Elasticsearch supported plugins, which vary from version to version. Check the Stack Pack version to see which plugins are supported for each version. This is currently only available from the UI and [ecctl](https://www.elastic.co/guide/en/ecctl/master/ecctl_stack_list.html)
        /// </summary>
        public readonly ImmutableArray<string> Plugins;
        /// <summary>
        /// JSON-formatted user level "elasticsearch.yml" setting overrides
        /// </summary>
        public readonly string? UserSettingsJson;
        /// <summary>
        /// JSON-formatted admin (ECE) level "elasticsearch.yml" setting overrides
        /// </summary>
        public readonly string? UserSettingsOverrideJson;
        /// <summary>
        /// YAML-formatted admin (ECE) level "elasticsearch.yml" setting overrides
        /// </summary>
        public readonly string? UserSettingsOverrideYaml;
        /// <summary>
        /// YAML-formatted user level "elasticsearch.yml" setting overrides
        /// </summary>
        public readonly string? UserSettingsYaml;

        [OutputConstructor]
        private DeploymentElasticsearchConfig(
            string? dockerImage,

            ImmutableArray<string> plugins,

            string? userSettingsJson,

            string? userSettingsOverrideJson,

            string? userSettingsOverrideYaml,

            string? userSettingsYaml)
        {
            DockerImage = dockerImage;
            Plugins = plugins;
            UserSettingsJson = userSettingsJson;
            UserSettingsOverrideJson = userSettingsOverrideJson;
            UserSettingsOverrideYaml = userSettingsOverrideYaml;
            UserSettingsYaml = userSettingsYaml;
        }
    }
}
