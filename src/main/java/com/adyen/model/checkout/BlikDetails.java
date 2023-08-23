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
 * BlikDetails
 */
@JsonPropertyOrder({
  BlikDetails.JSON_PROPERTY_BLIK_CODE,
  BlikDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  BlikDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  BlikDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  BlikDetails.JSON_PROPERTY_TYPE
})

public class BlikDetails {
  public static final String JSON_PROPERTY_BLIK_CODE = "blikCode";
  private String blikCode;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **blik**
   */
  public enum TypeEnum {
    BLIK("blik");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public BlikDetails() { 
  }

  public BlikDetails blikCode(String blikCode) {
    this.blikCode = blikCode;
    return this;
  }

   /**
   * BLIK code consisting of 6 digits.
   * @return blikCode
  **/
  @ApiModelProperty(value = "BLIK code consisting of 6 digits.")
  @JsonProperty(JSON_PROPERTY_BLIK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlikCode() {
    return blikCode;
  }


  @JsonProperty(JSON_PROPERTY_BLIK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlikCode(String blikCode) {
    this.blikCode = blikCode;
  }


  public BlikDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public BlikDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public BlikDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public BlikDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **blik**
   * @return type
  **/
  @ApiModelProperty(value = "**blik**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this BlikDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlikDetails blikDetails = (BlikDetails) o;
    return Objects.equals(this.blikCode, blikDetails.blikCode) &&
        Objects.equals(this.checkoutAttemptId, blikDetails.checkoutAttemptId) &&
        Objects.equals(this.recurringDetailReference, blikDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, blikDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, blikDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blikCode, checkoutAttemptId, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlikDetails {\n");
    sb.append("    blikCode: ").append(toIndentedString(blikCode)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of BlikDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BlikDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to BlikDetails
   */
  public static BlikDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BlikDetails.class);
  }
/**
  * Convert an instance of BlikDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
