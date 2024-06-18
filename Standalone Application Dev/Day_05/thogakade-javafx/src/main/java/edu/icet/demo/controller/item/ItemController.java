package edu.icet.demo.controller.item;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Item;
import edu.icet.demo.model.OrderDetail;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemController {

    public static ItemController instance;

    private ItemController(){
    }

    public static ItemController getInstance(){
        if(instance==null) {
            return instance = new ItemController();
        }
        return instance;
    }

    public ObservableList<Item> getAllItems() {
        try {
            ResultSet resultSet  = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT*FROM item");
            ObservableList<Item> items = FXCollections.observableArrayList();
            while(resultSet.next()){
                Item item = new Item(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getInt(5)
                );
                items.add(item);
            }
            return items;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateStock(List<OrderDetail> orderDetailList) {
        for (OrderDetail orderDetail:orderDetailList){
            int isAdd = updateStock(orderDetail);
            if (isAdd>0){
                return true;
            }
        }
        return false;
    }

    public int updateStock(OrderDetail orderDetail) {
        try {
            System.out.println(orderDetail);
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ptSt = connection.prepareStatement("UPDATE item SET QtyOnHand=QtyOnHand-? WHERE itemCode=?");
            ptSt.setInt(1,orderDetail.getQty());
            ptSt.setString(2,orderDetail.getItemCode());
            return ptSt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
