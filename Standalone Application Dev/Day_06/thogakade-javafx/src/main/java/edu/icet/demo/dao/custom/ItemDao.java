package edu.icet.demo.dao.custom;

import edu.icet.demo.dao.CrudDao;
import edu.icet.demo.entity.ItemEntity;
import edu.icet.demo.entity.OrderDetailEntity;

import java.util.List;

public interface ItemDao extends CrudDao<ItemEntity> {
    boolean updateQty(List<OrderDetailEntity> dao);

}
