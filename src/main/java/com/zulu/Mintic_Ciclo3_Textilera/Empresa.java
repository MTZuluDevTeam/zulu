package com.zulu.Mintic_Ciclo3_Textilera;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private int NIT;

    public Empresa(String nombre, String direccion, String telefono, int NIT){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT){
        this.NIT = NIT;
    }

}

