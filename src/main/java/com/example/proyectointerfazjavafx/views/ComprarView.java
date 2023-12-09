package com.example.proyectointerfazjavafx.views;

import com.example.proyectointerfazjavafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ComprarView {
    private static Stage comprarStage = new Stage();

    public static void show() throws IOException {
        // Oculta el Stage actual.
        comprarStage.hide();

        // Crea un nuevo Stage con el nuevo estilo.
        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("comprar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        newStage.setTitle("Panel Registro!");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();
    }
}
