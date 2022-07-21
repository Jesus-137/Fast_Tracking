package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Iterator;

public class EliminarProductoController {

    @FXML
    private TextField txt;

    @FXML
    private Label txtCantidad;

    @FXML
    private TextField txtId;

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    @FXML
    void btnEliminarProducto(MouseEvent event) {
        Iterator<Producto> iterator = AgregarProductoController.getProductos().iterator();
        int id=Integer.parseInt(txtId.getText()), i=0;
        boolean bantera=false;
        while (!bantera&&iterator.hasNext()){
            if (iterator.next().getId()==id) {
                AgregarProductoController.getProductos().remove(i);
                FastTrackingApplication.setFXML("Home-view","Fast Tracking");
                bantera=true;
            }
            i++;
        }
        if (!bantera){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Producto - Error");
            alert.setContentText("Producto no encontrado");
            alert.showAndWait();
        }
    }
}
