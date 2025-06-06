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
    public sealed class GetDeploymentTemplatesTemplateResult
    {
        /// <summary>
        /// Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateApmResult Apm;
        /// <summary>
        /// Outdated templates are marked as deprecated, but can still be used.
        /// </summary>
        public readonly bool Deprecated;
        /// <summary>
        /// The description of the deployment template.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Defines the default configuration for Elasticsearch.
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateElasticsearchResult Elasticsearch;
        /// <summary>
        /// Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateEnterpriseSearchResult EnterpriseSearch;
        /// <summary>
        /// The id of the deployment template.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateIntegrationsServerResult IntegrationsServer;
        /// <summary>
        /// Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
        /// </summary>
        public readonly Outputs.GetDeploymentTemplatesTemplateKibanaResult Kibana;
        /// <summary>
        /// The minimum stack version that can used with this deployment template.
        /// </summary>
        public readonly string MinStackVersion;
        /// <summary>
        /// The name of the deployment template.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetDeploymentTemplatesTemplateResult(
            Outputs.GetDeploymentTemplatesTemplateApmResult apm,

            bool deprecated,

            string description,

            Outputs.GetDeploymentTemplatesTemplateElasticsearchResult elasticsearch,

            Outputs.GetDeploymentTemplatesTemplateEnterpriseSearchResult enterpriseSearch,

            string id,

            Outputs.GetDeploymentTemplatesTemplateIntegrationsServerResult integrationsServer,

            Outputs.GetDeploymentTemplatesTemplateKibanaResult kibana,

            string minStackVersion,

            string name)
        {
            Apm = apm;
            Deprecated = deprecated;
            Description = description;
            Elasticsearch = elasticsearch;
            EnterpriseSearch = enterpriseSearch;
            Id = id;
            IntegrationsServer = integrationsServer;
            Kibana = kibana;
            MinStackVersion = minStackVersion;
            Name = name;
        }
    }
}
