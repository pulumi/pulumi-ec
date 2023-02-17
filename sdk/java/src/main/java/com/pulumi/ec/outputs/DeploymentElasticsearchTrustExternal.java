// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchTrustExternal {
    /**
     * @return Identifier of the the trust relationship with external entities (remote environments, remote accounts...).
     * 
     */
    private String relationshipId;
    /**
     * @return If true, all clusters in this external entity will be trusted and the `trust_allowlist` is ignored.
     * 
     */
    private Boolean trustAll;
    /**
     * @return The list of clusters to trust. Only used when `trust_all` is `false`.
     * 
     */
    private @Nullable List<String> trustAllowlists;

    private DeploymentElasticsearchTrustExternal() {}
    /**
     * @return Identifier of the the trust relationship with external entities (remote environments, remote accounts...).
     * 
     */
    public String relationshipId() {
        return this.relationshipId;
    }
    /**
     * @return If true, all clusters in this external entity will be trusted and the `trust_allowlist` is ignored.
     * 
     */
    public Boolean trustAll() {
        return this.trustAll;
    }
    /**
     * @return The list of clusters to trust. Only used when `trust_all` is `false`.
     * 
     */
    public List<String> trustAllowlists() {
        return this.trustAllowlists == null ? List.of() : this.trustAllowlists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchTrustExternal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String relationshipId;
        private Boolean trustAll;
        private @Nullable List<String> trustAllowlists;
        public Builder() {}
        public Builder(DeploymentElasticsearchTrustExternal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relationshipId = defaults.relationshipId;
    	      this.trustAll = defaults.trustAll;
    	      this.trustAllowlists = defaults.trustAllowlists;
        }

        @CustomType.Setter
        public Builder relationshipId(String relationshipId) {
            this.relationshipId = Objects.requireNonNull(relationshipId);
            return this;
        }
        @CustomType.Setter
        public Builder trustAll(Boolean trustAll) {
            this.trustAll = Objects.requireNonNull(trustAll);
            return this;
        }
        @CustomType.Setter
        public Builder trustAllowlists(@Nullable List<String> trustAllowlists) {
            this.trustAllowlists = trustAllowlists;
            return this;
        }
        public Builder trustAllowlists(String... trustAllowlists) {
            return trustAllowlists(List.of(trustAllowlists));
        }
        public DeploymentElasticsearchTrustExternal build() {
            final var o = new DeploymentElasticsearchTrustExternal();
            o.relationshipId = relationshipId;
            o.trustAll = trustAll;
            o.trustAllowlists = trustAllowlists;
            return o;
        }
    }
}