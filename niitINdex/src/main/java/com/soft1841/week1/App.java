package com.soft1841.week1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        URL location=getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader=new FXMLLoader(location);
        Parent root=fxmlLoader.load();
        Scene scene=new Scene(root,800,1000);
        scene.getStylesheets().addAll(
                "/css/style1.css");
        primaryStage.setTitle("扇贝英语");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args) {
        Application.launch(args);
    }
}
