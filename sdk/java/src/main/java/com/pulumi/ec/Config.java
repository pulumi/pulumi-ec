// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("ec");
/**
 * API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
 * 
 */
    public Optional<String> apikey() {
        return Codegen.stringProp("apikey").config(config).get();
    }
    public Optional<String> endpoint() {
        return Codegen.stringProp("endpoint").config(config).get();
    }
/**
 * Allow the provider to skip TLS validation on its outgoing HTTP calls.
 * 
 */
    public Optional<Boolean> insecure() {
        return Codegen.booleanProp("insecure").config(config).get();
    }
/**
 * Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
 * Private.
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).get();
    }
/**
 * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
 * 
 */
    public Optional<String> timeout() {
        return Codegen.stringProp("timeout").config(config).get();
    }
/**
 * Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
 * Private.
 * 
 */
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).get();
    }
/**
 * When set, a &#34;request.log&#34; file will be written with all outgoing HTTP requests. Defaults to &#34;false&#34;.
 * 
 */
    public Optional<Boolean> verbose() {
        return Codegen.booleanProp("verbose").config(config).get();
    }
/**
 * When set with verbose, the contents of the Authorization header will not be redacted. Defaults to &#34;false&#34;.
 * 
 */
    public Optional<Boolean> verboseCredentials() {
        return Codegen.booleanProp("verboseCredentials").config(config).get();
    }
/**
 * Timeout used for individual HTTP calls. Defaults to &#34;1m&#34;.
 * 
 */
    public Optional<String> verboseFile() {
        return Codegen.stringProp("verboseFile").config(config).get();
    }
}
