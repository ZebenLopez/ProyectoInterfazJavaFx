module com.example.proyectointerfazjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;


    opens com.example.proyectointerfazjavafx to javafx.fxml;
    exports com.example.proyectointerfazjavafx;
    exports com.example.proyectointerfazjavafx.controllers;
    opens com.example.proyectointerfazjavafx.controllers to javafx.fxml;
    exports com.example.proyectointerfazjavafx.views;
    opens com.example.proyectointerfazjavafx.views to javafx.fxml;
}