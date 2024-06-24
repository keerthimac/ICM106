package edu.icet.demo.controller.order;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.dto.OrderDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailController {
    private static OrderDetailController instance;

    private OrderDetailController() {
    }

    public static OrderDetailController getInstance() {
        if (instance == null) {
            return instance = new OrderDetailController();
        }
        return instance;
    }

    public boolean placeOrderDetail(List<OrderDetail> orderDetailList) {
        for (OrderDetail orderDetail : orderDetailList) {
            int isAdd = placeOrderDetail(orderDetail);
            if (isAdd>0){
                return true;
            }
        }
        return false;
    }

    public int placeOrderDetail(OrderDetail orderDetail) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement prSt = connection.prepareStatement("INSERT INTO orderdetail VALUE(?,?,?,?)");
            prSt.setString(1, orderDetail.getOrderId());
            prSt.setString(2, orderDetail.getItemCode());
            prSt.setInt(3, orderDetail.getQty());
            prSt.setDouble(4, orderDetail.getDiscount());
            return prSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
