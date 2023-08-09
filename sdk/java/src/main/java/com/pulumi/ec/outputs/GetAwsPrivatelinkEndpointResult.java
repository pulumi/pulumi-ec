// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAwsPrivatelinkEndpointResult {
    /**
     * @return The domain name to used in when configuring a private hosted zone in the VPCE connection.
     * 
     */
    private String domainName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Region to retrieve the Private Link configuration for.
     * 
     */
    private String region;
    /**
     * @return The VPC service name used to connect to the region.
     * 
     */
    private String vpcServiceName;
    /**
     * @return The IDs of the availability zones hosting the VPC endpoints.
     * 
     */
    private List<String> zoneIds;

    private GetAwsPrivatelinkEndpointResult() {}
    /**
     * @return The domain name to used in when configuring a private hosted zone in the VPCE connection.
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
    /**
     * @return Region to retrieve the Private Link configuration for.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The VPC service name used to connect to the region.
     * 
     */
    public String vpcServiceName() {
        return this.vpcServiceName;
    }
    /**
     * @return The IDs of the availability zones hosting the VPC endpoints.
     * 
     */
    public List<String> zoneIds() {
        return this.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsPrivatelinkEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String id;
        private String region;
        private String vpcServiceName;
        private List<String> zoneIds;
        public Builder() {}
        public Builder(GetAwsPrivatelinkEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.vpcServiceName = defaults.vpcServiceName;
    	      this.zoneIds = defaults.zoneIds;
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
        public Builder vpcServiceName(String vpcServiceName) {
            this.vpcServiceName = Objects.requireNonNull(vpcServiceName);
            return this;
        }
        @CustomType.Setter
        public Builder zoneIds(List<String> zoneIds) {
            this.zoneIds = Objects.requireNonNull(zoneIds);
            return this;
        }
        public Builder zoneIds(String... zoneIds) {
            return zoneIds(List.of(zoneIds));
        }
        public GetAwsPrivatelinkEndpointResult build() {
            final var o = new GetAwsPrivatelinkEndpointResult();
            o.domainName = domainName;
            o.id = id;
            o.region = region;
            o.vpcServiceName = vpcServiceName;
            o.zoneIds = zoneIds;
            return o;
        }
    }
}
