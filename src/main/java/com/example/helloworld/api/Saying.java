package com.example.helloworld.api;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying
{
  private long id;

  @Length(max = 3)
  private String content;

  public Saying(long id, String content) {
    this.id = id;
    this.content = content;
  }

  @JsonProperty
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @JsonProperty
  public long getId() {
    return id;

  }

  public void setId(long id) {
    this.id = id;
  }
}
