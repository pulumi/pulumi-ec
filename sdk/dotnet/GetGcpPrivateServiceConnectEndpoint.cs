// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud
{
    public static class GetGcpPrivateServiceConnectEndpoint
    {
        /// <summary>
        /// Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).
        /// 
        /// &gt; **NOTE:** This data source provides data relevant to the Elasticsearch Service (ESS) only, and should not be used for ECE.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var us_central1 = ElasticCloud.GetGcpPrivateServiceConnectEndpoint.Invoke(new()
        ///     {
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGcpPrivateServiceConnectEndpointResult> InvokeAsync(GetGcpPrivateServiceConnectEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGcpPrivateServiceConnectEndpointResult>("ec:index/getGcpPrivateServiceConnectEndpoint:getGcpPrivateServiceConnectEndpoint", args ?? new GetGcpPrivateServiceConnectEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-psc.html).
        /// 
        /// &gt; **NOTE:** This data source provides data relevant to the Elasticsearch Service (ESS) only, and should not be used for ECE.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var us_central1 = ElasticCloud.GetGcpPrivateServiceConnectEndpoint.Invoke(new()
        ///     {
        ///         Region = "us-central1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGcpPrivateServiceConnectEndpointResult> Invoke(GetGcpPrivateServiceConnectEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGcpPrivateServiceConnectEndpointResult>("ec:index/getGcpPrivateServiceConnectEndpoint:getGcpPrivateServiceConnectEndpoint", args ?? new GetGcpPrivateServiceConnectEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGcpPrivateServiceConnectEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Region to retrieve the Private Link configuration for.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetGcpPrivateServiceConnectEndpointArgs()
        {
        }
        public static new GetGcpPrivateServiceConnectEndpointArgs Empty => new GetGcpPrivateServiceConnectEndpointArgs();
    }

    public sealed class GetGcpPrivateServiceConnectEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Region to retrieve the Private Link configuration for.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetGcpPrivateServiceConnectEndpointInvokeArgs()
        {
        }
        public static new GetGcpPrivateServiceConnectEndpointInvokeArgs Empty => new GetGcpPrivateServiceConnectEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetGcpPrivateServiceConnectEndpointResult
    {
        /// <summary>
        /// The domain name to point towards the PSC endpoint.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Region;
        /// <summary>
        /// The service attachment URI to attach the PSC endpoint to.
        /// </summary>
        public readonly string ServiceAttachmentUri;

        [OutputConstructor]
        private GetGcpPrivateServiceConnectEndpointResult(
            string domainName,

            string id,

            string region,

            string serviceAttachmentUri)
        {
            DomainName = domainName;
            Id = id;
            Region = region;
            ServiceAttachmentUri = serviceAttachmentUri;
        }
    }
}
