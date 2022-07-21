package com.upchiapas.inicio_secion.models;

public class Producto {
    private String nombre;
    private int id;
    private int cantidad;

    public Producto(String nombre, int id, int cantidad) {
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
