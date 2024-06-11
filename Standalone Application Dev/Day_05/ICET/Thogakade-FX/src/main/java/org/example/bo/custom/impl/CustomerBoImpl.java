package org.example.bo.custom.impl;

import org.example.bo.custom.CustomerBo;
import org.example.dao.DaoFactory;
import org.example.dao.custom.CustomerDao;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.util.DaoType;
import org.modelmapper.ModelMapper;

public class CustomerBoImpl implements CustomerBo {

    private CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoType.CUSTOMER);
    @Override
    public boolean saveCustomer(Customer dto) {
        return customerDao.save(new ModelMapper().map(dto, CustomerEntity.class));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
