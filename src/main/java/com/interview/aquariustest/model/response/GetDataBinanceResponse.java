package com.interview.aquariustest.model.response;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.interview.aquariustest.model.BinanceTicker;

@JsonDeserialize(using = GetDataBinanceResponseDeserializer.class)
public class GetDataBinanceResponse extends Response<GetDataBinanceResponse>{
	public List<BinanceTicker> data;

    // Constructor
    public GetDataBinanceResponse(List<BinanceTicker> data) {
        this.data = data;
    }

	public List<BinanceTicker> getData() {
		return data;
	}

	public void setData(List<BinanceTicker> data) {
		this.data = data;
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
		GetDataBinanceResponse other = (GetDataBinanceResponse) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "GetDataBinanceResponse [data=" + data + "]";
	}
}
