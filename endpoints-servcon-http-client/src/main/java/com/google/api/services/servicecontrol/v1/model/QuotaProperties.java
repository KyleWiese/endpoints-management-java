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
 * Represents the properties needed for quota operations.
 *
 * Use the metric_value_sets field in Operation message to provide cost override with metric_name in
 * /quota//cost format. Overrides for unmatched quota groups will be ignored. Costs are expected to
 * be >= 0. Cost 0 will cause no quota check, but still traffic restrictions will be enforced.
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
public final class QuotaProperties extends com.google.api.client.json.GenericJson {

  /**
   * LimitType IDs that should be used for checking quota. Key in this map should be a valid
   * LimitType string, and the value is the ID to be used. For ex., an entry  will cause all user
   * quota limits to use 123 as the user ID. See google/api/quota.proto for the definition of
   * LimitType. CLIENT_PROJECT: Not supported. USER: Value of this entry will be used for enforcing
   * user-level quota       limits. If none specified, caller IP passed in the
   * servicecontrol.googleapis.com/caller_ip label will be used instead.       If the server cannot
   * resolve a value for this LimitType, an error       will be thrown. No validation will be
   * performed on this ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> limitByIds;

  /**
   * Quota mode for this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quotaMode;

  /**
   * LimitType IDs that should be used for checking quota. Key in this map should be a valid
   * LimitType string, and the value is the ID to be used. For ex., an entry  will cause all user
   * quota limits to use 123 as the user ID. See google/api/quota.proto for the definition of
   * LimitType. CLIENT_PROJECT: Not supported. USER: Value of this entry will be used for enforcing
   * user-level quota       limits. If none specified, caller IP passed in the
   * servicecontrol.googleapis.com/caller_ip label will be used instead.       If the server cannot
   * resolve a value for this LimitType, an error       will be thrown. No validation will be
   * performed on this ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLimitByIds() {
    return limitByIds;
  }

  /**
   * LimitType IDs that should be used for checking quota. Key in this map should be a valid
   * LimitType string, and the value is the ID to be used. For ex., an entry  will cause all user
   * quota limits to use 123 as the user ID. See google/api/quota.proto for the definition of
   * LimitType. CLIENT_PROJECT: Not supported. USER: Value of this entry will be used for enforcing
   * user-level quota       limits. If none specified, caller IP passed in the
   * servicecontrol.googleapis.com/caller_ip label will be used instead.       If the server cannot
   * resolve a value for this LimitType, an error       will be thrown. No validation will be
   * performed on this ID.
   * @param limitByIds limitByIds or {@code null} for none
   */
  public QuotaProperties setLimitByIds(java.util.Map<String, java.lang.String> limitByIds) {
    this.limitByIds = limitByIds;
    return this;
  }

  /**
   * Quota mode for this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuotaMode() {
    return quotaMode;
  }

  /**
   * Quota mode for this operation.
   * @param quotaMode quotaMode or {@code null} for none
   */
  public QuotaProperties setQuotaMode(java.lang.String quotaMode) {
    this.quotaMode = quotaMode;
    return this;
  }

  @Override
  public QuotaProperties set(String fieldName, Object value) {
    return (QuotaProperties) super.set(fieldName, value);
  }

  @Override
  public QuotaProperties clone() {
    return (QuotaProperties) super.clone();
  }

}
