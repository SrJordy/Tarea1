package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Infor=(TextView) findViewById(R.id.txtInfo);
        Bundle b=this.getIntent().getExtras();
        Infor.setText("Cédula: "+b.getString("Cedula")+"\n\n"+
                      "Nombre: "+b.getString("Nombre")+"\n\n"+
                      "Ciudad: "+b.getString("Ciudad")+"\n\n"+
                      "Fecha de nacimiento: "+b.getString("Fecha")+"\n\n"+
                      "Correo: "+b.getString("Correo")+"\n\n"+
                      "Teléfono: "+b.getString("Telefono")+"\n\n"+
                      "Género: "+b.getString("Genero"));
    }
}