// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchRemoteClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchRemoteClusterArgs Empty = new DeploymentElasticsearchRemoteClusterArgs();

    /**
     * Alias for this Cross Cluster Search binding
     * 
     */
    @Import(name="alias", required=true)
    private Output<String> alias;

    /**
     * @return Alias for this Cross Cluster Search binding
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }

    /**
     * Remote deployment ID
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return Remote deployment ID
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    @Import(name="refId")
    private @Nullable Output<String> refId;

    public Optional<Output<String>> refId() {
        return Optional.ofNullable(this.refId);
    }

    /**
     * If true, skip the cluster during search when disconnected
     * 
     */
    @Import(name="skipUnavailable")
    private @Nullable Output<Boolean> skipUnavailable;

    /**
     * @return If true, skip the cluster during search when disconnected
     * 
     */
    public Optional<Output<Boolean>> skipUnavailable() {
        return Optional.ofNullable(this.skipUnavailable);
    }

    private DeploymentElasticsearchRemoteClusterArgs() {}

    private DeploymentElasticsearchRemoteClusterArgs(DeploymentElasticsearchRemoteClusterArgs $) {
        this.alias = $.alias;
        this.deploymentId = $.deploymentId;
        this.refId = $.refId;
        this.skipUnavailable = $.skipUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchRemoteClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchRemoteClusterArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchRemoteClusterArgs();
        }

        public Builder(DeploymentElasticsearchRemoteClusterArgs defaults) {
            $ = new DeploymentElasticsearchRemoteClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias Alias for this Cross Cluster Search binding
         * 
         * @return builder
         * 
         */
        public Builder alias(Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Alias for this Cross Cluster Search binding
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param deploymentId Remote deployment ID
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Remote deployment ID
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        public Builder refId(@Nullable Output<String> refId) {
            $.refId = refId;
            return this;
        }

        public Builder refId(String refId) {
            return refId(Output.of(refId));
        }

        /**
         * @param skipUnavailable If true, skip the cluster during search when disconnected
         * 
         * @return builder
         * 
         */
        public Builder skipUnavailable(@Nullable Output<Boolean> skipUnavailable) {
            $.skipUnavailable = skipUnavailable;
            return this;
        }

        /**
         * @param skipUnavailable If true, skip the cluster during search when disconnected
         * 
         * @return builder
         * 
         */
        public Builder skipUnavailable(Boolean skipUnavailable) {
            return skipUnavailable(Output.of(skipUnavailable));
        }

        public DeploymentElasticsearchRemoteClusterArgs build() {
            $.alias = Objects.requireNonNull($.alias, "expected parameter 'alias' to be non-null");
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            return $;
        }
    }

}
