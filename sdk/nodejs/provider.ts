// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the ec package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'ec';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     */
    public readonly apikey!: pulumi.Output<string | undefined>;
    public readonly endpoint!: pulumi.Output<string | undefined>;
    /**
     * Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Timeout used for individual HTTP calls. Defaults to "1m".
     */
    public readonly timeout!: pulumi.Output<string | undefined>;
    /**
     * Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     */
    public readonly username!: pulumi.Output<string | undefined>;
    /**
     * Timeout used for individual HTTP calls. Defaults to "1m".
     */
    public readonly verboseFile!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["apikey"] = args?.apikey ? pulumi.secret(args.apikey) : undefined;
            resourceInputs["endpoint"] = args ? args.endpoint : undefined;
            resourceInputs["insecure"] = pulumi.output(args ? args.insecure : undefined).apply(JSON.stringify);
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["verbose"] = pulumi.output(args ? args.verbose : undefined).apply(JSON.stringify);
            resourceInputs["verboseCredentials"] = pulumi.output(args ? args.verboseCredentials : undefined).apply(JSON.stringify);
            resourceInputs["verboseFile"] = args ? args.verboseFile : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apikey", "password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }

    /**
     * This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
     */
    terraformConfig(): pulumi.Output<Provider.TerraformConfigResult> {
        return pulumi.runtime.call("pulumi:providers:ec/terraformConfig", {
            "__self__": this,
        }, this);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * API Key to use for API authentication. The only valid authentication mechanism for the Elasticsearch Service.
     */
    apikey?: pulumi.Input<string>;
    endpoint?: pulumi.Input<string>;
    /**
     * Allow the provider to skip TLS validation on its outgoing HTTP calls.
     */
    insecure?: pulumi.Input<boolean>;
    /**
     * Password to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     */
    password?: pulumi.Input<string>;
    /**
     * Timeout used for individual HTTP calls. Defaults to "1m".
     */
    timeout?: pulumi.Input<string>;
    /**
     * Username to use for API authentication. Available only when targeting ECE Installations or Elasticsearch Service
     * Private.
     */
    username?: pulumi.Input<string>;
    /**
     * When set, a "request.log" file will be written with all outgoing HTTP requests. Defaults to "false".
     */
    verbose?: pulumi.Input<boolean>;
    /**
     * When set with verbose, the contents of the Authorization header will not be redacted. Defaults to "false".
     */
    verboseCredentials?: pulumi.Input<boolean>;
    /**
     * Timeout used for individual HTTP calls. Defaults to "1m".
     */
    verboseFile?: pulumi.Input<string>;
}

export namespace Provider {
    /**
     * The results of the Provider.terraformConfig method.
     */
    export interface TerraformConfigResult {
        readonly result: {[key: string]: any};
    }

}
