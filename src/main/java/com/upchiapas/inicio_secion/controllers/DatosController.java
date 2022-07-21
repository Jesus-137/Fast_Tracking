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
        ArrayList<Cliente> pacientes= AgregarPacienteController.getClientes();
        Iterator<Cliente> iterator = pacientes.iterator();
        int id=Integer.parseInt(txtId.getText());
        boolean buscar=false;
        int i=0;
        String cadena="";
        while (!buscar&&iterator.hasNext()){
            if (iterator.next().getId()==id){
                mostrar.setText("Nombre: "+pacientes.get(i).getNombre()+" Edad: "+pacientes.get(i).getEdad()+"Tratamientos: ");
                for (int j=0; j<pacientes.get(i).getTratamientos().size(); j++){
                    cadena+=pacientes.get(i).getTratamientos().get(j)+"\n";
                }
                tratamientos.setText(cadena);
                buscar=true;
            }
            i++;
        }
    }
}
