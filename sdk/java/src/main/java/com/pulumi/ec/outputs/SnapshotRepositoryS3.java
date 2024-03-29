// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SnapshotRepositoryS3 {
    /**
     * @return An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return Name of the S3 bucket to use for snapshots.
     * 
     */
    private String bucket;
    /**
     * @return The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
     * 
     */
    private @Nullable Boolean pathStyleAccess;
    /**
     * @return Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
     * 
     */
    private @Nullable String region;
    /**
     * @return An S3 secret key. If set, the access_key setting must also be specified.
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
     * 
     */
    private @Nullable Boolean serverSideEncryption;

    private SnapshotRepositoryS3() {}
    /**
     * @return An S3 access key. If set, the secret_key setting must also be specified. If unset, the client will use the instance or container role instead.
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return Name of the S3 bucket to use for snapshots.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return The S3 service endpoint to connect to. This defaults to s3.amazonaws.com but the AWS documentation lists alternative S3 endpoints. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return Whether to force the use of the path style access pattern. If true, the path style access pattern will be used. If false, the access pattern will be automatically determined by the AWS Java SDK (See AWS documentation for details). Defaults to false.
     * 
     */
    public Optional<Boolean> pathStyleAccess() {
        return Optional.ofNullable(this.pathStyleAccess);
    }
    /**
     * @return Allows specifying the signing region to use. Specifying this setting manually should not be necessary for most use cases. Generally, the SDK will correctly guess the signing region to use. It should be considered an expert level setting to support S3-compatible APIs that require v4 signatures and use a region other than the default us-east-1. Defaults to empty string which means that the SDK will try to automatically determine the correct signing region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return An S3 secret key. If set, the access_key setting must also be specified.
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return When set to true files are encrypted on server side using AES256 algorithm. Defaults to false.
     * 
     */
    public Optional<Boolean> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotRepositoryS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private String bucket;
        private @Nullable String endpoint;
        private @Nullable Boolean pathStyleAccess;
        private @Nullable String region;
        private @Nullable String secretKey;
        private @Nullable Boolean serverSideEncryption;
        public Builder() {}
        public Builder(SnapshotRepositoryS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucket = defaults.bucket;
    	      this.endpoint = defaults.endpoint;
    	      this.pathStyleAccess = defaults.pathStyleAccess;
    	      this.region = defaults.region;
    	      this.secretKey = defaults.secretKey;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {

            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("SnapshotRepositoryS3", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder pathStyleAccess(@Nullable Boolean pathStyleAccess) {

            this.pathStyleAccess = pathStyleAccess;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {

            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideEncryption(@Nullable Boolean serverSideEncryption) {

            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public SnapshotRepositoryS3 build() {
            final var _resultValue = new SnapshotRepositoryS3();
            _resultValue.accessKey = accessKey;
            _resultValue.bucket = bucket;
            _resultValue.endpoint = endpoint;
            _resultValue.pathStyleAccess = pathStyleAccess;
            _resultValue.region = region;
            _resultValue.secretKey = secretKey;
            _resultValue.serverSideEncryption = serverSideEncryption;
            return _resultValue;
        }
    }
}
