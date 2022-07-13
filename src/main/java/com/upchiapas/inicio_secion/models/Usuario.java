package com.upchiapas.inicio_secion.models;

public class Usuario {
    private String nombre;
    private String password;
    public Usuario(String nombre, String password){
        this.nombre=nombre;
        this.password=password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
