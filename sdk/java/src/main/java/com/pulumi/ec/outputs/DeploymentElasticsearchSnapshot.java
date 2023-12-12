// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.DeploymentElasticsearchSnapshotRepository;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchSnapshot {
    /**
     * @return Indicates if Snapshotting is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Snapshot repository configuration
     * 
     */
    private @Nullable DeploymentElasticsearchSnapshotRepository repository;

    private DeploymentElasticsearchSnapshot() {}
    /**
     * @return Indicates if Snapshotting is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Snapshot repository configuration
     * 
     */
    public Optional<DeploymentElasticsearchSnapshotRepository> repository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchSnapshot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable DeploymentElasticsearchSnapshotRepository repository;
        public Builder() {}
        public Builder(DeploymentElasticsearchSnapshot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder repository(@Nullable DeploymentElasticsearchSnapshotRepository repository) {
            this.repository = repository;
            return this;
        }
        public DeploymentElasticsearchSnapshot build() {
            final var _resultValue = new DeploymentElasticsearchSnapshot();
            _resultValue.enabled = enabled;
            _resultValue.repository = repository;
            return _resultValue;
        }
    }
}
