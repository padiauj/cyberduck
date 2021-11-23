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
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import ch.cyberduck.core.sds.io.swagger.client.model.RoomData;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/**
 * Room information
 */
@Schema(description = "Room information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class RoomData {
  /**
   * Node type
   */
  public enum TypeEnum {
    ROOM("room");

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

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isGranted")
  private Boolean isGranted = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("recycleBinRetentionPeriod")
  private Integer recycleBinRetentionPeriod = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  @JsonProperty("createdAt")
  private DateTime createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("updatedAt")
  private DateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private UserInfo updatedBy = null;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("cntDownloadShares")
  private Integer cntDownloadShares = null;

  @JsonProperty("cntUploadShares")
  private Integer cntUploadShares = null;

  @JsonProperty("isFavorite")
  private Boolean isFavorite = null;

  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  @JsonProperty("children")
  private List<RoomData> children = null;

  public RoomData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @Schema(description = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RoomData id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Room ID
   * @return id
  **/
  @Schema(required = true, description = "Room ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomData isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }

   /**
   * Is user granted room permissions
   * @return isGranted
  **/
  @Schema(required = true, description = "Is user granted room permissions")
  public Boolean isIsGranted() {
    return isGranted;
  }

  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }

  public RoomData name(String name) {
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

  public RoomData isEncrypted(Boolean isEncrypted) {
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

  public RoomData recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }

   /**
   * Retention period for deleted nodes in days
   * minimum: 0
   * maximum: 9999
   * @return recycleBinRetentionPeriod
  **/
  @Schema(required = true, description = "Retention period for deleted nodes in days")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }

  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }

  public RoomData parentId(Long parentId) {
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

  public RoomData size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Room size
   * @return size
  **/
  @Schema(description = "Room size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public RoomData permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public RoomData createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Expiration date
   * @return createdAt
  **/
  @Schema(description = "Expiration date")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RoomData createdBy(UserInfo createdBy) {
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

  public RoomData updatedAt(DateTime updatedAt) {
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

  public RoomData updatedBy(UserInfo updatedBy) {
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

  public RoomData quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Quota in byte
   * @return quota
  **/
  @Schema(description = "Quota in byte")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public RoomData cntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
    return this;
  }

   /**
   * Returns the number of Download Shares of this node.
   * @return cntDownloadShares
  **/
  @Schema(description = "Returns the number of Download Shares of this node.")
  public Integer getCntDownloadShares() {
    return cntDownloadShares;
  }

  public void setCntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
  }

  public RoomData cntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
    return this;
  }

   /**
   * Returns the number of Upload Shares of this node.
   * @return cntUploadShares
  **/
  @Schema(description = "Returns the number of Upload Shares of this node.")
  public Integer getCntUploadShares() {
    return cntUploadShares;
  }

  public void setCntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
  }

  public RoomData isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Node is marked as favorite (for rooms / folders only)
   * @return isFavorite
  **/
  @Schema(description = "Node is marked as favorite (for rooms / folders only)")
  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public RoomData hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).
   * @return hasRecycleBin
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).")
  public Boolean isHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }

  public RoomData children(List<RoomData> children) {
    this.children = children;
    return this;
  }

  public RoomData addChildrenItem(RoomData childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.10.0  List of rooms, where this room is a parent (if exist)
   * @return children
  **/
  @Schema(description = "&#128679; Deprecated since v4.10.0  List of rooms, where this room is a parent (if exist)")
  public List<RoomData> getChildren() {
    return children;
  }

  public void setChildren(List<RoomData> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomData roomData = (RoomData) o;
    return Objects.equals(this.type, roomData.type) &&
        Objects.equals(this.id, roomData.id) &&
        Objects.equals(this.isGranted, roomData.isGranted) &&
        Objects.equals(this.name, roomData.name) &&
        Objects.equals(this.isEncrypted, roomData.isEncrypted) &&
        Objects.equals(this.recycleBinRetentionPeriod, roomData.recycleBinRetentionPeriod) &&
        Objects.equals(this.parentId, roomData.parentId) &&
        Objects.equals(this.size, roomData.size) &&
        Objects.equals(this.permissions, roomData.permissions) &&
        Objects.equals(this.createdAt, roomData.createdAt) &&
        Objects.equals(this.createdBy, roomData.createdBy) &&
        Objects.equals(this.updatedAt, roomData.updatedAt) &&
        Objects.equals(this.updatedBy, roomData.updatedBy) &&
        Objects.equals(this.quota, roomData.quota) &&
        Objects.equals(this.cntDownloadShares, roomData.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, roomData.cntUploadShares) &&
        Objects.equals(this.isFavorite, roomData.isFavorite) &&
        Objects.equals(this.hasRecycleBin, roomData.hasRecycleBin) &&
        Objects.equals(this.children, roomData.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, isGranted, name, isEncrypted, recycleBinRetentionPeriod, parentId, size, permissions, createdAt, createdBy, updatedAt, updatedBy, quota, cntDownloadShares, cntUploadShares, isFavorite, hasRecycleBin, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
