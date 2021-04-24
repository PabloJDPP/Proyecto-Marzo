package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class realventas extends AppCompatActivity {

    Button regvent;
    Button compro;
    private Spinner emplSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realventas);

        compro=(Button)findViewById(R.id.btn_comprobante);
        compro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compro = new Intent(realventas.this, comprobante.class);
                startActivity(compro);
            }
        });

        regvent=(Button)findViewById(R.id.btn_regresarvent);
        regvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regvent = new Intent(realventas.this, ventas.class);
                startActivity(regvent);
            }
        });


        emplSpinner=findViewById(R.id.spinnerempl);

        ArrayList<String> elemen= new ArrayList<>();

        elemen.add("Braulio Zarate");
        elemen.add("Pablo Donis");
        elemen.add("Kevin Sosa");
        elemen.add("Rudy Fajardo");
        elemen.add("Denis Florian");

        ArrayAdapter apd= new ArrayAdapter(realventas.this, android.R.layout.simple_spinner_dropdown_item, elemen);

        emplSpinner.setAdapter(apd);

        emplSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elemento=(String) emplSpinner.getAdapter().getItem(position);

                Toast.makeText(realventas.this, "Empleado:"+elemento, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
    });
}
}