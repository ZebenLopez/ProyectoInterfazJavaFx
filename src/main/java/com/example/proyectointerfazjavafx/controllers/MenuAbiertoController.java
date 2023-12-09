package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.Main;
import com.example.proyectointerfazjavafx.views.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuAbiertoController {
    @FXML
    public void botonEspaciales(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajesEspacialesView.show();
    }
    @FXML
    public void botonFuturo(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ProyectosFuturosView.show();
    }
    @FXML
    public void botonPlanetario(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajesPlanetariosView.show();
    }
    @FXML
    public void botonNosotros(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        SobreNosotrosView.show();
    }
    @FXML
    public void botonContacto(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ContactoView.show();
    }
    @FXML
    public void botonSalir(ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    public void botonCerrarSesion(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        Main.showLogin();
    }
}
