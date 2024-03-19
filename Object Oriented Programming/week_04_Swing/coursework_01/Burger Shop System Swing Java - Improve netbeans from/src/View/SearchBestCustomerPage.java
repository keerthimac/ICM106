/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.Order;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keeth
 */
public class SearchBestCustomerPage extends JFrame {
    private JTable ordersTable;
    private DefaultTableModel dtm;
    private JLabel lblTitle;
    
    static OrderController controller = HomePage.getController();
    
    private void loadTable(){
        Order[] orderArray=controller.findBestCustomers();
        dtm.setRowCount(0);
        for(int i=0;i<orderArray.length;i++){
            Order obj = orderArray[i];
            Object[] rowdata={
                obj.getCustomerId(),
                obj.getCustomerName(),
                obj.getTotal()
            };
            dtm.addRow(rowdata);
        }
    }

    SearchBestCustomerPage(){
        setTitle("Search Best Customer");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null); 
        
        lblTitle = new JLabel();
        lblTitle.setText("Search Best Customer");
        lblTitle.setFont(new Font("",Font.PLAIN,40));
        lblTitle.setForeground(Color.white);
        lblTitle.setBounds(0,0,800,70);
        
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setBackground(new Color(202,64,67,255));
        lblTitle.setOpaque(true);
        
        String [] columnNames ={"Customer Id","Customer Name","Total"};
        dtm= new DefaultTableModel(columnNames,0);
        ordersTable=new JTable(dtm);
        
        JScrollPane tblPane=new JScrollPane(ordersTable);
        tblPane.setBounds(70, 80, 650, 400);
        
        add(tblPane,BorderLayout.CENTER);
        add(lblTitle);
        
        loadTable();        
    }
}
