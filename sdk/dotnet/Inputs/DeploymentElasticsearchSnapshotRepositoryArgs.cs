// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchSnapshotRepositoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster snapshot reference repository settings, containing the repository name in ECE fashion
        /// </summary>
        [Input("reference")]
        public Input<Inputs.DeploymentElasticsearchSnapshotRepositoryReferenceArgs>? Reference { get; set; }

        public DeploymentElasticsearchSnapshotRepositoryArgs()
        {
        }
        public static new DeploymentElasticsearchSnapshotRepositoryArgs Empty => new DeploymentElasticsearchSnapshotRepositoryArgs();
    }
}
