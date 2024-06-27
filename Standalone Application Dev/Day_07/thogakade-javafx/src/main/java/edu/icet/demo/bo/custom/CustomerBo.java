package edu.icet.demo.bo.custom;

import edu.icet.demo.bo.SuperBo;
import edu.icet.demo.dto.Customer;
import javafx.collections.ObservableList;

public interface CustomerBo extends SuperBo {
    ObservableList<Customer> getCustomers();
    Customer searchCustomer(String id);
    boolean saveCustomer(Customer dto);
    boolean updateCustomer(Customer dto);
    boolean deleteCustomer(String id);
}
