package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;

public class menuempleados extends AppCompatActivity {

    Button ATRAS;
    Button buscaremp;
    Button agregarempl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuempleados);

        agregarempl=(Button)findViewById(R.id.btn_agregarempl);
        agregarempl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agregarempl = new Intent(menuempleados.this, agregarempleados.class);
                startActivity(agregarempl);
            }
        });

        buscaremp=(Button)findViewById(R.id.btn_buscarempleados) ;
        buscaremp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buscaremp=new Intent(menuempleados.this, buscarempleados.class);
                startActivity(buscaremp);
            }
        });


        ATRAS=(Button)findViewById(R.id.btn_volverempleados);
        ATRAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ATRAS = new Intent(menuempleados.this, MainActivity.class);
                startActivity(ATRAS);
            }
        });


    }
}