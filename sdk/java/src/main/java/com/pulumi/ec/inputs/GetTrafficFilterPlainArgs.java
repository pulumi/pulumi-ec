// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficFilterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrafficFilterPlainArgs Empty = new GetTrafficFilterPlainArgs();

    /**
     * The id of the traffic filter to select.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The id of the traffic filter to select.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The exact name of the traffic filter to select.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The exact name of the traffic filter to select.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetTrafficFilterPlainArgs() {}

    private GetTrafficFilterPlainArgs(GetTrafficFilterPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficFilterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficFilterPlainArgs $;

        public Builder() {
            $ = new GetTrafficFilterPlainArgs();
        }

        public Builder(GetTrafficFilterPlainArgs defaults) {
            $ = new GetTrafficFilterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the traffic filter to select.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The exact name of the traffic filter to select.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param region Region where the traffic filter is. For Elastic Cloud Enterprise (ECE) installations, use `ece-region`
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetTrafficFilterPlainArgs build() {
            return $;
        }
    }

}
