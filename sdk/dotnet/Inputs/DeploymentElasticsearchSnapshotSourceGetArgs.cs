// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class DeploymentElasticsearchSnapshotSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the snapshot to restore. Use '**latest_success**' to get the most recent successful snapshot.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// ID of the Elasticsearch cluster that will be used as the source of the snapshot
        /// </summary>
        [Input("sourceElasticsearchClusterId", required: true)]
        public Input<string> SourceElasticsearchClusterId { get; set; } = null!;

        public DeploymentElasticsearchSnapshotSourceGetArgs()
        {
        }
        public static new DeploymentElasticsearchSnapshotSourceGetArgs Empty => new DeploymentElasticsearchSnapshotSourceGetArgs();
    }
}
