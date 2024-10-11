package com.interview.aquariustest.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Builder
@NoArgsConstructor // Add this Lombok annotation
@AllArgsConstructor // Add this Lombok annotation
@FieldDefaults(level = AccessLevel.PUBLIC)
public class BinanceTicker {
    String symbol;
    String bidPrice;
    String bidQty;
    String askPrice;
    String askQty;
}
