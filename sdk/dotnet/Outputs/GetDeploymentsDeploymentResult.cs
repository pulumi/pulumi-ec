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
    public sealed class GetDeploymentsDeploymentResult
    {
        public readonly string Alias;
        public readonly string ApmRefId;
        public readonly string ApmResourceId;
        public readonly string DeploymentId;
        public readonly string ElasticsearchRefId;
        public readonly string ElasticsearchResourceId;
        public readonly string EnterpriseSearchRefId;
        public readonly string EnterpriseSearchResourceId;
        public readonly string IntegrationsServerRefId;
        public readonly string IntegrationsServerResourceId;
        public readonly string KibanaRefId;
        public readonly string KibanaResourceId;
        public readonly string Name;

        [OutputConstructor]
        private GetDeploymentsDeploymentResult(
            string alias,

            string apmRefId,

            string apmResourceId,

            string deploymentId,

            string elasticsearchRefId,

            string elasticsearchResourceId,

            string enterpriseSearchRefId,

            string enterpriseSearchResourceId,

            string integrationsServerRefId,

            string integrationsServerResourceId,

            string kibanaRefId,

            string kibanaResourceId,

            string name)
        {
            Alias = alias;
            ApmRefId = apmRefId;
            ApmResourceId = apmResourceId;
            DeploymentId = deploymentId;
            ElasticsearchRefId = elasticsearchRefId;
            ElasticsearchResourceId = elasticsearchResourceId;
            EnterpriseSearchRefId = enterpriseSearchRefId;
            EnterpriseSearchResourceId = enterpriseSearchResourceId;
            IntegrationsServerRefId = integrationsServerRefId;
            IntegrationsServerResourceId = integrationsServerResourceId;
            KibanaRefId = kibanaRefId;
            KibanaResourceId = kibanaResourceId;
            Name = name;
        }
    }
}
