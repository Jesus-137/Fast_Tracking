package com.upchiapas.inicio_secion.controllers;

import com.upchiapas.inicio_secion.FastTrackingApplication;
import com.upchiapas.inicio_secion.models.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Iterator;

public class DatosController {
    @FXML
    private TextField txtId;
    @FXML
    private TextArea tratamientos;
    @FXML
    private Label mostrar;

    @FXML
    void btnInicio(MouseEvent event) {
        FastTrackingApplication.setFXML("Home-view","Fast Tracking");
    }

    @FXML
    void btnBuscar(MouseEvent event){
        buscar(Integer.parseInt(txtId.getText()));
    }

    private String buscar(int id){
        ArrayList<Cliente> pacientes= AgregarPacienteController.getClientes();
        Iterator<Cliente> iterator = pacientes.iterator();
        boolean buscar=false;
        int i=0;
        while (!buscar&&iterator.hasNext()){
            if (iterator.next().getId()==id){
                mostrar.setText("Nombre: "+pacientes.get(i).getNombre()+"\nEdad: "+pacientes.get(i).getEdad()+"\nTratamientos: \n");
                tratamientos.setText(pacientes.get(i).Tratamientos());
            }
            i++;
        }
        return "no se en contro al cliente revise la id";
    }
}
