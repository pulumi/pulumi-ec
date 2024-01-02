// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotRepositoryS3Args extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotRepositoryS3Args Empty = new SnapshotRepositoryS3Args();

    /**
     * An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * Name of the S3 bucket to use for snapshots.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of the S3 bucket to use for snapshots.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
     * 
     */
    @Import(name="pathStyleAccess")
    private @Nullable Output<Boolean> pathStyleAccess;

    /**
     * @return Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> pathStyleAccess() {
        return Optional.ofNullable(this.pathStyleAccess);
    }

    /**
     * Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * An S3 secret key. If set, the access_key setting must also be specified.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return An S3 secret key. If set, the access_key setting must also be specified.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<Boolean> serverSideEncryption;

    /**
     * @return When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    private SnapshotRepositoryS3Args() {}

    private SnapshotRepositoryS3Args(SnapshotRepositoryS3Args $) {
        this.accessKey = $.accessKey;
        this.bucket = $.bucket;
        this.endpoint = $.endpoint;
        this.pathStyleAccess = $.pathStyleAccess;
        this.region = $.region;
        this.secretKey = $.secretKey;
        this.serverSideEncryption = $.serverSideEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotRepositoryS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotRepositoryS3Args $;

        public Builder() {
            $ = new SnapshotRepositoryS3Args();
        }

        public Builder(SnapshotRepositoryS3Args defaults) {
            $ = new SnapshotRepositoryS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param bucket Name of the S3 bucket to use for snapshots.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of the S3 bucket to use for snapshots.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param endpoint The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param pathStyleAccess Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder pathStyleAccess(@Nullable Output<Boolean> pathStyleAccess) {
            $.pathStyleAccess = pathStyleAccess;
            return this;
        }

        /**
         * @param pathStyleAccess Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder pathStyleAccess(Boolean pathStyleAccess) {
            return pathStyleAccess(Output.of(pathStyleAccess));
        }

        /**
         * @param region Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretKey An S3 secret key. If set, the access_key setting must also be specified.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey An S3 secret key. If set, the access_key setting must also be specified.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param serverSideEncryption When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<Boolean> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(Boolean serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        public SnapshotRepositoryS3Args build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("SnapshotRepositoryS3Args", "bucket");
            }
            return $;
        }
    }

}
