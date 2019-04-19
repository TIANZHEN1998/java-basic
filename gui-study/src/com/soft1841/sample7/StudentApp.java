package com.soft1841.sample7;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class StudentApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //读入外部的fxml布局文件
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        //给舞台设置标题
        primaryStage.setTitle("软件1841学生通讯录");
        //创建场景
        Scene scene = new Scene(root,1500,800);
        //将外部的样式表读入
        scene.getStylesheets().add(StudentApp.class.getResource("style.css").toExternalForm());

        //场景加入舞台
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}