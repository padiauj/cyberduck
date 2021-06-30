/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.brick.io.swagger.client.model.AutoEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Create Webhook Test
 */
@ApiModel(description = "Create Webhook Test")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T21:29:25.490+02:00")
public class WebhookTestEntity {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("data")
  private AutoEntity data = null;

  @JsonProperty("success")
  private Boolean success = null;

  public WebhookTestEntity code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Status HTTP code
   * @return code
  **/
  @ApiModelProperty(example = "200", value = "Status HTTP code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public WebhookTestEntity message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(example = "", value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public WebhookTestEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status message
   * @return status
  **/
  @ApiModelProperty(example = "", value = "Status message")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WebhookTestEntity data(AutoEntity data) {
    this.data = data;
    return this;
  }

   /**
   * Additional data
   * @return data
  **/
  @ApiModelProperty(value = "Additional data")
  public AutoEntity getData() {
    return data;
  }

  public void setData(AutoEntity data) {
    this.data = data;
  }

  public WebhookTestEntity success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * The success status of the webhook test
   * @return success
  **/
  @ApiModelProperty(example = "true", value = "The success status of the webhook test")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookTestEntity webhookTestEntity = (WebhookTestEntity) o;
    return Objects.equals(this.code, webhookTestEntity.code) &&
        Objects.equals(this.message, webhookTestEntity.message) &&
        Objects.equals(this.status, webhookTestEntity.status) &&
        Objects.equals(this.data, webhookTestEntity.data) &&
        Objects.equals(this.success, webhookTestEntity.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, status, data, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookTestEntity {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

