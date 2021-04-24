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

public class clientes extends AppCompatActivity {
    Button attras;
    Button searchc;
    Button agregar;
    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        agregar=(Button)findViewById(R.id.btn_grabaryan);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agregar = new Intent(clientes.this, clientes.class);
                startActivity(agregar);
            }
        });

        searchc=(Button)findViewById(R.id.btn_search) ;
        searchc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchc = new Intent(clientes.this, searchclientes.class );
                startActivity(searchc);
            }
        });

        attras=(Button)findViewById(R.id.btn_regresarclien);

        attras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attras = new Intent(clientes.this, MainActivity.class);
                startActivity(attras);
            }
        });

        mSpinner=findViewById(R.id.spinnerdep);

        ArrayList<String> elementos= new ArrayList<>();

        elementos.add("Alta Verapaz");
        elementos.add("Baja Verapaz");
        elementos.add("Chimaltenago");
        elementos.add("Chiquimula");
        elementos.add("Guatemala");
        elementos.add("El Progreso");
        elementos.add("Escuintla");
        elementos.add("Huehuetenango");
        elementos.add("Izabal");
        elementos.add("Jalapa");
        elementos.add("Jutiapa");
        elementos.add("Petén");
        elementos.add("Quetzaltenango");
        elementos.add("Quiché");
        elementos.add("Retalhuleu");
        elementos.add("Sacatepequez");
        elementos.add("San Marcos");
        elementos.add("Santa Rosa");
        elementos.add("Sololá");
        elementos.add("Suchitepequez");
        elementos.add("Totonicapán");
        elementos.add("Zacapa");

        ArrayAdapter adp= new ArrayAdapter(clientes.this, android.R.layout.simple_spinner_dropdown_item, elementos);

        mSpinner.setAdapter(adp);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String elemento=(String) mSpinner.getAdapter().getItem(position);

                Toast.makeText(clientes.this, "Selecciono:"+elemento, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}