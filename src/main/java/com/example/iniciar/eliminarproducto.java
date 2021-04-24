package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eliminarproducto extends AppCompatActivity {

    Button attras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminarproducto);

        attras=(Button)findViewById(R.id.btn_volverproducto);
        attras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attras = new Intent(eliminarproducto.this, productos.class);
                startActivity(attras);
            }
        });

    }
}