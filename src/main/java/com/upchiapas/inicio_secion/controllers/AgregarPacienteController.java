package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class AgregarPacienteController {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtMotivo;

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtId;

    @FXML
    void btnAgregar(MouseEvent event) {
        Cliente cliente = new Cliente(txtNombre.getText(),Integer.parseInt(txtEdad.getText()),Integer.parseInt(txtId.getText()));
        cliente.setTratamientos(txtMotivo.getText());
        clientes.add(cliente);
        FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
    }

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
    }
    public static ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
