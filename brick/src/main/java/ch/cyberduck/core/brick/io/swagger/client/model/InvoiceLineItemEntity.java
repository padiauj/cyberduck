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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * InvoiceLineItemEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-30T21:29:25.490+02:00")
public class InvoiceLineItemEntity {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Invoice line item type
   */
  public enum TypeEnum {
    INVOICE("invoice"),
    
    ADJUSTMENT("adjustment"),
    
    USAGE_OVERAGE("usage_overage"),
    
    USER_OVERAGE("user_overage"),
    
    ADDON_SUBSCRIPTION("addon_subscription"),
    
    MISC_FEE("misc_fee");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("service_end_at")
  private DateTime serviceEndAt = null;

  @JsonProperty("service_start_at")
  private DateTime serviceStartAt = null;

  @JsonProperty("updated_at")
  private DateTime updatedAt = null;

  @JsonProperty("plan")
  private String plan = null;

  @JsonProperty("site")
  private String site = null;

  public InvoiceLineItemEntity amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Invoice line item amount
   * @return amount
  **/
  @ApiModelProperty(example = "1.0", value = "Invoice line item amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InvoiceLineItemEntity createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Invoice line item created at date/time
   * @return createdAt
  **/
  @ApiModelProperty(example = "2000-01-01T01:00:00Z", value = "Invoice line item created at date/time")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InvoiceLineItemEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Invoice line item description
   * @return description
  **/
  @ApiModelProperty(example = "Service from 2019-01-01 through 2019-12-31", value = "Invoice line item description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceLineItemEntity type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Invoice line item type
   * @return type
  **/
  @ApiModelProperty(example = "invoice", value = "Invoice line item type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InvoiceLineItemEntity serviceEndAt(DateTime serviceEndAt) {
    this.serviceEndAt = serviceEndAt;
    return this;
  }

   /**
   * Invoice line item service end date/time
   * @return serviceEndAt
  **/
  @ApiModelProperty(example = "2000-01-01T01:00:00Z", value = "Invoice line item service end date/time")
  public DateTime getServiceEndAt() {
    return serviceEndAt;
  }

  public void setServiceEndAt(DateTime serviceEndAt) {
    this.serviceEndAt = serviceEndAt;
  }

  public InvoiceLineItemEntity serviceStartAt(DateTime serviceStartAt) {
    this.serviceStartAt = serviceStartAt;
    return this;
  }

   /**
   * Invoice line item service start date/time
   * @return serviceStartAt
  **/
  @ApiModelProperty(example = "2000-01-01T01:00:00Z", value = "Invoice line item service start date/time")
  public DateTime getServiceStartAt() {
    return serviceStartAt;
  }

  public void setServiceStartAt(DateTime serviceStartAt) {
    this.serviceStartAt = serviceStartAt;
  }

  public InvoiceLineItemEntity updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Invoice line item updated date/time
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2000-01-01T01:00:00Z", value = "Invoice line item updated date/time")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public InvoiceLineItemEntity plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Plan name
   * @return plan
  **/
  @ApiModelProperty(example = "Enterprise", value = "Plan name")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public InvoiceLineItemEntity site(String site) {
    this.site = site;
    return this;
  }

   /**
   * Site name
   * @return site
  **/
  @ApiModelProperty(example = "My site", value = "Site name")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLineItemEntity invoiceLineItemEntity = (InvoiceLineItemEntity) o;
    return Objects.equals(this.amount, invoiceLineItemEntity.amount) &&
        Objects.equals(this.createdAt, invoiceLineItemEntity.createdAt) &&
        Objects.equals(this.description, invoiceLineItemEntity.description) &&
        Objects.equals(this.type, invoiceLineItemEntity.type) &&
        Objects.equals(this.serviceEndAt, invoiceLineItemEntity.serviceEndAt) &&
        Objects.equals(this.serviceStartAt, invoiceLineItemEntity.serviceStartAt) &&
        Objects.equals(this.updatedAt, invoiceLineItemEntity.updatedAt) &&
        Objects.equals(this.plan, invoiceLineItemEntity.plan) &&
        Objects.equals(this.site, invoiceLineItemEntity.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, description, type, serviceEndAt, serviceStartAt, updatedAt, plan, site);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLineItemEntity {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceEndAt: ").append(toIndentedString(serviceEndAt)).append("\n");
    sb.append("    serviceStartAt: ").append(toIndentedString(serviceStartAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

