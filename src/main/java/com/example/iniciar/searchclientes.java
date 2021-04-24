package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class searchclientes extends AppCompatActivity {
    Button Atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchclientes);

        Atras=(Button)findViewById(R.id.btn_volverclienbusc);

        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Atras = new Intent(searchclientes.this, clientes.class);
                startActivity(Atras);
            }
        });
    }
}