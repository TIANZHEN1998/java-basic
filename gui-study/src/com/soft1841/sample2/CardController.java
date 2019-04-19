package com.soft1841.sample2;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

         public class CardController {
             @FXML
             private BorderPane mainContainer;

             public void showCardOne () throws Exception {
                 Parent cardOne = FXMLLoader.load(getClass().getResource("card1.fxml"));
                 mainContainer.setCenter(cardOne);
             }
             public void showCardTwo () throws Exception {
                 Parent cardOne =
                         FXMLLoader.load(getClass().getResource("card2.fxml"));

                 mainContainer.setCenter(cardOne);
             }
             public static class ArrayController {
                 public static void main (String[] args) {
                 }
             }
             }