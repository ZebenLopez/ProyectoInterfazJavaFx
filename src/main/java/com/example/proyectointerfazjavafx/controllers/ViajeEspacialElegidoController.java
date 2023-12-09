package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.Main;
import com.example.proyectointerfazjavafx.views.ComprarView;
import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import com.example.proyectointerfazjavafx.views.ViajesEspacialesView;
import com.example.proyectointerfazjavafx.views.ViajesPlanetariosView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViajeEspacialElegidoController {


    public void botonAtras(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajesEspacialesView.show();
    }

    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }

    public void botonComprar(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ComprarView.show();
    }
}
