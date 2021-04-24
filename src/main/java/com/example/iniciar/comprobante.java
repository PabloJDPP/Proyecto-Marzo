package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class comprobante extends AppCompatActivity {

    Button volverc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobante);

        volverc=(Button)findViewById(R.id.btn_regresarven);
        volverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverc = new Intent(comprobante.this, realventas.class);
                startActivity(volverc);
            }
        });

    }
}