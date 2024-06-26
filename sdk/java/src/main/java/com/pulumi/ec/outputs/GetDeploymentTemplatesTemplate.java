// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.ec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateApm;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateElasticsearch;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateEnterpriseSearch;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateIntegrationsServer;
import com.pulumi.ec.outputs.GetDeploymentTemplatesTemplateKibana;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentTemplatesTemplate {
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    private GetDeploymentTemplatesTemplateApm apm;
    /**
     * @return Outdated templates are marked as deprecated, but can still be used.
     * 
     */
    private Boolean deprecated;
    /**
     * @return The description of the deployment template.
     * 
     */
    private String description;
    /**
     * @return Defines the default configuration for Elasticsearch.
     * 
     */
    private GetDeploymentTemplatesTemplateElasticsearch elasticsearch;
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    private GetDeploymentTemplatesTemplateEnterpriseSearch enterpriseSearch;
    /**
     * @return The id of the deployment template.
     * 
     */
    private String id;
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    private GetDeploymentTemplatesTemplateIntegrationsServer integrationsServer;
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    private GetDeploymentTemplatesTemplateKibana kibana;
    /**
     * @return The minimum stack version that can used with this deployment template.
     * 
     */
    private String minStackVersion;
    /**
     * @return The name of the deployment template.
     * 
     */
    private String name;

    private GetDeploymentTemplatesTemplate() {}
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    public GetDeploymentTemplatesTemplateApm apm() {
        return this.apm;
    }
    /**
     * @return Outdated templates are marked as deprecated, but can still be used.
     * 
     */
    public Boolean deprecated() {
        return this.deprecated;
    }
    /**
     * @return The description of the deployment template.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Defines the default configuration for Elasticsearch.
     * 
     */
    public GetDeploymentTemplatesTemplateElasticsearch elasticsearch() {
        return this.elasticsearch;
    }
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    public GetDeploymentTemplatesTemplateEnterpriseSearch enterpriseSearch() {
        return this.enterpriseSearch;
    }
    /**
     * @return The id of the deployment template.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    public GetDeploymentTemplatesTemplateIntegrationsServer integrationsServer() {
        return this.integrationsServer;
    }
    /**
     * @return Defines the default configuration for a stateless application (Kibana, Enterprise Search, APM or Integrations Server).
     * 
     */
    public GetDeploymentTemplatesTemplateKibana kibana() {
        return this.kibana;
    }
    /**
     * @return The minimum stack version that can used with this deployment template.
     * 
     */
    public String minStackVersion() {
        return this.minStackVersion;
    }
    /**
     * @return The name of the deployment template.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentTemplatesTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetDeploymentTemplatesTemplateApm apm;
        private Boolean deprecated;
        private String description;
        private GetDeploymentTemplatesTemplateElasticsearch elasticsearch;
        private GetDeploymentTemplatesTemplateEnterpriseSearch enterpriseSearch;
        private String id;
        private GetDeploymentTemplatesTemplateIntegrationsServer integrationsServer;
        private GetDeploymentTemplatesTemplateKibana kibana;
        private String minStackVersion;
        private String name;
        public Builder() {}
        public Builder(GetDeploymentTemplatesTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apm = defaults.apm;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.enterpriseSearch = defaults.enterpriseSearch;
    	      this.id = defaults.id;
    	      this.integrationsServer = defaults.integrationsServer;
    	      this.kibana = defaults.kibana;
    	      this.minStackVersion = defaults.minStackVersion;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder apm(GetDeploymentTemplatesTemplateApm apm) {
            if (apm == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "apm");
            }
            this.apm = apm;
            return this;
        }
        @CustomType.Setter
        public Builder deprecated(Boolean deprecated) {
            if (deprecated == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "deprecated");
            }
            this.deprecated = deprecated;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder elasticsearch(GetDeploymentTemplatesTemplateElasticsearch elasticsearch) {
            if (elasticsearch == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "elasticsearch");
            }
            this.elasticsearch = elasticsearch;
            return this;
        }
        @CustomType.Setter
        public Builder enterpriseSearch(GetDeploymentTemplatesTemplateEnterpriseSearch enterpriseSearch) {
            if (enterpriseSearch == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "enterpriseSearch");
            }
            this.enterpriseSearch = enterpriseSearch;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder integrationsServer(GetDeploymentTemplatesTemplateIntegrationsServer integrationsServer) {
            if (integrationsServer == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "integrationsServer");
            }
            this.integrationsServer = integrationsServer;
            return this;
        }
        @CustomType.Setter
        public Builder kibana(GetDeploymentTemplatesTemplateKibana kibana) {
            if (kibana == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "kibana");
            }
            this.kibana = kibana;
            return this;
        }
        @CustomType.Setter
        public Builder minStackVersion(String minStackVersion) {
            if (minStackVersion == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "minStackVersion");
            }
            this.minStackVersion = minStackVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDeploymentTemplatesTemplate", "name");
            }
            this.name = name;
            return this;
        }
        public GetDeploymentTemplatesTemplate build() {
            final var _resultValue = new GetDeploymentTemplatesTemplate();
            _resultValue.apm = apm;
            _resultValue.deprecated = deprecated;
            _resultValue.description = description;
            _resultValue.elasticsearch = elasticsearch;
            _resultValue.enterpriseSearch = enterpriseSearch;
            _resultValue.id = id;
            _resultValue.integrationsServer = integrationsServer;
            _resultValue.kibana = kibana;
            _resultValue.minStackVersion = minStackVersion;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
