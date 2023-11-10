// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SnapshotRepositoryGeneric {
    /**
     * @return An arbitrary JSON object containing the repository settings.
     * 
     */
    private String settings;
    /**
     * @return Repository type
     * 
     */
    private String type;

    private SnapshotRepositoryGeneric() {}
    /**
     * @return An arbitrary JSON object containing the repository settings.
     * 
     */
    public String settings() {
        return this.settings;
    }
    /**
     * @return Repository type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotRepositoryGeneric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String settings;
        private String type;
        public Builder() {}
        public Builder(SnapshotRepositoryGeneric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder settings(String settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SnapshotRepositoryGeneric build() {
            final var o = new SnapshotRepositoryGeneric();
            o.settings = settings;
            o.type = type;
            return o;
        }
    }
}