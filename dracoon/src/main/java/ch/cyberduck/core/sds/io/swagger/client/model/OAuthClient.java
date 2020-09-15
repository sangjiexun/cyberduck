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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OAuth client information
 */
@Schema(description = "OAuth client information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-11T16:33:00.814633+02:00[Europe/Zurich]")
public class OAuthClient {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("clientName")
  private String clientName = null;

  /**
   * Determines whether client is a confidential or public client.
   */
  public enum ClientTypeEnum {
    CONFIDENTIAL("confidential"),
    PUBLIC("public");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClientTypeEnum fromValue(String text) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("clientType")
  private ClientTypeEnum clientType = null;

  @JsonProperty("isStandard")
  private Boolean isStandard = null;

  @JsonProperty("isExternal")
  private Boolean isExternal = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  /**
   * Authorized grant types  * &#x60;authorization_code&#x60;  * &#x60;implicit&#x60;  * &#x60;password&#x60;  * &#x60;client_credentials&#x60;  * &#x60;refresh_token&#x60;    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)
   */
  public enum GrantTypesEnum {
    AUTHORIZATION_CODE("authorization_code"),
    CLIENT_CREDENTIALS("client_credentials"),
    IMPLICIT("implicit"),
    PASSWORD("password"),
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypesEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static GrantTypesEnum fromValue(String text) {
      for (GrantTypesEnum b : GrantTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("grantTypes")
  private List<GrantTypesEnum> grantTypes = new ArrayList<>();

  @JsonProperty("redirectUris")
  private List<String> redirectUris = null;

  @JsonProperty("accessTokenValidity")
  private Integer accessTokenValidity = null;

  @JsonProperty("refreshTokenValidity")
  private Integer refreshTokenValidity = null;

  @JsonProperty("approvalValidity")
  private Integer approvalValidity = null;

  public OAuthClient clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ID of the OAuth client
   * @return clientId
  **/
  @Schema(required = true, description = "ID of the OAuth client")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthClient clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Secret, which client uses at authentication.
   * @return clientSecret
  **/
  @Schema(description = "Secret, which client uses at authentication.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuthClient clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Name, which is shown at the client configuration and authorization.
   * @return clientName
  **/
  @Schema(description = "Name, which is shown at the client configuration and authorization.")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OAuthClient clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Determines whether client is a confidential or public client.
   * @return clientType
  **/
  @Schema(description = "Determines whether client is a confidential or public client.")
  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public OAuthClient isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Determines whether client is a standard client.
   * @return isStandard
  **/
  @Schema(description = "Determines whether client is a standard client.")
  public Boolean isIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public OAuthClient isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Determines whether client is an external client.
   * @return isExternal
  **/
  @Schema(description = "Determines whether client is an external client.")
  public Boolean isIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public OAuthClient isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Determines whether client is enabled.
   * @return isEnabled
  **/
  @Schema(description = "Determines whether client is enabled.")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public OAuthClient grantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public OAuthClient addGrantTypesItem(GrantTypesEnum grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * Authorized grant types  * &#x60;authorization_code&#x60;  * &#x60;implicit&#x60;  * &#x60;password&#x60;  * &#x60;client_credentials&#x60;  * &#x60;refresh_token&#x60;    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)
   * @return grantTypes
  **/
  @Schema(required = true, description = "Authorized grant types  * `authorization_code`  * `implicit`  * `password`  * `client_credentials`  * `refresh_token`    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)")
  public List<GrantTypesEnum> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OAuthClient redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuthClient addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * URIs, to which a user is redirected after authorization.
   * @return redirectUris
  **/
  @Schema(description = "URIs, to which a user is redirected after authorization.")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OAuthClient accessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
    return this;
  }

   /**
   * Validity of the access token in seconds.
   * @return accessTokenValidity
  **/
  @Schema(description = "Validity of the access token in seconds.")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }

  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  public OAuthClient refreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
    return this;
  }

   /**
   * Validity of the refresh token in seconds.
   * @return refreshTokenValidity
  **/
  @Schema(description = "Validity of the refresh token in seconds.")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }

  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  public OAuthClient approvalValidity(Integer approvalValidity) {
    this.approvalValidity = approvalValidity;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Validity of the approval interval in seconds.
   * @return approvalValidity
  **/
  @Schema(description = "&#128640; Since v4.22.0  Validity of the approval interval in seconds.")
  public Integer getApprovalValidity() {
    return approvalValidity;
  }

  public void setApprovalValidity(Integer approvalValidity) {
    this.approvalValidity = approvalValidity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClient oauthClient = (OAuthClient) o;
    return Objects.equals(this.clientId, oauthClient.clientId) &&
        Objects.equals(this.clientSecret, oauthClient.clientSecret) &&
        Objects.equals(this.clientName, oauthClient.clientName) &&
        Objects.equals(this.clientType, oauthClient.clientType) &&
        Objects.equals(this.isStandard, oauthClient.isStandard) &&
        Objects.equals(this.isExternal, oauthClient.isExternal) &&
        Objects.equals(this.isEnabled, oauthClient.isEnabled) &&
        Objects.equals(this.grantTypes, oauthClient.grantTypes) &&
        Objects.equals(this.redirectUris, oauthClient.redirectUris) &&
        Objects.equals(this.accessTokenValidity, oauthClient.accessTokenValidity) &&
        Objects.equals(this.refreshTokenValidity, oauthClient.refreshTokenValidity) &&
        Objects.equals(this.approvalValidity, oauthClient.approvalValidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, clientName, clientType, isStandard, isExternal, isEnabled, grantTypes, redirectUris, accessTokenValidity, refreshTokenValidity, approvalValidity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClient {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
    sb.append("    approvalValidity: ").append(toIndentedString(approvalValidity)).append("\n");
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
