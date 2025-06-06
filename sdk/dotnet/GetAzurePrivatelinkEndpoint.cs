// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ElasticCloud
{
    public static class GetAzurePrivatelinkEndpoint
    {
        /// <summary>
        /// Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vnet.html).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var eastus = ElasticCloud.GetAzurePrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Region = "eastus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAzurePrivatelinkEndpointResult> InvokeAsync(GetAzurePrivatelinkEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAzurePrivatelinkEndpointResult>("ec:index/getAzurePrivatelinkEndpoint:getAzurePrivatelinkEndpoint", args ?? new GetAzurePrivatelinkEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vnet.html).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var eastus = ElasticCloud.GetAzurePrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Region = "eastus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAzurePrivatelinkEndpointResult> Invoke(GetAzurePrivatelinkEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAzurePrivatelinkEndpointResult>("ec:index/getAzurePrivatelinkEndpoint:getAzurePrivatelinkEndpoint", args ?? new GetAzurePrivatelinkEndpointInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about the Azure Private Link configuration for a given region. Further documentation on how to establish a PrivateLink connection can be found in the ESS [documentation](https://www.elastic.co/guide/en/cloud/current/ec-traffic-filtering-vnet.html).
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ElasticCloud = Pulumi.ElasticCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var eastus = ElasticCloud.GetAzurePrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Region = "eastus",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAzurePrivatelinkEndpointResult> Invoke(GetAzurePrivatelinkEndpointInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAzurePrivatelinkEndpointResult>("ec:index/getAzurePrivatelinkEndpoint:getAzurePrivatelinkEndpoint", args ?? new GetAzurePrivatelinkEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAzurePrivatelinkEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Region to retrieve the Private Link configuration for.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        public GetAzurePrivatelinkEndpointArgs()
        {
        }
        public static new GetAzurePrivatelinkEndpointArgs Empty => new GetAzurePrivatelinkEndpointArgs();
    }

    public sealed class GetAzurePrivatelinkEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Region to retrieve the Private Link configuration for.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetAzurePrivatelinkEndpointInvokeArgs()
        {
        }
        public static new GetAzurePrivatelinkEndpointInvokeArgs Empty => new GetAzurePrivatelinkEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetAzurePrivatelinkEndpointResult
    {
        /// <summary>
        /// The domain name to used in when configuring a private hosted zone in the VNet connection.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Region to retrieve the Private Link configuration for.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The service alias to establish a connection to.
        /// </summary>
        public readonly string ServiceAlias;

        [OutputConstructor]
        private GetAzurePrivatelinkEndpointResult(
            string domainName,

            string id,

            string region,

            string serviceAlias)
        {
            DomainName = domainName;
            Id = id;
            Region = region;
            ServiceAlias = serviceAlias;
        }
    }
}
