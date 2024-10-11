package com.interview.aquariustest.service;

import com.interview.aquariustest.model.response.BinanceAPIClientResponse;
import com.interview.aquariustest.model.response.GetDataHuobiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HuobiService {
	@GET("/market/tickers")
	Call<GetDataHuobiResponse> getData();
}
