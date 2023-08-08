// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGcpPrivateServiceConnectEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGcpPrivateServiceConnectEndpointPlainArgs Empty = new GetGcpPrivateServiceConnectEndpointPlainArgs();

    /**
     * Region to retrieve the Prive Link configuration for.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return Region to retrieve the Prive Link configuration for.
     * 
     */
    public String region() {
        return this.region;
    }

    private GetGcpPrivateServiceConnectEndpointPlainArgs() {}

    private GetGcpPrivateServiceConnectEndpointPlainArgs(GetGcpPrivateServiceConnectEndpointPlainArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGcpPrivateServiceConnectEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGcpPrivateServiceConnectEndpointPlainArgs $;

        public Builder() {
            $ = new GetGcpPrivateServiceConnectEndpointPlainArgs();
        }

        public Builder(GetGcpPrivateServiceConnectEndpointPlainArgs defaults) {
            $ = new GetGcpPrivateServiceConnectEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region Region to retrieve the Prive Link configuration for.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetGcpPrivateServiceConnectEndpointPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
