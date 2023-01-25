// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAwsPrivatelinkEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsPrivatelinkEndpointPlainArgs Empty = new GetAwsPrivatelinkEndpointPlainArgs();

    /**
     * Region to retrieve the Private Link configuration for.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Region to retrieve the Private Link configuration for.
     * 
     */
    public String region() {
        return this.region;
    }

    private GetAwsPrivatelinkEndpointPlainArgs() {}

    private GetAwsPrivatelinkEndpointPlainArgs(GetAwsPrivatelinkEndpointPlainArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsPrivatelinkEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsPrivatelinkEndpointPlainArgs $;

        public Builder() {
            $ = new GetAwsPrivatelinkEndpointPlainArgs();
        }

        public Builder(GetAwsPrivatelinkEndpointPlainArgs defaults) {
            $ = new GetAwsPrivatelinkEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Region to retrieve the Private Link configuration for.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetAwsPrivatelinkEndpointPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
