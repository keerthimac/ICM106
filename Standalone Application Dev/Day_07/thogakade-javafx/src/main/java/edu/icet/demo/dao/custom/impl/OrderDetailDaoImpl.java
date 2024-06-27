package edu.icet.demo.dao.custom.impl;

import edu.icet.demo.dao.custom.OrderDetailDao;
import edu.icet.demo.dto.OrderDetail;
import edu.icet.demo.entity.OrderDetailEntity;
import edu.icet.demo.entity.OrderEntity;
import edu.icet.demo.util.CrudUtil;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailDaoImpl implements OrderDetailDao {
    @Override
    public List<List<OrderDetailEntity>> get() {
        return null;
    }

    @Override
    public List<OrderDetailEntity> search(String id) {
        return List.of();
    }

    @Override
    public boolean save(List<OrderDetailEntity> daoList) {
        for (OrderDetailEntity dao : daoList) {
            boolean isOrderDetailAdd = save(dao);
            if (!isOrderDetailAdd) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean update(List<OrderDetailEntity> dao) {
        return false;
    }

    public boolean save(OrderDetailEntity dao) {
        String SQL = "INSERT INTO orderdetail VALUE(?,?,?,?)";
        try {
            return CrudUtil.execute(SQL,
                    dao.getOrderId(),
                    dao.getItemCode(),
                    dao.getQty(),
                    dao.getDiscount()
            );
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
