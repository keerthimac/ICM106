package edu.icet.demo.bo.custom;

import edu.icet.demo.bo.SuperBo;
import edu.icet.demo.dto.Order;

public interface OrderBo extends SuperBo {
    public boolean placeOrder(Order dto);
}
