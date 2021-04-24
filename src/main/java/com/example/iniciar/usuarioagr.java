package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usuarioagr extends AppCompatActivity {

    Button regresar;
    Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarioagr);

        regresar=(Button)findViewById(R.id.btn_regresargrup);
        buscar=(Button)findViewById(R.id.btn_buscargr);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent( usuarioagr.this, autenticacion.class);
                startActivity(regresar);
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscar = new Intent(usuarioagr.this, buscarusuario.class);
                startActivity(buscar);
            }
        });

    }
}