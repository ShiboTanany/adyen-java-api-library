/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BrandVariantsRestriction
 */
@JsonPropertyOrder({
  BrandVariantsRestriction.JSON_PROPERTY_OPERATION,
  BrandVariantsRestriction.JSON_PROPERTY_VALUE
})

public class BrandVariantsRestriction {
  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<String> value = null;

  public BrandVariantsRestriction() { 
  }

  public BrandVariantsRestriction operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Defines how the condition must be evaluated.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "Defines how the condition must be evaluated.")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public BrandVariantsRestriction value(List<String> value) {
    this.value = value;
    return this;
  }

  public BrandVariantsRestriction addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * List of card brand variants.  Possible values:   - **mc**, **mccredit**, **mccommercialcredit_b2b**, **mcdebit**, **mcbusinessdebit**, **mcbusinessworlddebit**, **mcprepaid**, **mcmaestro**   - **visa**, **visacredit**, **visadebit**, **visaprepaid**.  You can specify a rule for a generic variant. For example, to create a rule for all Mastercard payment instruments, use **mc**. The rule is applied to all payment instruments under **mc**, such as **mcbusinessdebit** and **mcdebit**.  
   * @return value
  **/
  @ApiModelProperty(value = "List of card brand variants.  Possible values:   - **mc**, **mccredit**, **mccommercialcredit_b2b**, **mcdebit**, **mcbusinessdebit**, **mcbusinessworlddebit**, **mcprepaid**, **mcmaestro**   - **visa**, **visacredit**, **visadebit**, **visaprepaid**.  You can specify a rule for a generic variant. For example, to create a rule for all Mastercard payment instruments, use **mc**. The rule is applied to all payment instruments under **mc**, such as **mcbusinessdebit** and **mcdebit**.  ")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(List<String> value) {
    this.value = value;
  }


  /**
   * Return true if this BrandVariantsRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandVariantsRestriction brandVariantsRestriction = (BrandVariantsRestriction) o;
    return Objects.equals(this.operation, brandVariantsRestriction.operation) &&
        Objects.equals(this.value, brandVariantsRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandVariantsRestriction {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of BrandVariantsRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrandVariantsRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to BrandVariantsRestriction
   */
  public static BrandVariantsRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BrandVariantsRestriction.class);
  }
/**
  * Convert an instance of BrandVariantsRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
