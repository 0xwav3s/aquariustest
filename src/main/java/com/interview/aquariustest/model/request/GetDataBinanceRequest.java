package com.interview.aquariustest.model.request;

import com.interview.aquariustest.model.response.GetDataBinanceResponse;
import com.interview.aquariustest.service.BinanceService;

public class GetDataBinanceRequest extends Request<GetDataBinanceResponse> {
	public BinanceService service;
	
	public GetDataBinanceRequest(BinanceService service) {
		this.service = service;	
	}
	
	public GetDataBinanceResponse excute() {
		return super.execute(service.getData(), GetDataBinanceResponse.class);
	}
	
}
