package edu.icet.demo.bo.custom.impl;

import edu.icet.demo.bo.custom.CustomerBo;
import edu.icet.demo.dao.DaoFactory;
import edu.icet.demo.dao.custom.CustomerDao;
import edu.icet.demo.dto.Customer;
import edu.icet.demo.entity.CustomerEntity;
import edu.icet.demo.util.DaoType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {

    CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoType.CUSTOMER);

    @Override
    public ObservableList<Customer> getCustomers() {
        ObservableList<Customer> customerList = FXCollections.observableArrayList();
        List<CustomerEntity> customerEntities = customerDao.get();
        for(CustomerEntity cusEntity : customerEntities){
            customerList.add(new ModelMapper().map(cusEntity,Customer.class));
        }
        return customerList;
    }

    @Override
    public Customer searchCustomer(String id) {
       return new ModelMapper().map(customerDao.search(id),Customer.class) ;
    }

    @Override
    public boolean saveCustomer(Customer dto) {
        return customerDao.save(new ModelMapper().map(dto, CustomerEntity.class));
    }

    @Override
    public boolean updateCustomer(Customer dto) {
        return customerDao.update(new ModelMapper().map(dto,CustomerEntity.class));
    }

    @Override
    public boolean deleteCustomer(String id) {
        return customerDao.delete(id);
    }
}
