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
import ch.cyberduck.core.sds.io.swagger.client.model.MfaSetupStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Contains information about the user&#x27;s MFA status
 */
@Schema(description = "Contains information about the user's MFA status")

public class UserMfaStatusResponse {
  @JsonProperty("mfaEnforced")
  private Boolean mfaEnforced = null;

  @JsonProperty("mfaSetups")
  private List<MfaSetupStatus> mfaSetups = new ArrayList<>();

  public UserMfaStatusResponse mfaEnforced(Boolean mfaEnforced) {
    this.mfaEnforced = mfaEnforced;
    return this;
  }

   /**
   * Determines whether multi-factor authentication is enforced
   * @return mfaEnforced
  **/
  @Schema(required = true, description = "Determines whether multi-factor authentication is enforced")
  public Boolean isMfaEnforced() {
    return mfaEnforced;
  }

  public void setMfaEnforced(Boolean mfaEnforced) {
    this.mfaEnforced = mfaEnforced;
  }

  public UserMfaStatusResponse mfaSetups(List<MfaSetupStatus> mfaSetups) {
    this.mfaSetups = mfaSetups;
    return this;
  }

  public UserMfaStatusResponse addMfaSetupsItem(MfaSetupStatus mfaSetupsItem) {
    this.mfaSetups.add(mfaSetupsItem);
    return this;
  }

   /**
   * Information about the second factor authentication method setup by the user
   * @return mfaSetups
  **/
  @Schema(required = true, description = "Information about the second factor authentication method setup by the user")
  public List<MfaSetupStatus> getMfaSetups() {
    return mfaSetups;
  }

  public void setMfaSetups(List<MfaSetupStatus> mfaSetups) {
    this.mfaSetups = mfaSetups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMfaStatusResponse userMfaStatusResponse = (UserMfaStatusResponse) o;
    return Objects.equals(this.mfaEnforced, userMfaStatusResponse.mfaEnforced) &&
        Objects.equals(this.mfaSetups, userMfaStatusResponse.mfaSetups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfaEnforced, mfaSetups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMfaStatusResponse {\n");
    
    sb.append("    mfaEnforced: ").append(toIndentedString(mfaEnforced)).append("\n");
    sb.append("    mfaSetups: ").append(toIndentedString(mfaSetups)).append("\n");
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
