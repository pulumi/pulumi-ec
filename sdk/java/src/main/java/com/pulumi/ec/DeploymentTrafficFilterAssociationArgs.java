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
     * Deployment ID of the deployment to which the traffic filter rule is attached.
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return Deployment ID of the deployment to which the traffic filter rule is attached.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    /**
     * Traffic filter ID of the rule to use for the attachment.
     * 
     */
    @Import(name="trafficFilterId", required=true)
    private Output<String> trafficFilterId;

    /**
     * @return Traffic filter ID of the rule to use for the attachment.
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
         * @param deploymentId Deployment ID of the deployment to which the traffic filter rule is attached.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Deployment ID of the deployment to which the traffic filter rule is attached.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param trafficFilterId Traffic filter ID of the rule to use for the attachment.
         * 
         * @return builder
         * 
         */
        public Builder trafficFilterId(Output<String> trafficFilterId) {
            $.trafficFilterId = trafficFilterId;
            return this;
        }

        /**
         * @param trafficFilterId Traffic filter ID of the rule to use for the attachment.
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
