package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iniciar.modelo.Usuario;

public class inicioActivity extends AppCompatActivity {

    Button volver;
    Button autenticacion;
    Button clientes;
    Button empleados;
    Button productos;
    Button ventas;

    private TextView tv_nombre, tv_nombre_completo, tv_correo;
    private Usuario objUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        ini();
        cargarDatos();

        ventas=(Button)findViewById(R.id.btn_ventas);
        ventas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ventas = new Intent(inicioActivity.this, ventas.class);
                startActivity(ventas);
            }
        });

        productos=(Button)findViewById(R.id.btn_productos);
        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent productos = new Intent(inicioActivity.this, productos.class);
                startActivity(productos);
            }
        });


        empleados=(Button)findViewById(R.id.btn_empleados);
        empleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent empleados =  new Intent(inicioActivity.this, menuempleados.class);
                startActivity(empleados);
            }
        });

        volver=(Button)findViewById(R.id.btn_volver);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new  Intent(inicioActivity.this, MainActivity.class);
                startActivity(volver);


            }
        });

        autenticacion=(Button)findViewById(R.id.btn_autenticacionyautorizacion);
        autenticacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent autenticacion =new  Intent (inicioActivity.this, autenticacion.class);
                startActivity(autenticacion);

            }
        });

        clientes=(Button)findViewById(R.id.btn_clientes);
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clientes = new Intent(inicioActivity.this, clientes.class);
                startActivity(clientes);
            }
        });


    }


    public void ini()
    {
        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        tv_nombre_completo = (TextView) findViewById(R.id.tv_nombre_completo);
        tv_correo = (TextView) findViewById(R.id.tv_correo);
    }

    public void cargarDatos()
    {
        objUsuario = (Usuario) getIntent().getSerializableExtra("Usuario");
        tv_nombre.setText(objUsuario.getNombre());
        tv_nombre_completo.setText(objUsuario.getNombre() +" "+ objUsuario.getApellido());
        tv_correo.setText(objUsuario.getCorreo());
    }


}