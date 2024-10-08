// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.SecurityProjectCredentialsArgs;
import com.pulumi.ec.inputs.SecurityProjectEndpointsArgs;
import com.pulumi.ec.inputs.SecurityProjectMetadataArgs;
import com.pulumi.ec.inputs.SecurityProjectProductTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityProjectState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProjectState Empty = new SecurityProjectState();

    /**
     * admin features package (BYOK, BYOIDP, CCS, CCR)
     * 
     */
    @Import(name="adminFeaturesPackage")
    private @Nullable Output<String> adminFeaturesPackage;

    /**
     * @return admin features package (BYOK, BYOIDP, CCS, CCR)
     * 
     */
    public Optional<Output<String>> adminFeaturesPackage() {
        return Optional.ofNullable(this.adminFeaturesPackage);
    }

    /**
     * A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     * 
     */
    @Import(name="cloudId")
    private @Nullable Output<String> cloudId;

    /**
     * @return The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
     * 
     */
    public Optional<Output<String>> cloudId() {
        return Optional.ofNullable(this.cloudId);
    }

    /**
     * Basic auth credentials to access the Elasticsearch API.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<SecurityProjectCredentialsArgs> credentials;

    /**
     * @return Basic auth credentials to access the Elasticsearch API.
     * 
     */
    public Optional<Output<SecurityProjectCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The endpoints to access the different apps of the project.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<SecurityProjectEndpointsArgs> endpoints;

    /**
     * @return The endpoints to access the different apps of the project.
     * 
     */
    public Optional<Output<SecurityProjectEndpointsArgs>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Additional details about the project.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<SecurityProjectMetadataArgs> metadata;

    /**
     * @return Additional details about the project.
     * 
     */
    public Optional<Output<SecurityProjectMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Descriptive name for a project.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Descriptive name for a project.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="productTypes")
    private @Nullable Output<List<SecurityProjectProductTypeArgs>> productTypes;

    public Optional<Output<List<SecurityProjectProductTypeArgs>>> productTypes() {
        return Optional.ofNullable(this.productTypes);
    }

    /**
     * Unique human-readable identifier for a region in Elastic Cloud.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return Unique human-readable identifier for a region in Elastic Cloud.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * the type of the project
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return the type of the project
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SecurityProjectState() {}

    private SecurityProjectState(SecurityProjectState $) {
        this.adminFeaturesPackage = $.adminFeaturesPackage;
        this.alias = $.alias;
        this.cloudId = $.cloudId;
        this.credentials = $.credentials;
        this.endpoints = $.endpoints;
        this.metadata = $.metadata;
        this.name = $.name;
        this.productTypes = $.productTypes;
        this.regionId = $.regionId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProjectState $;

        public Builder() {
            $ = new SecurityProjectState();
        }

        public Builder(SecurityProjectState defaults) {
            $ = new SecurityProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminFeaturesPackage admin features package (BYOK, BYOIDP, CCS, CCR)
         * 
         * @return builder
         * 
         */
        public Builder adminFeaturesPackage(@Nullable Output<String> adminFeaturesPackage) {
            $.adminFeaturesPackage = adminFeaturesPackage;
            return this;
        }

        /**
         * @param adminFeaturesPackage admin features package (BYOK, BYOIDP, CCS, CCR)
         * 
         * @return builder
         * 
         */
        public Builder adminFeaturesPackage(String adminFeaturesPackage) {
            return adminFeaturesPackage(Output.of(adminFeaturesPackage));
        }

        /**
         * @param alias A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias A custom domain label compatible with RFC-1035 standards. Derived from the project name by default.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param cloudId The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
         * 
         * @return builder
         * 
         */
        public Builder cloudId(@Nullable Output<String> cloudId) {
            $.cloudId = cloudId;
            return this;
        }

        /**
         * @param cloudId The cloud ID, an encoded string that provides other Elastic services with the necessary information to connect to this Elasticsearch and Kibana.
         * 
         * @return builder
         * 
         */
        public Builder cloudId(String cloudId) {
            return cloudId(Output.of(cloudId));
        }

        /**
         * @param credentials Basic auth credentials to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<SecurityProjectCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Basic auth credentials to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder credentials(SecurityProjectCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param endpoints The endpoints to access the different apps of the project.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<SecurityProjectEndpointsArgs> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints The endpoints to access the different apps of the project.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(SecurityProjectEndpointsArgs endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param metadata Additional details about the project.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<SecurityProjectMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Additional details about the project.
         * 
         * @return builder
         * 
         */
        public Builder metadata(SecurityProjectMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name Descriptive name for a project.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Descriptive name for a project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder productTypes(@Nullable Output<List<SecurityProjectProductTypeArgs>> productTypes) {
            $.productTypes = productTypes;
            return this;
        }

        public Builder productTypes(List<SecurityProjectProductTypeArgs> productTypes) {
            return productTypes(Output.of(productTypes));
        }

        public Builder productTypes(SecurityProjectProductTypeArgs... productTypes) {
            return productTypes(List.of(productTypes));
        }

        /**
         * @param regionId Unique human-readable identifier for a region in Elastic Cloud.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId Unique human-readable identifier for a region in Elastic Cloud.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param type the type of the project
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type the type of the project
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SecurityProjectState build() {
            return $;
        }
    }

}
