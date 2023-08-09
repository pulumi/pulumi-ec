// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { DeploymentArgs, DeploymentState } from "./deployment";
export type Deployment = import("./deployment").Deployment;
export const Deployment: typeof import("./deployment").Deployment = null as any;
utilities.lazyLoad(exports, ["Deployment"], () => require("./deployment"));

export { DeploymentElasticsearchKeystoreArgs, DeploymentElasticsearchKeystoreState } from "./deploymentElasticsearchKeystore";
export type DeploymentElasticsearchKeystore = import("./deploymentElasticsearchKeystore").DeploymentElasticsearchKeystore;
export const DeploymentElasticsearchKeystore: typeof import("./deploymentElasticsearchKeystore").DeploymentElasticsearchKeystore = null as any;
utilities.lazyLoad(exports, ["DeploymentElasticsearchKeystore"], () => require("./deploymentElasticsearchKeystore"));

export { DeploymentExtensionArgs, DeploymentExtensionState } from "./deploymentExtension";
export type DeploymentExtension = import("./deploymentExtension").DeploymentExtension;
export const DeploymentExtension: typeof import("./deploymentExtension").DeploymentExtension = null as any;
utilities.lazyLoad(exports, ["DeploymentExtension"], () => require("./deploymentExtension"));

export { DeploymentTrafficFilterArgs, DeploymentTrafficFilterState } from "./deploymentTrafficFilter";
export type DeploymentTrafficFilter = import("./deploymentTrafficFilter").DeploymentTrafficFilter;
export const DeploymentTrafficFilter: typeof import("./deploymentTrafficFilter").DeploymentTrafficFilter = null as any;
utilities.lazyLoad(exports, ["DeploymentTrafficFilter"], () => require("./deploymentTrafficFilter"));

export { DeploymentTrafficFilterAssociationArgs, DeploymentTrafficFilterAssociationState } from "./deploymentTrafficFilterAssociation";
export type DeploymentTrafficFilterAssociation = import("./deploymentTrafficFilterAssociation").DeploymentTrafficFilterAssociation;
export const DeploymentTrafficFilterAssociation: typeof import("./deploymentTrafficFilterAssociation").DeploymentTrafficFilterAssociation = null as any;
utilities.lazyLoad(exports, ["DeploymentTrafficFilterAssociation"], () => require("./deploymentTrafficFilterAssociation"));

export { GetAwsPrivatelinkEndpointArgs, GetAwsPrivatelinkEndpointResult, GetAwsPrivatelinkEndpointOutputArgs } from "./getAwsPrivatelinkEndpoint";
export const getAwsPrivatelinkEndpoint: typeof import("./getAwsPrivatelinkEndpoint").getAwsPrivatelinkEndpoint = null as any;
export const getAwsPrivatelinkEndpointOutput: typeof import("./getAwsPrivatelinkEndpoint").getAwsPrivatelinkEndpointOutput = null as any;
utilities.lazyLoad(exports, ["getAwsPrivatelinkEndpoint","getAwsPrivatelinkEndpointOutput"], () => require("./getAwsPrivatelinkEndpoint"));

export { GetAzurePrivatelinkEndpointArgs, GetAzurePrivatelinkEndpointResult, GetAzurePrivatelinkEndpointOutputArgs } from "./getAzurePrivatelinkEndpoint";
export const getAzurePrivatelinkEndpoint: typeof import("./getAzurePrivatelinkEndpoint").getAzurePrivatelinkEndpoint = null as any;
export const getAzurePrivatelinkEndpointOutput: typeof import("./getAzurePrivatelinkEndpoint").getAzurePrivatelinkEndpointOutput = null as any;
utilities.lazyLoad(exports, ["getAzurePrivatelinkEndpoint","getAzurePrivatelinkEndpointOutput"], () => require("./getAzurePrivatelinkEndpoint"));

export { GetDeploymentArgs, GetDeploymentResult, GetDeploymentOutputArgs } from "./getDeployment";
export const getDeployment: typeof import("./getDeployment").getDeployment = null as any;
export const getDeploymentOutput: typeof import("./getDeployment").getDeploymentOutput = null as any;
utilities.lazyLoad(exports, ["getDeployment","getDeploymentOutput"], () => require("./getDeployment"));

export { GetDeploymentsArgs, GetDeploymentsResult, GetDeploymentsOutputArgs } from "./getDeployments";
export const getDeployments: typeof import("./getDeployments").getDeployments = null as any;
export const getDeploymentsOutput: typeof import("./getDeployments").getDeploymentsOutput = null as any;
utilities.lazyLoad(exports, ["getDeployments","getDeploymentsOutput"], () => require("./getDeployments"));

export { GetGcpPrivateServiceConnectEndpointArgs, GetGcpPrivateServiceConnectEndpointResult, GetGcpPrivateServiceConnectEndpointOutputArgs } from "./getGcpPrivateServiceConnectEndpoint";
export const getGcpPrivateServiceConnectEndpoint: typeof import("./getGcpPrivateServiceConnectEndpoint").getGcpPrivateServiceConnectEndpoint = null as any;
export const getGcpPrivateServiceConnectEndpointOutput: typeof import("./getGcpPrivateServiceConnectEndpoint").getGcpPrivateServiceConnectEndpointOutput = null as any;
utilities.lazyLoad(exports, ["getGcpPrivateServiceConnectEndpoint","getGcpPrivateServiceConnectEndpointOutput"], () => require("./getGcpPrivateServiceConnectEndpoint"));

export { GetStackArgs, GetStackResult, GetStackOutputArgs } from "./getStack";
export const getStack: typeof import("./getStack").getStack = null as any;
export const getStackOutput: typeof import("./getStack").getStackOutput = null as any;
utilities.lazyLoad(exports, ["getStack","getStackOutput"], () => require("./getStack"));

export { GetTrafficFilterArgs, GetTrafficFilterResult, GetTrafficFilterOutputArgs } from "./getTrafficFilter";
export const getTrafficFilter: typeof import("./getTrafficFilter").getTrafficFilter = null as any;
export const getTrafficFilterOutput: typeof import("./getTrafficFilter").getTrafficFilterOutput = null as any;
utilities.lazyLoad(exports, ["getTrafficFilter","getTrafficFilterOutput"], () => require("./getTrafficFilter"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { SnapshotRepositoryArgs, SnapshotRepositoryState } from "./snapshotRepository";
export type SnapshotRepository = import("./snapshotRepository").SnapshotRepository;
export const SnapshotRepository: typeof import("./snapshotRepository").SnapshotRepository = null as any;
utilities.lazyLoad(exports, ["SnapshotRepository"], () => require("./snapshotRepository"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "ec:index/deployment:Deployment":
                return new Deployment(name, <any>undefined, { urn })
            case "ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore":
                return new DeploymentElasticsearchKeystore(name, <any>undefined, { urn })
            case "ec:index/deploymentExtension:DeploymentExtension":
                return new DeploymentExtension(name, <any>undefined, { urn })
            case "ec:index/deploymentTrafficFilter:DeploymentTrafficFilter":
                return new DeploymentTrafficFilter(name, <any>undefined, { urn })
            case "ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation":
                return new DeploymentTrafficFilterAssociation(name, <any>undefined, { urn })
            case "ec:index/snapshotRepository:SnapshotRepository":
                return new SnapshotRepository(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("ec", "index/deployment", _module)
pulumi.runtime.registerResourceModule("ec", "index/deploymentElasticsearchKeystore", _module)
pulumi.runtime.registerResourceModule("ec", "index/deploymentExtension", _module)
pulumi.runtime.registerResourceModule("ec", "index/deploymentTrafficFilter", _module)
pulumi.runtime.registerResourceModule("ec", "index/deploymentTrafficFilterAssociation", _module)
pulumi.runtime.registerResourceModule("ec", "index/snapshotRepository", _module)
pulumi.runtime.registerResourcePackage("ec", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:ec") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
