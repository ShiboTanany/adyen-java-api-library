/*
 * Fund API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Fund API provides endpoints for managing the funds in the accounts on your platform. These management operations include, for example, the transfer of funds from one account to another, the payout of funds to an account holder, and the retrieval of balances in an account.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Fund API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Fund/v6/accountHolderBalance ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayfund;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayfund.Amount;
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
 * RefundFundsTransferRequest
 */
@JsonPropertyOrder({
  RefundFundsTransferRequest.JSON_PROPERTY_AMOUNT,
  RefundFundsTransferRequest.JSON_PROPERTY_MERCHANT_REFERENCE,
  RefundFundsTransferRequest.JSON_PROPERTY_ORIGINAL_REFERENCE
})

public class RefundFundsTransferRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_ORIGINAL_REFERENCE = "originalReference";
  private String originalReference;

  public RefundFundsTransferRequest() { 
  }

  public RefundFundsTransferRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public RefundFundsTransferRequest merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * A value that can be supplied at the discretion of the executing user in order to link multiple transactions to one another.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "A value that can be supplied at the discretion of the executing user in order to link multiple transactions to one another.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public RefundFundsTransferRequest originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

   /**
   * A PSP reference of the original fund transfer.
   * @return originalReference
  **/
  @ApiModelProperty(required = true, value = "A PSP reference of the original fund transfer.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalReference() {
    return originalReference;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  /**
   * Return true if this RefundFundsTransferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundFundsTransferRequest refundFundsTransferRequest = (RefundFundsTransferRequest) o;
    return Objects.equals(this.amount, refundFundsTransferRequest.amount) &&
        Objects.equals(this.merchantReference, refundFundsTransferRequest.merchantReference) &&
        Objects.equals(this.originalReference, refundFundsTransferRequest.originalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, merchantReference, originalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundFundsTransferRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
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
   * Create an instance of RefundFundsTransferRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RefundFundsTransferRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to RefundFundsTransferRequest
   */
  public static RefundFundsTransferRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RefundFundsTransferRequest.class);
  }
/**
  * Convert an instance of RefundFundsTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
