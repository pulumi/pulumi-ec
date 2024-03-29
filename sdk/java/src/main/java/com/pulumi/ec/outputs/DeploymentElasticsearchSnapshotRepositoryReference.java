// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeploymentElasticsearchSnapshotRepositoryReference {
    /**
     * @return ECE snapshot repository name, from the &#39;/platform/configuration/snapshots/repositories&#39; endpoint
     * 
     */
    private String repositoryName;

    private DeploymentElasticsearchSnapshotRepositoryReference() {}
    /**
     * @return ECE snapshot repository name, from the &#39;/platform/configuration/snapshots/repositories&#39; endpoint
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchSnapshotRepositoryReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String repositoryName;
        public Builder() {}
        public Builder(DeploymentElasticsearchSnapshotRepositoryReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
        }

        @CustomType.Setter
        public Builder repositoryName(String repositoryName) {
            if (repositoryName == null) {
              throw new MissingRequiredPropertyException("DeploymentElasticsearchSnapshotRepositoryReference", "repositoryName");
            }
            this.repositoryName = repositoryName;
            return this;
        }
        public DeploymentElasticsearchSnapshotRepositoryReference build() {
            final var _resultValue = new DeploymentElasticsearchSnapshotRepositoryReference();
            _resultValue.repositoryName = repositoryName;
            return _resultValue;
        }
    }
}
