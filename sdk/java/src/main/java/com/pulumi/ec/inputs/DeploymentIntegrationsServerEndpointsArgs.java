// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DeploymentIntegrationsServerEndpointsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentIntegrationsServerEndpointsArgs Empty = new DeploymentIntegrationsServerEndpointsArgs();

    @Import(name="apm", required=true)
    private Output<String> apm;

    public Output<String> apm() {
        return this.apm;
    }

    @Import(name="fleet", required=true)
    private Output<String> fleet;

    public Output<String> fleet() {
        return this.fleet;
    }

    private DeploymentIntegrationsServerEndpointsArgs() {}

    private DeploymentIntegrationsServerEndpointsArgs(DeploymentIntegrationsServerEndpointsArgs $) {
        this.apm = $.apm;
        this.fleet = $.fleet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentIntegrationsServerEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentIntegrationsServerEndpointsArgs $;

        public Builder() {
            $ = new DeploymentIntegrationsServerEndpointsArgs();
        }

        public Builder(DeploymentIntegrationsServerEndpointsArgs defaults) {
            $ = new DeploymentIntegrationsServerEndpointsArgs(Objects.requireNonNull(defaults));
        }

        public Builder apm(Output<String> apm) {
            $.apm = apm;
            return this;
        }

        public Builder apm(String apm) {
            return apm(Output.of(apm));
        }

        public Builder fleet(Output<String> fleet) {
            $.fleet = fleet;
            return this;
        }

        public Builder fleet(String fleet) {
            return fleet(Output.of(fleet));
        }

        public DeploymentIntegrationsServerEndpointsArgs build() {
            if ($.apm == null) {
                throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpointsArgs", "apm");
            }
            if ($.fleet == null) {
                throw new MissingRequiredPropertyException("DeploymentIntegrationsServerEndpointsArgs", "fleet");
            }
            return $;
        }
    }

}
