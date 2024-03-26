import java.sql.*;
class Demo {
    public static void main(String[] args) {
        //String sql = "Insert into Customer Values('C1112','Niroth','Panadura',45000)";
        //String sql = "delete from customer where id='C1112'";
        String sql = "select * from customer;";
        //String sql = "select * from customer where address='matara';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Drvier s/w notg found...");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ThogaKade", "root", "0542222175");
            Statement stm = conn.createStatement();
            //stm.executeUpdate(sql);
            ResultSet rst=stm.executeQuery(sql);
            while(rst.next()){
                String id=rst.getString("id");
                String name=rst.getString("name");
                String address=rst.getString("address");
                double salary=rst.getDouble("salary");
                System.out.println(id+"\t"+name+"\t"+address+"\t"+salary);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
