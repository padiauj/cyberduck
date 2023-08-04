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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * List of File Versions
 */
@Schema(description = "List of File Versions")

public class FileVersion {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  public FileVersion id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID
   * @return id
  **/
  @Schema(required = true, description = "Node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FileVersion referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference ID. Identical across all versions of a file
   * @return referenceId
  **/
  @Schema(required = true, description = "Reference ID. Identical across all versions of a file")
  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public FileVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(required = true, description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileVersion parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent node ID (room or folder)
   * @return parentId
  **/
  @Schema(description = "Parent node ID (room or folder)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public FileVersion deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersion fileVersion = (FileVersion) o;
    return Objects.equals(this.id, fileVersion.id) &&
        Objects.equals(this.referenceId, fileVersion.referenceId) &&
        Objects.equals(this.name, fileVersion.name) &&
        Objects.equals(this.parentId, fileVersion.parentId) &&
        Objects.equals(this.deleted, fileVersion.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceId, name, parentId, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
