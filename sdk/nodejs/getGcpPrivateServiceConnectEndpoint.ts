// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about the GCP Private Service Connect configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const us-central1 = ec.getGcpPrivateServiceConnectEndpoint({
 *     region: "us-central1",
 * });
 * ```
 */
export function getGcpPrivateServiceConnectEndpoint(args: GetGcpPrivateServiceConnectEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetGcpPrivateServiceConnectEndpointResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("ec:index/getGcpPrivateServiceConnectEndpoint:getGcpPrivateServiceConnectEndpoint", {
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getGcpPrivateServiceConnectEndpoint.
 */
export interface GetGcpPrivateServiceConnectEndpointArgs {
    /**
     * Region to retrieve the Prive Link configuration for.
     */
    region: string;
}

/**
 * A collection of values returned by getGcpPrivateServiceConnectEndpoint.
 */
export interface GetGcpPrivateServiceConnectEndpointResult {
    /**
     * The domain name to point towards the PSC endpoint.
     */
    readonly domainName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Region to retrieve the Prive Link configuration for.
     */
    readonly region: string;
    /**
     * The service attachment URI to attach the PSC endpoint to.
     */
    readonly serviceAttachmentUri: string;
}
/**
 * Use this data source to retrieve information about the GCP Private Service Connect configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as ec from "@pulumi/ec";
 *
 * const us-central1 = ec.getGcpPrivateServiceConnectEndpoint({
 *     region: "us-central1",
 * });
 * ```
 */
export function getGcpPrivateServiceConnectEndpointOutput(args: GetGcpPrivateServiceConnectEndpointOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGcpPrivateServiceConnectEndpointResult> {
    return pulumi.output(args).apply((a: any) => getGcpPrivateServiceConnectEndpoint(a, opts))
}

/**
 * A collection of arguments for invoking getGcpPrivateServiceConnectEndpoint.
 */
export interface GetGcpPrivateServiceConnectEndpointOutputArgs {
    /**
     * Region to retrieve the Prive Link configuration for.
     */
    region: pulumi.Input<string>;
}
