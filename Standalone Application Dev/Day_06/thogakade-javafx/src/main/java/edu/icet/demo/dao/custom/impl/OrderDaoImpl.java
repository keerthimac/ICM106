package edu.icet.demo.dao.custom.impl;

import edu.icet.demo.dao.DaoFactory;
import edu.icet.demo.dao.SuperDao;
import edu.icet.demo.dao.custom.ItemDao;
import edu.icet.demo.dao.custom.OrderDao;
import edu.icet.demo.dao.custom.OrderDetailDao;
import edu.icet.demo.entity.OrderEntity;
import edu.icet.demo.util.CrudUtil;
import edu.icet.demo.util.DaoType;
import org.modelmapper.ModelMapper;

import java.sql.SQLException;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public List<OrderEntity> get() {
        return null;
    }

    @Override
    public OrderEntity search(String id) {
        return null;
    }

    @Override
    public boolean save(OrderEntity dao) {
        System.out.println(dao);
        String SQL = "INSERT INTO orders VALUE(?,?,?)";
        try {
            CrudUtil.setAutoCommitFalse();
            boolean isOrderAdd = CrudUtil.execute(SQL,
                    dao.getOrderId(),
                    dao.getOrderDate(),
                    dao.getCustomerId()
            );
            if (isOrderAdd) {
                OrderDetailDao orderDetailDao = DaoFactory.getInstance().getDao(DaoType.ORDER_DETAILS);
                boolean isOrderDetailAdd = orderDetailDao.save(dao.getOderDetailList());
                if(isOrderDetailAdd){
                    ItemDao itemDao = DaoFactory.getInstance().getDao(DaoType.ITEM);
                    boolean isStockUpdated = itemDao.updateQty(dao.getOderDetailList());
                    if(isStockUpdated){
                        CrudUtil.setAutoCommitTrue();
                        return true;
                    }
                }
            }
            CrudUtil.rollback();
            return false;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                CrudUtil.setAutoCommitTrue();
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean update(OrderEntity dao) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
