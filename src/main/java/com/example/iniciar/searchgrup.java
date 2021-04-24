package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class searchgrup extends AppCompatActivity {

    Button volvergrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchgrup);

        volvergrp=(Button)findViewById(R.id.btn_volvergrupbusc);
        volvergrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volvergrp = new Intent(searchgrup.this, grupos.class);
                startActivity(volvergrp);
            }

    });
    }
}