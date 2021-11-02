import * as elasticCloud from "@pulumi/ec";

const REGION = "us-east-1";

const latestVersion = elasticCloud.getStack({
  region: REGION,
  versionRegex: "latest"
});

new elasticCloud.Deployment('my-deployment', {
  region: REGION,
  version: latestVersion.then((x: { version: string; }) => x.version),
  deploymentTemplateId: "aws-io-optimized-v2",
  elasticsearch: {}
});