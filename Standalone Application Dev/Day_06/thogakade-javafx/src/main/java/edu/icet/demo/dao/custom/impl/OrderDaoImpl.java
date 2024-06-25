package edu.icet.demo.dao.custom.impl;

import edu.icet.demo.dao.custom.OrderDao;
import edu.icet.demo.entity.OderEntity;

public class OrderDaoImpl implements OrderDao {

    @Override
    public boolean save(OderEntity dto) {

        return false;
    }

    @Override
    public boolean delete(OderEntity id) {
        return false;
    }
}
