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
    public sealed class GetStackEnterpriseSearchResult
    {
        /// <summary>
        /// Maximum size of the instances.
        /// </summary>
        public readonly int CapacityConstraintsMax;
        /// <summary>
        /// Minimum size of the instances.
        /// </summary>
        public readonly int CapacityConstraintsMin;
        /// <summary>
        /// List of node types compatible with this one.
        /// </summary>
        public readonly ImmutableArray<string> CompatibleNodeTypes;
        /// <summary>
        /// List of configuration options that cannot be overridden by user settings.
        /// </summary>
        public readonly ImmutableArray<string> Denylists;
        /// <summary>
        /// Docker image to use for the Enterprise Search instance.
        /// </summary>
        public readonly string DockerImage;

        [OutputConstructor]
        private GetStackEnterpriseSearchResult(
            int capacityConstraintsMax,

            int capacityConstraintsMin,

            ImmutableArray<string> compatibleNodeTypes,

            ImmutableArray<string> denylists,

            string dockerImage)
        {
            CapacityConstraintsMax = capacityConstraintsMax;
            CapacityConstraintsMin = capacityConstraintsMin;
            CompatibleNodeTypes = compatibleNodeTypes;
            Denylists = denylists;
            DockerImage = dockerImage;
        }
    }
}
