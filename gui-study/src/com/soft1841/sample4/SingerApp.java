package com.soft1841.sample4;
        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;
public class SingerApp  extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        Parent root =
                FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("歌手");
        Scene scene = new Scene(root, 1300, 650);

        scene.getStylesheets().add(SingerApp.class.getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args) {
        launch(args);
    }

}
