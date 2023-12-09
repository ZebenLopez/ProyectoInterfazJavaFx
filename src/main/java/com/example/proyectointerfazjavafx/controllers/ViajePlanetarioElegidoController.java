package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.ComprarView;
import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import com.example.proyectointerfazjavafx.views.ViajesPlanetariosView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class ViajePlanetarioElegidoController {

    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }

    public void botonComprar(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ComprarView.show();
    }

    public void botonAtras(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajesPlanetariosView.show();
    }
}
