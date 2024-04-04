// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateElasticsearchCoordinatingAutoscaling;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeploymentTemplatesTemplateElasticsearchCoordinating {
    private GetDeploymentTemplatesTemplateElasticsearchCoordinatingAutoscaling autoscaling;
    private List<String> availableSizes;
    private String defaultSize;
    private String instanceConfigurationId;
    private Double instanceConfigurationVersion;
    private String sizeResource;

    private GetDeploymentTemplatesTemplateElasticsearchCoordinating() {}
    public GetDeploymentTemplatesTemplateElasticsearchCoordinatingAutoscaling autoscaling() {
        return this.autoscaling;
    }
    public List<String> availableSizes() {
        return this.availableSizes;
    }
    public String defaultSize() {
        return this.defaultSize;
    }
    public String instanceConfigurationId() {
        return this.instanceConfigurationId;
    }
    public Double instanceConfigurationVersion() {
        return this.instanceConfigurationVersion;
    }
    public String sizeResource() {
        return this.sizeResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentTemplatesTemplateElasticsearchCoordinating defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetDeploymentTemplatesTemplateElasticsearchCoordinatingAutoscaling autoscaling;
        private List<String> availableSizes;
        private String defaultSize;
        private String instanceConfigurationId;
        private Double instanceConfigurationVersion;
        private String sizeResource;
        public Builder() {}
        public Builder(GetDeploymentTemplatesTemplateElasticsearchCoordinating defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.availableSizes = defaults.availableSizes;
    	      this.defaultSize = defaults.defaultSize;
    	      this.instanceConfigurationId = defaults.instanceConfigurationId;
    	      this.instanceConfigurationVersion = defaults.instanceConfigurationVersion;
    	      this.sizeResource = defaults.sizeResource;
        }

        @CustomType.Setter
        public Builder autoscaling(GetDeploymentTemplatesTemplateElasticsearchCoordinatingAutoscaling autoscaling) {
            if (autoscaling == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "autoscaling");
            }
            this.autoscaling = autoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder availableSizes(List<String> availableSizes) {
            if (availableSizes == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "availableSizes");
            }
            this.availableSizes = availableSizes;
            return this;
        }
        public Builder availableSizes(String... availableSizes) {
            return availableSizes(List.of(availableSizes));
        }
        @CustomType.Setter
        public Builder defaultSize(String defaultSize) {
            if (defaultSize == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "defaultSize");
            }
            this.defaultSize = defaultSize;
            return this;
        }
        @CustomType.Setter
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            if (instanceConfigurationId == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "instanceConfigurationId");
            }
            this.instanceConfigurationId = instanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceConfigurationVersion(Double instanceConfigurationVersion) {
            if (instanceConfigurationVersion == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "instanceConfigurationVersion");
            }
            this.instanceConfigurationVersion = instanceConfigurationVersion;
            return this;
        }
        @CustomType.Setter
        public Builder sizeResource(String sizeResource) {
            if (sizeResource == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplateElasticsearchCoordinating", "sizeResource");
            }
            this.sizeResource = sizeResource;
            return this;
        }
        public GetDeploymentTemplatesTemplateElasticsearchCoordinating build() {
            final var _resultValue = new GetDeploymentTemplatesTemplateElasticsearchCoordinating();
            _resultValue.autoscaling = autoscaling;
            _resultValue.availableSizes = availableSizes;
            _resultValue.defaultSize = defaultSize;
            _resultValue.instanceConfigurationId = instanceConfigurationId;
            _resultValue.instanceConfigurationVersion = instanceConfigurationVersion;
            _resultValue.sizeResource = sizeResource;
            return _resultValue;
        }
    }
}
