package edu.icet.thogakade.controller;

import com.jfoenix.controls.JFXTextField;
import edu.icet.thogakade.db.DBConnection;
import edu.icet.thogakade.model.Customer;
import edu.icet.thogakade.model.tm.Table01TM;
import edu.icet.thogakade.model.tm.Table02TM;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class AddCustomerForm implements Initializable {
    public JFXTextField txtCustomerName;
    public ChoiceBox cmbTitle;
    public DatePicker dateDob;
    public JFXTextField txtSalary;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public JFXTextField txtProvince;
    public JFXTextField txtPostalCode;
    public TableView tblCustomer1;
    public JFXTextField txtCustomerId;
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

    public void btnAddOnAction(ActionEvent actionEvent) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(dateDob.getValue().toString());
        Customer customer = new Customer(
                txtCustomerId.getText(),
                cmbTitle.getValue().toString(),
                txtCustomerName.getText(),
                dateDob.getValue(),
                Double.parseDouble(txtSalary.getText()),
                txtAddress.getText(),
                txtCity.getText(),
                txtProvince.getText(),
                txtPostalCode.getText()
        );
        System.out.println(customer);

        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement psTm=connection.prepareStatement("INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)");
            psTm.setString(1,customer.getId());
            psTm.setString(2,customer.getTitle());
            psTm.setString(3,customer.getName());
            psTm.setObject(4,customer.getDob());
            psTm.setDouble(5,customer.getSalary());
            psTm.setString(6,customer.getAddress());
            psTm.setString(7,customer.getCity());
            psTm.setString(8,customer.getProvince());
            psTm.setString(9,customer.getPostal());

            psTm.execute();
            loadCustomers();
            loadTable01();
            loadTable02();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM customer WHERE CustId='"+txtCustomerId.getText()+"'");
            while (resultSet.next()){
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

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colCustomerId01.setCellValueFactory(new PropertyValueFactory<>("id"));
        colCusTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colCustomerId02.setCellValueFactory(new PropertyValueFactory<>("id"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<>("postal"));
        loadDropMenu();
        loadCustomers();
        loadTable01();
        loadTable02();
    }

    private List<Customer> customerList;
    private void loadTable01() {
        ObservableList<Table01TM> table01Data= FXCollections.observableArrayList();
        customerList.forEach(customer -> {
            Table01TM table01 = new Table01TM(
                    customer.getId(),
                    customer.getTitle(),
                    customer.getName(),
                    customer.getDob(),
                    customer.getSalary()
            );
            table01Data.add(table01);
        });
        tblCustomer1.setItems(table01Data);
    }

    private void loadTable02(){
        ObservableList<Table02TM> table02Data = FXCollections.observableArrayList();
        customerList.forEach(customer -> {
            Table02TM table02 = new Table02TM(
                    customer.getId(),
                    customer.getAddress(),
                    customer.getCity(),
                    customer.getProvince(),
                    customer.getPostal()
            );
            table02Data.add(table02);
        });
        tblCustomer2.setItems(table02Data);
    }

    private void loadCustomers() {
        customerList = new ArrayList<>();
        try {
            ResultSet resultSet = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT*FROM customer");
            while (resultSet.next()){
                Customer customer= new Customer(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDate(4).toLocalDate(),
                        resultSet.getDouble(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9));
                System.out.println(customer);
                customerList.add(customer);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void loadDropMenu() {
        ObservableList<Object> items= FXCollections.observableArrayList();
        items.add("Mrs");
        items.add("Mr");
        items.add("Miss");
        cmbTitle.setItems(items);
    }
}
