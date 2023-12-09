package com.example.proyectointerfazjavafx.controllers;

import com.example.proyectointerfazjavafx.views.MenuAbiertoView;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class ComprarController {
    public void botonVolver(ActionEvent actionEvent) throws IOException {
        ((Button) actionEvent.getSource()).getScene().getWindow().hide();
        MenuAbiertoView.show();
    }
}
