package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class autenticacion extends AppCompatActivity {
    Button grupo1;
    Button volverrr;
    Button usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacion);

        grupo1 = (Button)findViewById(R.id.btn_grupos);
        volverrr = (Button)findViewById(R.id.btn_volverpr);
        usuario = (Button)findViewById(R.id.btn_usuarios);

        grupo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent grupo1 = new  Intent (autenticacion.this, grupos.class);
                startActivity(grupo1);
            }
        });

        volverrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volverr = new Intent(autenticacion.this, MainActivity.class);
                startActivity(volverr);

            }
        });


        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent usuario= new Intent(autenticacion.this, usuarioagr.class);
                startActivity(usuario);
            }
        });

    }
}