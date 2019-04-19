package com.soft1841.sample7;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private TextField keywordsField;
    @FXML
    private ListView<HBox> studentListView;
    Student[] students = new Student[]{
            new Student("30.jpg","袁腾飞","男","安徽阜阳","15961101404","1802343337","112"),
            new Student("31.jpg","王欢乐","女","甘肃平凉","18805162578","1802343334","346"),
            new Student("32.jpg","汤  越","男","江苏常州","15651200279","1802343314","112"),
            new Student("33.jpg","黄劲理","男","广西钦州","13140344411","1802343308","112"),
            new Student("34.jpg","夏铭慧","女","江苏宿迁","13218926185","1802343335","346"),
            new Student("35.jpg","汤萌慧","女","北京朝阳","13585099125","180234333","346"),
            new Student("36.jpg","孟妮","女","安徽宿州","15556224828","1802343332","346"),
            new Student("37.jpg","侯粤嘉","男","湖南郴州","18851853957","1802343307","114")};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        genderComboBox.getItems().setAll("男", "女");
        for (Student s : students
        ) {
            HBox hBox = new HBox();

            Image image = new Image("/img/" + s.getPicture());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox.getChildren().add(imageView);
            Label labelName = new Label("\t姓名：" + s.getName());
            hBox.getChildren().add(labelName);
            Label labelGender = new Label("\t性别：" + s.getGender());
            hBox.getChildren().add(labelGender);
            String hiddenPhone =
                    s.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            Label labelNumber = new Label("\t手机号：" + hiddenPhone);
            hBox.getChildren().add(labelNumber);
            Label labelDormitory = new Label("\t宿舍号：" + s.getDormRoom());
            hBox.getChildren().add(labelDormitory);
            Label labelStudentId = new Label("\t学号：" + s.getStudentNumber());
            hBox.getChildren().add(labelStudentId);
            Label labelAddress = new Label("\t家庭住址" + s.getHomeAddress());
            hBox.getChildren().add(labelAddress);
            studentListView.getItems().add(hBox);
        }
        genderComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                searchSex(newValue);
            }
        });
    }
    public void searchSex(String keywords) {
        ObservableList<HBox> list = studentListView.getItems();
        studentListView.getItems().removeAll(list);
        for (Student student : students
        ) {
            HBox hBox1 = new HBox();
            Image image = new Image("/img/" + student.getPicture());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox1.getChildren().add(imageView);
            Label labelName = new Label("\t姓名：" + student.getName());
            hBox1.getChildren().add(labelName);
            Label labelGender = new Label("\t性别：" + student.getGender());
            hBox1.getChildren().add(labelGender);
            String hiddenPhone =
                    student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            Label labelNumber = new Label("\t手机号：" + hiddenPhone);
            hBox1.getChildren().add(labelNumber);
            Label labelDormRoom = new Label("\t宿舍号：" + student.getDormRoom());
            hBox1.getChildren().add(labelDormRoom);
            Label labelStudentId = new Label("\t学号：" + student.getStudentNumber());
            hBox1.getChildren().add(labelStudentId);
            Label labelAddress = new Label("\t家庭住址:" + student.getHomeAddress());
            hBox1.getChildren().add(labelAddress);
            if (student.getGender().contains(keywords)) {
                studentListView.getItems().add(hBox1);
            }
        }
    }

    public void enter() {
        keywordsField.setText("");
    }

    public void searchByKeywords() {
        ObservableList<HBox> list = studentListView.getItems();
        studentListView.getItems().removeAll(list);
        String keywords = keywordsField.getText().trim();
        for (Student student : students
        ) {
            HBox hBox1 = new HBox();
            Image image = new Image("/img/" + student.getPicture());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox1.getChildren().add(imageView);
            Label labelName = new Label("\t姓名：" + student.getName());
            hBox1.getChildren().add(labelName);
            Label labelGender = new Label("\t性别：" + student.getGender());
            hBox1.getChildren().add(labelGender);
            String hiddenPhone =
                    student.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            Label labelNumber = new Label("\t手机号：" + hiddenPhone);
            hBox1.getChildren().add(labelNumber);
            Label labelDormRoom = new Label("\t宿舍号：" + student.getDormRoom());
            hBox1.getChildren().add(labelDormRoom);
            Label labelStudentId = new Label("\t学号：" + student.getStudentNumber());
            hBox1.getChildren().add(labelStudentId);
            Label labelAddress = new Label("\t家庭住址" + student.getHomeAddress());
            hBox1.getChildren().add(labelAddress);
            if (student.getName().contains(keywords)) {
                studentListView.getItems().add(hBox1);
            }
            if (student.getDormRoom().contains(keywords)){
                studentListView.getItems().add(hBox1);
            }
            if (student.getHomeAddress().contains(keywords)){
                studentListView.getItems().add(hBox1);
            }
        }
    }
}
