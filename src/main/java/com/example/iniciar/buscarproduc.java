package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buscarproduc extends AppCompatActivity {

    Button regrepr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscarproduc);

        regrepr=(Button)findViewById(R.id.btn_volverproductos);
        regrepr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regrepr = new Intent(buscarproduc.this, productos.class);
                startActivity(regrepr);
            }
        });

    }
}