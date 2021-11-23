/*
 * ReSTFS
 * ReSTFS Open API 3.0 Spec
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.eue.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.eue.io.swagger.client.model.ResourceCreationResponseEntryHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ResourceCopyResponseEntry
 */


public class ResourceCopyResponseEntry {
  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("headers")
  private ResourceCreationResponseEntryHeaders headers = null;

  public ResourceCopyResponseEntry statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ResourceCopyResponseEntry reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ResourceCopyResponseEntry headers(ResourceCreationResponseEntryHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Schema(description = "")
  public ResourceCreationResponseEntryHeaders getHeaders() {
    return headers;
  }

  public void setHeaders(ResourceCreationResponseEntryHeaders headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCopyResponseEntry resourceCopyResponseEntry = (ResourceCopyResponseEntry) o;
    return Objects.equals(this.statusCode, resourceCopyResponseEntry.statusCode) &&
        Objects.equals(this.reason, resourceCopyResponseEntry.reason) &&
        Objects.equals(this.headers, resourceCopyResponseEntry.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, reason, headers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCopyResponseEntry {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
