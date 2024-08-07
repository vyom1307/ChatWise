package com.example.chatwise;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwise.databinding.ActivityProductListBinding;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<ProductListViewModel.Products> products;
    private ViewModel viewModel;
   private ActivityProductListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding= DataBindingUtil.setContentView(this, R.layout.activity_product_list);
        recyclerView= binding.recView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ProductAdapter(this,new ArrayList<>());
        recyclerView.setAdapter(adapter);
        viewModel=new ViewModelProvider(this).get(ViewModel.class);
        viewModel.getProducts().observe(this, new Observer<List<ProductListViewModel.Products>>() {
            @Override
            public void onChanged(List<ProductListViewModel.Products> productsList) {
                products=productsList;
                displayProducts();

            }


        });
    }
    private void displayProducts() {




        adapter.setProductList(products);




    }
}