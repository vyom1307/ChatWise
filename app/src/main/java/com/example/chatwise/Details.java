package com.example.chatwise;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.provider.FontRequest;
import androidx.databinding.DataBindingUtil;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.FontRequestEmojiCompatConfig;

import com.bumptech.glide.Glide;
import com.example.chatwise.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_details);
        FontRequest fontRequest = new FontRequest(
                "com.google.android.gms.fonts",
                "com.google.android.gms",
                "Noto Color Emoji Compat",
                R.array.com_google_android_gms_fonts_certs);

        EmojiCompat.Config config = new FontRequestEmojiCompatConfig(getApplicationContext(), fontRequest);
        EmojiCompat.init(config);

        Intent intent=getIntent();
        ProductListViewModel.Products product= (ProductListViewModel.Products) intent.getSerializableExtra("name");
        


        Glide.with(binding.image.getContext()).load(product.images.get(0)).into(binding.image);

        binding.title.setText(product.title);
        binding.descript.setText(product.description);
        binding.price.setText("$"+ product.price);
        binding.discount.setText("- "+product.discountPercentage+"%");
        binding.rating.setText(String.valueOf(product.rating)+"x⭐");


    }
}