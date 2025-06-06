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
    public sealed class GetDeploymentTemplatesTemplateElasticsearchResult
    {
        public readonly bool Autoscale;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchColdResult Cold;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchCoordinatingResult Coordinating;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchFrozenResult Frozen;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchHotResult Hot;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchMasterResult Master;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchMlResult Ml;
        /// <summary>
        /// Defines the default configuration for each topology.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchWarmResult Warm;

        [OutputConstructor]
        private GetDeploymentTemplatesTemplateElasticsearchResult(
            bool autoscale,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchColdResult cold,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchCoordinatingResult coordinating,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchFrozenResult frozen,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchHotResult hot,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchMasterResult master,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchMlResult ml,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchWarmResult warm)
        {
            Autoscale = autoscale;
            Cold = cold;
            Coordinating = coordinating;
            Frozen = frozen;
            Hot = hot;
            Master = master;
            Ml = ml;
            Warm = warm;
        }
    }
}
