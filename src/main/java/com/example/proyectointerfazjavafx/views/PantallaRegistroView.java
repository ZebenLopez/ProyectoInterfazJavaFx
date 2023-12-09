package com.example.proyectointerfazjavafx.views;

import com.example.proyectointerfazjavafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PantallaRegistroView {

    private static Stage registroStage = new Stage();

    public static void show() throws IOException {
        // Oculta el Stage actual.
        registroStage.hide();

        // Crea un nuevo Stage con el nuevo estilo.
        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("register-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        newStage.setTitle("Panel Registro!");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();
    }
}