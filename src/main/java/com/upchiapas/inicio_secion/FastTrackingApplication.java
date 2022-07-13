package com.upchiapas.inicio_secion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FastTrackingApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FastTrackingApplication.stage=stage;
        scene=new Scene(loadFXML("Login-view"));
        stage.setTitle("Fast Tracking");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

    public static Parent loadFXML(String nombre){
        FXMLLoader fxmlLoader = new FXMLLoader(FastTrackingApplication.class.getResource(nombre+".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nombre, String title){
        scene.setRoot(loadFXML(nombre));
        stage.setResizable(true);
        stage.sizeToScene();
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle(title);
    }

    public static void main(String[] args) {launch();}
}