// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentElasticsearchStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchStrategyArgs Empty = new DeploymentElasticsearchStrategyArgs();

    /**
     * Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rolling_all].
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rolling_all].
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DeploymentElasticsearchStrategyArgs() {}

    private DeploymentElasticsearchStrategyArgs(DeploymentElasticsearchStrategyArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchStrategyArgs $;

        public Builder() {
            $ = new DeploymentElasticsearchStrategyArgs();
        }

        public Builder(DeploymentElasticsearchStrategyArgs defaults) {
            $ = new DeploymentElasticsearchStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rolling_all].
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Set the type of configuration strategy [autodetect, grow_and_shrink, rolling_grow_and_shrink, rolling_all].
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentElasticsearchStrategyArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}