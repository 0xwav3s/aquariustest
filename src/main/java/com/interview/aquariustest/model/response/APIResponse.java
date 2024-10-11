package com.interview.aquariustest.model.response;

import retrofit2.Response;

public class APIResponse <T>{
    private Response<T> response;
    
    public APIResponse (Response<T> response) {
        this.response = response;
    }
    
    public boolean isSuccessful() {
        return response != null && response.isSuccessful();
    }

    public Response<T> getResponse() {
        return response;
    }
    
    public T body() {
        return response == null ? null : response.body();
    }
}
