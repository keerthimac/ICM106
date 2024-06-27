package edu.icet.demo.dao.custom.impl;

import edu.icet.demo.dao.custom.ItemDao;
import edu.icet.demo.entity.ItemEntity;

import edu.icet.demo.entity.OrderDetailEntity;
import edu.icet.demo.entity.OrderEntity;
import edu.icet.demo.util.CrudUtil;

import java.sql.SQLException;
import java.util.List;

public class ItemDaoImpl implements ItemDao {

    @Override
    public List<ItemEntity> get() {
        return null;
    }

    @Override
    public ItemEntity search(String id) {
        return null;
    }

    @Override
    public boolean save(ItemEntity dao) {
        return false;
    }

    @Override
    public boolean updateQty(List<OrderDetailEntity> daoList) {
        for (OrderDetailEntity orderDetail : daoList) {
            boolean isItemUpdated = updateQty(orderDetail);
            if (!isItemUpdated) {
                return false;
            }
        }
        return true;
    }

    public boolean updateQty(OrderDetailEntity dao) {
        String SQL = "UPDATE item SET QtyOnHand=QtyOnHand-? WHERE itemCode=?";
        try {
            return CrudUtil.execute(SQL,
                    dao.getQty(),
                    dao.getItemCode()
            );
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean update(ItemEntity dao) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
