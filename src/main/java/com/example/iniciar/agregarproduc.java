package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agregarproduc extends AppCompatActivity {

    Button regresapr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarproduc);

        regresapr=(Button)findViewById(R.id.btn_regresarproduc);
        regresapr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresapr = new Intent(agregarproduc.this, productos.class);
                startActivity(regresapr);
            }
        });


    }
}