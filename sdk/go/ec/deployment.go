// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeployment(ctx, "exampleMinimal", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch:        nil,
// 			Kibana:               nil,
// 			IntegrationsServer:   nil,
// 			EnterpriseSearch:     nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Tiered deployment with Autoscaling enabled
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeployment(ctx, "exampleMinimal", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch: &DeploymentElasticsearchArgs{
// 				Autoscale: pulumi.String("true"),
// 				Topologies: DeploymentElasticsearchTopologyArray{
// 					&DeploymentElasticsearchTopologyArgs{
// 						Id:   pulumi.String("cold"),
// 						Size: pulumi.String("8g"),
// 					},
// 					&DeploymentElasticsearchTopologyArgs{
// 						Id:          pulumi.String("hot_content"),
// 						Size:        pulumi.String("8g"),
// 						Autoscaling: nil,
// 					},
// 					&DeploymentElasticsearchTopologyArgs{
// 						Id:   pulumi.String("warm"),
// 						Size: pulumi.String("16g"),
// 					},
// 				},
// 			},
// 			Kibana:             nil,
// 			IntegrationsServer: nil,
// 			EnterpriseSearch:   nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### With observability settings
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeployment(ctx, "exampleObservability", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch:        nil,
// 			Kibana:               nil,
// 			Observability: &DeploymentObservabilityArgs{
// 				DeploymentId: pulumi.Any(ec_deployment.Example_minimal.Id),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### With Cross Cluster Search settings
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		sourceDeployment, err := ec.NewDeployment(ctx, "sourceDeployment", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch: &DeploymentElasticsearchArgs{
// 				Topologies: DeploymentElasticsearchTopologyArray{
// 					&DeploymentElasticsearchTopologyArgs{
// 						Id:   pulumi.String("hot_content"),
// 						Size: pulumi.String("1g"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeployment(ctx, "ccs", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-cross-cluster-search-v2"),
// 			Elasticsearch: &DeploymentElasticsearchArgs{
// 				RemoteClusters: DeploymentElasticsearchRemoteClusterArray{
// 					&DeploymentElasticsearchRemoteClusterArgs{
// 						DeploymentId: sourceDeployment.ID(),
// 						Alias:        sourceDeployment.Name,
// 						RefId: sourceDeployment.Elasticsearch.ApplyT(func(elasticsearch DeploymentElasticsearch) (string, error) {
// 							return elasticsearch.RefId, nil
// 						}).(pulumi.StringOutput),
// 					},
// 				},
// 			},
// 			Kibana: nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### With tags
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-ec/sdk/go/ec"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		latest, err := ec.GetStack(ctx, &GetStackArgs{
// 			VersionRegex: "latest",
// 			Region:       "us-east-1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec.NewDeployment(ctx, "withTags", &ec.DeploymentArgs{
// 			Region:               pulumi.String("us-east-1"),
// 			Version:              pulumi.String(latest.Version),
// 			DeploymentTemplateId: pulumi.String("aws-io-optimized-v2"),
// 			Elasticsearch:        nil,
// 			Tags: pulumi.StringMap{
// 				"owner":     pulumi.String("elastic cloud"),
// 				"component": pulumi.String("search"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// ~> **Note on legacy (pre-slider) deployments** Importing deployments created prior to the addition of sliders in ECE or ESS, without being migrated to use sliders, is not supported. ~> **Note on pre 6.6.0 deployments** Importing deployments with a version lower than `6.6.0` is not supported. ~> **Note on deployments with topology user settings** Only deployments with global user settings (config) are supported. Make sure to migrate to global settings before importing. Deployments can be imported using the `id`, for example
//
// ```sh
//  $ pulumi import ec:index/deployment:Deployment search 320b7b540dfc967a7a649c18e2fce4ed
// ```
type Deployment struct {
	pulumi.CustomResourceState

	// Deployment alias, affects the format of the resource URLs.
	Alias pulumi.StringOutput `pulumi:"alias"`
	// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
	Apm DeploymentApmPtrOutput `pulumi:"apm"`
	// Auto-generated APM secret_token, empty unless an `apm` resource is specified.
	// * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
	// * `elasticsearch.#.region` - Elasticsearch region.
	// * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
	// * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
	// * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
	// * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
	// * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
	// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
	// * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
	// * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
	// * `kibana.#.resource_id` - Kibana resource unique identifier.
	// * `kibana.#.region` - Kibana region.
	// * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
	// * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
	// * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
	// * `integrations_server.#.region` - Integrations Server region.
	// * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
	// * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
	// * `apm.#.resource_id` - APM resource unique identifier.
	// * `apm.#.region` - APM region.
	// * `apm.#.http_endpoint` - APM resource HTTP endpoint.
	// * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
	// * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
	// * `enterprise_search.#.region` - Enterprise Search region.
	// * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
	// * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
	// * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
	// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
	// * `observability.#.ref_id` - (Optional) Elasticsearch resource kind refId of the destination deployment.
	// * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
	// * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
	ApmSecretToken pulumi.StringOutput `pulumi:"apmSecretToken"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringOutput `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
	Elasticsearch DeploymentElasticsearchOutput `pulumi:"elasticsearch"`
	// Auto-generated Elasticsearch password.
	ElasticsearchPassword pulumi.StringOutput `pulumi:"elasticsearchPassword"`
	// Auto-generated Elasticsearch username.
	ElasticsearchUsername pulumi.StringOutput `pulumi:"elasticsearchUsername"`
	// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
	EnterpriseSearch DeploymentEnterpriseSearchPtrOutput `pulumi:"enterpriseSearch"`
	// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
	IntegrationsServer DeploymentIntegrationsServerPtrOutput `pulumi:"integrationsServer"`
	// Kibana instance definition, can only be specified once.
	Kibana DeploymentKibanaPtrOutput `pulumi:"kibana"`
	// Name of the deployment.
	Name pulumi.StringOutput `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a separate deployment.
	Observability DeploymentObservabilityPtrOutput `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
	Region pulumi.StringOutput `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
	RequestId pulumi.StringPtrOutput `pulumi:"requestId"`
	// Key value map of arbitrary string tags.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// List of traffic filter rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayOutput `pulumi:"trafficFilters"`
	// Elastic Stack version to use for all the deployment resources.
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewDeployment registers a new resource with the given unique name, arguments, and options.
func NewDeployment(ctx *pulumi.Context,
	name string, args *DeploymentArgs, opts ...pulumi.ResourceOption) (*Deployment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeploymentTemplateId == nil {
		return nil, errors.New("invalid value for required argument 'DeploymentTemplateId'")
	}
	if args.Elasticsearch == nil {
		return nil, errors.New("invalid value for required argument 'Elasticsearch'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	var resource Deployment
	err := ctx.RegisterResource("ec:index/deployment:Deployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeployment gets an existing Deployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeploymentState, opts ...pulumi.ResourceOption) (*Deployment, error) {
	var resource Deployment
	err := ctx.ReadResource("ec:index/deployment:Deployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Deployment resources.
type deploymentState struct {
	// Deployment alias, affects the format of the resource URLs.
	Alias *string `pulumi:"alias"`
	// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
	Apm *DeploymentApm `pulumi:"apm"`
	// Auto-generated APM secret_token, empty unless an `apm` resource is specified.
	// * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
	// * `elasticsearch.#.region` - Elasticsearch region.
	// * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
	// * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
	// * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
	// * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
	// * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
	// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
	// * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
	// * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
	// * `kibana.#.resource_id` - Kibana resource unique identifier.
	// * `kibana.#.region` - Kibana region.
	// * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
	// * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
	// * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
	// * `integrations_server.#.region` - Integrations Server region.
	// * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
	// * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
	// * `apm.#.resource_id` - APM resource unique identifier.
	// * `apm.#.region` - APM region.
	// * `apm.#.http_endpoint` - APM resource HTTP endpoint.
	// * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
	// * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
	// * `enterprise_search.#.region` - Enterprise Search region.
	// * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
	// * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
	// * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
	// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
	// * `observability.#.ref_id` - (Optional) Elasticsearch resource kind refId of the destination deployment.
	// * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
	// * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
	ApmSecretToken *string `pulumi:"apmSecretToken"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId *string `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
	Elasticsearch *DeploymentElasticsearch `pulumi:"elasticsearch"`
	// Auto-generated Elasticsearch password.
	ElasticsearchPassword *string `pulumi:"elasticsearchPassword"`
	// Auto-generated Elasticsearch username.
	ElasticsearchUsername *string `pulumi:"elasticsearchUsername"`
	// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
	EnterpriseSearch *DeploymentEnterpriseSearch `pulumi:"enterpriseSearch"`
	// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
	IntegrationsServer *DeploymentIntegrationsServer `pulumi:"integrationsServer"`
	// Kibana instance definition, can only be specified once.
	Kibana *DeploymentKibana `pulumi:"kibana"`
	// Name of the deployment.
	Name *string `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a separate deployment.
	Observability *DeploymentObservability `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
	Region *string `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
	RequestId *string `pulumi:"requestId"`
	// Key value map of arbitrary string tags.
	Tags map[string]string `pulumi:"tags"`
	// List of traffic filter rule identifiers that will be applied to the deployment.
	TrafficFilters []string `pulumi:"trafficFilters"`
	// Elastic Stack version to use for all the deployment resources.
	Version *string `pulumi:"version"`
}

type DeploymentState struct {
	// Deployment alias, affects the format of the resource URLs.
	Alias pulumi.StringPtrInput
	// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
	Apm DeploymentApmPtrInput
	// Auto-generated APM secret_token, empty unless an `apm` resource is specified.
	// * `elasticsearch.#.resource_id` - Elasticsearch resource unique identifier.
	// * `elasticsearch.#.region` - Elasticsearch region.
	// * `elasticsearch.#.cloud_id` - Encoded Elasticsearch credentials to use in Beats or Logstash. For more information, see [Configure Beats and Logstash with Cloud ID](https://www.elastic.co/guide/en/cloud/current/ec-cloud-id.html).
	// * `elasticsearch.#.http_endpoint` - Elasticsearch resource HTTP endpoint.
	// * `elasticsearch.#.https_endpoint` - Elasticsearch resource HTTPs endpoint.
	// * `elasticsearch.#.topology.#.instance_configuration_id` - instance configuration of the deployment topology element.
	// * `elasticsearch.#.topology.#.node_type_data` - Node type (data) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_master` - Node type (master) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ingest` - Node type (ingest) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_type_ml` - Node type (machine learning) for the Elasticsearch topology element.
	// * `elasticsearch.#.topology.#.node_roles` - List of roles for the topology element. They are inferred from the deployment template.
	// * `elasticsearch.#.topology.#.autoscaling.#.policy_override_json` - Computed policy overrides set directly via the API or other clients.
	// * `elasticsearch.#.snapshot_source.#.source_elasticsearch_cluster_id` - ID of the Elasticsearch cluster that will be used as the source of the snapshot.
	// * `elasticsearch.#.snapshot_source.#.snapshot_name` - Name of the snapshot to restore.
	// * `kibana.#.resource_id` - Kibana resource unique identifier.
	// * `kibana.#.region` - Kibana region.
	// * `kibana.#.http_endpoint` - Kibana resource HTTP endpoint.
	// * `kibana.#.https_endpoint` - Kibana resource HTTPs endpoint.
	// * `integrations_server.#.resource_id` - Integrations Server resource unique identifier.
	// * `integrations_server.#.region` - Integrations Server region.
	// * `integrations_server.#.http_endpoint` - Integrations Server resource HTTP endpoint.
	// * `integrations_server.#.https_endpoint` - Integrations Server resource HTTPs endpoint.
	// * `apm.#.resource_id` - APM resource unique identifier.
	// * `apm.#.region` - APM region.
	// * `apm.#.http_endpoint` - APM resource HTTP endpoint.
	// * `apm.#.https_endpoint` - APM resource HTTPs endpoint.
	// * `enterprise_search.#.resource_id` - Enterprise Search resource unique identifier.
	// * `enterprise_search.#.region` - Enterprise Search region.
	// * `enterprise_search.#.http_endpoint` - Enterprise Search resource HTTP endpoint.
	// * `enterprise_search.#.https_endpoint` - Enterprise Search resource HTTPs endpoint.
	// * `enterprise_search.#.topology.#.node_type_appserver` - Node type (Appserver) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_connector` - Node type (Connector) for the Enterprise Search topology element.
	// * `enterprise_search.#.topology.#.node_type_worker` - Node type (worker) for the Enterprise Search topology element.
	// * `observability.#.deployment_id` - Destination deployment ID for the shipped logs and monitoring metrics.
	// * `observability.#.ref_id` - (Optional) Elasticsearch resource kind refId of the destination deployment.
	// * `observability.#.logs` - Enables or disables shipping logs. Defaults to true.
	// * `observability.#.metrics` - Enables or disables shipping metrics. Defaults to true.
	ApmSecretToken pulumi.StringPtrInput
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringPtrInput
	// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
	Elasticsearch DeploymentElasticsearchPtrInput
	// Auto-generated Elasticsearch password.
	ElasticsearchPassword pulumi.StringPtrInput
	// Auto-generated Elasticsearch username.
	ElasticsearchUsername pulumi.StringPtrInput
	// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
	EnterpriseSearch DeploymentEnterpriseSearchPtrInput
	// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
	IntegrationsServer DeploymentIntegrationsServerPtrInput
	// Kibana instance definition, can only be specified once.
	Kibana DeploymentKibanaPtrInput
	// Name of the deployment.
	Name pulumi.StringPtrInput
	// Observability settings that you can set to ship logs and metrics to a separate deployment.
	Observability DeploymentObservabilityPtrInput
	// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
	Region pulumi.StringPtrInput
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
	RequestId pulumi.StringPtrInput
	// Key value map of arbitrary string tags.
	Tags pulumi.StringMapInput
	// List of traffic filter rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayInput
	// Elastic Stack version to use for all the deployment resources.
	Version pulumi.StringPtrInput
}

func (DeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentState)(nil)).Elem()
}

type deploymentArgs struct {
	// Deployment alias, affects the format of the resource URLs.
	Alias *string `pulumi:"alias"`
	// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
	Apm *DeploymentApm `pulumi:"apm"`
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId string `pulumi:"deploymentTemplateId"`
	// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
	Elasticsearch DeploymentElasticsearch `pulumi:"elasticsearch"`
	// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
	EnterpriseSearch *DeploymentEnterpriseSearch `pulumi:"enterpriseSearch"`
	// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
	IntegrationsServer *DeploymentIntegrationsServer `pulumi:"integrationsServer"`
	// Kibana instance definition, can only be specified once.
	Kibana *DeploymentKibana `pulumi:"kibana"`
	// Name of the deployment.
	Name *string `pulumi:"name"`
	// Observability settings that you can set to ship logs and metrics to a separate deployment.
	Observability *DeploymentObservability `pulumi:"observability"`
	// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
	Region string `pulumi:"region"`
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
	RequestId *string `pulumi:"requestId"`
	// Key value map of arbitrary string tags.
	Tags map[string]string `pulumi:"tags"`
	// List of traffic filter rule identifiers that will be applied to the deployment.
	TrafficFilters []string `pulumi:"trafficFilters"`
	// Elastic Stack version to use for all the deployment resources.
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a Deployment resource.
type DeploymentArgs struct {
	// Deployment alias, affects the format of the resource URLs.
	Alias pulumi.StringPtrInput
	// **DEPRECATED** (Optional) APM instance definition, can only be specified once. It should only be used with deployments with a version prior to 8.0.0.
	Apm DeploymentApmPtrInput
	// Deployment template identifier to create the deployment from. See the [full list](https://www.elastic.co/guide/en/cloud/current/ec-regions-templates-instances.html) of regions and deployment templates available in ESS.
	DeploymentTemplateId pulumi.StringInput
	// Elasticsearch cluster definition, can only be specified once. For multi-node Elasticsearch clusters, use multiple `topology` blocks.
	Elasticsearch DeploymentElasticsearchInput
	// Enterprise Search server definition, can only be specified once. For multi-node Enterprise Search deployments, use multiple `topology` blocks.
	EnterpriseSearch DeploymentEnterpriseSearchPtrInput
	// Integrations Server instance definition, can only be specified once. It has replaced `apm` in stack version 8.0.0.
	IntegrationsServer DeploymentIntegrationsServerPtrInput
	// Kibana instance definition, can only be specified once.
	Kibana DeploymentKibanaPtrInput
	// Name of the deployment.
	Name pulumi.StringPtrInput
	// Observability settings that you can set to ship logs and metrics to a separate deployment.
	Observability DeploymentObservabilityPtrInput
	// Elasticsearch Service (ESS) region where to create the deployment. For Elastic Cloud Enterprise (ECE) installations, set `"ece-region"`.
	Region pulumi.StringInput
	// Request ID to set when you create the deployment. Use it only when previous attempts return an error and `requestId` is returned as part of the error.
	RequestId pulumi.StringPtrInput
	// Key value map of arbitrary string tags.
	Tags pulumi.StringMapInput
	// List of traffic filter rule identifiers that will be applied to the deployment.
	TrafficFilters pulumi.StringArrayInput
	// Elastic Stack version to use for all the deployment resources.
	Version pulumi.StringInput
}

func (DeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deploymentArgs)(nil)).Elem()
}

type DeploymentInput interface {
	pulumi.Input

	ToDeploymentOutput() DeploymentOutput
	ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput
}

func (*Deployment) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (i *Deployment) ToDeploymentOutput() DeploymentOutput {
	return i.ToDeploymentOutputWithContext(context.Background())
}

func (i *Deployment) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentOutput)
}

// DeploymentArrayInput is an input type that accepts DeploymentArray and DeploymentArrayOutput values.
// You can construct a concrete instance of `DeploymentArrayInput` via:
//
//          DeploymentArray{ DeploymentArgs{...} }
type DeploymentArrayInput interface {
	pulumi.Input

	ToDeploymentArrayOutput() DeploymentArrayOutput
	ToDeploymentArrayOutputWithContext(context.Context) DeploymentArrayOutput
}

type DeploymentArray []DeploymentInput

func (DeploymentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (i DeploymentArray) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return i.ToDeploymentArrayOutputWithContext(context.Background())
}

func (i DeploymentArray) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentArrayOutput)
}

// DeploymentMapInput is an input type that accepts DeploymentMap and DeploymentMapOutput values.
// You can construct a concrete instance of `DeploymentMapInput` via:
//
//          DeploymentMap{ "key": DeploymentArgs{...} }
type DeploymentMapInput interface {
	pulumi.Input

	ToDeploymentMapOutput() DeploymentMapOutput
	ToDeploymentMapOutputWithContext(context.Context) DeploymentMapOutput
}

type DeploymentMap map[string]DeploymentInput

func (DeploymentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (i DeploymentMap) ToDeploymentMapOutput() DeploymentMapOutput {
	return i.ToDeploymentMapOutputWithContext(context.Background())
}

func (i DeploymentMap) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeploymentMapOutput)
}

type DeploymentOutput struct{ *pulumi.OutputState }

func (DeploymentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Deployment)(nil)).Elem()
}

func (o DeploymentOutput) ToDeploymentOutput() DeploymentOutput {
	return o
}

func (o DeploymentOutput) ToDeploymentOutputWithContext(ctx context.Context) DeploymentOutput {
	return o
}

type DeploymentArrayOutput struct{ *pulumi.OutputState }

func (DeploymentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Deployment)(nil)).Elem()
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutput() DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) ToDeploymentArrayOutputWithContext(ctx context.Context) DeploymentArrayOutput {
	return o
}

func (o DeploymentArrayOutput) Index(i pulumi.IntInput) DeploymentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].([]*Deployment)[vs[1].(int)]
	}).(DeploymentOutput)
}

type DeploymentMapOutput struct{ *pulumi.OutputState }

func (DeploymentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Deployment)(nil)).Elem()
}

func (o DeploymentMapOutput) ToDeploymentMapOutput() DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) ToDeploymentMapOutputWithContext(ctx context.Context) DeploymentMapOutput {
	return o
}

func (o DeploymentMapOutput) MapIndex(k pulumi.StringInput) DeploymentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Deployment {
		return vs[0].(map[string]*Deployment)[vs[1].(string)]
	}).(DeploymentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentInput)(nil)).Elem(), &Deployment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentArrayInput)(nil)).Elem(), DeploymentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeploymentMapInput)(nil)).Elem(), DeploymentMap{})
	pulumi.RegisterOutputType(DeploymentOutput{})
	pulumi.RegisterOutputType(DeploymentArrayOutput{})
	pulumi.RegisterOutputType(DeploymentMapOutput{})
}
