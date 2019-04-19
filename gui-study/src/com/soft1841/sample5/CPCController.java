package com.soft1841.sample5;
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
public class CPCController {
    @FXML
    private FlowPane CPCPane;
    @FXML
    private VBox songBox;

    public void showAllone () {
        ObservableList<Node> list = CPCPane.getChildren();
        CPCPane.getChildren().removeAll(list);
        songBox.setVisible(false);
        CPCPane.setVisible(true);
        CPC[] CPCs = new CPC[]{
                new CPC("李克强同志", "12.png"),
                new CPC("栗战书同志", "13.png"),
                new CPC("汪洋同志", "14.png"),
                new CPC("王沪宁同志", "15.png"),
                new CPC("赵乐际同志", "16.png"),
                new CPC("韩正同志", "17.png"),
        };
        for (CPC CPC : CPCs
        ) {
            BorderPane borderPane = new BorderPane();
            Label namelabel = new Label(CPC.getName());
            Image image = new Image("/img/" + CPC.getAvatar());
            ImageView imageView = new ImageView(image);
            borderPane.setCenter(imageView);//头像加到中间
            borderPane.setBottom(namelabel);//名字加到下面
            CPCPane.getChildren().add(borderPane);
        }
    }
    public void showSong () {
        ObservableList <Node> list = songBox.getChildren();
        songBox.getChildren().removeAll(list);
        CPCPane.setVisible(false);
        songBox.setVisible(true);
        Song [] songs = new Song[]{
                new Song("义武军进行曲", "中国人民解放军军乐团",      "https://music.163.com/?from=infinity#/outchain/2/395749/", "song4.png", "01:40"),

        };
        for (Song song : songs) {
            HBox hBox = new HBox();
            hBox.setSpacing(20);
            hBox.setMinWidth(700);
            hBox.setPadding(new Insets(20, 20, 20, 20));
            Image image = new Image("/img/" + song.getLogo());
            ImageView imageView = new ImageView(image);
            imageView.setStyle("-fx-cursor: hand;");
            imageView.setOnMouseClicked(event -> {
                Stage stage = new Stage();
                stage.setTitle("中华人民共和国国歌");
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