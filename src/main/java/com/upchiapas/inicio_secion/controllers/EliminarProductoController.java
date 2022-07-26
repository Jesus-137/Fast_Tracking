package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Iterator;

public class EliminarProductoController {
    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtId;

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    @FXML
    void btnEliminarProducto(MouseEvent event) {
        Iterator<Producto> iterator = AgregarProductoController.getProductos().iterator();
        int id, i=-1, cantidad, respaldo;
        try {//validacion de la id y cantidad que sea un número
            id=Integer.parseInt(txtId.getText());
            cantidad = Integer.parseInt(txtCantidad.getText());
            boolean bantera = false, encontrado=false;
            while (!encontrado && iterator.hasNext()) {
                i++;
                if (iterator.next().getId() == id) {
                    if(cantidad<=AgregarProductoController.getProductos().get(i).getCantidad()) {
                        respaldo = AgregarProductoController.getProductos().get(i).getCantidad() - cantidad;
                        AgregarProductoController.getProductos().get(i).setCantidad(respaldo);
                        bantera = true;
                    }
                    else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText(null);
                        alert.setTitle("Error");
                        alert.setContentText("La cantidad a eliminar es mas que la actual");
                        alert.showAndWait();
                    }
                    encontrado=true;
                }
            }
            if (!encontrado) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Producto no encontrado");
                alert.showAndWait();
            }
            if (AgregarProductoController.getProductos().get(i).getCantidad()==0){
                AgregarProductoController.getProductos().remove(i);
                FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
            }else if(bantera) {
                FastTrackingApplication.setFXML("Home-view", "Fast Tracking");
            }
        }catch (NumberFormatException e){//muestra al usuario su error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("La id y la cantidad tienen que ser un numero");
            alert.showAndWait();
        }
    }
}
