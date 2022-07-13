package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class CrearCuentaControllers {
    private static ArrayList<Usuario> usuarios= new ArrayList<>();

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
        usuarios.add(new Usuario(nombre.getText(), Password.getText()));
        FastTrackingApplication.setFXML("Login-view","Fast Tracking");
    }

    public static ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
}