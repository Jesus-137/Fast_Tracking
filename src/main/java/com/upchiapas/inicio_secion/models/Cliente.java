package com.upchiapas.inicio_secion.models;

public class Cliente {
    private String nombre;
    private int edad;
    private String motivo;

    public Cliente(String nombre, int edad, String motivo){
        this.motivo=motivo;
        this.edad=edad;
        this.nombre=nombre;
    }
}
