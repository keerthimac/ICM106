package edu.icet.demo.dao.custom.impl;

import edu.icet.demo.dao.custom.CustomerDao;
import edu.icet.demo.entity.CustomerEntity;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(CustomerEntity dto) {
        return false;
    }

    @Override
    public boolean delete(CustomerEntity id) {
        return false;
    }
}
