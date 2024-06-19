package edu.icet.demo.controller.order;

import edu.icet.demo.controller.item.ItemController;
import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderController {
    private static OrderController instance;

    private OrderController(){}

    public static OrderController getInstance(){
        if(instance==null) {
            return instance = new OrderController();
        }
        return instance;
    }

    public Boolean placeOrder(Order order) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders VALUE(?,?,?)");
            preparedStatement.setString(1,order.getOrderId());
            preparedStatement.setObject(2,order.getOrderDate());
            preparedStatement.setString(3,order.getCustomerId());
            int isOrderAdd = preparedStatement.executeUpdate();
            System.out.println(isOrderAdd);
            if(isOrderAdd>0){
                Boolean isOrderDetailAdd = OrderDetailController.getInstance().placeOrderDetail(order.getOderDetailList());
                System.out.println(isOrderDetailAdd);
                if (isOrderDetailAdd){
                    boolean isUpdateStock = ItemController.getInstance().updateStock(order.getOderDetailList());
                    System.out.println(isUpdateStock);
                    if (isUpdateStock){
                        connection.setAutoCommit(true);
                        return true;
                    }
                }
            }
            connection.rollback();
            return false;
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("finally");
            connection.setAutoCommit(true);
        }
    }
}
