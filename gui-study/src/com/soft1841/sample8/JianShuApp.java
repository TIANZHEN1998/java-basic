package com.soft1841.sample8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class JianShuApp extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        URL location=getClass().getResource("main.fxml");
        FXMLLoader fxmlLoader=new FXMLLoader(location);
        BorderPane borderPane=fxmlLoader.load();
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(borderPane,screenSize.width,screenSize.height);
        //添加样式
        scene.getStylesheets().addAll("style.css");
        primaryStage.setTitle("简书");
        primaryStage.setScene(scene); //舞台设置场景
        primaryStage.show();   //舞台可见
    }
    public static void main(String[] args) {
        launch(args);
    }
}
