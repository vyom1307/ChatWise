package com.example.chatwise;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatwise.databinding.ItemListBinding;
import com.example.chatwise.databinding.ItemTitleBinding;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_TITLE = 0;
    private static final int TYPE_PRODUCT = 1;
    private Context context;
    private ArrayList<Object> list;
    private ItemClickListener itemClickListener;

    public ProductAdapter(Context context,ArrayList<Object> list) {
        this.context = context;
        this.list = list;
    }
    public void setProductList(List<ProductListViewModel.Products> productList) {
        list.add("Products List");  // Add title item
        list.addAll(productList);   // Add product items
        notifyDataSetChanged();
    }
    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof String) {
            return TYPE_TITLE;
        } else {
            return TYPE_PRODUCT;
        }

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(viewType==TYPE_PRODUCT){
            ItemListBinding binding;
             binding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_list,parent,false);
            return new ProductViewHolder(binding);
        }else{
            ItemTitleBinding binding;
             binding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_title,parent,false);
            return new TitleViewHolder(binding);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof ProductViewHolder){
            ProductListViewModel.Products product=(ProductListViewModel.Products) list.get(position);
            ((ProductViewHolder) holder).binding.setViewModel(product);
        }
        else{
            String title=(String) list.get(position);
            ((TitleViewHolder) holder).bind(title);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemListBinding binding;

        public ProductViewHolder(ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.getRoot().setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {
            Intent i=new Intent(v.getContext(), Details.class);
            i.putExtra("name",  binding.getViewModel());
            v.getContext().startActivity(i);
        }
    }
    static class TitleViewHolder extends RecyclerView.ViewHolder {
        ItemTitleBinding binding;
        public TitleViewHolder(ItemTitleBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(String title) {
            binding.setVariable(BR.title, title);
            binding.executePendingBindings();
        }
    }


}
