package edu.icet.thogakade.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","'0542222175'");
    }

    private Connection connection;

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if(instance==null){
            return instance = new DBConnection();
        }
        return instance;
    }
}
