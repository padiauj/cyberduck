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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * List Message Reactions
 */
@Schema(description = "List Message Reactions")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T22:25:43.390877+02:00[Europe/Paris]")
public class MessageReactionEntity {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("emoji")
  private String emoji = null;

  public MessageReactionEntity id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Reaction ID
   * @return id
  **/
  @Schema(example = "1", description = "Reaction ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessageReactionEntity emoji(String emoji) {
    this.emoji = emoji;
    return this;
  }

   /**
   * Emoji used in the reaction.
   * @return emoji
  **/
  @Schema(example = "👍", description = "Emoji used in the reaction.")
  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageReactionEntity messageReactionEntity = (MessageReactionEntity) o;
    return Objects.equals(this.id, messageReactionEntity.id) &&
        Objects.equals(this.emoji, messageReactionEntity.emoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emoji);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageReactionEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
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
