package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Iterator;

public class AgregarTratamientoController {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtTratamiento;
    @FXML
    void btnAgregarT(MouseEvent event) {
        ArrayList<Cliente> clientes = AgregarPacienteController.getClientes();
        int id=Integer.parseInt(txtId.getText());
        int i=0;
        boolean bandera=false;
        while (!bandera&&i<clientes.size()){
            if (clientes.get(i).getId()==id){
                AgregarPacienteController.getClientes().get(i).setTratamientos(txtTratamiento.getText());
                FastTrackingApplication.setFXML("Home-view","Fast Tracking");
                bandera=true;
            }
            i++;
        }
        if (!bandera){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Busqueda - Error");
            alert.setContentText("El paciente no se encontro verifique la id");
            alert.showAndWait();
        }
    }
    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }
}
