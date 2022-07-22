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
    void btnCerrarSesion(MouseEvent event) {
        FastTrackingApplication.setFXML("Login-view","Fast Tracking");
    }

    @FXML
    void btnVerDatos(ActionEvent event) {
        FastTrackingApplication.setFXML("Datos-view","Fast Tracking");
    }

    @FXML
    void btnEliminar(ActionEvent event) {
        FastTrackingApplication.setFXML("EliminarPaciente-view","Fast Tracking");
    }
    @FXML
    void btnAgregarTratamiento(ActionEvent event){
        FastTrackingApplication.setFXML("AgregarTratamiento-view","Fast Tracking");
    }
    @FXML
    void btnAgregarProducto(ActionEvent event){
        FastTrackingApplication.setFXML("AgregarProducto-view","Fast Tracking");
    }
    @FXML
    void btnEliminarProducto(ActionEvent event){
        FastTrackingApplication.setFXML("EliminarProducto-view","Fast Tracking");
    }
    @FXML
    void btnVer(ActionEvent event){
        FastTrackingApplication.setFXML("VerProducto-view","Fast Tracking");
    }
}