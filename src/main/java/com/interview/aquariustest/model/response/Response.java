package com.interview.aquariustest.model.response;

import lombok.Data;

@Data
public class Response <T> {
    private transient APIResponse<T> response;

    public void setResponse(APIResponse<T> response) {
        this.response = response;
    }
    
    public boolean isSuccessful() {
        return response.isSuccessful();
    }
}