package org.example.bo.custom;

import org.example.bo.SuperBo;
import org.example.dto.Customer;

public interface CustomerBo extends SuperBo{
    boolean saveCustomer(Customer dto);
    boolean deleteById(String id);
}
