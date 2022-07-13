package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;


public class HomeController {

    @FXML
    void btnAgregar(MouseEvent event) {

    }

    @FXML
    void btnCerrarSecion(MouseEvent event) {
        FastTrackingApplication.setFXML("Login-view","Fast Tracking");
    }

    @FXML
    void btnDatos(MouseEvent event) {

    }

    @FXML
    void btnEliminar(MouseEvent event) {

    }

    @FXML
    void btnVer(MouseEvent event) {

    }

}