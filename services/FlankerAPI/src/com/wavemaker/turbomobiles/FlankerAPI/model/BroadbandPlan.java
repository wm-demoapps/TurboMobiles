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
import java.util.ArrayList;
import java.util.List;
/**
 * BroadbandPlan
 */

public class BroadbandPlan {
  @JsonProperty("image")
  private String image = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isRecommended")
  private Boolean isRecommended = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("broadbandPlanFeatureses")
  private List<BroadbandPlanFeatures> broadbandPlanFeatureses = null;

  public BroadbandPlan image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public BroadbandPlan price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public BroadbandPlan name(String name) {
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

  public BroadbandPlan isRecommended(Boolean isRecommended) {
    this.isRecommended = isRecommended;
    return this;
  }

   /**
   * Get isRecommended
   * @return isRecommended
  **/
  public Boolean isIsRecommended() {
    return isRecommended;
  }

  public void setIsRecommended(Boolean isRecommended) {
    this.isRecommended = isRecommended;
  }

  public BroadbandPlan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BroadbandPlan id(Integer id) {
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

  public BroadbandPlan tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public BroadbandPlan broadbandPlanFeatureses(List<BroadbandPlanFeatures> broadbandPlanFeatureses) {
    this.broadbandPlanFeatureses = broadbandPlanFeatureses;
    return this;
  }

  public BroadbandPlan addBroadbandPlanFeaturesesItem(BroadbandPlanFeatures broadbandPlanFeaturesesItem) {
    if (this.broadbandPlanFeatureses == null) {
      this.broadbandPlanFeatureses = new ArrayList<>();
    }
    this.broadbandPlanFeatureses.add(broadbandPlanFeaturesesItem);
    return this;
  }

   /**
   * Get broadbandPlanFeatureses
   * @return broadbandPlanFeatureses
  **/
  public List<BroadbandPlanFeatures> getBroadbandPlanFeatureses() {
    return broadbandPlanFeatureses;
  }

  public void setBroadbandPlanFeatureses(List<BroadbandPlanFeatures> broadbandPlanFeatureses) {
    this.broadbandPlanFeatureses = broadbandPlanFeatureses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadbandPlan BroadbandPlan = (BroadbandPlan) o;
    return Objects.equals(this.image, BroadbandPlan.image) &&
        Objects.equals(this.price, BroadbandPlan.price) &&
        Objects.equals(this.name, BroadbandPlan.name) &&
        Objects.equals(this.isRecommended, BroadbandPlan.isRecommended) &&
        Objects.equals(this.description, BroadbandPlan.description) &&
        Objects.equals(this.id, BroadbandPlan.id) &&
        Objects.equals(this.tag, BroadbandPlan.tag) &&
        Objects.equals(this.broadbandPlanFeatureses, BroadbandPlan.broadbandPlanFeatureses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, price, name, isRecommended, description, id, tag, broadbandPlanFeatureses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadbandPlan {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRecommended: ").append(toIndentedString(isRecommended)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    broadbandPlanFeatureses: ").append(toIndentedString(broadbandPlanFeatureses)).append("\n");
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
