package com.soft1841.sample4;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class SingerController {
    @FXML
    private FlowPane singerPane;
    @FXML
    private VBox songBox;

    public void showSingers () {
        ObservableList <Node> list = singerPane.getChildren();
        singerPane.getChildren().removeAll(list);
        songBox.setVisible(false);
        singerPane.setVisible(true);
        Singer[] singers = new Singer[]{
                new Singer("歌手排行", "0.png"),
                new Singer("薛之谦", "1.png"),
                new Singer("花粥", "2.png"),
                new Singer("陈奕迅", "3.png"),
                new Singer("林俊杰", "4.png"),
                new Singer("邓紫棋", "5.png"),
                new Singer("林宥嘉", "6.png"),
                new Singer("王贰浪", "7.png")
        };
        for (Singer singer : singers
        ) {
            BorderPane borderPane = new BorderPane();
            //创建一个文本组件，同时将歌手的姓名作为文本的内容
            Label namelabel = new Label(singer.getName());
            //创建一个图片组件，同时将歌手的照片作为图片的内容
            Image image = new Image("/img/" + singer.getAvatar());
            ImageView imageView = new ImageView(image);
            borderPane.setCenter(imageView);//头像加到中间
            borderPane.setBottom(namelabel);//名字加到下面
            //将每个歌手的border Pane面板加入sIngerPane
            singerPane.getChildren().add(borderPane);
        }
    }

    public void showSongs () {
        ObservableList <Node> list = songBox.getChildren();
        songBox.getChildren().removeAll(list);
        singerPane.setVisible(false);
        songBox.setVisible(true);
        Song[] songs = new Song[]{
                new Song("年少有为", "李荣浩", "https://music.163.com/?from=infinity#/song?id=1293886117", "song1.png", "04:39"),
                new Song("可不可以", "张子豪", "https://music.163.com/?from=infinity#/song?id=553755659", "song2.png", "04:00"),
                new Song("盗将行", "花粥", "https://music.163.com/?from=infinity#/song?id=574566207", "song3.png", "03:18")
        };
        for (Song song : songs) {
            HBox hBox = new HBox();
            hBox.setSpacing(20);
            hBox.setMinWidth(700);
            hBox.setPadding(new Insets(20, 20, 20, 20));
            Image image = new Image("/img/" + song.getLogo());
            ImageView imageView = new ImageView(image);
            imageView.setStyle("-fx-cursor: hand;");
            //点击歌曲图片通过webview加载音乐网址
            imageView.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                stage.setTitle("歌曲界面");
                WebView webView = new WebView();
                WebEngine webEngine = webView.getEngine();
                webEngine.load(song.getSongUrl());
                Scene scene = new Scene(webView, 1200, 600);
                stage.setScene(scene);
                stage.show();
            });
            Label songNameLabel = new Label(song.getSongName());
            Label timeLabel = new Label(song.getTime());
            Label singerNameLabel = new Label(song.getSinger());
            hBox.getChildren().addAll(imageView, songNameLabel, timeLabel, singerNameLabel);
            songBox.getChildren().add(hBox);
        }
    }
}