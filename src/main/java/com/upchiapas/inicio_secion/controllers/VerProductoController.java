package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Iterator;

public class VerProductoController {

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtId;

    @FXML
    void btnBuscarProducto(MouseEvent event) {
        Iterator<Producto> iterator = AgregarProductoController.getProductos().iterator();
        boolean bantera=false;
        int id=Integer.parseInt(txtId.getText()), i=0;
        while (!bantera&&iterator.hasNext()){
            if(iterator.next().getId()==id){
                mostrar.setText("Nombre: "+AgregarProductoController.getProductos().get(i).getNombre()+
                        "\nCantidad: "+AgregarProductoController.getProductos().get(i).getCantidad());
                bantera=true;
            }
            i++;
        }
        if(!bantera){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Buscar - Error");
            alert.setContentText("No se encontro el producto revise la id");
            alert.showAndWait();
        }
    }
    @FXML
    void btnInicio(MouseEvent event){
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }
}
