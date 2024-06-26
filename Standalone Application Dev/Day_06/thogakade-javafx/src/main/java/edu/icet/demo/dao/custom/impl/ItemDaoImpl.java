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
    public boolean save(ItemEntity dao) {
        return false;
    }

    @Override
    public boolean updateQty(List<OrderDetailEntity> dao) {
        boolean isItemUpdated = true;
        while (isItemUpdated){
            for(OrderDetailEntity orderDetail : dao){
                updateQty(dao);
            }
        }
        return isItemUpdated;
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
