package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
    private TableLayout Tabla;
    private ArrayList<Persona> Personas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);
        Tabla = (TableLayout)findViewById(R.id.Tabla);
        Personas = Datos.Obtener();

        for (int i = 0; i <Personas.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3= new TextView(this);
            TextView c4= new TextView(this);
            c1.setText(""+(i+1));
            c2.setText(""+Personas.get(i).getCedula());
            c3.setText(""+Personas.get(i).getNombre());
            c4.setText(""+Personas.get(i).getApellido());
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            Tabla.addView(fila);
        }
    }
}
