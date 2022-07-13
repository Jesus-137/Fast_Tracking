module com.upchiapas.inicio_secion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.inicio_secion to javafx.fxml;
    exports com.upchiapas.inicio_secion;
    exports com.upchiapas.inicio_secion.controllers;
    opens com.upchiapas.inicio_secion.controllers to javafx.fxml;
}