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
import ch.cyberduck.core.sds.io.swagger.client.model.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * S3 file upload status information
 */
@Schema(description = "S3 file upload status information")

public class S3ShareUploadStatus {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("errorDetails")
  private ErrorResponse errorDetails = null;

  public S3ShareUploadStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * S3 file upload status:  * &#x60;transfer&#x60; - upload in progress  * &#x60;finishing&#x60; - completing file upload  * &#x60;done&#x60; - file upload successully done  * &#x60;error&#x60; - an error occurred while file upload
   * @return status
  **/
  @Schema(required = true, description = "S3 file upload status:  * `transfer` - upload in progress  * `finishing` - completing file upload  * `done` - file upload successully done  * `error` - an error occurred while file upload")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public S3ShareUploadStatus fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name
   * @return fileName
  **/
  @Schema(required = true, description = "File name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public S3ShareUploadStatus size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size in byte
   * @return size
  **/
  @Schema(description = "File size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public S3ShareUploadStatus errorDetails(ErrorResponse errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @Schema(description = "")
  public ErrorResponse getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorResponse errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3ShareUploadStatus s3ShareUploadStatus = (S3ShareUploadStatus) o;
    return Objects.equals(this.status, s3ShareUploadStatus.status) &&
        Objects.equals(this.fileName, s3ShareUploadStatus.fileName) &&
        Objects.equals(this.size, s3ShareUploadStatus.size) &&
        Objects.equals(this.errorDetails, s3ShareUploadStatus.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fileName, size, errorDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3ShareUploadStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
