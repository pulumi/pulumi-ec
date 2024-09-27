// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.OrganizationMembersDeploymentRole;
import com.pulumi.ec.outputs.OrganizationMembersProjectElasticsearchRole;
import com.pulumi.ec.outputs.OrganizationMembersProjectObservabilityRole;
import com.pulumi.ec.outputs.OrganizationMembersProjectSecurityRole;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationMembers {
    /**
     * @return Grant access to one or more deployments. For more info see: [Deployment instance roles](https://www.elastic.co/guide/en/cloud/current/ec-user-privileges.html#ec_instance_access_roles).
     * 
     */
    private @Nullable List<OrganizationMembersDeploymentRole> deploymentRoles;
    /**
     * @return Email address of the user.
     * 
     */
    private @Nullable String email;
    /**
     * @return Set to true while the user has not yet accepted their invitation to the organization.
     * 
     */
    private @Nullable Boolean invitationPending;
    /**
     * @return The optional organization role for the member. Can be one of `organization-admin`, `billing-admin`. For more info see: [Organization roles](https://www.elastic.co/guide/en/cloud/current/ec-user-privileges.html#ec_organization_level_roles)
     * 
     */
    private @Nullable String organizationRole;
    /**
     * @return Roles assigned for elasticsearch projects. For more info see: [Serverless elasticsearch roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#es)
     * 
     */
    private @Nullable List<OrganizationMembersProjectElasticsearchRole> projectElasticsearchRoles;
    /**
     * @return Roles assigned for observability projects. For more info see: [Serverless observability roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#observability)
     * 
     */
    private @Nullable List<OrganizationMembersProjectObservabilityRole> projectObservabilityRoles;
    /**
     * @return Roles assigned for security projects. For more info see: [Serverless security roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#security)
     * 
     */
    private @Nullable List<OrganizationMembersProjectSecurityRole> projectSecurityRoles;
    /**
     * @return User ID.
     * 
     */
    private @Nullable String userId;

    private OrganizationMembers() {}
    /**
     * @return Grant access to one or more deployments. For more info see: [Deployment instance roles](https://www.elastic.co/guide/en/cloud/current/ec-user-privileges.html#ec_instance_access_roles).
     * 
     */
    public List<OrganizationMembersDeploymentRole> deploymentRoles() {
        return this.deploymentRoles == null ? List.of() : this.deploymentRoles;
    }
    /**
     * @return Email address of the user.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return Set to true while the user has not yet accepted their invitation to the organization.
     * 
     */
    public Optional<Boolean> invitationPending() {
        return Optional.ofNullable(this.invitationPending);
    }
    /**
     * @return The optional organization role for the member. Can be one of `organization-admin`, `billing-admin`. For more info see: [Organization roles](https://www.elastic.co/guide/en/cloud/current/ec-user-privileges.html#ec_organization_level_roles)
     * 
     */
    public Optional<String> organizationRole() {
        return Optional.ofNullable(this.organizationRole);
    }
    /**
     * @return Roles assigned for elasticsearch projects. For more info see: [Serverless elasticsearch roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#es)
     * 
     */
    public List<OrganizationMembersProjectElasticsearchRole> projectElasticsearchRoles() {
        return this.projectElasticsearchRoles == null ? List.of() : this.projectElasticsearchRoles;
    }
    /**
     * @return Roles assigned for observability projects. For more info see: [Serverless observability roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#observability)
     * 
     */
    public List<OrganizationMembersProjectObservabilityRole> projectObservabilityRoles() {
        return this.projectObservabilityRoles == null ? List.of() : this.projectObservabilityRoles;
    }
    /**
     * @return Roles assigned for security projects. For more info see: [Serverless security roles](https://www.elastic.co/docs/current/serverless/general/assign-user-roles#security)
     * 
     */
    public List<OrganizationMembersProjectSecurityRole> projectSecurityRoles() {
        return this.projectSecurityRoles == null ? List.of() : this.projectSecurityRoles;
    }
    /**
     * @return User ID.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationMembers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OrganizationMembersDeploymentRole> deploymentRoles;
        private @Nullable String email;
        private @Nullable Boolean invitationPending;
        private @Nullable String organizationRole;
        private @Nullable List<OrganizationMembersProjectElasticsearchRole> projectElasticsearchRoles;
        private @Nullable List<OrganizationMembersProjectObservabilityRole> projectObservabilityRoles;
        private @Nullable List<OrganizationMembersProjectSecurityRole> projectSecurityRoles;
        private @Nullable String userId;
        public Builder() {}
        public Builder(OrganizationMembers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentRoles = defaults.deploymentRoles;
    	      this.email = defaults.email;
    	      this.invitationPending = defaults.invitationPending;
    	      this.organizationRole = defaults.organizationRole;
    	      this.projectElasticsearchRoles = defaults.projectElasticsearchRoles;
    	      this.projectObservabilityRoles = defaults.projectObservabilityRoles;
    	      this.projectSecurityRoles = defaults.projectSecurityRoles;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder deploymentRoles(@Nullable List<OrganizationMembersDeploymentRole> deploymentRoles) {

            this.deploymentRoles = deploymentRoles;
            return this;
        }
        public Builder deploymentRoles(OrganizationMembersDeploymentRole... deploymentRoles) {
            return deploymentRoles(List.of(deploymentRoles));
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder invitationPending(@Nullable Boolean invitationPending) {

            this.invitationPending = invitationPending;
            return this;
        }
        @CustomType.Setter
        public Builder organizationRole(@Nullable String organizationRole) {

            this.organizationRole = organizationRole;
            return this;
        }
        @CustomType.Setter
        public Builder projectElasticsearchRoles(@Nullable List<OrganizationMembersProjectElasticsearchRole> projectElasticsearchRoles) {

            this.projectElasticsearchRoles = projectElasticsearchRoles;
            return this;
        }
        public Builder projectElasticsearchRoles(OrganizationMembersProjectElasticsearchRole... projectElasticsearchRoles) {
            return projectElasticsearchRoles(List.of(projectElasticsearchRoles));
        }
        @CustomType.Setter
        public Builder projectObservabilityRoles(@Nullable List<OrganizationMembersProjectObservabilityRole> projectObservabilityRoles) {

            this.projectObservabilityRoles = projectObservabilityRoles;
            return this;
        }
        public Builder projectObservabilityRoles(OrganizationMembersProjectObservabilityRole... projectObservabilityRoles) {
            return projectObservabilityRoles(List.of(projectObservabilityRoles));
        }
        @CustomType.Setter
        public Builder projectSecurityRoles(@Nullable List<OrganizationMembersProjectSecurityRole> projectSecurityRoles) {

            this.projectSecurityRoles = projectSecurityRoles;
            return this;
        }
        public Builder projectSecurityRoles(OrganizationMembersProjectSecurityRole... projectSecurityRoles) {
            return projectSecurityRoles(List.of(projectSecurityRoles));
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {

            this.userId = userId;
            return this;
        }
        public OrganizationMembers build() {
            final var _resultValue = new OrganizationMembers();
            _resultValue.deploymentRoles = deploymentRoles;
            _resultValue.email = email;
            _resultValue.invitationPending = invitationPending;
            _resultValue.organizationRole = organizationRole;
            _resultValue.projectElasticsearchRoles = projectElasticsearchRoles;
            _resultValue.projectObservabilityRoles = projectObservabilityRoles;
            _resultValue.projectSecurityRoles = projectSecurityRoles;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}
