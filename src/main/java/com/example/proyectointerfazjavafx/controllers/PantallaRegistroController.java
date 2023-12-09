package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class PantallaRegistroController {

    @FXML
    private TextField textUsuario;
    @FXML
    private TextField textMail;
    @FXML
    private TextField textTelefono;
    @FXML
    private TextField textPass;
    @FXML
    private TextField textPass2;
    @FXML
    public void initialize() {
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            String newText = change.getControlNewText();

            // Permite solo dígitos
            if (!newText.matches("\\d*")) {
                return null;
            }

            return change;
        });

        textTelefono.setTextFormatter(textFormatter);
    }

    @FXML
    public void ejecutarRegistro(ActionEvent actionEvent) throws IOException {
        if (textUsuario.getText().isEmpty() || textMail.getText().isEmpty() || textTelefono.getText().isEmpty() || textPass.getText().isEmpty() || textPass2.getText().isEmpty()) {
            mostrarAlerta("Error", "Debe completar todos los campos");
        } else if (!textPass.getText().equals(textPass2.getText())) {
            mostrarAlerta("Error", "Las contraseñas no coinciden");
        } else if (textPass.getText().length() < 8) {
            mostrarAlerta("Error", "La contraseña debe tener al menos 8 caracteres");
        } else if (textUsuario.getText().length() < 4) {
            mostrarAlerta("Error", "El nombre de usuario debe tener al menos 4 caracteres");
        } else if (textTelefono.getText().length() != 9) {
            mostrarAlerta("Error", "El telefono debe tener 9 digitos");
        } else if (!textMail.getText().contains("@") || !textMail.getText().contains(".")) {
            mostrarAlerta("Error", "El mail ingresado no es valido");
        } else if (textUsuario.getText().length() > 20) {
            mostrarAlerta("Error", "El nombre de usuario no puede tener mas de 20 caracteres");
        } else if (textTelefono.getText().length() > 20) {
            mostrarAlerta("Error", "El telefono no puede tener mas de 20 caracteres");
        } else if (textMail.getText().length() > 20) {
            mostrarAlerta("Error", "El mail no puede tener mas de 20 caracteres");
        } else if (textPass.getText().length() > 20) {
            mostrarAlerta("Error", "La contraseña no puede tener mas de 20 caracteres");
        } else if (textPass2.getText().length() > 20) {
            mostrarAlerta("Error", "La contraseña no puede tener mas de 20 caracteres");
        } else {
            mostrarAlertaInfo("Informacion", "El usuario ha sido registrado correctamente");
            ((Button) actionEvent.getSource()).getScene().getWindow().hide();
            Main.showLogin();
        }
    }

    @FXML
    public void botonSalir(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        Main.showLogin();
    }


    @FXML
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
    private void mostrarAlertaInfo(String titulo, String mensaje) {
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
