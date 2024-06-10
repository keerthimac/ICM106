package edu.icet.demo.controller.customer;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerController implements CustomerService {

    public static CustomerController instance;

    private CustomerController(){};

    public static CustomerController getInstance(){
        if(instance == null) return instance = new CustomerController();
        return instance;
    }

    public ObservableList<Customer> getAllCustomers() {
        ObservableList<Customer> customerList = FXCollections.observableArrayList();
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
            return customerList;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addCustomer(Customer newCustomer) throws RuntimeException {
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
            return preparedStatement.execute();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateCustomer(Customer newCustomer) throws RuntimeException {
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
            return preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteCustomer(String custId) throws RuntimeException {
        try {
            return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM customer WHERE CustId ='" + custId + "'").execute();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Customer> searchCustomer(String custId) throws RuntimeException {
        List<Customer> customers = new ArrayList<>();
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
                customers.add(customer);
            }
        return customers;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
