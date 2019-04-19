package com.soft1841.sample9;
import com.soft1841.sample1.ArrayApp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class PigApp  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 边界布局
        BorderPane root = new BorderPane();
        // 创建场景
        Scene scene = new Scene(root, 1400,1000);
        // 显示图片组件
        ImageView imgView = new ImageView(this.getClass().getResource("/img/tangxun.jpg").toExternalForm());
        scene.getStylesheets().add(ArrayApp.class.getResource("style.css").toExternalForm());
        imgView.setFitWidth(150);
        imgView.setFitHeight(150);
        root.setTop(imgView);
        // 主舞台的设置
        primaryStage.setScene(scene);
        primaryStage.setTitle("小猪佩奇");
        primaryStage.show();
        // 响应键盘按下事件 ,对象是scene ,不是imgView
        scene.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();
            // 按下了左键
            if (code.equals(KeyCode.LEFT)) {
                imgView.setTranslateX(imgView.getTranslateX() - 50);
                //按下了右键
            } else if (code.equals(KeyCode.RIGHT)) {
                imgView.setTranslateX(imgView.getTranslateX() + 50);
                //按下了上方向键
            } else if (code.equals(KeyCode.UP)) {
                imgView.setTranslateY(imgView.getTranslateY() - 50);
                //按下了下方向键
            } else if (code.equals(KeyCode.DOWN)) {
                imgView.setTranslateY(imgView.getTranslateY() + 50);
            }
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}