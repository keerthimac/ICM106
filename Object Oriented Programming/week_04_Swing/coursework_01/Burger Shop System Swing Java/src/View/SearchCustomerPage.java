/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.Order;
import static View.SearchOrderPage.controller;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keeth
 */
public class SearchCustomerPage extends JFrame {
    private JTable ordersTable;
    private DefaultTableModel dtm;
    private JLabel lblTitle;
    private JLabel lblOrderDetails;
    private JButton btnSearchCustomer;
    private JLabel lblCusName;
    private JLabel lblCusNameResult;
    
    private JLabel lblCusId;
    private JTextField txtCusIdResult;
    private Order orderObj;
    
    static OrderController controller = HomePage.getController(); 
    
    public SearchCustomerPage(){
        setTitle("Search Customer");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null); 
        
        Font lblFont = new Font("", Font.BOLD,13);
        Font btnFont = new Font("", Font.PLAIN,12);
        
        lblTitle = new JLabel();
        lblTitle.setText("Search Customer");
        lblTitle.setFont(new Font("",Font.BOLD,40));
        lblTitle.setForeground(Color.white);
        lblTitle.setBounds(0,0,800,70);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setBackground(new Color(202,64,67,255));
        lblTitle.setOpaque(true);
        
        lblOrderDetails = new JLabel();
        lblOrderDetails.setText("Search Order Details");
        lblOrderDetails.setFont(new Font("", Font.BOLD,30));
        lblOrderDetails.setForeground(Color.WHITE);
        lblOrderDetails.setBounds(0,150,800,50);
        lblOrderDetails.setVerticalAlignment(JLabel.CENTER);
        lblOrderDetails.setHorizontalAlignment(JLabel.CENTER);
        lblOrderDetails.setBackground(new Color(202,64,67,255));
        lblOrderDetails.setOpaque(true);
                
        
        lblCusId = new JLabel();
        lblCusId.setText("Customer Id : ");
        lblCusId.setFont(lblFont);
        lblCusId.setBounds(70,85,100,25);

        txtCusIdResult = new JTextField();
        txtCusIdResult.setText(null);
        txtCusIdResult.setFont(lblFont);
        txtCusIdResult.setBounds(170,85, 100, 25);

        btnSearchCustomer = new JButton("Search");
        btnSearchCustomer.setFont(btnFont);
        btnSearchCustomer.setBounds(275, 85, 100, 25);
        btnSearchCustomer.setFocusable(false);
        btnSearchCustomer.addActionListener(evt->{
            int cusIndex = controller.searchCustomerIndex(txtCusIdResult.getText());
            if(cusIndex==-1){
                JOptionPane.showMessageDialog(null, "Invalid Customer ID", "Alert", JOptionPane.ERROR_MESSAGE);
            }else{
                orderObj = controller.getOrderInfo(cusIndex);
                lblCusNameResult.setText(orderObj.getCustomerName());
                loadTable();
            }
        });
        
        lblCusName = new JLabel();
        lblCusName.setText("Name : ");
        lblCusName.setFont(lblFont);
        lblCusName.setBounds(70,110,100,25);
        
        lblCusNameResult = new JLabel();
        lblCusNameResult.setFont(lblFont);
        lblCusNameResult.setBounds(170,110,100,25);
        
        String [] columnNames ={"Order Id","Order Qty","Total"};
        dtm= new DefaultTableModel(columnNames,0);
        ordersTable=new JTable(dtm);
        
        JScrollPane tblPane=new JScrollPane(ordersTable);
        tblPane.setBounds(70,250, 650,250);
        
        add(tblPane);
        add(lblTitle);
        add(lblOrderDetails); 
        add(lblCusId);
        add(txtCusIdResult); 
        add(btnSearchCustomer);  
        add(lblCusName);
        add(lblCusNameResult);
    }
    
    private void loadTable(){
        Order[] cusOrderArray=controller.getCustomerOrders(txtCusIdResult.getText());
        dtm.setRowCount(0);
        for(int i=0;i<cusOrderArray.length;i++){
            Order obj = cusOrderArray[i];
            Object[] rowdata={
                obj.getOrderId(),
                obj.getQty(),
                obj.getTotal()
            };
            dtm.addRow(rowdata);
        }
    } 
}
