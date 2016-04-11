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
 * The response message of the Report method.
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
public final class ReportResponse extends com.google.api.client.json.GenericJson {

  /**
   * The partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status and this list:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operation`s in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operation`s in the request are processed successfully. Each
   * `Operation` that failed processing has a corresponding item    in this list. 3. A failed RPC
   * status indicates a complete failure where none of the    `Operation`s in the request is
   * processed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReportError> reportErrors;

  /**
   * The partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status and this list:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operation`s in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operation`s in the request are processed successfully. Each
   * `Operation` that failed processing has a corresponding item    in this list. 3. A failed RPC
   * status indicates a complete failure where none of the    `Operation`s in the request is
   * processed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<ReportError> getReportErrors() {
    return reportErrors;
  }

  /**
   * The partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status and this list:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operation`s in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operation`s in the request are processed successfully. Each
   * `Operation` that failed processing has a corresponding item    in this list. 3. A failed RPC
   * status indicates a complete failure where none of the    `Operation`s in the request is
   * processed successfully.
   * @param reportErrors reportErrors or {@code null} for none
   */
  public ReportResponse setReportErrors(java.util.List<ReportError> reportErrors) {
    this.reportErrors = reportErrors;
    return this;
  }

  @Override
  public ReportResponse set(String fieldName, Object value) {
    return (ReportResponse) super.set(fieldName, value);
  }

  @Override
  public ReportResponse clone() {
    return (ReportResponse) super.clone();
  }

}
