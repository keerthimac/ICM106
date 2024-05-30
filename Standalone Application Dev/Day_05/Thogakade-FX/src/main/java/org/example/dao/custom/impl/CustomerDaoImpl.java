package org.example.dao.custom.impl;

import org.example.dao.custom.CustomerDao;
import org.example.entity.CustomerEntity;
import org.example.util.CrudUtil;

import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {

        try {
            String SQL = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
            CrudUtil.execute(
                    SQL,
                    entity.getCustomerId(),
                    entity.getCustomerTitle(),
                    entity.getCustomerName(),
                    entity.getDob(),
                    entity.getSalary(),
                    entity.getAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getPostalCode()
            );

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
