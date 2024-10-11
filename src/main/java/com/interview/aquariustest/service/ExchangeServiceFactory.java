package com.interview.aquariustest.service;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.interview.aquariustest.common.ExchangeType;

import jakarta.annotation.PostConstruct;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Component
public class ExchangeServiceFactory {
	protected BinanceService binanceService;

	protected HuobiService huobiService;

	@Value("${api.binanceUrl}")
	private String binanceUrl;

	@Value("${api.huobiUrl}")
	private String huobiUrl;

	@PostConstruct
	public void init() {
		binanceService = createService(BinanceService.class, binanceUrl);
		huobiService = createService(HuobiService.class, huobiUrl);
	}

	public <T> T getService(ExchangeType type) {
		switch (type) {
		case BINANCE:
			return (T) binanceService;
		case HUOBI:
			return (T) huobiService;
		default:
			throw new IllegalArgumentException("Unknown exchange type: " + type);

		}
	}

	private <T> T createService(Class<T> serviceClass, String baseUrl) {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
				.addConverterFactory(JacksonConverterFactory.create()).build();
		return retrofit.create(serviceClass);
	}
}