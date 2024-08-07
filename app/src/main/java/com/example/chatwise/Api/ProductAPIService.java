package com.example.chatwise.Api;

import com.example.chatwise.ProductListViewModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPIService {
    @GET("/products")
    Call<ProductListViewModel> GetProducts();
}
