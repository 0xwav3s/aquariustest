package com.interview.aquariustest.model.request;

import com.interview.aquariustest.model.response.GetDataHuobiResponse;
import com.interview.aquariustest.service.HuobiService;

public class GetDataHuobiRequest extends Request<GetDataHuobiResponse> {
	public HuobiService service;
	
	public GetDataHuobiRequest(HuobiService service) {
		this.service = service;	
	}
	
	public GetDataHuobiResponse excute() {
		return super.execute(service.getData(), GetDataHuobiResponse.class);
	}
	
}
