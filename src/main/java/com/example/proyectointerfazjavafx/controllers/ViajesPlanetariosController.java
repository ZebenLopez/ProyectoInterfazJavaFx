package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import com.example.proyectointerfazjavafx.views.ViajePlanetarioElegidoView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ViajesPlanetariosController {
    @FXML
    public void botonMenuInvisible(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
    @FXML
    public void botonPlaneta(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        ViajePlanetarioElegidoView.show();
    }
    @FXML
    public void botonSalir(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
}
