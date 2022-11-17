// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentElasticsearchKeystoreState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentElasticsearchKeystoreState Empty = new DeploymentElasticsearchKeystoreState();

    /**
     * if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
     * 
     */
    @Import(name="asFile")
    private @Nullable Output<Boolean> asFile;

    /**
     * @return if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
     * 
     */
    public Optional<Output<Boolean>> asFile() {
        return Optional.ofNullable(this.asFile);
    }

    /**
     * Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
     * 
     */
    @Import(name="deploymentId")
    private @Nullable Output<String> deploymentId;

    /**
     * @return Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
     * 
     */
    public Optional<Output<String>> deploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }

    /**
     * Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
     * 
     */
    @Import(name="settingName")
    private @Nullable Output<String> settingName;

    /**
     * @return Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
     * 
     */
    public Optional<Output<String>> settingName() {
        return Optional.ofNullable(this.settingName);
    }

    /**
     * Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DeploymentElasticsearchKeystoreState() {}

    private DeploymentElasticsearchKeystoreState(DeploymentElasticsearchKeystoreState $) {
        this.asFile = $.asFile;
        this.deploymentId = $.deploymentId;
        this.settingName = $.settingName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentElasticsearchKeystoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentElasticsearchKeystoreState $;

        public Builder() {
            $ = new DeploymentElasticsearchKeystoreState();
        }

        public Builder(DeploymentElasticsearchKeystoreState defaults) {
            $ = new DeploymentElasticsearchKeystoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param asFile if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
         * 
         * @return builder
         * 
         */
        public Builder asFile(@Nullable Output<Boolean> asFile) {
            $.asFile = asFile;
            return this;
        }

        /**
         * @param asFile if set to `true`, it stores the remote keystore setting as a file. The default value is `false`, which stores the keystore setting as string when value is a plain string.
         * 
         * @return builder
         * 
         */
        public Builder asFile(Boolean asFile) {
            return asFile(Output.of(asFile));
        }

        /**
         * @param deploymentId Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Deployment ID of the deployment that holds the Elasticsearch cluster where the keystore setting is written to.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param settingName Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
         * 
         * @return builder
         * 
         */
        public Builder settingName(@Nullable Output<String> settingName) {
            $.settingName = settingName;
            return this;
        }

        /**
         * @param settingName Required name for the keystore setting, if the setting already exists in the Elasticsearch cluster, it will be overridden.
         * 
         * @return builder
         * 
         */
        public Builder settingName(String settingName) {
            return settingName(Output.of(settingName));
        }

        /**
         * @param value Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of this setting. This can either be a string or a JSON object that is stored as a JSON string in the keystore.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DeploymentElasticsearchKeystoreState build() {
            return $;
        }
    }

}
