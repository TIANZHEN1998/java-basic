package com.soft1841.sample6;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private ComboBox <String> genderComboBox;
    @FXML
    private ListView <Student> studentListView;
    @FXML
    private TextField keywordsField;
    Student[] students = new Student[]{
            new Student("高金通", " 男", "18013394607", "江苏连云港", "115", "/img/20.jpg"),
            new Student("郭瑞昌", " 男", "18851853897", "山西临汾", "114", "/img/21.jpg"),
            new Student("林斌涛", " 男", "18851853611", "浙江温州", "116", "/img/22.jpg"),
            new Student("徐鹏", " 男", "13485099125", "江苏宿迁", "113", "/img/23.jpg"),
            new Student("位哲武", " 男", "13013947768", "江苏徐州", "115", "/img/24.jpg"),
            new Student("周国庆", " 男", "13988889999", "江苏徐州", "113", "/img/25.jpg"),
            new Student("亢悦昕", " 女", "13988889999", "山西忻州", "347", "/img/26.jpg"),
            new Student("刘恋", " 女", "18386294658", "贵州毕节", "347", "/img/27.jpg"),
            new Student("孟妮", " 女", "15556224828", "江苏徐州", "346", "/img/28.jpg"),
            new Student("王欢乐", " 女", "17748986841", "甘肃平凉", "346", "/img/29.jpg")};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        genderComboBox.getItems().setAll("男", "女","113","114","115","116","346","347");
        studentListView.getItems().setAll(students);
    }
    public void enter () {
        keywordsField.setText(" ");
    }
    public void searchByKeywords () {
        ObservableList<Student> list = studentListView.getItems();

        studentListView.getItems().removeAll(list);
        String keywords = keywordsField.getText().trim();
        for (Student student : students) {
            if (student.getHomeAddress().contains(keywords)) {
                studentListView.getItems().add(student);
            }
        }
    }
}