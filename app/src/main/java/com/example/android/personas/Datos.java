package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by Android on 19/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> Personas = new ArrayList<>();

    public static void Guardar(Persona persona){
        Personas.add(persona);
    }

    public static ArrayList<Persona> Obtener(){
        return Personas;
    }
}
