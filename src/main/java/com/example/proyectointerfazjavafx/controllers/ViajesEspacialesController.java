package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import com.example.proyectointerfazjavafx.views.ViajeEspacialElegidoView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class ViajesEspacialesController {
    public void botonEspaciales(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajeEspacialElegidoView.show();
    }

    public void botonSalir(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }

    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
}
