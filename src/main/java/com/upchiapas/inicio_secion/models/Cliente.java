package com.upchiapas.inicio_secion.models;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int edad;
    private ArrayList<String> tratamientos =new ArrayList<>();
    private int id;

    public Cliente(String nombre, int edad, int id){
        this.edad=edad;
        this.nombre=nombre;
        this.id=id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos.add(tratamientos);
    }

    public ArrayList<String> getTratamientos() {
        return tratamientos;
    }

    public int getId() {
        return id;
    }
}
