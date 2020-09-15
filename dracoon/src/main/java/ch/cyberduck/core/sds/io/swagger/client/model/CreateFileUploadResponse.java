/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-08-05 12:38:27<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.24.0.crypto_upgrade-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Upload channel information
 */
@Schema(description = "Upload channel information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-11T16:33:00.814633+02:00[Europe/Zurich]")
public class CreateFileUploadResponse {
  @JsonProperty("uploadUrl")
  private String uploadUrl = null;

  @JsonProperty("uploadId")
  private String uploadId = null;

  @JsonProperty("token")
  private String token = null;

  public CreateFileUploadResponse uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * (public) Upload URL
   * @return uploadUrl
  **/
  @Schema(required = true, description = "(public) Upload URL")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  public CreateFileUploadResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Upload (channel) ID
   * @return uploadId
  **/
  @Schema(required = true, description = "Upload (channel) ID")
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public CreateFileUploadResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.3.0  Upload token
   * @return token
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.3.0  Upload token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadResponse createFileUploadResponse = (CreateFileUploadResponse) o;
    return Objects.equals(this.uploadUrl, createFileUploadResponse.uploadUrl) &&
        Objects.equals(this.uploadId, createFileUploadResponse.uploadId) &&
        Objects.equals(this.token, createFileUploadResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadUrl, uploadId, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadResponse {\n");
    
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
