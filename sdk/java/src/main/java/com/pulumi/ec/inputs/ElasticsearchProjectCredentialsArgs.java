// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticsearchProjectCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticsearchProjectCredentialsArgs Empty = new ElasticsearchProjectCredentialsArgs();

    /**
     * Basic auth password that can be used to access the Elasticsearch API.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Basic auth password that can be used to access the Elasticsearch API.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Basic auth username that can be used to access the Elasticsearch API.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Basic auth username that can be used to access the Elasticsearch API.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ElasticsearchProjectCredentialsArgs() {}

    private ElasticsearchProjectCredentialsArgs(ElasticsearchProjectCredentialsArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticsearchProjectCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticsearchProjectCredentialsArgs $;

        public Builder() {
            $ = new ElasticsearchProjectCredentialsArgs();
        }

        public Builder(ElasticsearchProjectCredentialsArgs defaults) {
            $ = new ElasticsearchProjectCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Basic auth password that can be used to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Basic auth password that can be used to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Basic auth username that can be used to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Basic auth username that can be used to access the Elasticsearch API.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ElasticsearchProjectCredentialsArgs build() {
            return $;
        }
    }

}