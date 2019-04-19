package com.soft1841.sample1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArrayApp extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        //读入外部的fxmi布局文件
        Parent root= FXMLLoader.load(getClass().getResource("sample1.fxml"));
        //给舞台设置标题
        primaryStage.setTitle("数组的GUI界面程序");
        //创建场景
        Scene scene=new Scene(root,1000,600);
        //将外部的样式表读入
        scene.getStylesheets().add(ArrayApp.class.getResource("style.css").toExternalForm());
        //场景加入舞台，并将外部的布局文件的根节点加入其中
        primaryStage.setScene(scene);
       primaryStage.show();
    }
    public static void main (String[] args) {
        Application.launch(args);
    }
}
