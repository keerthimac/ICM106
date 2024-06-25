package edu.icet.demo.bo.custom.impl;

import edu.icet.demo.bo.BoFactory;
import edu.icet.demo.bo.custom.OrderBo;
import edu.icet.demo.dto.Order;
import edu.icet.demo.util.BoType;

public class OrderBoImpl implements OrderBo {
    @Override
    public boolean placeOrder(Order dto) {
        return false;
    }
}
