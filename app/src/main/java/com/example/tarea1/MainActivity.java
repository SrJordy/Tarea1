package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view){
        EditText TNombre=(EditText) findViewById(R.id.txtNombre);
        EditText TCedula=(EditText) findViewById(R.id.txtCedula);
        EditText TCiudad=(EditText) findViewById(R.id.txtCiudad);
        EditText TFecha=(EditText) findViewById(R.id.txtFecha);
        EditText TCorreo=(EditText) findViewById(R.id.txtCorreo);
        EditText TFono=(EditText) findViewById(R.id.txtTelf);
        RadioButton Masc=(RadioButton) findViewById(R.id.rdMas);

        String Nombre=TNombre.getText().toString();
        String Cedula=TCedula.getText().toString();
        String Ciudad=TCiudad.getText().toString();
        String Fecha=TFecha.getText().toString();
        String Correo=TCorreo.getText().toString();
        String Telefono=TFono.getText().toString();
        String Genero=Masc.isChecked()?"Masculino":"Femenino";

        if (Cedula.isEmpty())
        {
            Toast.makeText(this, "Ingrese un número de cedula", Toast.LENGTH_SHORT).show();
        } else if (Cedula.length()<10) {
            Toast.makeText(this, "Número de cédula invalido", Toast.LENGTH_SHORT).show();
        } else if (Nombre.isEmpty()) {
            Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
        } else if (Ciudad.isEmpty()) {
            Toast.makeText(this, "Ingrese una Ciudad", Toast.LENGTH_SHORT).show();
        } else if (Fecha.isEmpty()) {
            Toast.makeText(this, "Ingrese una fecha de nacimiento", Toast.LENGTH_SHORT).show();
        } else if (Correo.isEmpty()) {
            Toast.makeText(this, "Ingrese un correo", Toast.LENGTH_SHORT).show();
        } else if (Telefono.isEmpty()) {
            Toast.makeText(this, "Ingrese un número de telefono", Toast.LENGTH_SHORT).show();
        } else if (Telefono.length()<10) {
            Toast.makeText(this, "Número de teléfono invalido", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent= new Intent(MainActivity.this, MainActivity2.class);
            Bundle b=new Bundle();
            b.putString("Cedula",Cedula);
            b.putString("Nombre",Nombre);
            b.putString("Ciudad",Ciudad);
            b.putString("Fecha",Fecha);
            b.putString("Correo",Correo);
            b.putString("Telefono",Telefono);
            b.putString("Genero",Genero);
            intent.putExtras(b);
            startActivity(intent);
        }

    }
    public void btnLimpiar(View view){
        EditText TNombre=(EditText) findViewById(R.id.txtNombre);
        EditText TCedula=(EditText) findViewById(R.id.txtCedula);
        EditText TCiudad=(EditText) findViewById(R.id.txtCiudad);
        EditText TFecha=(EditText) findViewById(R.id.txtFecha);
        EditText TCorreo=(EditText) findViewById(R.id.txtCorreo);
        EditText TFono=(EditText) findViewById(R.id.txtTelf);
        RadioButton Masc=(RadioButton) findViewById(R.id.rdMas);
        RadioButton Fem=(RadioButton) findViewById(R.id.rdFem);
        TNombre.setText("");
        TCedula.setText("");
        TCiudad.setText("");
        TFecha.setText("");
        TCorreo.setText("");
        TFono.setText("");
        Masc.setChecked(false);
        Fem.setChecked(false);
    }
}