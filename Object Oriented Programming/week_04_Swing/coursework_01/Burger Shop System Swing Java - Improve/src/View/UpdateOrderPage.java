/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.Order;
import static View.PlaceOrderPage.BURGERPRICE;
import static View.SearchOrderPage.controller;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Keeth
 */
public class UpdateOrderPage extends JFrame {
    
    static OrderController controller = HomePage.getController();
    
    private JLabel homeLbl;

    private JLabel lblOrderId;
    private JLabel lblOrderStatus;  
    private JLabel lblCustomerId;
    private JLabel lblCustomerName;
    private JLabel lblBurgerQty;
    private JLabel lblNetTotal;
    private JLabel lblNetTotalResult;
    private JLabel lblOrderStatusError;
    private JLabel lblOrderStatusError2;
   
    private JTextField txtOrderStatusResult;
    private JTextField txtOrderIdResult; 
    private JTextField txtCustomerIdResult;
    private JTextField txtCustomerNameResult;
    private JTextField txtBurgerQtyResult;

    private JButton btnSearchOrder;
    private JButton btnTotal;
    private JButton btnUpdate;
    private JButton btnback;
    double total = 0;

    private JComboBox<String> dropdown;


    
    public UpdateOrderPage(){

        setTitle("Place Order");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        Font lblFont = new Font("", Font.BOLD,13);
        Font btnFont = new Font("", Font.PLAIN,12);
        
        homeLbl = new JLabel();
        homeLbl.setText("Update Order");
        homeLbl.setFont(new Font("", Font.BOLD,30));
        homeLbl.setForeground(Color.WHITE);
        homeLbl.setBounds(0,0,600,70);
        homeLbl.setVerticalAlignment(JLabel.CENTER);
        homeLbl.setHorizontalAlignment(JLabel.CENTER);
        homeLbl.setBackground(new Color(202,64,67,255));
        homeLbl.setOpaque(true);
        add(homeLbl);        

        lblOrderId = new JLabel("Order Id:");
        lblOrderId.setFont(lblFont);
        lblOrderId.setBounds(50,110, 100, 20);
        add(lblOrderId);        

        txtOrderIdResult = new JTextField();
        txtOrderIdResult.setFont(lblFont);
        txtOrderIdResult.setBounds(140, 110, 120, 25);
        add(txtOrderIdResult);        
        
        btnSearchOrder = new JButton("Search");
        btnSearchOrder.setFont(btnFont);
        btnSearchOrder.setBounds(270, 110, 100, 25);
        btnSearchOrder.setFocusable(false);
        btnSearchOrder.addActionListener(evt->{
            int orderIndex = controller.searchOrderIndex(txtOrderIdResult.getText());
            if(orderIndex==-1){
                lblOrderStatusError.setText(null);
                lblOrderStatusError2.setText(null);
                lblNetTotalResult.setText(null);
                txtCustomerIdResult.setText(null);
                txtCustomerNameResult.setText(null);
                txtBurgerQtyResult.setText(null);
                txtCustomerIdResult.setEditable(false);
                txtCustomerNameResult.setEditable(false);
                txtBurgerQtyResult.setEditable(false);
                dropdown.setEnabled(false);
                btnTotal.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Invalid order ID", "Alert", JOptionPane.ERROR_MESSAGE);
            }else{
                btnTotal.setEnabled(true);
                dropdown.setEnabled(true);
                lblOrderStatusError.setText(null);
                lblOrderStatusError2.setText(null); 
                //txtCustomerIdResult.setEditable(true);
                //txtCustomerNameResult.setEditable(true);
                txtBurgerQtyResult.setEditable(true);
                btnUpdate.setEnabled(true);
                Order orderObj = controller.getOrderInfo(orderIndex);
                txtCustomerIdResult.setText(orderObj.getCustomerId());
                txtCustomerNameResult.setText(orderObj.getCustomerName());
                txtBurgerQtyResult.setText(String.valueOf(orderObj.getQty()));
                lblNetTotalResult.setText(String.valueOf(orderObj.getTotal()));
                dropdown.setSelectedItem(orderObj.getStatus()==0?"Preparing":orderObj.getStatus()==1?"Delevered":"Cancel");
                if(orderObj.getStatus()==1){
                    dropdown.setEnabled(false);
                    btnTotal.setEnabled(false);
                    lblOrderStatusError.setText("This Order has been Delevered");
                    lblOrderStatusError2.setText("Sorry.you cannot update this order");
                    txtCustomerIdResult.setEditable(false);
                    txtCustomerNameResult.setEditable(false);
                    txtBurgerQtyResult.setEditable(false);
                    btnUpdate.setEnabled(false);
                }else if(orderObj.getStatus()==2){
                    dropdown.setEnabled(false);
                    btnTotal.setEnabled(false);
                    lblOrderStatusError.setText("This Order has been Cancled");
                    lblOrderStatusError2.setText("Sorry.you cannot update this order");  
                    txtCustomerIdResult.setEditable(false);
                    txtCustomerNameResult.setEditable(false);
                    txtBurgerQtyResult.setEditable(false);
                    btnUpdate.setEnabled(false);
                }
            }
        });
        add(btnSearchOrder);
         
        lblOrderStatus = new JLabel("Order Status :");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setBounds(50, 140, 120, 20);
        add(lblOrderStatus);

        String[] items = {"Preparing", "Delevered", "Cancel"};
        dropdown = new JComboBox<>(items);
        dropdown.setFont(lblFont);
        dropdown.setBounds(140, 140, 120, 25);
        add(dropdown);           
        /*
        txtOrderStatusResult = new JTextField();
        txtOrderStatusResult.setFont(lblFont);
        txtOrderStatusResult.setBounds(140, 140, 120, 25);
        add(txtOrderStatusResult);    
        */
        
        lblOrderStatusError = new JLabel();
        lblOrderStatusError.setFont(new Font("", Font.PLAIN,10));
        lblOrderStatusError.setForeground(new Color(202,64,67,255));
        lblOrderStatusError.setBounds(270, 135, 200, 25);
        add(lblOrderStatusError);

        lblOrderStatusError2 = new JLabel();
        lblOrderStatusError2.setFont(new Font("", Font.PLAIN,10));
        lblOrderStatusError2.setForeground(new Color(202,64,67,255));
        lblOrderStatusError2.setBounds(270, 145, 200, 25);
        add(lblOrderStatusError2);        
        
        lblCustomerId = new JLabel("Customer Id :");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setBounds(50,170, 130, 20);
        add(lblCustomerId);
        
        txtCustomerIdResult = new JTextField();
        txtCustomerIdResult.setFont(lblFont);
        txtCustomerIdResult.setBounds(140,170, 120, 25);
        add(txtCustomerIdResult);
        
        lblCustomerName = new JLabel("Name :");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(50, 200, 120, 20);
        add(lblCustomerName);        

        txtCustomerNameResult = new JTextField();
        txtCustomerNameResult.setFont(lblFont);
        txtCustomerNameResult.setBounds(140, 200, 120, 25);
        add(txtCustomerNameResult);          
        
        lblBurgerQty = new JLabel("Burger QTY :");
        lblBurgerQty.setFont(lblFont);
        lblBurgerQty.setBounds(50, 230, 120, 20);
        add(lblBurgerQty);
        
        btnTotal = new JButton("+");
        btnTotal.setFont(btnFont);
        btnTotal.setBounds(270, 230, 50, 20);
        btnTotal.setFocusable(false);
        btnTotal.addActionListener(evt->{
            int qty = Integer.parseInt(txtBurgerQtyResult.getText());
            total = qty*BURGERPRICE;
            lblNetTotalResult.setText(total+"0");
        });
        add(btnTotal);        

        txtBurgerQtyResult = new JTextField();
        txtBurgerQtyResult.setFont(lblFont);
        txtBurgerQtyResult.setBounds(140, 230, 120, 25);
        add(txtBurgerQtyResult);        
        
        lblNetTotal = new JLabel("Net Total :");
        lblNetTotal.setFont(lblFont);
        lblNetTotal.setBounds(50, 260, 120, 20);
        add(lblNetTotal);

        lblNetTotalResult = new JLabel();
        lblNetTotalResult.setFont(lblFont);
        lblNetTotalResult.setForeground(new Color(202,64,67,255));
        lblNetTotalResult.setBounds(140, 260, 120, 20);
        add(lblNetTotalResult);        

        btnUpdate = new JButton("Update order");
        btnUpdate.setFont(btnFont);
        btnUpdate.setBounds(350, 400, 120, 25);
        btnUpdate.setFocusable(false);
        btnUpdate.addActionListener(evt->{
            String OrderIdResult = txtOrderIdResult.getText();
            String burgerQtyResult = txtBurgerQtyResult.getText();
            String customerNameResult = txtCustomerNameResult.getText();
            String customerIdResult = txtCustomerIdResult.getText();
            if (OrderIdResult.isEmpty() || burgerQtyResult.isEmpty() || customerIdResult.isEmpty() || customerNameResult.isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            int orderIndex = controller.searchOrderIndex(txtOrderIdResult.getText());
            if (orderIndex==-1) {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Order No", "Alert", JOptionPane.ERROR_MESSAGE);
            }else{
                Order orderObj = controller.getOrderInfo(orderIndex);
                orderObj.setCustomerName(txtCustomerNameResult.getText());
                orderObj.setQty(Integer.parseInt(txtBurgerQtyResult.getText()));
                orderObj.setTotal(Integer.parseInt(txtBurgerQtyResult.getText())*BURGERPRICE);
                orderObj.setStatus(dropdown.getSelectedItem()=="Cancel"?2:dropdown.getSelectedItem()=="Delevered"?1:0);
                JOptionPane.showMessageDialog(null, "Order Update Succsess", "Alert", JOptionPane.INFORMATION_MESSAGE);            
            }

        });
        add(btnUpdate);
        
        btnback = new JButton("Back");
        btnback.setFont(btnFont);
        btnback.setBounds(480, 400, 75, 25);
        btnback.setFocusable(false);
        btnback.addActionListener(evt->{
              dispose();
        });
        add(btnback);
        
        lblOrderStatusError.setText(null);
        lblOrderStatusError2.setText(null);
        lblNetTotalResult.setText(null);
        txtCustomerIdResult.setText(null);
        txtCustomerNameResult.setText(null);
        txtBurgerQtyResult.setText(null);
        txtCustomerIdResult.setEditable(false);
        txtCustomerNameResult.setEditable(false);
        txtBurgerQtyResult.setEditable(false);
        dropdown.setEnabled(false);
        btnTotal.setEnabled(false);
        btnUpdate.setEnabled(false);
    }
}
