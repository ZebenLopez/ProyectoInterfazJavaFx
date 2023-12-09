package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.Main;
import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PantallaPrincipalController {

    @FXML

    public void botonSalir(ActionEvent actionEvent) {
        System.exit(0);
    }
    @FXML
    public void botonMenu(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
    @FXML
    public void menu() {
    }

    @FXML
    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
}
