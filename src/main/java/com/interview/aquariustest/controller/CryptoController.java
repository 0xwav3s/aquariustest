package com.interview.aquariustest.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.aquariustest.common.ExchangeType;
import com.interview.aquariustest.model.request.GetDataBinanceRequest;
import com.interview.aquariustest.model.request.GetDataHuobiRequest;
import com.interview.aquariustest.model.response.GetDataBinanceResponse;
import com.interview.aquariustest.model.response.GetDataHuobiResponse;
import com.interview.aquariustest.service.BinanceService;
import com.interview.aquariustest.service.ExchangeDataService;
import com.interview.aquariustest.service.HuobiService;

@RestController
@RequestMapping("/api/v1")
public class CryptoController {

	public final ExchangeDataService client;

	@Autowired
	public CryptoController(ExchangeDataService client) {
		this.client = client;
	}

	@GetMapping("/test")
	public ResponseEntity<Object> getData() throws IOException {
		GetDataBinanceResponse data = client.getData(ExchangeType.BINANCE);
		return  ResponseEntity.ok(data);
	}
}
