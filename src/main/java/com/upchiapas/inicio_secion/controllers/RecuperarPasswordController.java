package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Doctor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Iterator;

public class RecuperarPasswordController {

    @FXML
    private TextField txtNombre;
    @FXML
    private Label password;

    @FXML
    void btnRecuperarPassword(MouseEvent event) {
        Iterator<Doctor> iterator = CrearCuentaControllers.getUsuarios().iterator();
        int i=0;
        boolean encontrado=false;
        while (!encontrado&&iterator.hasNext()){
            if (iterator.next().getNombre().equals(txtNombre.getText())){
                password.setText("Su contraceña es: "+CrearCuentaControllers.getUsuarios().get(i).getPassword());
                encontrado=true;
            }
            i++;
        }
        if(!encontrado){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Usuario no encontrado repise el nombre de usuario");
            alert.showAndWait();
        }
    }

    @FXML
    void btnInicioSesion(MouseEvent event) {
        FastTrackingApplication.setFXML("Login-view","Fast Tracking");
    }
}
