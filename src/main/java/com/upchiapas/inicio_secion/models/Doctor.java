package com.upchiapas.inicio_secion.models;

import java.util.ArrayList;

public class Doctor {
    private String nombre;
    private String password;
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    public Doctor(String nombre, String password){
        this.nombre=nombre;
        this.password=password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(Cliente cliente) {
        Doctor.clientes.add(cliente);
    }
}
