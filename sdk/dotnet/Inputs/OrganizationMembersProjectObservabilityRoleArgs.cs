// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud.Inputs
{

    public sealed class OrganizationMembersProjectObservabilityRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Role applies to all projects in the organization.
        /// </summary>
        [Input("allProjects")]
        public Input<bool>? AllProjects { get; set; }

        [Input("applicationRoles")]
        private InputList<string>? _applicationRoles;

        /// <summary>
        /// If provided, the user assigned this role assignment will be granted this application role when signing in to the project(s) specified in the role assignment.
        /// </summary>
        public InputList<string> ApplicationRoles
        {
            get => _applicationRoles ?? (_applicationRoles = new InputList<string>());
            set => _applicationRoles = value;
        }

        [Input("projectIds")]
        private InputList<string>? _projectIds;

        /// <summary>
        /// Role applies to projects listed here.
        /// </summary>
        public InputList<string> ProjectIds
        {
            get => _projectIds ?? (_projectIds = new InputList<string>());
            set => _projectIds = value;
        }

        /// <summary>
        /// Assigned role. (Allowed values: `admin`, `editor`, `viewer`)
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public OrganizationMembersProjectObservabilityRoleArgs()
        {
        }
        public static new OrganizationMembersProjectObservabilityRoleArgs Empty => new OrganizationMembersProjectObservabilityRoleArgs();
    }
}
