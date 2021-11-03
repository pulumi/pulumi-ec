"""A Python Pulumi program"""

import pulumi_ec as ec

REGION = "us-east-1"

latest_version = ec.get_stack(
    region=REGION, version_regex="latest").version

deployment = ec.Deployment('my-deployment', region=REGION, version=latest_version,
                     deployment_template_id="aws-io-optimized-v2", elasticsearch={})
