package com.soft1841.book.controller;

import cn.hutool.db.Entity;
import com.soft1841.book.dao.BookDAO;
import com.soft1841.book.dao.ReaderDAO;
import com.soft1841.book.utils.DAOFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class ReaderAnalysisController  implements Initializable {

    @FXML
    private StackPane pieChartPane, barChartPane;
    private ReaderDAO readerDAO = DAOFactory.getReaderDAOInstance();

    private ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();


    @Override
    public void initialize (URL location, ResourceBundle resources) {
        initPieChart();
        initBarChart();
    }

    private void initBarChart () {

    }

    private void initPieChart() {
        }

    }
