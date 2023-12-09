package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class ContactoController {
    @FXML
    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }

    @FXML
    public TextArea texto;
    public void botonMail(ActionEvent actionEvent) throws IOException {
        if (texto.getText().isEmpty()) {
            mostrarAlerta("Error", "Debe completar todos los campos");
        } else {
            mostrarAlerta("Informacion", "El mail ha sido enviado correctamente, en breve recibirá una respuesta.");
            ((Button) actionEvent.getSource()).getScene().getWindow().hide();
            MenuAbiertoView.show();
        }
    }

    @FXML
    public void botonTelefono(ActionEvent actionEvent) throws IOException {
        if (texto.getText().isEmpty()) {
            mostrarAlerta("Error", "Debe completar todos los campos");
        } else {
            mostrarAlerta("Informacion", "El mensaje telefónico ha sido enviado correctamente, en breve recibirá una respuesta.");
            ((Button) actionEvent.getSource()).getScene().getWindow().hide();
            MenuAbiertoView.show();
        }
    }

    @FXML
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.getDialogPane().setPrefSize(200, 150);
        alert.getDialogPane().getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style/alert.css")).toExternalForm());
        alert.initStyle(StageStyle.UNDECORATED);
        alert.showAndWait();
    }
}
