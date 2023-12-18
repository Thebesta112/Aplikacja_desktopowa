package com.example.aplikacja_desktopowa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("golebie.jpg")));
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("skinny.jpg")));
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("medium.jpg")));
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("xxl.jpg")));
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("l-man.jpg")));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}