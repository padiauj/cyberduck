/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.45.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.UserKeyPairContainer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Request model for handling encryption settings for a room
 */
@Schema(description = "Request model for handling encryption settings for a room")

public class EncryptRoomRequest {
  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("useDataSpaceRescueKey")
  private Boolean useDataSpaceRescueKey = null;

  @JsonProperty("dataRoomRescueKey")
  private UserKeyPairContainer dataRoomRescueKey = null;

  public EncryptRoomRequest isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Encryption state
   * @return isEncrypted
  **/
  @Schema(required = true, description = "Encryption state")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public EncryptRoomRequest useDataSpaceRescueKey(Boolean useDataSpaceRescueKey) {
    this.useDataSpaceRescueKey = useDataSpaceRescueKey;
    return this;
  }

   /**
   * Use system emergency password (rescue key) for files in this room
   * @return useDataSpaceRescueKey
  **/
  @Schema(description = "Use system emergency password (rescue key) for files in this room")
  public Boolean isUseDataSpaceRescueKey() {
    return useDataSpaceRescueKey;
  }

  public void setUseDataSpaceRescueKey(Boolean useDataSpaceRescueKey) {
    this.useDataSpaceRescueKey = useDataSpaceRescueKey;
  }

  public EncryptRoomRequest dataRoomRescueKey(UserKeyPairContainer dataRoomRescueKey) {
    this.dataRoomRescueKey = dataRoomRescueKey;
    return this;
  }

   /**
   * Get dataRoomRescueKey
   * @return dataRoomRescueKey
  **/
  @Schema(description = "")
  public UserKeyPairContainer getDataRoomRescueKey() {
    return dataRoomRescueKey;
  }

  public void setDataRoomRescueKey(UserKeyPairContainer dataRoomRescueKey) {
    this.dataRoomRescueKey = dataRoomRescueKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptRoomRequest encryptRoomRequest = (EncryptRoomRequest) o;
    return Objects.equals(this.isEncrypted, encryptRoomRequest.isEncrypted) &&
        Objects.equals(this.useDataSpaceRescueKey, encryptRoomRequest.useDataSpaceRescueKey) &&
        Objects.equals(this.dataRoomRescueKey, encryptRoomRequest.dataRoomRescueKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEncrypted, useDataSpaceRescueKey, dataRoomRescueKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptRoomRequest {\n");
    
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    useDataSpaceRescueKey: ").append(toIndentedString(useDataSpaceRescueKey)).append("\n");
    sb.append("    dataRoomRescueKey: ").append(toIndentedString(dataRoomRescueKey)).append("\n");
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
