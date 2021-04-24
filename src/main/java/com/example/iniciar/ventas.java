package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ventas extends AppCompatActivity {
    Button dventas;
     Button vollver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);

        vollver=(Button)findViewById(R.id.btn_volverini);
        vollver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vollver = new Intent(ventas.this, MainActivity.class);
                startActivity(vollver);
            }
        });



        dventas=(Button)findViewById(R.id.btn_detallevent);
        dventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dventas = new Intent(ventas.this, detalleventas.class);
                startActivity(dventas);
            }
        });

    }
}