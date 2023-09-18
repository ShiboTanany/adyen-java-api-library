/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.TransactionDescriptionInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * GenericPmWithTdiInfo
 */
@JsonPropertyOrder({
  GenericPmWithTdiInfo.JSON_PROPERTY_TRANSACTION_DESCRIPTION
})

public class GenericPmWithTdiInfo {
  public static final String JSON_PROPERTY_TRANSACTION_DESCRIPTION = "transactionDescription";
  private TransactionDescriptionInfo transactionDescription;

  public GenericPmWithTdiInfo() { 
  }

  public GenericPmWithTdiInfo transactionDescription(TransactionDescriptionInfo transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionDescriptionInfo getTransactionDescription() {
    return transactionDescription;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionDescription(TransactionDescriptionInfo transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  /**
   * Return true if this GenericPmWithTdiInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericPmWithTdiInfo genericPmWithTdiInfo = (GenericPmWithTdiInfo) o;
    return Objects.equals(this.transactionDescription, genericPmWithTdiInfo.transactionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericPmWithTdiInfo {\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of GenericPmWithTdiInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenericPmWithTdiInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to GenericPmWithTdiInfo
   */
  public static GenericPmWithTdiInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GenericPmWithTdiInfo.class);
  }
/**
  * Convert an instance of GenericPmWithTdiInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

