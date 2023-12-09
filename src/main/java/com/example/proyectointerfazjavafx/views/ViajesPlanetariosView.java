package com.example.proyectointerfazjavafx.views;

import com.example.proyectointerfazjavafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViajesPlanetariosView {

    private static Stage viajesPlanetariosStage = new Stage();

    public static void show() throws IOException {
        viajesPlanetariosStage.hide();

        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viajes-planetarios.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        newStage.setTitle("Viajes Planetarios!");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();
    }
}
