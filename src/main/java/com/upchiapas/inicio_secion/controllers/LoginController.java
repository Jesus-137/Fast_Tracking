package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Doctor;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class LoginController {
    @FXML
    private PasswordField Password;
    @FXML
    private TextField nombre;

    @FXML
    void btnLogin(MouseEvent event)
    {
        boolean correcto = false;
        int i=0;
        while (!correcto&&i<CrearCuentaControllers.getUsuarios().size())
        {
            if (nombre.getText().equals(CrearCuentaControllers.getUsuarios().get(i).getNombre()))
                if (Password.getText().equals(CrearCuentaControllers.getUsuarios().get(i).getPassword())) {
                    FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
                    correcto=true;
                }
            i++;
        }
        if (!correcto)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El nombre o la contraceña es incorrecto");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalir(MouseEvent event)
    {
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Login - Adios");
        alert.setContentText("Gracias por su preferencia, hasta luego");
        alert.showAndWait();
        System.exit(1);
    }
    @FXML
    void btnCrearCuenta(MouseEvent event)
    {
        FastTrackingApplication.setFXML("CrearCuenta-view","Fast Tracking");
    }
}
