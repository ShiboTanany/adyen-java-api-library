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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TimeOfDay
 */
@JsonPropertyOrder({
  TimeOfDay.JSON_PROPERTY_END_TIME,
  TimeOfDay.JSON_PROPERTY_START_TIME
})

public class TimeOfDay {
  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public TimeOfDay() { 
  }

  public TimeOfDay endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time in a time-only ISO-8601 extended offset format. For example: **08:00:00+02:00**, **22:30:00-03:00**.  
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time in a time-only ISO-8601 extended offset format. For example: **08:00:00+02:00**, **22:30:00-03:00**.  ")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public TimeOfDay startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time in a time-only ISO-8601 extended offset format. For example: **08:00:00+02:00**, **22:30:00-03:00**.  
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time in a time-only ISO-8601 extended offset format. For example: **08:00:00+02:00**, **22:30:00-03:00**.  ")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  /**
   * Return true if this TimeOfDay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOfDay timeOfDay = (TimeOfDay) o;
    return Objects.equals(this.endTime, timeOfDay.endTime) &&
        Objects.equals(this.startTime, timeOfDay.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOfDay {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
   * Create an instance of TimeOfDay given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeOfDay
   * @throws JsonProcessingException if the JSON string is invalid with respect to TimeOfDay
   */
  public static TimeOfDay fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TimeOfDay.class);
  }
/**
  * Convert an instance of TimeOfDay to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
