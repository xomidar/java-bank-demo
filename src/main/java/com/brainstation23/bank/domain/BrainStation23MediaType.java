package com.brainstation23.bank.domain;

import java.io.Serializable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class BrainStation23MediaType implements Serializable {

  public static final String APPLICATION_JSON_VALUE_V1 = "application/vnd.brainstation23.v1.0+json";
  public static final String APPLICATION_JSON_VALUE_V2 = "application/vnd.brainstation23.v2.0+json";
  public static final String APPLICATION_JSON_VALUE_V3 = "application/vnd.brainstation23.v3.0+json";
}
