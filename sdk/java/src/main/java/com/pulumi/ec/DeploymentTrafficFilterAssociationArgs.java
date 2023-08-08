// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentTrafficFilterAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTrafficFilterAssociationArgs Empty = new DeploymentTrafficFilterAssociationArgs();

    /**
     * Required deployment ID where the traffic filter will be associated
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return Required deployment ID where the traffic filter will be associated
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    /**
     * Required traffic filter ruleset ID to tie to a deployment
     * 
     */
    @Import(name="trafficFilterId", required=true)
    private Output<String> trafficFilterId;

    /**
     * @return Required traffic filter ruleset ID to tie to a deployment
     * 
     */
    public Output<String> trafficFilterId() {
        return this.trafficFilterId;
    }

    private DeploymentTrafficFilterAssociationArgs() {}

    private DeploymentTrafficFilterAssociationArgs(DeploymentTrafficFilterAssociationArgs $) {
        this.deploymentId = $.deploymentId;
        this.trafficFilterId = $.trafficFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTrafficFilterAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTrafficFilterAssociationArgs $;

        public Builder() {
            $ = new DeploymentTrafficFilterAssociationArgs();
        }

        public Builder(DeploymentTrafficFilterAssociationArgs defaults) {
            $ = new DeploymentTrafficFilterAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId Required deployment ID where the traffic filter will be associated
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
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
        public Builder trafficFilterId(Output<String> trafficFilterId) {
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

        public DeploymentTrafficFilterAssociationArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.trafficFilterId = Objects.requireNonNull($.trafficFilterId, "expected parameter 'trafficFilterId' to be non-null");
            return $;
        }
    }

}
