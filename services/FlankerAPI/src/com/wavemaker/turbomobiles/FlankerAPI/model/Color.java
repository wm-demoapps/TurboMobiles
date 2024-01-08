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
 * Color
 */

public class Color {
  @JsonProperty("hexcode")
  private String hexcode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private Integer id = null;

  public Color hexcode(String hexcode) {
    this.hexcode = hexcode;
    return this;
  }

   /**
   * Get hexcode
   * @return hexcode
  **/
  public String getHexcode() {
    return hexcode;
  }

  public void setHexcode(String hexcode) {
    this.hexcode = hexcode;
  }

  public Color name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Color id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color Color = (Color) o;
    return Objects.equals(this.hexcode, Color.hexcode) &&
        Objects.equals(this.name, Color.name) &&
        Objects.equals(this.id, Color.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexcode, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    
    sb.append("    hexcode: ").append(toIndentedString(hexcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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