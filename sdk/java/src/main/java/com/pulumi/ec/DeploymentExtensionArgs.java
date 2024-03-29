// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentExtensionArgs Empty = new DeploymentExtensionArgs();

    /**
     * Description for the extension
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the extension
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The URL to download the extension archive.
     * 
     */
    @Import(name="downloadUrl")
    private @Nullable Output<String> downloadUrl;

    /**
     * @return The URL to download the extension archive.
     * 
     */
    public Optional<Output<String>> downloadUrl() {
        return Optional.ofNullable(this.downloadUrl);
    }

    /**
     * Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     * 
     */
    @Import(name="extensionType", required=true)
    private Output<String> extensionType;

    /**
     * @return Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
     * 
     */
    public Output<String> extensionType() {
        return this.extensionType;
    }

    /**
     * Hash value of the file. Triggers re-uploading the file on change.
     * 
     */
    @Import(name="fileHash")
    private @Nullable Output<String> fileHash;

    /**
     * @return Hash value of the file. Triggers re-uploading the file on change.
     * 
     */
    public Optional<Output<String>> fileHash() {
        return Optional.ofNullable(this.fileHash);
    }

    /**
     * Local file path to upload as the extension.
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return Local file path to upload as the extension.
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * Name of the extension
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the extension
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private DeploymentExtensionArgs() {}

    private DeploymentExtensionArgs(DeploymentExtensionArgs $) {
        this.description = $.description;
        this.downloadUrl = $.downloadUrl;
        this.extensionType = $.extensionType;
        this.fileHash = $.fileHash;
        this.filePath = $.filePath;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentExtensionArgs $;

        public Builder() {
            $ = new DeploymentExtensionArgs();
        }

        public Builder(DeploymentExtensionArgs defaults) {
            $ = new DeploymentExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description for the extension
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the extension
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param downloadUrl The URL to download the extension archive.
         * 
         * @return builder
         * 
         */
        public Builder downloadUrl(@Nullable Output<String> downloadUrl) {
            $.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * @param downloadUrl The URL to download the extension archive.
         * 
         * @return builder
         * 
         */
        public Builder downloadUrl(String downloadUrl) {
            return downloadUrl(Output.of(downloadUrl));
        }

        /**
         * @param extensionType Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(Output<String> extensionType) {
            $.extensionType = extensionType;
            return this;
        }

        /**
         * @param extensionType Extension type. Must be `bundle` or `plugin`. A `bundle` will usually contain a dictionary or script, where a `plugin` is compiled from source.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(String extensionType) {
            return extensionType(Output.of(extensionType));
        }

        /**
         * @param fileHash Hash value of the file. Triggers re-uploading the file on change.
         * 
         * @return builder
         * 
         */
        public Builder fileHash(@Nullable Output<String> fileHash) {
            $.fileHash = fileHash;
            return this;
        }

        /**
         * @param fileHash Hash value of the file. Triggers re-uploading the file on change.
         * 
         * @return builder
         * 
         */
        public Builder fileHash(String fileHash) {
            return fileHash(Output.of(fileHash));
        }

        /**
         * @param filePath Local file path to upload as the extension.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath Local file path to upload as the extension.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param name Name of the extension
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the extension
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Elastic stack version. A full version (e.g 8.7.0) should be set for plugins. A wildcard (e.g 8.*) may be used for bundles.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DeploymentExtensionArgs build() {
            if ($.extensionType == null) {
                throw new MissingRequiredPropertyException("DeploymentExtensionArgs", "extensionType");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("DeploymentExtensionArgs", "version");
            }
            return $;
        }
    }

}
