package com.soft1841.sample8;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class JianShuController  implements Initializable {
    @FXML
    private Button testBtn1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //创建图标
        Image btnImg1 = new Image("/img/123.png");
        ImageView imageView1 = new ImageView(btnImg1);
        //给按钮设置图标
        testBtn1.setGraphic(imageView1);


    }

}
