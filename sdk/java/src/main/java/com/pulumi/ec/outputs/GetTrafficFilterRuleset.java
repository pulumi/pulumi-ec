// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetTrafficFilterRulesetRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrafficFilterRuleset {
    /**
     * @return The description of the ruleset.
     * 
     */
    private String description;
    /**
     * @return The ID of the ruleset
     * 
     */
    private String id;
    /**
     * @return Should the ruleset be automatically included in the new deployments.
     * 
     */
    private Boolean includeByDefault;
    /**
     * @return The name of the ruleset.
     * 
     */
    private String name;
    /**
     * @return The ruleset can be attached only to deployments in the specific region.
     * 
     */
    private String region;
    /**
     * @return An individual rule
     * 
     */
    private List<GetTrafficFilterRulesetRule> rules;

    private GetTrafficFilterRuleset() {}
    /**
     * @return The description of the ruleset.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the ruleset
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Should the ruleset be automatically included in the new deployments.
     * 
     */
    public Boolean includeByDefault() {
        return this.includeByDefault;
    }
    /**
     * @return The name of the ruleset.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ruleset can be attached only to deployments in the specific region.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return An individual rule
     * 
     */
    public List<GetTrafficFilterRulesetRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficFilterRuleset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private Boolean includeByDefault;
        private String name;
        private String region;
        private List<GetTrafficFilterRulesetRule> rules;
        public Builder() {}
        public Builder(GetTrafficFilterRuleset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.includeByDefault = defaults.includeByDefault;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeByDefault(Boolean includeByDefault) {
            this.includeByDefault = Objects.requireNonNull(includeByDefault);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetTrafficFilterRulesetRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetTrafficFilterRulesetRule... rules) {
            return rules(List.of(rules));
        }
        public GetTrafficFilterRuleset build() {
            final var o = new GetTrafficFilterRuleset();
            o.description = description;
            o.id = id;
            o.includeByDefault = includeByDefault;
            o.name = name;
            o.region = region;
            o.rules = rules;
            return o;
        }
    }
}
