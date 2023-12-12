// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentObservability {
    private String deploymentId;
    private @Nullable Boolean logs;
    private @Nullable Boolean metrics;
    private @Nullable String refId;

    private DeploymentObservability() {}
    public String deploymentId() {
        return this.deploymentId;
    }
    public Optional<Boolean> logs() {
        return Optional.ofNullable(this.logs);
    }
    public Optional<Boolean> metrics() {
        return Optional.ofNullable(this.metrics);
    }
    public Optional<String> refId() {
        return Optional.ofNullable(this.refId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentObservability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deploymentId;
        private @Nullable Boolean logs;
        private @Nullable Boolean metrics;
        private @Nullable String refId;
        public Builder() {}
        public Builder(DeploymentObservability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.refId = defaults.refId;
        }

        @CustomType.Setter
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        @CustomType.Setter
        public Builder logs(@Nullable Boolean logs) {
            this.logs = logs;
            return this;
        }
        @CustomType.Setter
        public Builder metrics(@Nullable Boolean metrics) {
            this.metrics = metrics;
            return this;
        }
        @CustomType.Setter
        public Builder refId(@Nullable String refId) {
            this.refId = refId;
            return this;
        }
        public DeploymentObservability build() {
            final var _resultValue = new DeploymentObservability();
            _resultValue.deploymentId = deploymentId;
            _resultValue.logs = logs;
            _resultValue.metrics = metrics;
            _resultValue.refId = refId;
            return _resultValue;
        }
    }
}
