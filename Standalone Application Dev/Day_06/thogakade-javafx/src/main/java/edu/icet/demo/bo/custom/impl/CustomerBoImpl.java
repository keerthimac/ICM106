package edu.icet.demo.bo.custom.impl;

import edu.icet.demo.bo.custom.CustomerBo;
import edu.icet.demo.model.Customer;

public class CustomerBoImpl implements CustomerBo {

    @Override
    public boolean saveCustomer(Customer dto) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
