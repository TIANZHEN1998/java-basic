package com.soft1841.sample3;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class PoemController {
    @FXML
    private BorderPane mainContainer;

    public void showCardOne() throws Exception {
        Parent cardOne =
                FXMLLoader.load(getClass().getResource("card.fxml"));
        mainContainer.setCenter(cardOne);
        String[] poem = {
                "苍苍竹林寺，","杳杳钟声晚。","荷笠带斜阳，","青山独归远。"
        };
        ListView<String> listView = new ListView<>();
        for (int i = 0 ; i < poem.length; i++ ){
            listView.getItems().add(poem[i]);
        }
        mainContainer.setCenter(listView);
    }
}
