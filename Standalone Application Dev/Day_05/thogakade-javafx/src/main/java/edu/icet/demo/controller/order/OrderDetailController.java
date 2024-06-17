package edu.icet.demo.controller.order;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Order;
import edu.icet.demo.model.OrderDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailController {
    public static OrderDetailController instance;

    private OrderDetailController(){}

    public static OrderDetailController getInstance(){
        if(instance == null){
            return instance = new OrderDetailController();
        }
        return instance;
    }

    public Boolean placeOrderDetail(List<OrderDetail> orderDetailList){
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
