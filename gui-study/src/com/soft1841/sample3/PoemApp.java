package com.soft1841.sample3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PoemApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
      Parent root =
                FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("数组GUI古诗面板程序");
        Scene scene = new Scene(root, 1000, 600);

        scene.getStylesheets().add(PoemApp.class.getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



