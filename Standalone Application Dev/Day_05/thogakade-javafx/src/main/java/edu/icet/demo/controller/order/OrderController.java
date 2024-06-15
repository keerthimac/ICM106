package edu.icet.demo.controller.order;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderController {
    private static OrderController instance;

    private OrderController(){}

    public static OrderController getInstance(){
        if(instance==null) {
            return instance = new OrderController();
        }
        return instance;
    }

    public Boolean placeOrder(Order order){
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders VALUE(?,?,?)");
            preparedStatement.setString(1,order.getOrderId());
            preparedStatement.setObject(2,order.getOrderDate());
            preparedStatement.setString(3,order.getCustomerId());
            preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
