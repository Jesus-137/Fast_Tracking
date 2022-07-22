package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
import com.upchiapas.inicio_secion.models.Doctor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Iterator;

public class EliminarPacienteControler {
    @FXML
    private TextField txtId;

    @FXML
    void btnEliminar(MouseEvent event) {
        Iterator<Cliente> iterator = Doctor.getClientes().iterator();
        boolean bandera=false;
        int id;
        try {
            id = Integer.parseInt(txtId.getText());
            while (!bandera && iterator.hasNext()) {
                if (iterator.next().getId() == id) {
                    iterator.remove();
                    bandera = true;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Eliminar - paciente");
                    alert.setContentText("El paciente asido eliminado correctamente");
                    alert.showAndWait();
                    FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
                }
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La id tiene que ser un numero");
            alert.showAndWait();
        }
    }
    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
    }
}