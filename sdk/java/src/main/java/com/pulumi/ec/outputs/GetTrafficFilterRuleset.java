// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetTrafficFilterRulesetRule;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            if (description == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder includeByDefault(Boolean includeByDefault) {
            if (includeByDefault == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "includeByDefault");
            }
            this.includeByDefault = includeByDefault;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetTrafficFilterRulesetRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetTrafficFilterRuleset", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetTrafficFilterRulesetRule... rules) {
            return rules(List.of(rules));
        }
        public GetTrafficFilterRuleset build() {
            final var _resultValue = new GetTrafficFilterRuleset();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.includeByDefault = includeByDefault;
            _resultValue.name = name;
            _resultValue.region = region;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}