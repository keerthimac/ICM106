package edu.icet.demo.controller.customer;

import edu.icet.demo.model.Customer;
import javafx.collections.ObservableList;

import java.util.List;

public interface CustomerService {
    public ObservableList<Customer> getAllCustomers();
    public boolean addCustomer(Customer newCustomer);
    public boolean updateCustomer(Customer newCustomer);
    public boolean deleteCustomer(String custId);
    public List<Customer> searchCustomer(String custId);
}
