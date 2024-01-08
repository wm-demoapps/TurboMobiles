/*
 * flanker_dbService Swagger Documentation
 * Swagger API documentation for flanker_db
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.wavemaker.turbomobiles.FlankerAPI.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Downloadable
 */

public class Downloadable {
  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("inline")
  private Boolean inline = null;

  @JsonProperty("contents")
  private InputStream contents = null;

  @JsonProperty("contentLength")
  private Integer contentLength = null;

  @JsonProperty("contentType")
  private String contentType = null;

  public Downloadable fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Downloadable inline(Boolean inline) {
    this.inline = inline;
    return this;
  }

   /**
   * Get inline
   * @return inline
  **/
  public Boolean isInline() {
    return inline;
  }

  public void setInline(Boolean inline) {
    this.inline = inline;
  }

  public Downloadable contents(InputStream contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  public InputStream getContents() {
    return contents;
  }

  public void setContents(InputStream contents) {
    this.contents = contents;
  }

  public Downloadable contentLength(Integer contentLength) {
    this.contentLength = contentLength;
    return this;
  }

   /**
   * Get contentLength
   * @return contentLength
  **/
  public Integer getContentLength() {
    return contentLength;
  }

  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }

  public Downloadable contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Downloadable Downloadable = (Downloadable) o;
    return Objects.equals(this.fileName, Downloadable.fileName) &&
        Objects.equals(this.inline, Downloadable.inline) &&
        Objects.equals(this.contents, Downloadable.contents) &&
        Objects.equals(this.contentLength, Downloadable.contentLength) &&
        Objects.equals(this.contentType, Downloadable.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, inline, contents, contentLength, contentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Downloadable {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
