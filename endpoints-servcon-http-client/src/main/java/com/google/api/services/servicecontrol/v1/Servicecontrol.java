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

package com.google.api.services.servicecontrol.v1;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.http.protobuf.ProtoHttpContent;
import com.google.api.client.protobuf.ProtoObjectParser;
import com.google.api.client.util.ObjectParser;
import com.google.api.servicecontrol.v1.CheckRequest;
import com.google.api.servicecontrol.v1.CheckResponse;
import com.google.api.servicecontrol.v1.ReportRequest;
import com.google.api.servicecontrol.v1.ReportResponse;

/**
 * Service definition for Servicecontrol (v1).
 *
 * <p>
 * The Service Control API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/service-control/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ServicecontrolRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Servicecontrol extends AbstractGoogleClient {
  private static final ObjectParser parser = new ProtoObjectParser();

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0-SNAPSHOT of the Google Service Control API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://servicecontrol.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Servicecontrol(com.google.api.client.http.HttpTransport transport,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Servicecontrol(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Services collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Servicecontrol servicecontrol = new Servicecontrol(...);}
   *   {@code Servicecontrol.Services.List request = servicecontrol.services().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Services services() {
    return new Services();
  }

  /**
   * The "services" collection of methods.
   */
  public class Services {

    /**
     * Checks quota, abuse status etc. to decide whether the given operation should proceed. It should
     * be called by the service before the given operation is executed.
     *
     * This method requires the `servicemanagement.services.check` permission on the specified service.
     * For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
     *
     * Create a request for the method "services.check".
     *
     * This request holds the parameters needed by the servicecontrol server.  After setting any
     * optional parameters, call the {@link Check#execute()} method to invoke the remote operation.
     *
     * @param serviceName Identity of the service. For example 'fortuneteller.example.com'.
     * @param content the {@link com.google.api.services.servicecontrol.v1.model.CheckRequest}
     * @return the request
     */
    public Check check(java.lang.String serviceName, CheckRequest content)
        throws java.io.IOException {
      Check result = new Check(serviceName, content);
      initialize(result);
      return result;
    }

    public class Check extends ServicecontrolRequest<CheckResponse> {

      private static final String REST_PATH = "v1/services/{serviceName}:check";

      /**
       * Checks quota, abuse status etc. to decide whether the given operation should proceed. It
       * should be called by the service before the given operation is executed.
       *
       * This method requires the `servicemanagement.services.check` permission on the specified
       * service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
       *
       * Create a request for the method "services.check".
       *
       * This request holds the parameters needed by the the servicecontrol server. After setting
       * any optional parameters, call the {@link Check#execute()} method to invoke the remote
       * operation.
       * <p>
       * {@link Check#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor.
       * </p>
       *
       * @param serviceName Identity of the service. For example 'fortuneteller.example.com'.
       * @param content the {@link CheckRequest}
       * @since 1.13
       */
      protected Check(java.lang.String serviceName, CheckRequest content) {
        super(Servicecontrol.this,
            "POST",
            REST_PATH,
            new ProtoHttpContent(content),
            CheckResponse.class);
        this.serviceName = com.google.api.client.util.Preconditions.checkNotNull(serviceName, "Required parameter serviceName must be specified.");
      }

      @Override
      public Check setAccessToken(java.lang.String accessToken) {
        return (Check) super.setAccessToken(accessToken);
      }

      @Override
      public Check setAlt(java.lang.String alt) {
        return (Check) super.setAlt(alt);
      }

      @Override
      public Check setBearerToken(java.lang.String bearerToken) {
        return (Check) super.setBearerToken(bearerToken);
      }

      @Override
      public Check setCallback(java.lang.String callback) {
        return (Check) super.setCallback(callback);
      }

      @Override
      public Check setFields(java.lang.String fields) {
        return (Check) super.setFields(fields);
      }

      @Override
      public Check setKey(java.lang.String key) {
        return (Check) super.setKey(key);
      }

      @Override
      public Check setOauthToken(java.lang.String oauthToken) {
        return (Check) super.setOauthToken(oauthToken);
      }

      @Override
      public Check setPp(java.lang.Boolean pp) {
        return (Check) super.setPp(pp);
      }

      @Override
      public Check setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Check) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Check setQuotaUser(java.lang.String quotaUser) {
        return (Check) super.setQuotaUser(quotaUser);
      }

      @Override
      public Check setUploadType(java.lang.String uploadType) {
        return (Check) super.setUploadType(uploadType);
      }

      @Override
      public Check setUploadProtocol(java.lang.String uploadProtocol) {
        return (Check) super.setUploadProtocol(uploadProtocol);
      }

      /** Identity of the service. For example 'fortuneteller.example.com'. */
      @com.google.api.client.util.Key
      private java.lang.String serviceName;

      /** Identity of the service. For example 'fortuneteller.example.com'.
       */
      public java.lang.String getServiceName() {
        return serviceName;
      }

      /** Identity of the service. For example 'fortuneteller.example.com'. */
      public Check setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
        return this;
      }

      @Override
      public Check set(String parameterName, Object value) {
        return (Check) super.set(parameterName, value);
      }
    }

    /**
     * Reports an operation to the service control features such as billing, logging, monitoring
     * etc. It should be called by the service after the given operation is completed.
     *
     * This method requires the `servicemanagement.services.report` permission on the specified
     * service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
     *
     * Create a request for the method "services.report".
     *
     * This request holds the parameters needed by the servicecontrol server. After setting any
     * optional parameters, call the {@link Report#execute()} method to invoke the remote operation.
     *
     * @param serviceName The service name that the following operations will be reported against.
     *        For example 'fortuneteller.example.com'.
     * @param content the {@link ReportRequest}
     * @return the request
     */
    public Report report(java.lang.String serviceName, ReportRequest content)
        throws java.io.IOException {
      Report result = new Report(serviceName, content);
      initialize(result);
      return result;
    }

    public class Report extends ServicecontrolRequest<ReportResponse> {

      private static final String REST_PATH = "v1/services/{serviceName}:report";

      /**
       * Reports an operation to the service control features such as billing, logging, monitoring etc.
       * It should be called by the service after the given operation is completed.
       *
       * This method requires the `servicemanagement.services.report` permission on the specified
       * service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
       *
       * Create a request for the method "services.report".
       *
       * This request holds the parameters needed by the the servicecontrol server.  After setting any
       * optional parameters, call the {@link Report#execute()} method to invoke the remote operation.
       * <p> {@link
       * Report#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param serviceName The service name that the following operations will be reported against.
    For example
     *        'fortuneteller.example.com'.
       * @param content the {@link com.google.api.services.servicecontrol.v1.model.ReportRequest}
       * @since 1.13
       */
      protected Report(java.lang.String serviceName, ReportRequest content) {
        super(Servicecontrol.this,
            "POST",
            REST_PATH,
            new ProtoHttpContent(content),
            ReportResponse.class);
        this.serviceName = com.google.api.client.util.Preconditions.checkNotNull(serviceName, "Required parameter serviceName must be specified.");
      }

      @Override
      public Report setAccessToken(java.lang.String accessToken) {
        return (Report) super.setAccessToken(accessToken);
      }

      @Override
      public Report setAlt(java.lang.String alt) {
        return (Report) super.setAlt(alt);
      }

      @Override
      public Report setBearerToken(java.lang.String bearerToken) {
        return (Report) super.setBearerToken(bearerToken);
      }

      @Override
      public Report setCallback(java.lang.String callback) {
        return (Report) super.setCallback(callback);
      }

      @Override
      public Report setFields(java.lang.String fields) {
        return (Report) super.setFields(fields);
      }

      @Override
      public Report setKey(java.lang.String key) {
        return (Report) super.setKey(key);
      }

      @Override
      public Report setOauthToken(java.lang.String oauthToken) {
        return (Report) super.setOauthToken(oauthToken);
      }

      @Override
      public Report setPp(java.lang.Boolean pp) {
        return (Report) super.setPp(pp);
      }

      @Override
      public Report setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Report) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Report setQuotaUser(java.lang.String quotaUser) {
        return (Report) super.setQuotaUser(quotaUser);
      }

      @Override
      public Report setUploadType(java.lang.String uploadType) {
        return (Report) super.setUploadType(uploadType);
      }

      @Override
      public Report setUploadProtocol(java.lang.String uploadProtocol) {
        return (Report) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The service name that the following operations will be reported against. For example
       * 'fortuneteller.example.com'.
       */
      @com.google.api.client.util.Key
      private java.lang.String serviceName;

      /** The service name that the following operations will be reported against. For example
     'fortuneteller.example.com'.
       */
      public java.lang.String getServiceName() {
        return serviceName;
      }

      /**
       * The service name that the following operations will be reported against. For example
       * 'fortuneteller.example.com'.
       */
      public Report setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
        return this;
      }

      @Override
      public Report set(String parameterName, Object value) {
        return (Report) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Servicecontrol}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends AbstractGoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          parser,
          httpRequestInitializer);
    }

    /** Builds a new instance of {@link Servicecontrol}. */
    @Override
    public Servicecontrol build() {
      return new Servicecontrol(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ServicecontrolRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setServicecontrolRequestInitializer(
        ServicecontrolRequestInitializer servicecontrolRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(servicecontrolRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
