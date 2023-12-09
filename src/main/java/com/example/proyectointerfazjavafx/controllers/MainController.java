package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.PantallaRegistroView;
import com.example.proyectointerfazjavafx.views.PrincipalView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class MainController {
    String usuario = "admin";
    String contraseña = "admin";
    @FXML
    public TextField texto1;

    @FXML
    public void botonrRegistro(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        PantallaRegistroView.show();
    }

    @FXML
    public void botonLogin(ActionEvent actionEvent) throws IOException {
        if (texto1.getText().equals(usuario) && texto1.getText().equals(contraseña)) {
            ((Button) actionEvent.getSource()).getScene().getWindow().hide();
            PrincipalView.show();
        } else {
            mostrarAlerta("Error", "Usuario o contraseña incorrectos");
        }
//        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
//        PrincipalView.show();
    }

    @FXML
    private AnchorPane anchorPane;

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.getDialogPane().setPrefSize(200, 150);
        alert.getDialogPane().getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style/alert.css")).toExternalForm());
        alert.initStyle(StageStyle.UNDECORATED);
        alert.showAndWait();
    }
    @FXML
    public void botonSalir(ActionEvent actionEvent) {
        System.exit(0);
    }

}