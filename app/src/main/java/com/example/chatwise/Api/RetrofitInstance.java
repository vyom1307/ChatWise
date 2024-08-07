package com.example.chatwise.Api;

import com.example.chatwise.Api.ProductAPIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private  static Retrofit retrofit=null;
    private static String BASE_URL="https://dummyjson.com";
    public  static ProductAPIService getService(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ProductAPIService.class);
    }
}
