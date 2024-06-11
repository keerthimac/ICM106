package edu.icet.demo.controller.item;

import edu.icet.demo.db.DBConnection;
import edu.icet.demo.model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

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
}
