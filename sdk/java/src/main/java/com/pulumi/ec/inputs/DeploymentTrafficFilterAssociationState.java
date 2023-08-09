// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentTrafficFilterAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTrafficFilterAssociationState Empty = new DeploymentTrafficFilterAssociationState();

    /**
     * Required deployment ID where the traffic filter will be associated
     * 
     */
    @Import(name="deploymentId")
    private @Nullable Output<String> deploymentId;

    /**
     * @return Required deployment ID where the traffic filter will be associated
     * 
     */
    public Optional<Output<String>> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    /**
     * Required traffic filter ruleset ID to tie to a deployment
     * 
     */
    @Import(name="trafficFilterId")
    private @Nullable Output<String> trafficFilterId;

    /**
     * @return Required traffic filter ruleset ID to tie to a deployment
     * 
     */
    public Optional<Output<String>> trafficFilterId() {
        return Optional.ofNullable(this.trafficFilterId);
    }

    private DeploymentTrafficFilterAssociationState() {}

    private DeploymentTrafficFilterAssociationState(DeploymentTrafficFilterAssociationState $) {
        this.deploymentId = $.deploymentId;
        this.trafficFilterId = $.trafficFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTrafficFilterAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTrafficFilterAssociationState $;

        public Builder() {
            $ = new DeploymentTrafficFilterAssociationState();
        }

        public Builder(DeploymentTrafficFilterAssociationState defaults) {
            $ = new DeploymentTrafficFilterAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId Required deployment ID where the traffic filter will be associated
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Required deployment ID where the traffic filter will be associated
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param trafficFilterId Required traffic filter ruleset ID to tie to a deployment
         * 
         * @return builder
         * 
         */
        public Builder trafficFilterId(@Nullable Output<String> trafficFilterId) {
            $.trafficFilterId = trafficFilterId;
            return this;
        }

        /**
         * @param trafficFilterId Required traffic filter ruleset ID to tie to a deployment
         * 
         * @return builder
         * 
         */
        public Builder trafficFilterId(String trafficFilterId) {
            return trafficFilterId(Output.of(trafficFilterId));
        }

        public DeploymentTrafficFilterAssociationState build() {
            return $;
        }
    }

}
