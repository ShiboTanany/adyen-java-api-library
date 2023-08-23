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
import com.adyen.model.balanceplatform.InvalidField;
import com.adyen.model.balanceplatform.JSONObject;
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
 * RestServiceError
 */
@JsonPropertyOrder({
  RestServiceError.JSON_PROPERTY_DETAIL,
  RestServiceError.JSON_PROPERTY_ERROR_CODE,
  RestServiceError.JSON_PROPERTY_INSTANCE,
  RestServiceError.JSON_PROPERTY_INVALID_FIELDS,
  RestServiceError.JSON_PROPERTY_REQUEST_ID,
  RestServiceError.JSON_PROPERTY_RESPONSE,
  RestServiceError.JSON_PROPERTY_STATUS,
  RestServiceError.JSON_PROPERTY_TITLE,
  RestServiceError.JSON_PROPERTY_TYPE
})

public class RestServiceError {
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private String instance;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<InvalidField> invalidFields = null;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private JSONObject response;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RestServiceError() { 
  }

  public RestServiceError detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "A human-readable explanation specific to this occurrence of the problem.")
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  public RestServiceError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A code that identifies the problem type.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "A code that identifies the problem type.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RestServiceError instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * A unique URI that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @ApiModelProperty(value = "A unique URI that identifies the specific occurrence of the problem.")
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(String instance) {
    this.instance = instance;
  }


  public RestServiceError invalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public RestServiceError addInvalidFieldsItem(InvalidField invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Detailed explanation of each validation error, when applicable.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "Detailed explanation of each validation error, when applicable.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InvalidField> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public RestServiceError requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   * @return requestId
  **/
  @ApiModelProperty(value = "A unique reference for the request, essentially the same as `pspReference`.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public RestServiceError response(JSONObject response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JSONObject getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(JSONObject response) {
    this.response = response;
  }


  public RestServiceError status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The HTTP status code.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public RestServiceError title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A short, human-readable summary of the problem type.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public RestServiceError type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "A URI that identifies the problem type, pointing to human-readable documentation on this problem type.")
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
   * Return true if this RestServiceError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestServiceError restServiceError = (RestServiceError) o;
    return Objects.equals(this.detail, restServiceError.detail) &&
        Objects.equals(this.errorCode, restServiceError.errorCode) &&
        Objects.equals(this.instance, restServiceError.instance) &&
        Objects.equals(this.invalidFields, restServiceError.invalidFields) &&
        Objects.equals(this.requestId, restServiceError.requestId) &&
        Objects.equals(this.response, restServiceError.response) &&
        Objects.equals(this.status, restServiceError.status) &&
        Objects.equals(this.title, restServiceError.title) &&
        Objects.equals(this.type, restServiceError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, errorCode, instance, invalidFields, requestId, response, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestServiceError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
   * Create an instance of RestServiceError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RestServiceError
   * @throws JsonProcessingException if the JSON string is invalid with respect to RestServiceError
   */
  public static RestServiceError fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RestServiceError.class);
  }
/**
  * Convert an instance of RestServiceError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
