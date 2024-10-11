package com.interview.aquariustest.service;

import com.interview.aquariustest.model.response.BinanceAPIClientResponse;
import com.interview.aquariustest.model.response.GetDataBinanceResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BinanceService {
	@GET("/api/v3/ticker/bookTicker")
	Call<GetDataBinanceResponse> getData();
}
