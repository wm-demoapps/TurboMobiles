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
 * Pageable
 */

public class Pageable {
  @JsonProperty("paged")
  private Boolean paged = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("offset")
  private Long offset = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("unpaged")
  private Boolean unpaged = null;

  @JsonProperty("sort")
  private Sort sort = null;

  public Pageable paged(Boolean paged) {
    this.paged = paged;
    return this;
  }

   /**
   * Get paged
   * @return paged
  **/
  public Boolean isPaged() {
    return paged;
  }

  public void setPaged(Boolean paged) {
    this.paged = paged;
  }

  public Pageable pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Pageable offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Pageable pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Pageable unpaged(Boolean unpaged) {
    this.unpaged = unpaged;
    return this;
  }

   /**
   * Get unpaged
   * @return unpaged
  **/
  public Boolean isUnpaged() {
    return unpaged;
  }

  public void setUnpaged(Boolean unpaged) {
    this.unpaged = unpaged;
  }

  public Pageable sort(Sort sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable Pageable = (Pageable) o;
    return Objects.equals(this.paged, Pageable.paged) &&
        Objects.equals(this.pageNumber, Pageable.pageNumber) &&
        Objects.equals(this.offset, Pageable.offset) &&
        Objects.equals(this.pageSize, Pageable.pageSize) &&
        Objects.equals(this.unpaged, Pageable.unpaged) &&
        Objects.equals(this.sort, Pageable.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paged, pageNumber, offset, pageSize, unpaged, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    
    sb.append("    paged: ").append(toIndentedString(paged)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    unpaged: ").append(toIndentedString(unpaged)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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