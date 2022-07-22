package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
import com.upchiapas.inicio_secion.models.Doctor;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class AgregarPacienteController {
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
        int edad;
        int id;
        try{//validacion de la id y la edad del paciente
            edad = Integer.parseInt(txtEdad.getText());
            id = Integer.parseInt(txtId.getText());
            boolean bandera=false;
            Iterator<Cliente> iterator = Doctor.getClientes().iterator();
            while (!bandera&&iterator.hasNext()) {
                if(iterator.next().getId()==id){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Ya a ingresado esta id para un paciente");
                    alert.showAndWait();
                    bandera=true;
                }
            }
            if (!bandera){
                Doctor.setClientes(new Cliente(txtNombre.getText(),edad,id,txtMotivo.getText()));
                FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
            }
        }catch (NumberFormatException e){//aroga una ventana alterna para informar al usuario del error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La edad y la id tienen que ser un numero");
            alert.showAndWait();
        }
    }

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
    }
}
