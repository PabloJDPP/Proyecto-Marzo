package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buscarusuario extends AppCompatActivity {

    Button regresarr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscarusuario);

        regresarr= (Button)findViewById(R.id.btn_volvergrupbusc);

        regresarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresarr = new Intent(buscarusuario.this, usuarioagr.class);
                startActivity(regresarr);
            }
        });
    }



}