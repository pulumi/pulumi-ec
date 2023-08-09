// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.SnapshotRepositoryGenericArgs;
import com.pulumi.ec.inputs.SnapshotRepositoryS3Args;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotRepositoryArgs Empty = new SnapshotRepositoryArgs();

    /**
     * Generic repository settings.
     * 
     */
    @Import(name="generic")
    private @Nullable Output<SnapshotRepositoryGenericArgs> generic;

    /**
     * @return Generic repository settings.
     * 
     */
    public Optional<Output<SnapshotRepositoryGenericArgs>> generic() {
        return Optional.ofNullable(this.generic);
    }

    /**
     * The name of the snapshot repository configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the snapshot repository configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * S3 repository settings.
     * 
     */
    @Import(name="s3")
    private @Nullable Output<SnapshotRepositoryS3Args> s3;

    /**
     * @return S3 repository settings.
     * 
     */
    public Optional<Output<SnapshotRepositoryS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    private SnapshotRepositoryArgs() {}

    private SnapshotRepositoryArgs(SnapshotRepositoryArgs $) {
        this.generic = $.generic;
        this.name = $.name;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotRepositoryArgs $;

        public Builder() {
            $ = new SnapshotRepositoryArgs();
        }

        public Builder(SnapshotRepositoryArgs defaults) {
            $ = new SnapshotRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param generic Generic repository settings.
         * 
         * @return builder
         * 
         */
        public Builder generic(@Nullable Output<SnapshotRepositoryGenericArgs> generic) {
            $.generic = generic;
            return this;
        }

        /**
         * @param generic Generic repository settings.
         * 
         * @return builder
         * 
         */
        public Builder generic(SnapshotRepositoryGenericArgs generic) {
            return generic(Output.of(generic));
        }

        /**
         * @param name The name of the snapshot repository configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the snapshot repository configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param s3 S3 repository settings.
         * 
         * @return builder
         * 
         */
        public Builder s3(@Nullable Output<SnapshotRepositoryS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        /**
         * @param s3 S3 repository settings.
         * 
         * @return builder
         * 
         */
        public Builder s3(SnapshotRepositoryS3Args s3) {
            return s3(Output.of(s3));
        }

        public SnapshotRepositoryArgs build() {
            return $;
        }
    }

}
