// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve a list of IDs for the deployment and resource kinds, based on the specified query.
//
// ## Example Usage
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
// 		opt0 := "azure-compute-optimized"
// 		opt1 := "test"
// 		opt2 := 200
// 		_, err := ec.GetDeployments(ctx, &GetDeploymentsArgs{
// 			DeploymentTemplateId: &opt0,
// 			Elasticsearch: GetDeploymentsElasticsearch{
// 				Healthy: "true",
// 			},
// 			EnterpriseSearch: GetDeploymentsEnterpriseSearch{
// 				Healthy: "true",
// 			},
// 			IntegrationsServer: GetDeploymentsIntegrationsServer{
// 				Version: "8.0.0",
// 			},
// 			Kibana: GetDeploymentsKibana{
// 				Status: "started",
// 			},
// 			NamePrefix: &opt1,
// 			Size:       &opt2,
// 			Tags: map[string]interface{}{
// 				"foo": "bar",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetDeployments(ctx *pulumi.Context, args *GetDeploymentsArgs, opts ...pulumi.InvokeOption) (*GetDeploymentsResult, error) {
	var rv GetDeploymentsResult
	err := ctx.Invoke("ec:index/getDeployments:getDeployments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDeployments.
type GetDeploymentsArgs struct {
	// **DEPRECATED** Filter by APM resource kind status or configuration.
	// * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `apm.#.version` - Elastic stack version.
	// * `apm.#.healthy` - Overall health status of the APM instances.
	Apm *GetDeploymentsApm `pulumi:"apm"`
	// ID of the deployment template used to create the deployment.
	DeploymentTemplateId *string `pulumi:"deploymentTemplateId"`
	// Filter by Elasticsearch resource kind status or configuration.
	// * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `elasticsearch.#.version` - Elastic stack version.
	// * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
	Elasticsearch *GetDeploymentsElasticsearch `pulumi:"elasticsearch"`
	// Filter by Enterprise Search resource kind status or configuration.
	// * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `enterprise_search.#.version` - Elastic stack version.
	// * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
	EnterpriseSearch *GetDeploymentsEnterpriseSearch `pulumi:"enterpriseSearch"`
	// Overall health status of the deployment.
	Healthy *string `pulumi:"healthy"`
	// Filter by Integrations Server resource kind status or configuration.
	// * `integrations_server.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `integrations_server.#.version` - Elastic stack version.
	// * `integrations_server.#.healthy` - Overall health status of the Integrations Server instances.
	IntegrationsServer *GetDeploymentsIntegrationsServer `pulumi:"integrationsServer"`
	// Filter by Kibana resource kind status or configuration.
	// * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `kibana.#.version` - Elastic stack version.
	// * `kibana.#.healthy` - Overall health status of the Kibana instances.
	Kibana *GetDeploymentsKibana `pulumi:"kibana"`
	// Prefix that one or several deployment names have in common.
	NamePrefix *string `pulumi:"namePrefix"`
	// The maximum number of deployments to return. Defaults to `100`.
	Size *int `pulumi:"size"`
	// Key value map of arbitrary string tags for the deployment.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getDeployments.
type GetDeploymentsResult struct {
	Apm                  *GetDeploymentsApm `pulumi:"apm"`
	DeploymentTemplateId *string            `pulumi:"deploymentTemplateId"`
	// List of deployments which match the specified query.
	// * `deployments.#.deployment_id` - The deployment unique ID.
	// * `deployments.#.alias` - Deployment alias.
	// * `deployments.#.name` - The name of the deployment.
	// * `deployments.#.elasticsearch_resource_id` - The Elasticsearch resource unique ID.
	// * `deployments.#.elasticsearch_ref_id` - The Elasticsearch resource reference.
	// * `deployments.#.kibana_resource_id` - The Kibana resource unique ID.
	// * `deployments.#.kibana_ref_id` - The Kibana resource reference.
	// * `deployments.#.integrations_server_resource_id` - The Integrations Server resource unique ID.
	// * `deployments.#.integrations_server_ref_id` - The Integrations Server resource reference.
	// * `deployments.#.apm_resource_id` - The APM resource unique ID.
	// * `deployments.#.apm_ref_id` - The APM resource reference.
	// * `deployments.#.enterprise_search_resource_id` - The Enterprise Search resource unique ID.
	// * `deployments.#.enterprise_search_ref_id` - The Enterprise Search resource reference.
	Deployments      []GetDeploymentsDeployment      `pulumi:"deployments"`
	Elasticsearch    *GetDeploymentsElasticsearch    `pulumi:"elasticsearch"`
	EnterpriseSearch *GetDeploymentsEnterpriseSearch `pulumi:"enterpriseSearch"`
	Healthy          *string                         `pulumi:"healthy"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string                            `pulumi:"id"`
	IntegrationsServer *GetDeploymentsIntegrationsServer `pulumi:"integrationsServer"`
	Kibana             *GetDeploymentsKibana             `pulumi:"kibana"`
	NamePrefix         *string                           `pulumi:"namePrefix"`
	ReturnCount        int                               `pulumi:"returnCount"`
	Size               *int                              `pulumi:"size"`
	Tags               map[string]string                 `pulumi:"tags"`
}

func GetDeploymentsOutput(ctx *pulumi.Context, args GetDeploymentsOutputArgs, opts ...pulumi.InvokeOption) GetDeploymentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDeploymentsResult, error) {
			args := v.(GetDeploymentsArgs)
			r, err := GetDeployments(ctx, &args, opts...)
			return *r, err
		}).(GetDeploymentsResultOutput)
}

// A collection of arguments for invoking getDeployments.
type GetDeploymentsOutputArgs struct {
	// **DEPRECATED** Filter by APM resource kind status or configuration.
	// * `apm.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `apm.#.version` - Elastic stack version.
	// * `apm.#.healthy` - Overall health status of the APM instances.
	Apm GetDeploymentsApmPtrInput `pulumi:"apm"`
	// ID of the deployment template used to create the deployment.
	DeploymentTemplateId pulumi.StringPtrInput `pulumi:"deploymentTemplateId"`
	// Filter by Elasticsearch resource kind status or configuration.
	// * `elasticsearch.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `elasticsearch.#.version` - Elastic stack version.
	// * `elasticsearch.#.healthy` - Overall health status of the Elasticsearch instances.
	Elasticsearch GetDeploymentsElasticsearchPtrInput `pulumi:"elasticsearch"`
	// Filter by Enterprise Search resource kind status or configuration.
	// * `enterprise_search.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `enterprise_search.#.version` - Elastic stack version.
	// * `enterprise_search.#.healthy` - Overall health status of the Enterprise Search instances.
	EnterpriseSearch GetDeploymentsEnterpriseSearchPtrInput `pulumi:"enterpriseSearch"`
	// Overall health status of the deployment.
	Healthy pulumi.StringPtrInput `pulumi:"healthy"`
	// Filter by Integrations Server resource kind status or configuration.
	// * `integrations_server.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `integrations_server.#.version` - Elastic stack version.
	// * `integrations_server.#.healthy` - Overall health status of the Integrations Server instances.
	IntegrationsServer GetDeploymentsIntegrationsServerPtrInput `pulumi:"integrationsServer"`
	// Filter by Kibana resource kind status or configuration.
	// * `kibana.#.status` - Resource kind status (Available statuses are: initializing, stopping, stopped, rebooting, restarting, reconfiguring, and started).
	// * `kibana.#.version` - Elastic stack version.
	// * `kibana.#.healthy` - Overall health status of the Kibana instances.
	Kibana GetDeploymentsKibanaPtrInput `pulumi:"kibana"`
	// Prefix that one or several deployment names have in common.
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
	// The maximum number of deployments to return. Defaults to `100`.
	Size pulumi.IntPtrInput `pulumi:"size"`
	// Key value map of arbitrary string tags for the deployment.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetDeploymentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeploymentsArgs)(nil)).Elem()
}

// A collection of values returned by getDeployments.
type GetDeploymentsResultOutput struct{ *pulumi.OutputState }

func (GetDeploymentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDeploymentsResult)(nil)).Elem()
}

func (o GetDeploymentsResultOutput) ToGetDeploymentsResultOutput() GetDeploymentsResultOutput {
	return o
}

func (o GetDeploymentsResultOutput) ToGetDeploymentsResultOutputWithContext(ctx context.Context) GetDeploymentsResultOutput {
	return o
}

func (o GetDeploymentsResultOutput) Apm() GetDeploymentsApmPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *GetDeploymentsApm { return v.Apm }).(GetDeploymentsApmPtrOutput)
}

func (o GetDeploymentsResultOutput) DeploymentTemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *string { return v.DeploymentTemplateId }).(pulumi.StringPtrOutput)
}

// List of deployments which match the specified query.
// * `deployments.#.deployment_id` - The deployment unique ID.
// * `deployments.#.alias` - Deployment alias.
// * `deployments.#.name` - The name of the deployment.
// * `deployments.#.elasticsearch_resource_id` - The Elasticsearch resource unique ID.
// * `deployments.#.elasticsearch_ref_id` - The Elasticsearch resource reference.
// * `deployments.#.kibana_resource_id` - The Kibana resource unique ID.
// * `deployments.#.kibana_ref_id` - The Kibana resource reference.
// * `deployments.#.integrations_server_resource_id` - The Integrations Server resource unique ID.
// * `deployments.#.integrations_server_ref_id` - The Integrations Server resource reference.
// * `deployments.#.apm_resource_id` - The APM resource unique ID.
// * `deployments.#.apm_ref_id` - The APM resource reference.
// * `deployments.#.enterprise_search_resource_id` - The Enterprise Search resource unique ID.
// * `deployments.#.enterprise_search_ref_id` - The Enterprise Search resource reference.
func (o GetDeploymentsResultOutput) Deployments() GetDeploymentsDeploymentArrayOutput {
	return o.ApplyT(func(v GetDeploymentsResult) []GetDeploymentsDeployment { return v.Deployments }).(GetDeploymentsDeploymentArrayOutput)
}

func (o GetDeploymentsResultOutput) Elasticsearch() GetDeploymentsElasticsearchPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *GetDeploymentsElasticsearch { return v.Elasticsearch }).(GetDeploymentsElasticsearchPtrOutput)
}

func (o GetDeploymentsResultOutput) EnterpriseSearch() GetDeploymentsEnterpriseSearchPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *GetDeploymentsEnterpriseSearch { return v.EnterpriseSearch }).(GetDeploymentsEnterpriseSearchPtrOutput)
}

func (o GetDeploymentsResultOutput) Healthy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *string { return v.Healthy }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDeploymentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDeploymentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDeploymentsResultOutput) IntegrationsServer() GetDeploymentsIntegrationsServerPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *GetDeploymentsIntegrationsServer { return v.IntegrationsServer }).(GetDeploymentsIntegrationsServerPtrOutput)
}

func (o GetDeploymentsResultOutput) Kibana() GetDeploymentsKibanaPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *GetDeploymentsKibana { return v.Kibana }).(GetDeploymentsKibanaPtrOutput)
}

func (o GetDeploymentsResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

func (o GetDeploymentsResultOutput) ReturnCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetDeploymentsResult) int { return v.ReturnCount }).(pulumi.IntOutput)
}

func (o GetDeploymentsResultOutput) Size() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDeploymentsResult) *int { return v.Size }).(pulumi.IntPtrOutput)
}

func (o GetDeploymentsResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetDeploymentsResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDeploymentsResultOutput{})
}
