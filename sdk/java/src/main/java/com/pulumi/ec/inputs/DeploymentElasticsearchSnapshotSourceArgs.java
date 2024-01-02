// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchSnapshotSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchSnapshotSourceArgs Empty = new DeploymentElasticsearchSnapshotSourceArgs();

    /**
     * Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable Output<String> snapshotName;

    /**
     * @return Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
     * 
     */
    public Optional<Output<String>> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    /**
     * ID of the Elasticsearch cluster that will be used as the source of the snapshot
     * 
     */
    @Import(name="sourceElasticsearchClusterId", required=true)
    private Output<String> sourceElasticsearchClusterId;

    /**
     * @return ID of the Elasticsearch cluster that will be used as the source of the snapshot
     * 
     */
    public Output<String> sourceElasticsearchClusterId() {
        return this.sourceElasticsearchClusterId;
    }

    private DeploymentElasticsearchSnapshotSourceArgs() {}

    private DeploymentElasticsearchSnapshotSourceArgs(DeploymentElasticsearchSnapshotSourceArgs $) {
        this.snapshotName = $.snapshotName;
        this.sourceElasticsearchClusterId = $.sourceElasticsearchClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchSnapshotSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchSnapshotSourceArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchSnapshotSourceArgs();
        }

        public Builder(DeploymentElasticsearchSnapshotSourceArgs defaults) {
            $ = new DeploymentElasticsearchSnapshotSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param snapshotName Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        /**
         * @param snapshotName Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotName(String snapshotName) {
            return snapshotName(Output.of(snapshotName));
        }

        /**
         * @param sourceElasticsearchClusterId ID of the Elasticsearch cluster that will be used as the source of the snapshot
         * 
         * @return builder
         * 
         */
        public Builder sourceElasticsearchClusterId(Output<String> sourceElasticsearchClusterId) {
            $.sourceElasticsearchClusterId = sourceElasticsearchClusterId;
            return this;
        }

        /**
         * @param sourceElasticsearchClusterId ID of the Elasticsearch cluster that will be used as the source of the snapshot
         * 
         * @return builder
         * 
         */
        public Builder sourceElasticsearchClusterId(String sourceElasticsearchClusterId) {
            return sourceElasticsearchClusterId(Output.of(sourceElasticsearchClusterId));
        }

        public DeploymentElasticsearchSnapshotSourceArgs build() {
            if ($.sourceElasticsearchClusterId == null) {
                throw new MissingRequiredPropertyException("DeploymentElasticsearchSnapshotSourceArgs", "sourceElasticsearchClusterId");
            }
            return $;
        }
    }

}
