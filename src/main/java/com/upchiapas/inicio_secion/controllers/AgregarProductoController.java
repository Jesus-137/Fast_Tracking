package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class AgregarProductoController {

    private static ArrayList<Producto> productos =new ArrayList<>();
    @FXML
    private TextField txtCandidad;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnAgregarProducto(MouseEvent event) {
        Producto producto = new Producto(txtNombre.getText(),Integer.parseInt(txtId.getText()),Integer.parseInt(txtCandidad.getText()));
        productos.add(producto);
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    public static ArrayList<Producto> getProductos() {return productos;}
}