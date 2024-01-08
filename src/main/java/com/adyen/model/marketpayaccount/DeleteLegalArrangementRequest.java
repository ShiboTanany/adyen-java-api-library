/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayaccount.LegalArrangementRequest;
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
 * DeleteLegalArrangementRequest
 */
@JsonPropertyOrder({
  DeleteLegalArrangementRequest.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  DeleteLegalArrangementRequest.JSON_PROPERTY_LEGAL_ARRANGEMENTS
})

public class DeleteLegalArrangementRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_LEGAL_ARRANGEMENTS = "legalArrangements";
  private List<LegalArrangementRequest> legalArrangements = new ArrayList<>();

  public DeleteLegalArrangementRequest() { 
  }

  public DeleteLegalArrangementRequest accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the account holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(required = true, value = "The code of the account holder.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public DeleteLegalArrangementRequest legalArrangements(List<LegalArrangementRequest> legalArrangements) {
    this.legalArrangements = legalArrangements;
    return this;
  }

  public DeleteLegalArrangementRequest addLegalArrangementsItem(LegalArrangementRequest legalArrangementsItem) {
    this.legalArrangements.add(legalArrangementsItem);
    return this;
  }

   /**
   * List of legal arrangements.
   * @return legalArrangements
  **/
  @ApiModelProperty(required = true, value = "List of legal arrangements.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ARRANGEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LegalArrangementRequest> getLegalArrangements() {
    return legalArrangements;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ARRANGEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalArrangements(List<LegalArrangementRequest> legalArrangements) {
    this.legalArrangements = legalArrangements;
  }


  /**
   * Return true if this DeleteLegalArrangementRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteLegalArrangementRequest deleteLegalArrangementRequest = (DeleteLegalArrangementRequest) o;
    return Objects.equals(this.accountHolderCode, deleteLegalArrangementRequest.accountHolderCode) &&
        Objects.equals(this.legalArrangements, deleteLegalArrangementRequest.legalArrangements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, legalArrangements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteLegalArrangementRequest {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    legalArrangements: ").append(toIndentedString(legalArrangements)).append("\n");
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
   * Create an instance of DeleteLegalArrangementRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteLegalArrangementRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to DeleteLegalArrangementRequest
   */
  public static DeleteLegalArrangementRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DeleteLegalArrangementRequest.class);
  }
/**
  * Convert an instance of DeleteLegalArrangementRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
