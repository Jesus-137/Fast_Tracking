package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Iterator;

public class AgregarProductoController {

    private static ArrayList<Producto> productos =new ArrayList<>();
    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnAgregarProducto(MouseEvent event) {
        int id, cantidad, i=0;
        boolean bandera=false;
        try {
            Iterator<Producto> iterator = productos.iterator();
            id=Integer.parseInt(txtId.getText());
            cantidad = Integer.parseInt(txtCantidad.getText());
            while (!bandera&&iterator.hasNext()) {
                if(iterator.next().getId()==id){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Ya a ingresado esta id para un producto");
                    alert.showAndWait();
                    bandera=true;
                }
                i++;
            }
            if (!bandera){
                productos.add(new Producto(txtNombre.getText(),id,cantidad));
                FastTrackingApplication.setFXML("Home-view","Fast Tracking");
            }
        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La id y la cantidad tienen que ser un numero");
            alert.showAndWait();
        }
    }

    @FXML
    void btnCancelar(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    public static ArrayList<Producto> getProductos() {return productos;}
}