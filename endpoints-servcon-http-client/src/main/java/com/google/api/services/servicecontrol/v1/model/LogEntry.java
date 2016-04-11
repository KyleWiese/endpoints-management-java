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
 * An individual entry in a log.
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
public final class LogEntry extends com.google.api.client.json.GenericJson {

  /**
   * Information about the HTTP request associated with this log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpRequest httpRequest;

  /**
   * A unique ID for the log entry. If you provide this field, the logging service considers other
   * log entries in the same log with the same ID as duplicates which can be removed.  If omitted,
   * Stackdriver Logging will generate a unique ID for this log entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertId;

  /**
   * The log to which this entry belongs. When a log entry is written, the value of this field is
   * set by the logging system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String log;

  /**
   * Required. Information about the log entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntryMetadata metadata;

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogEntryOperation operation;

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. You
   * can only pass `protoPayload` values that belong to a set of approved types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> protoPayload;

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> structPayload;

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textPayload;

  /**
   * Information about the HTTP request associated with this log entry, if applicable.
   * @return value or {@code null} for none
   */
  public HttpRequest getHttpRequest() {
    return httpRequest;
  }

  /**
   * Information about the HTTP request associated with this log entry, if applicable.
   * @param httpRequest httpRequest or {@code null} for none
   */
  public LogEntry setHttpRequest(HttpRequest httpRequest) {
    this.httpRequest = httpRequest;
    return this;
  }

  /**
   * A unique ID for the log entry. If you provide this field, the logging service considers other
   * log entries in the same log with the same ID as duplicates which can be removed.  If omitted,
   * Stackdriver Logging will generate a unique ID for this log entry.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertId() {
    return insertId;
  }

  /**
   * A unique ID for the log entry. If you provide this field, the logging service considers other
   * log entries in the same log with the same ID as duplicates which can be removed.  If omitted,
   * Stackdriver Logging will generate a unique ID for this log entry.
   * @param insertId insertId or {@code null} for none
   */
  public LogEntry setInsertId(java.lang.String insertId) {
    this.insertId = insertId;
    return this;
  }

  /**
   * The log to which this entry belongs. When a log entry is written, the value of this field is
   * set by the logging system.
   * @return value or {@code null} for none
   */
  public java.lang.String getLog() {
    return log;
  }

  /**
   * The log to which this entry belongs. When a log entry is written, the value of this field is
   * set by the logging system.
   * @param log log or {@code null} for none
   */
  public LogEntry setLog(java.lang.String log) {
    this.log = log;
    return this;
  }

  /**
   * Required. Information about the log entry.
   * @return value or {@code null} for none
   */
  public LogEntryMetadata getMetadata() {
    return metadata;
  }

  /**
   * Required. Information about the log entry.
   * @param metadata metadata or {@code null} for none
   */
  public LogEntry setMetadata(LogEntryMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @return value or {@code null} for none
   */
  public LogEntryOperation getOperation() {
    return operation;
  }

  /**
   * Optional. Information about an operation associated with the log entry, if applicable.
   * @param operation operation or {@code null} for none
   */
  public LogEntry setOperation(LogEntryOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. You
   * can only pass `protoPayload` values that belong to a set of approved types.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getProtoPayload() {
    return protoPayload;
  }

  /**
   * The log entry payload, represented as a protocol buffer that is expressed as a JSON object. You
   * can only pass `protoPayload` values that belong to a set of approved types.
   * @param protoPayload protoPayload or {@code null} for none
   */
  public LogEntry setProtoPayload(java.util.Map<String, java.lang.Object> protoPayload) {
    this.protoPayload = protoPayload;
    return this;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getStructPayload() {
    return structPayload;
  }

  /**
   * The log entry payload, represented as a structure that is expressed as a JSON object.
   * @param structPayload structPayload or {@code null} for none
   */
  public LogEntry setStructPayload(java.util.Map<String, java.lang.Object> structPayload) {
    this.structPayload = structPayload;
    return this;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @return value or {@code null} for none
   */
  public java.lang.String getTextPayload() {
    return textPayload;
  }

  /**
   * The log entry payload, represented as a Unicode string (UTF-8).
   * @param textPayload textPayload or {@code null} for none
   */
  public LogEntry setTextPayload(java.lang.String textPayload) {
    this.textPayload = textPayload;
    return this;
  }

  @Override
  public LogEntry set(String fieldName, Object value) {
    return (LogEntry) super.set(fieldName, value);
  }

  @Override
  public LogEntry clone() {
    return (LogEntry) super.clone();
  }

}
