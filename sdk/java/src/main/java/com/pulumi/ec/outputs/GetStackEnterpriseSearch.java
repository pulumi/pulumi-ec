// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStackEnterpriseSearch {
    /**
     * @return Maximum size of the instances.
     * 
     */
    private Integer capacityConstraintsMax;
    /**
     * @return Minimum size of the instances.
     * 
     */
    private Integer capacityConstraintsMin;
    /**
     * @return List of node types compatible with this one.
     * 
     */
    private List<String> compatibleNodeTypes;
    /**
     * @return List of configuration options that cannot be overridden by user settings.
     * 
     */
    private List<String> denylists;
    /**
     * @return Docker image to use for the Enterprise Search instance.
     * 
     */
    private String dockerImage;

    private GetStackEnterpriseSearch() {}
    /**
     * @return Maximum size of the instances.
     * 
     */
    public Integer capacityConstraintsMax() {
        return this.capacityConstraintsMax;
    }
    /**
     * @return Minimum size of the instances.
     * 
     */
    public Integer capacityConstraintsMin() {
        return this.capacityConstraintsMin;
    }
    /**
     * @return List of node types compatible with this one.
     * 
     */
    public List<String> compatibleNodeTypes() {
        return this.compatibleNodeTypes;
    }
    /**
     * @return List of configuration options that cannot be overridden by user settings.
     * 
     */
    public List<String> denylists() {
        return this.denylists;
    }
    /**
     * @return Docker image to use for the Enterprise Search instance.
     * 
     */
    public String dockerImage() {
        return this.dockerImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackEnterpriseSearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer capacityConstraintsMax;
        private Integer capacityConstraintsMin;
        private List<String> compatibleNodeTypes;
        private List<String> denylists;
        private String dockerImage;
        public Builder() {}
        public Builder(GetStackEnterpriseSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityConstraintsMax = defaults.capacityConstraintsMax;
    	      this.capacityConstraintsMin = defaults.capacityConstraintsMin;
    	      this.compatibleNodeTypes = defaults.compatibleNodeTypes;
    	      this.denylists = defaults.denylists;
    	      this.dockerImage = defaults.dockerImage;
        }

        @CustomType.Setter
        public Builder capacityConstraintsMax(Integer capacityConstraintsMax) {
            this.capacityConstraintsMax = Objects.requireNonNull(capacityConstraintsMax);
            return this;
        }
        @CustomType.Setter
        public Builder capacityConstraintsMin(Integer capacityConstraintsMin) {
            this.capacityConstraintsMin = Objects.requireNonNull(capacityConstraintsMin);
            return this;
        }
        @CustomType.Setter
        public Builder compatibleNodeTypes(List<String> compatibleNodeTypes) {
            this.compatibleNodeTypes = Objects.requireNonNull(compatibleNodeTypes);
            return this;
        }
        public Builder compatibleNodeTypes(String... compatibleNodeTypes) {
            return compatibleNodeTypes(List.of(compatibleNodeTypes));
        }
        @CustomType.Setter
        public Builder denylists(List<String> denylists) {
            this.denylists = Objects.requireNonNull(denylists);
            return this;
        }
        public Builder denylists(String... denylists) {
            return denylists(List.of(denylists));
        }
        @CustomType.Setter
        public Builder dockerImage(String dockerImage) {
            this.dockerImage = Objects.requireNonNull(dockerImage);
            return this;
        }
        public GetStackEnterpriseSearch build() {
            final var _resultValue = new GetStackEnterpriseSearch();
            _resultValue.capacityConstraintsMax = capacityConstraintsMax;
            _resultValue.capacityConstraintsMin = capacityConstraintsMin;
            _resultValue.compatibleNodeTypes = compatibleNodeTypes;
            _resultValue.denylists = denylists;
            _resultValue.dockerImage = dockerImage;
            return _resultValue;
        }
    }
}
