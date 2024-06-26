package edu.icet.demo.bo.custom;

import edu.icet.demo.bo.SuperBo;
import edu.icet.demo.dto.Customer;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(Customer dto);
    boolean deleteById(String id);
}
