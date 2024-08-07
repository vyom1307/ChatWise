package com.example.chatwise;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button viewProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        viewProduct=findViewById(R.id.viewProd);
        viewProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Main","Button Clicked");
                Intent i=new Intent(MainActivity.this, ProductList.class);
                startActivity(i);
                Log.d("Activity","started Clicked");
            }
        });
    }
}