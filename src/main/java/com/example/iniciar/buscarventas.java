package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buscarventas extends AppCompatActivity {

    Button vregre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscarventas);

        vregre=(Button)findViewById(R.id.btn_volverve);
        vregre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vregre = new Intent(buscarventas.this, detalleventas.class);
                startActivity(vregre);
            }
        });
    }
}