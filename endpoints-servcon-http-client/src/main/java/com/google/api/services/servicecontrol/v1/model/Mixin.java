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
 * Declares an API to be included in this API. The including API must redeclare all the methods from
 * the included API, but documentation and options are inherited as follows:
 *
 * - If after comment and whitespace stripping, the documentation   string of the redeclared method
 * is empty, it will be inherited   from the original method.
 *
 * - Each annotation belonging to the service config (http,   visibility) which is not set in the
 * redeclared method will be   inherited.
 *
 * - If an http annotation is inherited, the path pattern will be   modified as follows. Any version
 * prefix will be replaced by the   version of the including API plus the root path if specified.
 *
 * Example of a simple mixin:
 *
 *     package google.acl.v1;     service AccessControl {       // Get the underlying ACL object.
 * rpc GetAcl(GetAclRequest) returns (Acl) {         option (google.api.http).get =
 * "/v1/{resource=**}:getAcl";       }     }
 *
 *     package google.storage.v2;     service Storage {       //       rpc GetAcl(GetAclRequest)
 * returns (Acl);
 *
 *       // Get a data record.       rpc GetData(GetDataRequest) returns (Data) {         option
 * (google.api.http).get = "/v2/{resource=**}";       }     }
 *
 * Example of a mixin configuration:
 *
 *     apis:     - name: google.storage.v2.Storage       mixins:       - name:
 * google.acl.v1.AccessControl
 *
 * The mixin construct implies that all methods in `AccessControl` are also declared with same name
 * and request/response types in `Storage`. A documentation generator or annotation processor will
 * see the effective `Storage.GetAcl` method after inherting documentation and annotations as
 * follows:
 *
 *     service Storage {       // Get the underlying ACL object.       rpc GetAcl(GetAclRequest)
 * returns (Acl) {         option (google.api.http).get = "/v2/{resource=**}:getAcl";       }
 * ...     }
 *
 * Note how the version in the path pattern changed from `v1` to `v2`.
 *
 * If the `root` field in the mixin is specified, it should be a relative path under which inherited
 * HTTP paths are placed. Example:
 *
 *     apis:     - name: google.storage.v2.Storage       mixins:       - name:
 * google.acl.v1.AccessControl         root: acls
 *
 * This implies the following inherited HTTP annotation:
 *
 *     service Storage {       // Get the underlying ACL object.       rpc GetAcl(GetAclRequest)
 * returns (Acl) {         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";       }
 * ...     }
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
public final class Mixin extends com.google.api.client.json.GenericJson {

  /**
   * The fully qualified name of the API which is included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If non-empty specifies a path under which inherited HTTP paths are rooted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String root;

  /**
   * The fully qualified name of the API which is included.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified name of the API which is included.
   * @param name name or {@code null} for none
   */
  public Mixin setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If non-empty specifies a path under which inherited HTTP paths are rooted.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoot() {
    return root;
  }

  /**
   * If non-empty specifies a path under which inherited HTTP paths are rooted.
   * @param root root or {@code null} for none
   */
  public Mixin setRoot(java.lang.String root) {
    this.root = root;
    return this;
  }

  @Override
  public Mixin set(String fieldName, Object value) {
    return (Mixin) super.set(fieldName, value);
  }

  @Override
  public Mixin clone() {
    return (Mixin) super.clone();
  }

}
