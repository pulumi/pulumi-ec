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

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi-ec/provider/pkg/version"
)

// TestMigrateElasticsearchAutoscale covers the state migration for
// https://github.com/pulumi/pulumi-ec/issues/147: legacy stacks store
// elasticsearch.autoscale as a string, the current schema expects a bool.
func TestMigrateElasticsearchAutoscale(t *testing.T) {
	t.Parallel()

	es := func(autoscale resource.PropertyValue) resource.PropertyMap {
		return resource.PropertyMap{
			"elasticsearch": resource.NewObjectProperty(resource.PropertyMap{
				"autoscale": autoscale,
				"hot":       resource.NewObjectProperty(resource.PropertyMap{"size": resource.NewStringProperty("8g")}),
			}),
		}
	}
	autoscaleOf := func(t *testing.T, m resource.PropertyMap) resource.PropertyValue {
		return m["elasticsearch"].ObjectValue()["autoscale"]
	}

	t.Run("string false -> bool false", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchAutoscale(context.Background(), es(resource.NewStringProperty("false")))
		require.NoError(t, err)
		got := autoscaleOf(t, out)
		require.True(t, got.IsBool())
		assert.False(t, got.BoolValue())
	})

	t.Run("string true -> bool true (case-insensitive)", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchAutoscale(context.Background(), es(resource.NewStringProperty("TRUE")))
		require.NoError(t, err)
		got := autoscaleOf(t, out)
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("already bool is left untouched (idempotent)", func(t *testing.T) {
		t.Parallel()
		out, err := migrateElasticsearchAutoscale(context.Background(), es(resource.NewBoolProperty(true)))
		require.NoError(t, err)
		got := autoscaleOf(t, out)
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("single-element list shape", func(t *testing.T) {
		t.Parallel()
		in := resource.PropertyMap{
			"elasticsearch": resource.NewArrayProperty([]resource.PropertyValue{
				resource.NewObjectProperty(resource.PropertyMap{"autoscale": resource.NewStringProperty("true")}),
			}),
		}
		out, err := migrateElasticsearchAutoscale(context.Background(), in)
		require.NoError(t, err)
		got := out["elasticsearch"].ArrayValue()[0].ObjectValue()["autoscale"]
		require.True(t, got.IsBool())
		assert.True(t, got.BoolValue())
	})

	t.Run("missing elasticsearch is a no-op", func(t *testing.T) {
		t.Parallel()
		in := resource.PropertyMap{"region": resource.NewStringProperty("gcp-europe-west1")}
		out, err := migrateElasticsearchAutoscale(context.Background(), in)
		require.NoError(t, err)
		assert.Equal(t, in, out)
	})
}

// TestAutoscaleTransformIsWired guards against the hook silently detaching if the
// resource token mapping changes (e.g. the Resources map key is no longer populated).
func TestAutoscaleTransformIsWired(t *testing.T) {
	t.Parallel()
	version.Version = "0.0.0-test"
	p := Provider()
	r := p.Resources["ec_deployment"]
	require.NotNil(t, r, "ec_deployment must be present in the Resources map")
	assert.NotNil(t, r.TransformFromState, "TransformFromState must be set on ec_deployment")
}
