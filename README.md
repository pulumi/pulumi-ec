# Elastic Cloud Resource Provider

The Elastic Cloud Resource Provider lets you manage [Elastic Cloud](https://www.elastic.co/cloud/) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @pulumi/ec
```

or `yarn`:

```bash
yarn add @pulumi/ec
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_ec
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/pulumi/pulumi-ec/sdk
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.ElasticCloud
```

## Configuration

The following configuration points are available for the `ec` provider:

- `ec:endpoint`: The Elastic Cloud endpoint to which requests should be sent.  This value should be specified only when using the Elastic Cloud provider with an ECE installation or ESS Private.
- `ec:apikey`: The Elastic Cloud API key, recommended over `username` and `password` to authenticate against the Elastic Cloud API.  May also be sourced from environment variable `EC_API_KEY`.
- `ec:username`: The Elastic Cloud username.  May also be sourced from environment variable `EC_USER` or `EC_USERNAME`.  Conflicts with `ec:apiKey`.  Not recommened - prefer using `ec:apikey` over `ec:username` and `ec:password`.
- `ec:password`: The Elastic Cloud user's password.  May also be sourced from environment variable `EC_PASS` or `EC_PASSWORD`.  Conflicts with `ec:apiKey`.  Not recommened - prefer using `ec:apikey` over `ec:username` and `ec:password`.
- `ec:insecure`: If `true`, allows the provider to skip TLS verification (not recommended).  Defaults to `false`.
- `ec:timeout`: Allows the user to set a custom timeout in the individual HTTP request level. Defaults to 1 minute (`"1m"`), but can be extended if timeouts are experienced.
- `ec:verbose`: When set to true, it writes a requests.json file in the folder where Terraform runs with all the outgoing HTTP requests and responses. Defaults to false.
- `ec:verboseCredentials`: If set to `true` and `ec:verbose` is set to `true`, the contents of the Authorization header will not be redacted.  Defaults to `false`.
- `ec:verboseFile`: Sets the name of the file to which verbose request and response HTTP flow will be written. Defaults to `request.log`.

Either `ec:endpoint` or (`ec:username` and `ec:password`) must be specified.  All other parameters are optional:

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/ec/api-docs/).
