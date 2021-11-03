"""A Python Pulumi program"""

import pulumi_ec

REGION = "us-east-1"

latest_version = pulumi_ec.get_stack(
    region=REGION, version_regex="latest").version

pulumi_ec.deployment('my-deployment', region=REGION, version=latest_version,
                     deployment_template_id="aws-io-optimized-v2", elasticsearch={})
