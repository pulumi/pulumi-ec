// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     * 
     */
    @Import(name="apikey")
    private @Nullable Output<String> apikey;

    /**
     * @return API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     * 
     */
    public Optional<Output<String>> apikey() {
        return Optional.ofNullable(this.apikey);
    }

    /**
     * Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Allow the provider to skip TLS validation on its outgoing HTTP calls.
     * 
     */
    @Import(name="insecure", json=true)
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Allow the provider to skip TLS validation on its outgoing HTTP calls.
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * When set, a &#34;request.log&#34; file will be written with all outgoing HTTP requests. Defaults to &#34;false&#34;.
     * 
     */
    @Import(name="verbose", json=true)
    private @Nullable Output<Boolean> verbose;

    /**
     * @return When set, a &#34;request.log&#34; file will be written with all outgoing HTTP requests. Defaults to &#34;false&#34;.
     * 
     */
    public Optional<Output<Boolean>> verbose() {
        return Optional.ofNullable(this.verbose);
    }

    /**
     * When set with verbose, the contents of the Authorization header will not be redacted. Defaults to &#34;false&#34;.
     * 
     */
    @Import(name="verboseCredentials", json=true)
    private @Nullable Output<Boolean> verboseCredentials;

    /**
     * @return When set with verbose, the contents of the Authorization header will not be redacted. Defaults to &#34;false&#34;.
     * 
     */
    public Optional<Output<Boolean>> verboseCredentials() {
        return Optional.ofNullable(this.verboseCredentials);
    }

    /**
     * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    @Import(name="verboseFile")
    private @Nullable Output<String> verboseFile;

    /**
     * @return Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
     * 
     */
    public Optional<Output<String>> verboseFile() {
        return Optional.ofNullable(this.verboseFile);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.apikey = $.apikey;
        this.endpoint = $.endpoint;
        this.insecure = $.insecure;
        this.password = $.password;
        this.timeout = $.timeout;
        this.username = $.username;
        this.verbose = $.verbose;
        this.verboseCredentials = $.verboseCredentials;
        this.verboseFile = $.verboseFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apikey API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
         * 
         * @return builder
         * 
         */
        public Builder apikey(@Nullable Output<String> apikey) {
            $.apikey = apikey;
            return this;
        }

        /**
         * @param apikey API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
         * 
         * @return builder
         * 
         */
        public Builder apikey(String apikey) {
            return apikey(Output.of(apikey));
        }

        /**
         * @param endpoint Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint where the terraform provider will point to. Defaults to &#34;https://api.elastic-cloud.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param insecure Allow the provider to skip TLS validation on its outgoing HTTP calls.
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Allow the provider to skip TLS validation on its outgoing HTTP calls.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param password Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
         * Private.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
         * Private.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param timeout Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param username Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
         * Private.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
         * Private.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param verbose When set, a &#34;request.log&#34; file will be written with all outgoing HTTP requests. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verbose(@Nullable Output<Boolean> verbose) {
            $.verbose = verbose;
            return this;
        }

        /**
         * @param verbose When set, a &#34;request.log&#34; file will be written with all outgoing HTTP requests. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verbose(Boolean verbose) {
            return verbose(Output.of(verbose));
        }

        /**
         * @param verboseCredentials When set with verbose, the contents of the Authorization header will not be redacted. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verboseCredentials(@Nullable Output<Boolean> verboseCredentials) {
            $.verboseCredentials = verboseCredentials;
            return this;
        }

        /**
         * @param verboseCredentials When set with verbose, the contents of the Authorization header will not be redacted. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verboseCredentials(Boolean verboseCredentials) {
            return verboseCredentials(Output.of(verboseCredentials));
        }

        /**
         * @param verboseFile Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verboseFile(@Nullable Output<String> verboseFile) {
            $.verboseFile = verboseFile;
            return this;
        }

        /**
         * @param verboseFile Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
         * 
         * @return builder
         * 
         */
        public Builder verboseFile(String verboseFile) {
            return verboseFile(Output.of(verboseFile));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
