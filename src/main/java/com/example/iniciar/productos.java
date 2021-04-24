package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class productos extends AppCompatActivity {

    Button Regr;
    Button Agre;
    Button Busc;
    Button elim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        elim=(Button)findViewById(R.id.btn_eliminarproduc);
        elim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elim = new Intent(productos.this, eliminarproducto.class);
                startActivity(elim);
            }
        });

        Busc=(Button)findViewById(R.id.btn_buscarprodu);
        Busc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Busc = new Intent(productos.this, buscarproduc.class);
                startActivity(Busc);
            }
        });


        Agre=(Button)findViewById(R.id.btn_agregarproduc);
        Agre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Agre = new Intent(productos.this, agregarproduc.class);
                startActivity(Agre);
            }
        });



        Regr=(Button)findViewById(R.id.btn_volverproduc);
        Regr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Regr = new Intent(productos.this, MainActivity.class);
                startActivity(Regr);
            }
        });

    }
}