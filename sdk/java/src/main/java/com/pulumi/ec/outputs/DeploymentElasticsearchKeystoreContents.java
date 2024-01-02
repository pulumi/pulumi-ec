// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentElasticsearchKeystoreContents {
    /**
     * @return If true, the secret is handled as a file. Otherwise, it&#39;s handled as a plain string.
     * 
     */
    private @Nullable Boolean asFile;
    /**
     * @return Secret value. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    private String value;

    private DeploymentElasticsearchKeystoreContents() {}
    /**
     * @return If true, the secret is handled as a file. Otherwise, it&#39;s handled as a plain string.
     * 
     */
    public Optional<Boolean> asFile() {
        return Optional.ofNullable(this.asFile);
    }
    /**
     * @return Secret value. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentElasticsearchKeystoreContents defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean asFile;
        private String value;
        public Builder() {}
        public Builder(DeploymentElasticsearchKeystoreContents defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asFile = defaults.asFile;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder asFile(@Nullable Boolean asFile) {

            this.asFile = asFile;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("DeploymentElasticsearchKeystoreContents", "value");
            }
            this.value = value;
            return this;
        }
        public DeploymentElasticsearchKeystoreContents build() {
            final var _resultValue = new DeploymentElasticsearchKeystoreContents();
            _resultValue.asFile = asFile;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
