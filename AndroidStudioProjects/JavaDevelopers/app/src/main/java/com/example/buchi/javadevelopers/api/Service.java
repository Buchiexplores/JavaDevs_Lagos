package com.example.buchi.javadevelopers.api;

import com.example.buchi.javadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by buchi on 9/13/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();

}
