package edu.icet.demo.controller;

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
import javafx.scene.control.ChoiceBox;
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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CreateOrderForm implements Initializable {

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

    private List<Customer> customerList;

    public void btnAddOnAction(ActionEvent actionEvent) throws ParseException {
        Customer newCustomer = new Customer(txtCustomerId.getText(), cmbTitle.getValue().toString(), txtCustomerName.getText(), dateDob.getValue(), Double.parseDouble(txtSalary.getText()), txtAddress.getText(), txtCity.getText(), txtProvince.getText(), txtPostalCode.getText());
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, newCustomer.getId());
            preparedStatement.setString(2, newCustomer.getTitle());
            preparedStatement.setString(3, newCustomer.getName());
            preparedStatement.setObject(4, newCustomer.getDob());
            preparedStatement.setDouble(5, newCustomer.getSalary());
            preparedStatement.setString(6, newCustomer.getAddress());
            preparedStatement.setString(7, newCustomer.getCity());
            preparedStatement.setString(8, newCustomer.getProvince());
            preparedStatement.setString(9, newCustomer.getPostal());
            preparedStatement.execute();
            loadCustomers();
            loadTable01();
            loadTable02();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        Customer newCustomer = new Customer(txtCustomerId.getText(), cmbTitle.getValue().toString(), txtCustomerName.getText(), dateDob.getValue(), Double.parseDouble(txtSalary.getText()), txtAddress.getText(), txtCity.getText(), txtProvince.getText(), txtPostalCode.getText());
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(
                    "UPDATE customer SET CustTitle=?,CustName=?,DOB=?,salary=?,CustAddress=?,City=?,Province=?,PostalCode=? WHERE CustID = ?"
            );
            preparedStatement.setString(1, newCustomer.getTitle());
            preparedStatement.setString(2, newCustomer.getName());
            preparedStatement.setObject(3, newCustomer.getDob());
            preparedStatement.setDouble(4, newCustomer.getSalary());
            preparedStatement.setString(5, newCustomer.getAddress());
            preparedStatement.setString(6, newCustomer.getCity());
            preparedStatement.setString(7, newCustomer.getProvince());
            preparedStatement.setString(8, newCustomer.getPostal());
            preparedStatement.setString(9, newCustomer.getId());
            preparedStatement.execute();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String custId = txtCustomerId.getText();
        try {
            DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM customer WHERE CustId ='" + custId + "'").execute();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        String custId = txtCustomerId.getText();
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM customer WHERE CustId ='" + custId + "'");
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate(),
                        resultSet.getDouble(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9)
                );
                cmbTitle.setValue(customer.getTitle());
                txtCustomerName.setText(customer.getName());
                dateDob.setValue(customer.getDob());
                txtSalary.setText(String.valueOf(customer.getSalary()));
                txtAddress.setText(customer.getAddress());
                txtCity.setText(customer.getCity());
                txtProvince.setText(customer.getProvince());
                txtPostalCode.setText(customer.getPostal());
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadDrops();
        loadCustomers();
        loadTable01();
        loadTable02();
    }

    private void loadTable02() {
        ObservableList<Table02> table02Data = FXCollections.observableArrayList();
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

    private void loadCustomers() {
        customerList = new ArrayList<>();
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM customer");
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate(),
                        resultSet.getDouble(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9)
                );
                customerList.add(customer);
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadDrops() {
        ObservableList<Object> titleDropItems = FXCollections.observableArrayList();
        titleDropItems.add("Mr");
        titleDropItems.add("Mrs");
        titleDropItems.add("Miss");
        cmbTitle.setItems(titleDropItems);

    }
}
