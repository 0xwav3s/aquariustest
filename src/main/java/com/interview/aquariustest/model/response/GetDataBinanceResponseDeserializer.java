package com.interview.aquariustest.model.response;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.interview.aquariustest.model.BinanceTicker;

public class GetDataBinanceResponseDeserializer extends JsonDeserializer<GetDataBinanceResponse> {
    @Override
    public GetDataBinanceResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        List<BinanceTicker> tickers = jp.readValueAs(new TypeReference<List<BinanceTicker>>() {});
        return new GetDataBinanceResponse(tickers);
    }
}
