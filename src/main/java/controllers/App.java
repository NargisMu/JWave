package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

// отдельный проект
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
// https://metanit.com/java/javafx/1.8.php
        // установка надписи
        Text text = new Text("Hello METANIT.COM!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(80);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }

}
