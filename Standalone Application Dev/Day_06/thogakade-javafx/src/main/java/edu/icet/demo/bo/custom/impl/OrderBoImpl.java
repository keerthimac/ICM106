package edu.icet.demo.bo.custom.impl;

import edu.icet.demo.bo.BoFactory;
import edu.icet.demo.bo.custom.OrderBo;
import edu.icet.demo.dao.DaoFactory;
import edu.icet.demo.dao.custom.OrderDao;
import edu.icet.demo.dto.Order;
import edu.icet.demo.entity.OrderEntity;
import edu.icet.demo.util.BoType;
import edu.icet.demo.util.DaoType;
import org.modelmapper.ModelMapper;

public class OrderBoImpl implements OrderBo {

    OrderDao orderDao = DaoFactory.getInstance().getDao(DaoType.ORDER);

    @Override
    public boolean placeOrder(Order dto) {
        return orderDao.save(new ModelMapper().map(dto, OrderEntity.class));
    }
}
