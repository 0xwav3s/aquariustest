package com.interview.aquariustest.model.response;

import java.util.List;
import java.util.Objects;

import com.interview.aquariustest.model.BinanceTicker;
import com.interview.aquariustest.model.HuobiTicker;

public class GetDataHuobiResponse extends Response<GetDataHuobiResponse>{
	public List<HuobiTicker> data;
	public String status;
	public Long ts;
	public GetDataHuobiResponse() {}

	public GetDataHuobiResponse(List<HuobiTicker> data) {
		this.data = data;
	}

	public List<HuobiTicker> getData() {
		return data;
	}

	public void setData(List<HuobiTicker> data) {
		this.data = data;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(data);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetDataHuobiResponse other = (GetDataHuobiResponse) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "GetDataHuobiResponse [data=" + data + "]";
	}
}
