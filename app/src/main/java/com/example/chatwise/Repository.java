package com.example.chatwise;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.chatwise.Api.ProductAPIService;
import com.example.chatwise.Api.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private MutableLiveData<List<ProductListViewModel.Products>>productLiveData=new MutableLiveData<>();
    private ArrayList<ProductListViewModel.Products> products=new ArrayList<>();

    public MutableLiveData<List<ProductListViewModel.Products>>getProducts(){
        ProductAPIService productAPIService = RetrofitInstance.getService();
        Call<ProductListViewModel>call=productAPIService.GetProducts();
        call.enqueue(new Callback<ProductListViewModel>() {
            @Override
            public void onResponse(Call<ProductListViewModel> call, Response<ProductListViewModel> response) {
                ProductListViewModel r=response.body();
                if(r!=null){
                    products=(ArrayList<ProductListViewModel.Products>) r.getProducts();
                    productLiveData.setValue(products);
                }
            }

            @Override
            public void onFailure(Call<ProductListViewModel> call, Throwable throwable) {
                Log.d("Error", Objects.requireNonNull(throwable.getMessage()));
            }
        });
        return productLiveData;
    }
}
