package com.example.android.personas;

/**
 * Created by Android on 19/09/2017.
 */

public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;

    public Persona(String cedula, String nombre, String apellido) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Cedula='" + Cedula + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }



    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Persona() {

    }

    public void Guardar(){
        Datos.Guardar(this);
    }
}
