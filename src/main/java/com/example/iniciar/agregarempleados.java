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

public class agregarempleados extends AppCompatActivity {

    Button REGRESAR;
    Button AGREGAR;
    private Spinner sSpinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarempleados);

        AGREGAR=(Button)findViewById(R.id.btn_grabary);
        AGREGAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AGREGAR = new Intent(agregarempleados.this, agregarempleados. class);
                startActivity(AGREGAR);
            }
        });


        REGRESAR=(Button)findViewById(R.id.btn_regresaremple);

        REGRESAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent REGRESAR = new Intent(agregarempleados.this, menuempleados.class);
                startActivity(REGRESAR);
            }
        });


        sSpinner=findViewById(R.id.spinnersex);
        ArrayList<String> element= new ArrayList<>();
        element.add("Masculino");
        element.add("Femenino");
        ArrayAdapter adpp= new ArrayAdapter(agregarempleados.this, android.R.layout.simple_spinner_dropdown_item, element);

        sSpinner.setAdapter(adpp);

        sSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elemento=(String) sSpinner.getAdapter().getItem(position);

                Toast.makeText(agregarempleados.this, "Selecciono:"+elemento, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }



        });
}
}
