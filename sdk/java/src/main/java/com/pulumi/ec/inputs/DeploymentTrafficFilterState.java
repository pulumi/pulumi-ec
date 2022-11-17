// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.ec.inputs.DeploymentTrafficFilterRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentTrafficFilterState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentTrafficFilterState Empty = new DeploymentTrafficFilterState();

    /**
     * Description of the ruleset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the ruleset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * To automatically include the ruleset in the new deployments. Defaults to `false`.
     * 
     */
    @Import(name="includeByDefault")
    private @Nullable Output<Boolean> includeByDefault;

    /**
     * @return To automatically include the ruleset in the new deployments. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> includeByDefault() {
        return Optional.ofNullable(this.includeByDefault);
    }

    /**
     * Name of the ruleset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Filter region, the ruleset can only be attached to deployments in the specific region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Filter region, the ruleset can only be attached to deployments in the specific region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Rule block, which can be specified multiple times for multiple rules.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<DeploymentTrafficFilterRuleArgs>> rules;

    /**
     * @return Rule block, which can be specified multiple times for multiple rules.
     * 
     */
    public Optional<Output<List<DeploymentTrafficFilterRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Type of the ruleset.  It can be `&#34;ip&#34;`, `&#34;vpce&#34;` or `&#34;azure_private_endpoint&#34;`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the ruleset.  It can be `&#34;ip&#34;`, `&#34;vpce&#34;` or `&#34;azure_private_endpoint&#34;`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeploymentTrafficFilterState() {}

    private DeploymentTrafficFilterState(DeploymentTrafficFilterState $) {
        this.description = $.description;
        this.includeByDefault = $.includeByDefault;
        this.name = $.name;
        this.region = $.region;
        this.rules = $.rules;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentTrafficFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTrafficFilterState $;

        public Builder() {
            $ = new DeploymentTrafficFilterState();
        }

        public Builder(DeploymentTrafficFilterState defaults) {
            $ = new DeploymentTrafficFilterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param includeByDefault To automatically include the ruleset in the new deployments. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeByDefault(@Nullable Output<Boolean> includeByDefault) {
            $.includeByDefault = includeByDefault;
            return this;
        }

        /**
         * @param includeByDefault To automatically include the ruleset in the new deployments. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeByDefault(Boolean includeByDefault) {
            return includeByDefault(Output.of(includeByDefault));
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region Filter region, the ruleset can only be attached to deployments in the specific region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Filter region, the ruleset can only be attached to deployments in the specific region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param rules Rule block, which can be specified multiple times for multiple rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<DeploymentTrafficFilterRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Rule block, which can be specified multiple times for multiple rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<DeploymentTrafficFilterRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Rule block, which can be specified multiple times for multiple rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(DeploymentTrafficFilterRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param type Type of the ruleset.  It can be `&#34;ip&#34;`, `&#34;vpce&#34;` or `&#34;azure_private_endpoint&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the ruleset.  It can be `&#34;ip&#34;`, `&#34;vpce&#34;` or `&#34;azure_private_endpoint&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentTrafficFilterState build() {
            return $;
        }
    }

}
