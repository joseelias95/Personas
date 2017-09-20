package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText Cedula, Nombre, Apellido;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        Cedula = (EditText)findViewById(R.id.TxtCedula);
        Nombre = (EditText)findViewById(R.id.TxtNombre);
        Apellido = (EditText)findViewById(R.id.TxtApellido);
        resources = this.getResources();
    }

    public void Guardar(View view){
        String ced, nom, apell;
        ced = Cedula.getText().toString();
        nom = Nombre.getText().toString();
        apell = Apellido.getText().toString();

        Persona p = new Persona(ced,nom,apell);
        p.Guardar();
        Toast.makeText(this, resources.getString(R.string.MensajeExito), Toast.LENGTH_SHORT).show();
    }
}
