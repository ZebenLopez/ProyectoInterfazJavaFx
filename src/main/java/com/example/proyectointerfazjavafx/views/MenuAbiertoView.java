package com.example.proyectointerfazjavafx.views;

import com.example.proyectointerfazjavafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MenuAbiertoView {

    private static Stage menuAbiertoStage = new Stage();

    public static void show() throws IOException {
        menuAbiertoStage.hide();

        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu-abierto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        newStage.setTitle("Panel Menu Abierto!");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();
    }
}
