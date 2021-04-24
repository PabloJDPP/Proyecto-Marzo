package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grupos extends AppCompatActivity {
    Button buscargrup;
    Button volverr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);

        volverr=(Button)findViewById(R.id.btn_volvergrup);

        volverr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volverr = new Intent(grupos.this, autenticacion.class);
                startActivity(volverr);
            }
        });

        buscargrup=(Button)findViewById(R.id.btn_buscargr);

        buscargrup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscargrup = new Intent(grupos.this, searchgrup.class);
                startActivity(buscargrup);
            }
        });

    }
}