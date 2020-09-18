/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class FileLockRequest {
  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("expire")
  private DateTime expire = null;

  public FileLockRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The name of the user locking the item
   * @return owner
  **/
  @ApiModelProperty(value = "The name of the user locking the item")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public FileLockRequest expire(DateTime expire) {
    this.expire = expire;
    return this;
  }

   /**
   * The lock expire, between now and 1 year
   * @return expire
  **/
  @ApiModelProperty(value = "The lock expire, between now and 1 year")
  public DateTime getExpire() {
    return expire;
  }

  public void setExpire(DateTime expire) {
    this.expire = expire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLockRequest fileLockRequest = (FileLockRequest) o;
    return Objects.equals(this.owner, fileLockRequest.owner) &&
        Objects.equals(this.expire, fileLockRequest.expire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, expire);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLockRequest {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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

