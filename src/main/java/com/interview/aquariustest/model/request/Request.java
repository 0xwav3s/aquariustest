package com.interview.aquariustest.model.request;

import java.io.IOException;

import com.interview.aquariustest.model.response.APIError;
import com.interview.aquariustest.model.response.APIResponse;
import com.interview.aquariustest.model.response.Response;

import retrofit2.Call;

public class Request<T extends Response<T>> {

    protected T execute(Call<T> call, Class<T> clazz) {
        T entity = null;
        APIResponse <T> apiResponse;
        try {
        	retrofit2.Response<T> response = call.execute();
        	apiResponse = new APIResponse<>(response);
            entity = apiResponse.body();
            if  (entity == null) {
                entity = clazz.newInstance();
            }
        } catch (IOException e) {
        	e.printStackTrace();
            APIError error = new APIError();
            error.setCode("NetworkError");
            error.setMessage(e.getMessage());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        return entity;
    }
}


