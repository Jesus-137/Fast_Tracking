package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;


public class HomeController {

    @FXML
    void btnAgregar(ActionEvent event) {
        FastTrackingApplication.setFXML("AgregarPaciente-view","Fast TrackingJ");
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