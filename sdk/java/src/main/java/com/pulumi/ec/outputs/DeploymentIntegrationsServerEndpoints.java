// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeploymentIntegrationsServerEndpoints {
    private String apm;
    private String fleet;
    private String profiling;
    private String symbols;

    private DeploymentIntegrationsServerEndpoints() {}
    public String apm() {
        return this.apm;
    }
    public String fleet() {
        return this.fleet;
    }
    public String profiling() {
        return this.profiling;
    }
    public String symbols() {
        return this.symbols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentIntegrationsServerEndpoints defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apm;
        private String fleet;
        private String profiling;
        private String symbols;
        public Builder() {}
        public Builder(DeploymentIntegrationsServerEndpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apm = defaults.apm;
    	      this.fleet = defaults.fleet;
    	      this.profiling = defaults.profiling;
    	      this.symbols = defaults.symbols;
        }

        @CustomType.Setter
        public Builder apm(String apm) {
            if (apm == null) {
              throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpoints", "apm");
            }
            this.apm = apm;
            return this;
        }
        @CustomType.Setter
        public Builder fleet(String fleet) {
            if (fleet == null) {
              throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpoints", "fleet");
            }
            this.fleet = fleet;
            return this;
        }
        @CustomType.Setter
        public Builder profiling(String profiling) {
            if (profiling == null) {
              throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpoints", "profiling");
            }
            this.profiling = profiling;
            return this;
        }
        @CustomType.Setter
        public Builder symbols(String symbols) {
            if (symbols == null) {
              throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpoints", "symbols");
            }
            this.symbols = symbols;
            return this;
        }
        public DeploymentIntegrationsServerEndpoints build() {
            final var _resultValue = new DeploymentIntegrationsServerEndpoints();
            _resultValue.apm = apm;
            _resultValue.fleet = fleet;
            _resultValue.profiling = profiling;
            _resultValue.symbols = symbols;
            return _resultValue;
        }
    }
}
