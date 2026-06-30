// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ec

import (
	"context"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-ec/provider/pkg/version"
)

// Ensure https://github.com/pulumi/pulumi-ec/issues/147 schema migration
// v1 stacks store elasticsearch.autoscale as a string, the current schema expects a bool.
func TestMigrateElasticCloudDeploymentAutoscale(t *testing.T) {
	t.Parallel()

	es := func(autoscale resource.PropertyValue) resource.PropertyMap {
		return resource.PropertyMap{
			elasticsearchKey: resource.NewObjectProperty(resource.PropertyMap{
				"autoscale": autoscale,
				"hot":       resource.NewObjectProperty(resource.PropertyMap{"size": resource.NewStringProperty("8g")}),
			}),
		}
	}
	autoscaleOf := func(m resource.PropertyMap) resource.PropertyValue {
		return m[elasticsearchKey].ObjectValue()["autoscale"]
	}

	t.Run("string false -> bool false", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchState(context.Background(), es(resource.NewStringProperty("false")))
		require.NoError(t, err)
		got := autoscaleOf(out)
		require.True(t, got.IsBool())
		assert.False(t, got.BoolValue())
	})

	t.Run("string true -> bool true (case-insensitive)", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchState(context.Background(), es(resource.NewStringProperty("TRUE")))
		require.NoError(t, err)
		got := autoscaleOf(out)
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("already bool is left untouched (idempotent)", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchState(context.Background(), es(resource.NewBoolProperty(true)))
		require.NoError(t, err)
		got := autoscaleOf(out)
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("single-element list shape", func(t *testing.T) {
		t.Parallel()
		in := resource.PropertyMap{
			elasticsearchKey: resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewObjectProperty(resource.PropertyMap{"autoscale": resource.NewStringProperty("true")}),
			}),
		}
		out, err := migrateElasticsearchState(context.Background(), in)
		require.NoError(t, err)
		got := out[elasticsearchKey].ArrayValue()[0].ObjectValue()["autoscale"]
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("missing elasticsearch is a no-op", func(t *testing.T) {
		t.Parallel()
		in := resource.PropertyMap{"region": resource.NewStringProperty("gcp-europe-west1")}
		out, err := migrateElasticsearchState(context.Background(), in)
		require.NoError(t, err)
		assert.Equal(t, in, out)
	})
}

// v1 stacks store elasticsearch.strategy as a single-element) list of `{type: "..."}` objects
// The current schema expects a bare `type` string.
func TestMigrateElasticCloudDeploymentStrategy(t *testing.T) {
	t.Parallel()

	es := func(strategy resource.PropertyValue) resource.PropertyMap {
		return resource.PropertyMap{
			elasticsearchKey: resource.NewObjectProperty(resource.PropertyMap{
				"strategy": strategy,
			}),
		}
	}
	strategyOf := func(m resource.PropertyMap) resource.PropertyValue {
		return m[elasticsearchKey].ObjectValue()["strategy"]
	}

	t.Run("list of {type} -> string", func(t *testing.T) {
		t.Parallel()
		in := es(resource.NewArrayProperty([]resource.PropertyValue{
			resource.NewObjectProperty(resource.PropertyMap{"type": resource.NewStringProperty("autodetect")}),
		}))
		out, err := migrateElasticsearchState(context.Background(), in)
		require.NoError(t, err)
		got := strategyOf(out)
		require.True(t, got.IsString())
		assert.Equal(t, "autodetect", got.StringValue())
	})

	t.Run("single {type} object -> string", func(t *testing.T) {
		t.Parallel()
		in := es(resource.NewObjectProperty(resource.PropertyMap{"type": resource.NewStringProperty("grow_and_shrink")}))
		out, err := migrateElasticsearchState(context.Background(), in)
		require.NoError(t, err)
		got := strategyOf(out)
		require.True(t, got.IsString())
		assert.Equal(t, "grow_and_shrink", got.StringValue())
	})

	t.Run("already a string is left untouched (idempotent)", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchState(context.Background(), es(resource.NewStringProperty("rolling_all")))
		require.NoError(t, err)
		got := strategyOf(out)
		require.True(t, got.IsString())
		assert.Equal(t, "rolling_all", got.StringValue())
	})

	t.Run("empty list is left untouched", func(t *testing.T) {
		t.Parallel()
		in := es(resource.NewArrayProperty(nil))
		out, err := migrateElasticsearchState(context.Background(), in)
		require.NoError(t, err)
		assert.True(t, strategyOf(out).IsArray())
	})
}

func TestElasticCloudDeploymentSchemaMigrationTransformIsWired(t *testing.T) {
	t.Parallel()
	version.Version = "0.0.0-test"
	p := Provider()
	r := p.Resources["ec_deployment"]
	require.NotNil(t, r, "ec_deployment must be present in the Resources map")
	assert.NotNil(t, r.TransformFromState, "TransformFromState must be set on ec_deployment")
	assert.NotNil(t, r.PreStateUpgradeHook, "PreStateUpgradeHook must be set on ec_deployment")
}
