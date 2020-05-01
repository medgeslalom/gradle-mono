package io.example.api.pet;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

/** A pet in the store */
@ApiModel(description = "A pet in the store")
@lombok.Data
public class Pet {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tag")
  private String tag;
}
