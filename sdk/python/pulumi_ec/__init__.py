# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .deployment import *
from .deployment_elasticsearch_keystore import *
from .deployment_extension import *
from .deployment_traffic_filter import *
from .deployment_traffic_filter_association import *
from .elasticsearch_project import *
from .get_aws_privatelink_endpoint import *
from .get_azure_privatelink_endpoint import *
from .get_deployment import *
from .get_deployment_templates import *
from .get_deployments import *
from .get_gcp_private_service_connect_endpoint import *
from .get_stack import *
from .get_traffic_filter import *
from .observability_project import *
from .organization import *
from .provider import *
from .security_project import *
from .snapshot_repository import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_ec.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_ec.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "ec",
  "mod": "index/deployment",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/deployment:Deployment": "Deployment"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/deploymentElasticsearchKeystore",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/deploymentElasticsearchKeystore:DeploymentElasticsearchKeystore": "DeploymentElasticsearchKeystore"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/deploymentExtension",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/deploymentExtension:DeploymentExtension": "DeploymentExtension"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/deploymentTrafficFilter",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/deploymentTrafficFilter:DeploymentTrafficFilter": "DeploymentTrafficFilter"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/deploymentTrafficFilterAssociation",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/deploymentTrafficFilterAssociation:DeploymentTrafficFilterAssociation": "DeploymentTrafficFilterAssociation"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/elasticsearchProject",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/elasticsearchProject:ElasticsearchProject": "ElasticsearchProject"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/observabilityProject",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/observabilityProject:ObservabilityProject": "ObservabilityProject"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/organization",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/organization:Organization": "Organization"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/securityProject",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/securityProject:SecurityProject": "SecurityProject"
  }
 },
 {
  "pkg": "ec",
  "mod": "index/snapshotRepository",
  "fqn": "pulumi_ec",
  "classes": {
   "ec:index/snapshotRepository:SnapshotRepository": "SnapshotRepository"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "ec",
  "token": "pulumi:providers:ec",
  "fqn": "pulumi_ec",
  "class": "Provider"
 }
]
"""
)