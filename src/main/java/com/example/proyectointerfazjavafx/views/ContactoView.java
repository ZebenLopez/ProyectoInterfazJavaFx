package com.example.proyectointerfazjavafx.views;

import com.example.proyectointerfazjavafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ContactoView {

    private static Stage contactoStage = new Stage();

    public static void show() throws IOException {
        contactoStage.hide();

        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("contacto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        contactoStage.setTitle("Contacto");
        contactoStage.setScene(scene);
        contactoStage.setResizable(false);
        contactoStage.show();


    }
}
