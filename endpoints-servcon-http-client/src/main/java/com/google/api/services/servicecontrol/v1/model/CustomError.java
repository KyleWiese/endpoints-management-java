/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.servicecontrol.v1.model;

/**
 * Customize service error responses.  For example, list any service specific protobuf types that
 * can appear in error detail lists of error responses.
 *
 * Example:
 *
 *     custom_error:       types:       - google.foo.v1.CustomError       -
 * google.foo.v1.AnotherError
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Service Control API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomError extends com.google.api.client.json.GenericJson {

  /**
   * The list of custom error rules to select to which messages this should apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomErrorRule> rules;

  static {
    // hack to force ProGuard to consider CustomErrorRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomErrorRule.class);
  }

  /**
   * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> types;

  /**
   * The list of custom error rules to select to which messages this should apply.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomErrorRule> getRules() {
    return rules;
  }

  /**
   * The list of custom error rules to select to which messages this should apply.
   * @param rules rules or {@code null} for none
   */
  public CustomError setRules(java.util.List<CustomErrorRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTypes() {
    return types;
  }

  /**
   * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
   * @param types types or {@code null} for none
   */
  public CustomError setTypes(java.util.List<java.lang.String> types) {
    this.types = types;
    return this;
  }

  @Override
  public CustomError set(String fieldName, Object value) {
    return (CustomError) super.set(fieldName, value);
  }

  @Override
  public CustomError clone() {
    return (CustomError) super.clone();
  }

}
