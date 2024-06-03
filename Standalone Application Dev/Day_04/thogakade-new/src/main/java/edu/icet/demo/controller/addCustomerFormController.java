package edu.icet.demo.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class addCustomerForm {
    @FXML
    private JFXButton btnAddCusOnAction;

    @FXML
    private ChoiceBox<?> choMatStatus;

    @FXML
    private ChoiceBox<?> choiceProvince;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCusId01;

    @FXML
    private TableColumn<?, ?> colCusId02;

    @FXML
    private TableColumn<?, ?> colDob;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPostCode;

    @FXML
    private TableColumn<?, ?> colProvince;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private DatePicker dateDob;

    @FXML
    private TableView<?> tblCustomer01;

    @FXML
    private TableView<?> tblCustomer02;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtCity;

    @FXML
    private JFXTextField txtCusId;

    @FXML
    private JFXTextField txtCusName;

    @FXML
    private JFXTextField txtPostal;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void dobOnAction(ActionEvent event) {

    }

}
