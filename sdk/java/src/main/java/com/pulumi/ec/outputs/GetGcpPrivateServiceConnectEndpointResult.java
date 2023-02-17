// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGcpPrivateServiceConnectEndpointResult {
    /**
     * @return The domain name to point towards the PSC endpoint.
     * 
     */
    private String domainName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String region;
    /**
     * @return The service attachment URI to attach the PSC endpoint to.
     * 
     */
    private String serviceAttachmentUri;

    private GetGcpPrivateServiceConnectEndpointResult() {}
    /**
     * @return The domain name to point towards the PSC endpoint.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String region() {
        return this.region;
    }
    /**
     * @return The service attachment URI to attach the PSC endpoint to.
     * 
     */
    public String serviceAttachmentUri() {
        return this.serviceAttachmentUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGcpPrivateServiceConnectEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String id;
        private String region;
        private String serviceAttachmentUri;
        public Builder() {}
        public Builder(GetGcpPrivateServiceConnectEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.serviceAttachmentUri = defaults.serviceAttachmentUri;
        }

        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAttachmentUri(String serviceAttachmentUri) {
            this.serviceAttachmentUri = Objects.requireNonNull(serviceAttachmentUri);
            return this;
        }
        public GetGcpPrivateServiceConnectEndpointResult build() {
            final var o = new GetGcpPrivateServiceConnectEndpointResult();
            o.domainName = domainName;
            o.id = id;
            o.region = region;
            o.serviceAttachmentUri = serviceAttachmentUri;
            return o;
        }
    }
}