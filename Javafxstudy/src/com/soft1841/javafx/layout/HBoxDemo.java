package com.soft1841.javafx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox 布局练习");
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(50, 50, 50, 50));
        hBox.setStyle("-fx-background-color: #65C0CD");
      //
        for (int i = 1; i <= 5; i++) {
            Button button = new Button("按钮" + i);
            button.setMinSize(80, 30);
            button.setStyle("-fx-background-color:#D889C3;-fx-text-fill:#FFFFFF;-fx-font-size:14px");
            hBox.getChildren().add(button);
        }
        Label label = new Label("田震");
        label.setStyle("-fx-font-size: 20px;-fx-text-fill: #6C2756");
        Image image = new Image("resources/img/nice.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        hBox.getChildren().add(label);
        hBox.getChildren().add(imageView);
        Scene scene = new Scene(hBox, 900, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args) {
        Application.launch(args);
    }
}
