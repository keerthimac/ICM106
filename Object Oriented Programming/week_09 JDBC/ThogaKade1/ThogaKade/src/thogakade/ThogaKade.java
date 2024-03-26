package thogakade;

import java.sql.*;

public class ThogaKade {

    public static void main(String[] args) {
        String sql = "Insert into Customer Values('C1112','Niroth','Panadura',45000)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Drvier s/w notg found...");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "0542222175");
            Statement stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
