/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * InstallmentsNumber
 */
@JsonPropertyOrder({
  InstallmentsNumber.JSON_PROPERTY_MAX_NUMBER_OF_INSTALLMENTS
})

public class InstallmentsNumber {
  public static final String JSON_PROPERTY_MAX_NUMBER_OF_INSTALLMENTS = "maxNumberOfInstallments";
  private Integer maxNumberOfInstallments;

  public InstallmentsNumber() { 
  }

  public InstallmentsNumber maxNumberOfInstallments(Integer maxNumberOfInstallments) {
    this.maxNumberOfInstallments = maxNumberOfInstallments;
    return this;
  }

   /**
   * Maximum number of installments
   * @return maxNumberOfInstallments
  **/
  @ApiModelProperty(required = true, value = "Maximum number of installments")
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumberOfInstallments() {
    return maxNumberOfInstallments;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNumberOfInstallments(Integer maxNumberOfInstallments) {
    this.maxNumberOfInstallments = maxNumberOfInstallments;
  }


  /**
   * Return true if this InstallmentsNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentsNumber installmentsNumber = (InstallmentsNumber) o;
    return Objects.equals(this.maxNumberOfInstallments, installmentsNumber.maxNumberOfInstallments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumberOfInstallments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentsNumber {\n");
    sb.append("    maxNumberOfInstallments: ").append(toIndentedString(maxNumberOfInstallments)).append("\n");
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
   * Create an instance of InstallmentsNumber given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InstallmentsNumber
   * @throws JsonProcessingException if the JSON string is invalid with respect to InstallmentsNumber
   */
  public static InstallmentsNumber fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InstallmentsNumber.class);
  }
/**
  * Convert an instance of InstallmentsNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
