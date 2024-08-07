package com.example.chatwise;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {
    private Repository repository;
    public ViewModel(@NonNull Application application) {
        super(application);
        this.repository = new Repository();
    }
    public LiveData<List<ProductListViewModel.Products>>getProducts(){
        return repository.getProducts();
    }

}
