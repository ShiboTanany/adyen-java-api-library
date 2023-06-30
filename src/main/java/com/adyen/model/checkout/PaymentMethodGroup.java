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
 * PaymentMethodGroup
 */
@JsonPropertyOrder({
  PaymentMethodGroup.JSON_PROPERTY_NAME,
  PaymentMethodGroup.JSON_PROPERTY_PAYMENT_METHOD_DATA,
  PaymentMethodGroup.JSON_PROPERTY_TYPE
})

public class PaymentMethodGroup {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_DATA = "paymentMethodData";
  private String paymentMethodData;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public PaymentMethodGroup() { 
  }

  public PaymentMethodGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the group.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the group.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PaymentMethodGroup paymentMethodData(String paymentMethodData) {
    this.paymentMethodData = paymentMethodData;
    return this;
  }

   /**
   * Echo data to be used if the payment method is displayed as part of this group.
   * @return paymentMethodData
  **/
  @ApiModelProperty(value = "Echo data to be used if the payment method is displayed as part of this group.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethodData() {
    return paymentMethodData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodData(String paymentMethodData) {
    this.paymentMethodData = paymentMethodData;
  }


  public PaymentMethodGroup type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The unique code of the group.
   * @return type
  **/
  @ApiModelProperty(value = "The unique code of the group.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this PaymentMethodGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodGroup paymentMethodGroup = (PaymentMethodGroup) o;
    return Objects.equals(this.name, paymentMethodGroup.name) &&
        Objects.equals(this.paymentMethodData, paymentMethodGroup.paymentMethodData) &&
        Objects.equals(this.type, paymentMethodGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, paymentMethodData, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethodData: ").append(toIndentedString(paymentMethodData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of PaymentMethodGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethodGroup
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentMethodGroup
   */
  public static PaymentMethodGroup fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentMethodGroup.class);
  }
/**
  * Convert an instance of PaymentMethodGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

