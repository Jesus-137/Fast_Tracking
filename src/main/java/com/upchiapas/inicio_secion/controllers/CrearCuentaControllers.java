package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Doctor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class CrearCuentaControllers {
    private static ArrayList<Doctor> usuarios= new ArrayList<>();

    @FXML
    private PasswordField Password;

    @FXML
    private TextField nombre;

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Login-view","Fast Tracking");
    }

    @FXML
    void btnCrearCuenta(MouseEvent event) {
        boolean bandera=true;
        int i=0;
        while (bandera&&i<usuarios.size()){
            if (nombre.getText().equals(usuarios.get(i).getNombre())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Login - Error");
                alert.setContentText("El nombre ya esta siendo usado");
                alert.showAndWait();
                bandera=false;
            }
            i++;
        }
        if (bandera){
            usuarios.add(new Doctor(nombre.getText(), Password.getText()));
            FastTrackingApplication.setFXML("Login-view","Fast Tracking");
        }
    }

    public static ArrayList<Doctor> getUsuarios(){
        return usuarios;
    }
}