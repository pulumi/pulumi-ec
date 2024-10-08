// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.OrganizationMembersArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    /**
     * Manages the members of an Elastic Cloud organization. The key of each entry should be the email of the member.
     * 
     */
    @Import(name="members")
    private @Nullable Output<Map<String,OrganizationMembersArgs>> members;

    /**
     * @return Manages the members of an Elastic Cloud organization. The key of each entry should be the email of the member.
     * 
     */
    public Optional<Output<Map<String,OrganizationMembersArgs>>> members() {
        return Optional.ofNullable(this.members);
    }

    private OrganizationArgs() {}

    private OrganizationArgs(OrganizationArgs $) {
        this.members = $.members;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationArgs $;

        public Builder() {
            $ = new OrganizationArgs();
        }

        public Builder(OrganizationArgs defaults) {
            $ = new OrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param members Manages the members of an Elastic Cloud organization. The key of each entry should be the email of the member.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<Map<String,OrganizationMembersArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Manages the members of an Elastic Cloud organization. The key of each entry should be the email of the member.
         * 
         * @return builder
         * 
         */
        public Builder members(Map<String,OrganizationMembersArgs> members) {
            return members(Output.of(members));
        }

        public OrganizationArgs build() {
            return $;
        }
    }

}
