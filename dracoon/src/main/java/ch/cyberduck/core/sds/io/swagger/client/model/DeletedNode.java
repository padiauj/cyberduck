/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * Deleted node information (Deleted node can be a folder or file)
 */
@Schema(description = "Deleted node information (Deleted node can be a folder or file)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class DeletedNode {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  /**
   * Node type
   */
  public enum TypeEnum {
    FOLDER("folder"),
    FILE("file");

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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("expireAt")
  private DateTime expireAt = null;

  @JsonProperty("accessedAt")
  private DateTime accessedAt = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("size")
  private Long size = null;

  /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    (default: classification from parent room)
   */
  public enum ClassificationEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    ClassificationEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClassificationEnum fromValue(Integer text) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("classification")
  private ClassificationEnum classification = null;

  @JsonProperty("createdAt")
  private DateTime createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("updatedAt")
  private DateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private UserInfo updatedBy = null;

  @JsonProperty("deletedAt")
  private DateTime deletedAt = null;

  @JsonProperty("deletedBy")
  private UserInfo deletedBy = null;

  public DeletedNode id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID
   * @return id
  **/
  @Schema(description = "Node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeletedNode parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent node ID (room or folder)
   * @return parentId
  **/
  @Schema(required = true, description = "Parent node ID (room or folder)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public DeletedNode parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Parent node path  &#x60;/&#x60; if node is a root node (room)
   * @return parentPath
  **/
  @Schema(required = true, description = "Parent node path  `/` if node is a root node (room)")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public DeletedNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @Schema(required = true, description = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public DeletedNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Node name
   * @return name
  **/
  @Schema(required = true, description = "Node name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeletedNode expireAt(DateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date
   * @return expireAt
  **/
  @Schema(description = "Expiration date")
  public DateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(DateTime expireAt) {
    this.expireAt = expireAt;
  }

  public DeletedNode accessedAt(DateTime accessedAt) {
    this.accessedAt = accessedAt;
    return this;
  }

   /**
   * Last access date
   * @return accessedAt
  **/
  @Schema(description = "Last access date")
  public DateTime getAccessedAt() {
    return accessedAt;
  }

  public void setAccessedAt(DateTime accessedAt) {
    this.accessedAt = accessedAt;
  }

  public DeletedNode isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Encryption state
   * @return isEncrypted
  **/
  @Schema(description = "Encryption state")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public DeletedNode notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes
   * @return notes
  **/
  @Schema(description = "User notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DeletedNode size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Node size in byte
   * @return size
  **/
  @Schema(description = "Node size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DeletedNode classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential    (default: classification from parent room)
   * @return classification
  **/
  @Schema(description = "Classification ID:  * `1` - public  * `2` - internal  * `3` - confidential  * `4` - strictly confidential    (default: classification from parent room)")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public DeletedNode createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date
   * @return createdAt
  **/
  @Schema(description = "Creation date")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DeletedNode createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public DeletedNode updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Modification date
   * @return updatedAt
  **/
  @Schema(description = "Modification date")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DeletedNode updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @Schema(description = "")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }

  public DeletedNode deletedAt(DateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Deletion date
   * @return deletedAt
  **/
  @Schema(description = "Deletion date")
  public DateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(DateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public DeletedNode deletedBy(UserInfo deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

   /**
   * Get deletedBy
   * @return deletedBy
  **/
  @Schema(description = "")
  public UserInfo getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(UserInfo deletedBy) {
    this.deletedBy = deletedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedNode deletedNode = (DeletedNode) o;
    return Objects.equals(this.id, deletedNode.id) &&
        Objects.equals(this.parentId, deletedNode.parentId) &&
        Objects.equals(this.parentPath, deletedNode.parentPath) &&
        Objects.equals(this.type, deletedNode.type) &&
        Objects.equals(this.name, deletedNode.name) &&
        Objects.equals(this.expireAt, deletedNode.expireAt) &&
        Objects.equals(this.accessedAt, deletedNode.accessedAt) &&
        Objects.equals(this.isEncrypted, deletedNode.isEncrypted) &&
        Objects.equals(this.notes, deletedNode.notes) &&
        Objects.equals(this.size, deletedNode.size) &&
        Objects.equals(this.classification, deletedNode.classification) &&
        Objects.equals(this.createdAt, deletedNode.createdAt) &&
        Objects.equals(this.createdBy, deletedNode.createdBy) &&
        Objects.equals(this.updatedAt, deletedNode.updatedAt) &&
        Objects.equals(this.updatedBy, deletedNode.updatedBy) &&
        Objects.equals(this.deletedAt, deletedNode.deletedAt) &&
        Objects.equals(this.deletedBy, deletedNode.deletedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, parentPath, type, name, expireAt, accessedAt, isEncrypted, notes, size, classification, createdAt, createdBy, updatedAt, updatedBy, deletedAt, deletedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    accessedAt: ").append(toIndentedString(accessedAt)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
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
