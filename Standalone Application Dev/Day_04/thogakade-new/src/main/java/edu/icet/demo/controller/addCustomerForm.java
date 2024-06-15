package edu.icet.demo.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class addCustomerFormController implements Initializable {

    public JFXTextField txtCusId;
    public ChoiceBox choMatStatus;
    public JFXTextField txtCusName;
    public DatePicker dateDob;
    public JFXTextField txtSalary;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public ChoiceBox choiceProvince;
    public JFXTextField txtPostal;
    public TableView tblCustomer01;
    public TableColumn colCusId01;
    public TableColumn colTitle;
    public TableColumn colName;
    public TableColumn colDob;
    public TableColumn colSalary;
    public TableView tblCustomer02;
    public TableColumn colCusId02;
    public TableColumn colAddress;
    public TableColumn colCity;
    public TableColumn colProvince;
    public TableColumn colPostCode;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String testing = "Hello World.....";
        System.out.println(testing);
        loadDropMenu();
    }

    private void loadDropMenu() {
        ObservableList<Object> matStatusDrop = FXCollections.observableArrayList();
        matStatusDrop.add("Mr");
        matStatusDrop.add("Mrs");
        matStatusDrop.add("Miss");
        choMatStatus.setItems(matStatusDrop);
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
    }
    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnAddCusOnAction(ActionEvent actionEvent) {
    }
}
