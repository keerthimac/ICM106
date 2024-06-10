package edu.icet.demo.controller.customer;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Customer;
import edu.icet.demo.model.tableModel.Table01;
import edu.icet.demo.model.tableModel.Table02;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;

public class AddCustomerFormController implements Initializable {

    public JFXTextField txtCustomerId;
    public JFXTextField txtCustomerName;
    public JFXComboBox cmbTitle;
    public DatePicker dateDob;
    public JFXTextField txtSalary;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public JFXTextField txtProvince;
    public JFXTextField txtPostalCode;
    public TableView tblCustomer1;
    public TableColumn colCustomerId01;
    public TableColumn colCusTitle;
    public TableColumn colName;
    public TableColumn colDob;
    public TableColumn colSalary;
    public TableView tblCustomer2;
    public TableColumn colCustomerId02;
    public TableColumn colAddress;
    public TableColumn colCity;
    public TableColumn colProvince;
    public TableColumn colPostalCode;
    public JFXButton btnUpdate;
    public JFXButton btnDelete;
    public JFXButton btnSearch;

    CustomerService customerService;


    public void btnAddOnAction(ActionEvent actionEvent) {
        Customer newCustomer = new Customer(txtCustomerId.getText(), cmbTitle.getValue().toString(), txtCustomerName.getText(), dateDob.getValue(), Double.parseDouble(txtSalary.getText()), txtAddress.getText(), txtCity.getText(), txtProvince.getText(), txtPostalCode.getText());
        boolean b = customerService.addCustomer(newCustomer);
        if (b) {
            new Alert(Alert.AlertType.ERROR, "Customer Did Not Added").show();
        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Added").show();
        }
        loadTable01();
        loadTable02();


    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        Customer newCustomer = new Customer(txtCustomerId.getText(), cmbTitle.getValue().toString(), txtCustomerName.getText(), dateDob.getValue(), Double.parseDouble(txtSalary.getText()), txtAddress.getText(), txtCity.getText(), txtProvince.getText(), txtPostalCode.getText());
        boolean b = customerService.updateCustomer(newCustomer);
        if (b) {
            new Alert(Alert.AlertType.ERROR, "Customer Did Not Updated").show();
        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Updated").show();
        }
        loadTable01();
        loadTable02();
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String custId = txtCustomerId.getText();
        boolean b = customerService.deleteCustomer(custId);
        if (b) {
            new Alert(Alert.AlertType.ERROR, "Customer Did Not Deleted").show();
        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Deleted").show();
        }
        loadTable01();
        loadTable02();
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        String custId = txtCustomerId.getText();
        for (Customer customer : customerService.searchCustomer(custId)) {
            cmbTitle.setValue(customer.getTitle());
            txtCustomerName.setText(customer.getName());
            dateDob.setValue(customer.getDob());
            txtSalary.setText(String.valueOf(customer.getSalary()));
            txtAddress.setText(customer.getAddress());
            txtCity.setText(customer.getCity());
            txtProvince.setText(customer.getProvince());
            txtPostalCode.setText(customer.getPostal());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.customerService = CustomerController.getInstance();
        loadDrops();
        loadTable01();
        loadTable02();
    }

    private void loadTable02() {
        ObservableList<Table02> table02Data = FXCollections.observableArrayList();
        ObservableList<Customer> customerList = customerService.getAllCustomers();
        customerList.forEach(customer -> {
            Table02 table02 = new Table02(
                    customer.getId(),
                    customer.getAddress(),
                    customer.getCity(),
                    customer.getProvince(),
                    customer.getPostal()
            );
            table02Data.add(table02);
        });
        tblCustomer2.setItems(table02Data);
        colCustomerId02.setCellValueFactory(new PropertyValueFactory<>("id"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<>("postal"));
    }

    private void loadTable01() {
        ObservableList<Table01> table01Data = FXCollections.observableArrayList();
        ObservableList<Customer> customerList = customerService.getAllCustomers();
        customerList.forEach(customer -> {
            Table01 table01 = new Table01(
                    customer.getId(),
                    customer.getTitle(),
                    customer.getName(),
                    customer.getDob(),
                    customer.getSalary()
            );
            table01Data.add(table01);
        });
        tblCustomer1.setItems(table01Data);
        colCustomerId01.setCellValueFactory(new PropertyValueFactory<>("id"));
        colCusTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

    }

    private void loadDrops() {
        ObservableList<Object> titleDropItems = FXCollections.observableArrayList();
        titleDropItems.add("Mr");
        titleDropItems.add("Mrs");
        titleDropItems.add("Miss");
        cmbTitle.setItems(titleDropItems);

    }
}
