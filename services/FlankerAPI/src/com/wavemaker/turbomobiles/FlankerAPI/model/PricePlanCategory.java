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
 * PricePlanCategory
 */

public class PricePlanCategory {
  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("category")
  private String category = null;

  public PricePlanCategory icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public PricePlanCategory id(Integer id) {
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

  public PricePlanCategory category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricePlanCategory PricePlanCategory = (PricePlanCategory) o;
    return Objects.equals(this.icon, PricePlanCategory.icon) &&
        Objects.equals(this.id, PricePlanCategory.id) &&
        Objects.equals(this.category, PricePlanCategory.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, id, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePlanCategory {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
