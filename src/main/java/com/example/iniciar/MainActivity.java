package com.example.iniciar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.iniciar.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_correo, et_contrasena;
    private Button btn_iniciar_sesion;
    private ArrayList<Usuario> listaUsuario;
    private Usuario objUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ini();


    }

    public void ini()
    {
        et_correo= (EditText) findViewById(R.id.et_correo);
        et_contrasena= (EditText) findViewById(R.id.et_contrasena);
        btn_iniciar_sesion= (Button) findViewById(R.id.btn_iniciar_sesion);
        btn_iniciar_sesion.setOnClickListener(this);

    }

    private void llenarUsuario(){
        listaUsuario=new ArrayList<Usuario>();
        listaUsuario.add(new Usuario("Juan", "Donis","Juan","Juan15251"));
        listaUsuario.add(new Usuario("Braulio", "Zarate","Braulio","123456"));
        listaUsuario.add(new Usuario("Denis", "Florian","Denis","Denis14509"));
        listaUsuario.add(new Usuario("Kevin", "Sosa","Kevin","Kevin22497"));
        listaUsuario.add(new Usuario("Rudy", "Fajardo","Rudy","Rudy1590"));
    }

    private void iniciarSesion(){
        llenarUsuario();
        String correo= et_correo.getText().toString();
        String contrasena= et_contrasena.getText().toString();
        boolean usuarioEcontrado = false;
        for (int i=0; i< listaUsuario.size(); i++)
        {
            if (correo.equals(listaUsuario.get(i).getCorreo())&& contrasena.equals(listaUsuario.get(i).getContrasena()))
            {
                Toast.makeText(this, "BIENVENIDO" + listaUsuario.get(i).getNombre(), Toast.LENGTH_SHORT).show();
                usuarioEcontrado = true;
                Intent inicio = new Intent(MainActivity.this,inicioActivity.class);
                objUsuario= listaUsuario.get(i);
                inicio.putExtra("Usuario", objUsuario);
                startActivity(inicio);

            }

            else if (correo.isEmpty() ||contrasena.isEmpty())
            {
                Toast.makeText(this, "Lleno los campos", Toast.LENGTH_SHORT).show();
            }

        }
        if (!usuarioEcontrado)
        {
            Toast.makeText(this, "Los datos ingresados son Incorrectos ", Toast.LENGTH_SHORT).show();
        }

    }



    @Override
    public void onClick(View v) {
         if (v.getId()== R.id.btn_iniciar_sesion)
         {
            iniciarSesion();
         }

    }
}