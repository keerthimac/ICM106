/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.Order;
import static View.PlaceOrderPage.BURGERPRICE;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Keeth
 */
public class SearchOrderPage extends JFrame {
    
    static OrderController controller = HomePage.getController();
    
    private JLabel lblSearchOrder;
    private JLabel lblOrderId;
    private JTextField txtOrderId;
    private JButton btnSearchOrder;
    private JButton btnBack;
    
    private JLabel lblCustomerId;
    private JLabel lblCustomerIdResult;
    private JLabel lblCustomerName;
    private JLabel lblCustomerNameResult;
    private JLabel lblBurgerQty;
    private JLabel lblBurgerQtyResult;
    private JLabel lblOrderStatus;
    private JLabel lblOrderStatusResult;
    private JLabel lblNetTotal;
    private JLabel lblNetTotalResult;
    
    public SearchOrderPage(){
        setTitle("Search Order Details");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        Font lblFont = new Font("", Font.BOLD,13);
        Font btnFont = new Font("", Font.PLAIN,12);
        
        lblSearchOrder = new JLabel();
        lblSearchOrder.setText("Search Order Details");
        lblSearchOrder.setFont(new Font("", Font.BOLD,30));
        lblSearchOrder.setForeground(Color.WHITE);
        lblSearchOrder.setBounds(0,0,600,70);
        lblSearchOrder.setVerticalAlignment(JLabel.CENTER);
        lblSearchOrder.setHorizontalAlignment(JLabel.CENTER);
        lblSearchOrder.setBackground(new Color(202,64,67,255));
        lblSearchOrder.setOpaque(true);
        add(lblSearchOrder);  
        
        lblOrderId = new JLabel("Enter Order Id :");
        lblOrderId.setFont(lblFont);
        lblOrderId.setBounds(50,100, 100, 20);
        add(lblOrderId);
        
        txtOrderId = new JTextField();
        txtOrderId.setFont(lblFont);
        txtOrderId.setBounds(150, 100, 120, 25);
        add(txtOrderId);        

        btnSearchOrder = new JButton("Search");
        btnSearchOrder.setFont(btnFont);
        btnSearchOrder.setBounds(275, 100, 100, 25);
        btnSearchOrder.setFocusable(false);
        btnSearchOrder.addActionListener(evt->{
            int orderIndex = controller.searchOrderIndex(txtOrderId.getText());
            if(orderIndex==-1){
                JOptionPane.showMessageDialog(null, "Invalid order ID", "Alert", JOptionPane.ERROR_MESSAGE);
            }else{
                Order orderObj = controller.getOrderInfo(orderIndex);
                lblCustomerIdResult.setText(orderObj.getCustomerId());
                lblCustomerNameResult.setText(orderObj.getCustomerName());
                lblBurgerQtyResult.setText(String.valueOf(orderObj.getQty()));
                lblNetTotalResult.setText(String.valueOf(orderObj.getTotal()));
                lblOrderStatusResult.setText(orderObj.getStatus()==0?"preparing":orderObj.getStatus()==1?"Delevered":"cancel");
            }
        });
        add(btnSearchOrder);
        
        btnBack = new JButton("Back to Home Page");
        btnBack.setFont(btnFont);
        btnBack.setBounds(50, 350, 150, 25);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt->{
            dispose();
        });
        add(btnBack);  
        
        lblCustomerId = new JLabel("Customer Id :");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setBounds(50,170, 130, 20);
        add(lblCustomerId);
        
        lblCustomerIdResult = new JLabel();
        lblCustomerIdResult.setFont(lblFont);
        lblCustomerIdResult.setBounds(140,170, 130, 20);
        add(lblCustomerIdResult);
        
        lblCustomerName = new JLabel("Name :");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(50, 200, 120, 20);
        add(lblCustomerName);        

        lblCustomerNameResult = new JLabel();
        lblCustomerNameResult.setFont(lblFont);
        lblCustomerNameResult.setBounds(100, 200, 120, 20);
        add(lblCustomerNameResult);          
        
        lblBurgerQty = new JLabel("Burger QTY :");
        lblBurgerQty.setFont(lblFont);
        lblBurgerQty.setBounds(50, 230, 120, 20);
        add(lblBurgerQty);

        lblBurgerQtyResult = new JLabel();
        lblBurgerQtyResult.setFont(lblFont);
        lblBurgerQtyResult.setBounds(140, 230, 120, 20);
        add(lblBurgerQtyResult);        
        
        lblNetTotal = new JLabel("Net Total :");
        lblNetTotal.setFont(lblFont);
        lblNetTotal.setBounds(50, 260, 120, 20);
        add(lblNetTotal);

        lblNetTotalResult = new JLabel();
        lblNetTotalResult.setFont(lblFont);
        lblNetTotalResult.setBounds(120, 260, 120, 20);
        add(lblNetTotalResult);        
        
        lblOrderStatus = new JLabel("Order Status :");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setBounds(50, 290, 120, 20);
        add(lblOrderStatus);

        lblOrderStatusResult = new JLabel(" Pending ");
        lblOrderStatusResult.setFont(lblFont);
        lblOrderStatusResult.setBounds(140, 290, 120, 20);
        add(lblOrderStatusResult);        
        
        
    }
}
