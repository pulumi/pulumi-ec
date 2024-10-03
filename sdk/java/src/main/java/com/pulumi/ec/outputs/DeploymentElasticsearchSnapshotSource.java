// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchSnapshotSource {
    /**
     * @return Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
     * 
     */
    private @Nullable String snapshotName;
    /**
     * @return ID of the Elasticsearch cluster that will be used as the source of the snapshot
     * 
     */
    private String sourceElasticsearchClusterId;

    private DeploymentElasticsearchSnapshotSource() {}
    /**
     * @return Name of the snapshot to restore. Use &#39;**latest_success**&#39; to get the most recent successful snapshot.
     * 
     */
    public Optional<String> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }
    /**
     * @return ID of the Elasticsearch cluster that will be used as the source of the snapshot
     * 
     */
    public String sourceElasticsearchClusterId() {
        return this.sourceElasticsearchClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchSnapshotSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String snapshotName;
        private String sourceElasticsearchClusterId;
        public Builder() {}
        public Builder(DeploymentElasticsearchSnapshotSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotName = defaults.snapshotName;
    	      this.sourceElasticsearchClusterId = defaults.sourceElasticsearchClusterId;
        }

        @CustomType.Setter
        public Builder snapshotName(@Nullable String snapshotName) {

            this.snapshotName = snapshotName;
            return this;
        }
        @CustomType.Setter
        public Builder sourceElasticsearchClusterId(String sourceElasticsearchClusterId) {
            if (sourceElasticsearchClusterId == null) {
              throw new MissingRequiredPropertyException("DeploymentElasticsearchSnapshotSource", "sourceElasticsearchClusterId");
            }
            this.sourceElasticsearchClusterId = sourceElasticsearchClusterId;
            return this;
        }
        public DeploymentElasticsearchSnapshotSource build() {
            final var _resultValue = new DeploymentElasticsearchSnapshotSource();
            _resultValue.snapshotName = snapshotName;
            _resultValue.sourceElasticsearchClusterId = sourceElasticsearchClusterId;
            return _resultValue;
        }
    }
}