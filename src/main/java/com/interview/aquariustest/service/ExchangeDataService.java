package com.interview.aquariustest.service;

import com.interview.aquariustest.model.response.GetDataBinanceResponse;
import com.interview.aquariustest.model.response.GetDataHuobiResponse;
import com.interview.aquariustest.model.response.Response;

import retrofit2.Call;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interview.aquariustest.common.ExchangeType;
import com.interview.aquariustest.model.request.*;

@Component
public class ExchangeDataService {
	private final ExchangeServiceFactory serviceFactory;

	@Autowired
	public ExchangeDataService(ExchangeServiceFactory serviceFactory) {
		this.serviceFactory = serviceFactory;
	}

	public <T> T getData(ExchangeType exchangeType) throws IOException {
		var service = serviceFactory.getService(exchangeType);
		switch (exchangeType) {
		case BINANCE:
			// Cast to BinanceService and call getData()
			return (T) ((BinanceService) service).getData().execute().body();
		case HUOBI:
			// Cast to HuobiService and call getData()
			return (T) ((HuobiService) service).getData().execute().body();
		default:
			throw new IllegalArgumentException("Unknown exchange type: " + exchangeType);
		}
	}
}
