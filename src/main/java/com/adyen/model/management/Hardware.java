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
 * Hardware
 */
@JsonPropertyOrder({
  Hardware.JSON_PROPERTY_DISPLAY_MAXIMUM_BACK_LIGHT,
  Hardware.JSON_PROPERTY_RESTART_HOUR
})

public class Hardware {
  public static final String JSON_PROPERTY_DISPLAY_MAXIMUM_BACK_LIGHT = "displayMaximumBackLight";
  private Integer displayMaximumBackLight;

  public static final String JSON_PROPERTY_RESTART_HOUR = "restartHour";
  private Integer restartHour;

  public Hardware() { 
  }

  public Hardware displayMaximumBackLight(Integer displayMaximumBackLight) {
    this.displayMaximumBackLight = displayMaximumBackLight;
    return this;
  }

   /**
   * The brightness of the display when the terminal is being used, expressed as a percentage.
   * @return displayMaximumBackLight
  **/
  @ApiModelProperty(value = "The brightness of the display when the terminal is being used, expressed as a percentage.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_MAXIMUM_BACK_LIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisplayMaximumBackLight() {
    return displayMaximumBackLight;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_MAXIMUM_BACK_LIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayMaximumBackLight(Integer displayMaximumBackLight) {
    this.displayMaximumBackLight = displayMaximumBackLight;
  }


  public Hardware restartHour(Integer restartHour) {
    this.restartHour = restartHour;
    return this;
  }

   /**
   * The hour (0 - 23) in which the device will reboot, reboot will happen in the timezone of the device
   * @return restartHour
  **/
  @ApiModelProperty(value = "The hour (0 - 23) in which the device will reboot, reboot will happen in the timezone of the device")
  @JsonProperty(JSON_PROPERTY_RESTART_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRestartHour() {
    return restartHour;
  }


  @JsonProperty(JSON_PROPERTY_RESTART_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestartHour(Integer restartHour) {
    this.restartHour = restartHour;
  }


  /**
   * Return true if this Hardware object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hardware hardware = (Hardware) o;
    return Objects.equals(this.displayMaximumBackLight, hardware.displayMaximumBackLight) &&
        Objects.equals(this.restartHour, hardware.restartHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayMaximumBackLight, restartHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hardware {\n");
    sb.append("    displayMaximumBackLight: ").append(toIndentedString(displayMaximumBackLight)).append("\n");
    sb.append("    restartHour: ").append(toIndentedString(restartHour)).append("\n");
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
   * Create an instance of Hardware given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Hardware
   * @throws JsonProcessingException if the JSON string is invalid with respect to Hardware
   */
  public static Hardware fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Hardware.class);
  }
/**
  * Convert an instance of Hardware to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
