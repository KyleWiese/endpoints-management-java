/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.scc.aggregator;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import com.google.common.hash.Hasher;

/**
 * Provides functions that support the creation of signatures.
 */
public final class Signing {
  private Signing() {}

  /**
   * Updates {@code h} with the contents of {@code labels}.
   *
   * {@code labels} can be any Map<String, String>, but will typically be labels, but will typically
   * be the labels of one of the model protobufs.
   *
   * @param h a {@link Hasher}
   * @param labels some labels
   * @return the {@code Hasher}, to allow fluent-style usage
   */
  public static Hasher putLabels(Hasher h, Map<String, String> labels) {
    for (Map.Entry<String, String> labelsEntry : labels.entrySet()) {
      h.putChar('\0');
      h.putString(labelsEntry.getKey(), StandardCharsets.UTF_8);
      h.putChar('\0');
      h.putString(labelsEntry.getValue(), StandardCharsets.UTF_8);
    }
    return h;
  }
}
