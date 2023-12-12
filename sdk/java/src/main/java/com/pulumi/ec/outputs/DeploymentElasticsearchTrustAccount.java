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
public final class DeploymentElasticsearchTrustAccount {
    /**
     * @return The ID of the Account.
     * 
     */
    private String accountId;
    /**
     * @return If true, all clusters in this account will by default be trusted and the `trust_allowlist` is ignored.
     * 
     */
    private Boolean trustAll;
    /**
     * @return The list of clusters to trust. Only used when `trust_all` is false.
     * 
     */
    private @Nullable List<String> trustAllowlists;

    private DeploymentElasticsearchTrustAccount() {}
    /**
     * @return The ID of the Account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return If true, all clusters in this account will by default be trusted and the `trust_allowlist` is ignored.
     * 
     */
    public Boolean trustAll() {
        return this.trustAll;
    }
    /**
     * @return The list of clusters to trust. Only used when `trust_all` is false.
     * 
     */
    public List<String> trustAllowlists() {
        return this.trustAllowlists == null ? List.of() : this.trustAllowlists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchTrustAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean trustAll;
        private @Nullable List<String> trustAllowlists;
        public Builder() {}
        public Builder(DeploymentElasticsearchTrustAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.trustAll = defaults.trustAll;
    	      this.trustAllowlists = defaults.trustAllowlists;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
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
        public DeploymentElasticsearchTrustAccount build() {
            final var _resultValue = new DeploymentElasticsearchTrustAccount();
            _resultValue.accountId = accountId;
            _resultValue.trustAll = trustAll;
            _resultValue.trustAllowlists = trustAllowlists;
            return _resultValue;
        }
    }
}
