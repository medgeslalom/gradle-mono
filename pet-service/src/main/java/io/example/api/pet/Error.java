package io.example.api.pet;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Error */
@lombok.Data
public class Error {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;
}
