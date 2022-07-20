package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
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
        Iterator<Cliente> iterator = AgregarPacienteController.getClientes().iterator();
        boolean bandera=false;
        while (!bandera&&iterator.hasNext()) {
            if (iterator.next().getId()==Integer.parseInt(txtId.getText())){
                iterator.remove();
                bandera=true;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Eliminar - paciente");
                alert.setContentText("El paciente asido eliminado correctamente");
                alert.showAndWait();
                FastTrackingApplication.setFXML("Home-view","Fast Tracking");
            }
        }
    }
    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
    }
}