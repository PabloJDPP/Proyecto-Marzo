package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detalleventas extends AppCompatActivity {
    Button regressar;
    Button buventas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleventas);

        buventas=(Button)findViewById(R.id.btn_detallevent);
        buventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buventas = new Intent(detalleventas.this, buscarventas.class);
                startActivity(buventas);
            }
        });


        regressar=(Button)findViewById(R.id.btn_volverventas);
        regressar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regressar = new Intent(detalleventas.this, ventas.class);
                startActivity(regressar);
            }
        });
    }
}