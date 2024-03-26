 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.Order;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Keeth
 */
public class PlaceOrderPage extends JFrame {
    
    static OrderController controller = HomePage.getController();
    
    private String orderId = controller.generateOrderId();
    private String customerId = controller.generateCustomerId();
//----------------Static(global) Varibles-------------------------------
    //final variables for the order info
    public static final int PREPARING = 0;
    public static final int DELIVERED = 1;
    public static final int CANCEL = 2;
    final static double BURGERPRICE=500;
    double total = 0;
    
    private JLabel homeLbl;
    
    private JLabel lblOrderId;
    private JLabel lblOrderIdResult;
    private JLabel lblCustomerId;
    private JLabel lblCustomerName;
    private JLabel lblBurgerQty;
    private JLabel lblOrderStatus;
    private JLabel lblOrderStatusResult;
    private JLabel lblNetTotal;
    private JLabel lblNetTotalResult;
    
    private JButton btnPlaceOrder;
    private JButton btnHomePage;
    private JButton btnCancel;
    private JButton btnTotal;
    
    private JTextField txtCustomerId;
    private JTextField txtCustomerName;
    private JTextField txtBurgerQty;
    
    private void clearText(){
        txtCustomerName.setText(null);
        txtCustomerName.setEditable(true);
        txtBurgerQty.setText(null);
        lblOrderIdResult.setText(null);
        txtCustomerId.setText(null);
        lblNetTotalResult.setText("0.00");
    }
    
    private void nextIds(){
       txtCustomerId.setText(controller.generateCustomerId());
       lblOrderIdResult.setText(controller.generateOrderId()); 
    }
    
    
    
    public PlaceOrderPage(){
        setTitle("Place Order");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        Font lblFont = new Font("", Font.BOLD,13);
        Font btnFont = new Font("", Font.PLAIN,12);
        
        homeLbl = new JLabel();
        homeLbl.setText("Place Order");
        homeLbl.setFont(new Font("", Font.BOLD,30));
        homeLbl.setForeground(Color.WHITE);
        homeLbl.setBounds(0,0,600,70);
        homeLbl.setVerticalAlignment(JLabel.CENTER);
        homeLbl.setHorizontalAlignment(JLabel.CENTER);
        homeLbl.setBackground(new Color(202,64,67,255));
        homeLbl.setOpaque(true);
        add(homeLbl);
        
        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(btnFont);
        btnPlaceOrder.setBounds(400, 100, 150, 25);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.addActionListener(evt->{
            String customerName = txtCustomerName.getText();
            String burgerQtyText = txtBurgerQty.getText();
            
            if (customerName.isEmpty() || burgerQtyText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            int burgerQty;
            try {
                burgerQty = Integer.parseInt(burgerQtyText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for burger quantity.", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Order orderObj = new Order(lblOrderIdResult.getText(),txtCustomerId.getText(),txtCustomerName.getText(),burgerQty,burgerQty*BURGERPRICE,PREPARING);
            int result = JOptionPane.showConfirmDialog(null, "Do you want to proceed this order?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Order Placed Succsess", "Alert", JOptionPane.INFORMATION_MESSAGE);
                controller.addOrder(orderObj);
            } else {
                 JOptionPane.showMessageDialog(null, "you Cancled the Order", "Alert", JOptionPane.ERROR_MESSAGE);
                 dispose();
                 return;
            }

            int nextResult = JOptionPane.showConfirmDialog(null, "Do you want to Place Abother order?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (nextResult == JOptionPane.YES_OPTION) {
                lblOrderIdResult.setText(controller.generateOrderId()); 
                txtBurgerQty.setText(null);
                lblNetTotalResult.setText("0.00");
                txtCustomerName.setEditable(false);
            }else{
                clearText();
                //System.out.println(controller.generateCustomerId());
                nextIds();            
            }             
        });
        add(btnPlaceOrder);   
        
        btnHomePage = new JButton("Back to Home Page");
        btnHomePage.setFont(btnFont);
        btnHomePage.setBounds(400, 155, 150, 25);
        btnHomePage.setFocusable(false);
        btnHomePage.addActionListener(evt->{
            dispose();
        });
        add(btnHomePage);     
        
        btnCancel = new JButton("Cancel");
        btnCancel.setFont(btnFont);
        btnCancel.setBounds(400, 210, 150, 25);
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(evt->{
            dispose();
        });
        add(btnCancel);

        btnTotal = new JButton("+");
        btnTotal.setFont(btnFont);
        btnTotal.setBounds(265, 190, 50, 20);
        btnTotal.setFocusable(false);
        btnTotal.addActionListener(evt->{
            int qty = Integer.parseInt(txtBurgerQty.getText());
            total = qty*BURGERPRICE;
            lblNetTotalResult.setText(total+"0");
        });
        add(btnTotal);
        
        lblOrderId = new JLabel("Order Id :");
        lblOrderId.setFont(lblFont);
        lblOrderId.setBounds(50, 100, 100, 20);
        add(lblOrderId);

        lblOrderIdResult = new JLabel(orderId);
        lblOrderIdResult.setFont(lblFont);
        lblOrderIdResult.setBounds(140, 100, 100, 20);
        add(lblOrderIdResult);
        
        lblCustomerId = new JLabel("Customer Id :");
        lblCustomerId.setFont(lblFont);
        lblCustomerId.setBounds(50, 130, 130, 20);
        add(lblCustomerId);
        
        lblCustomerName = new JLabel("Name :");
        lblCustomerName.setFont(lblFont);
        lblCustomerName.setBounds(50, 160, 120, 20);
        add(lblCustomerName);        

        lblBurgerQty = new JLabel("Burger QTY :");
        lblBurgerQty.setFont(lblFont);
        lblBurgerQty.setBounds(50, 190, 120, 20);
        add(lblBurgerQty);
        
        lblOrderStatus = new JLabel("Order Status :");
        lblOrderStatus.setFont(lblFont);
        lblOrderStatus.setBounds(50, 220, 120, 20);
        add(lblOrderStatus);

        lblOrderStatusResult = new JLabel(" Pending ");
        lblOrderStatusResult.setFont(lblFont);
        lblOrderStatusResult.setBounds(140, 220, 120, 20);
        add(lblOrderStatusResult);
        
        lblNetTotal = new JLabel("Net Total :");
        lblNetTotal.setFont(lblFont);
        lblNetTotal.setBounds(400, 400, 120, 20);
        add(lblNetTotal);

        lblNetTotalResult = new JLabel(Double.toString(total));
        lblNetTotalResult.setForeground(new Color(202,64,67,255));
        lblNetTotalResult.setFont(lblFont);
        lblNetTotalResult.setBounds(475, 400, 120, 20);
        add(lblNetTotalResult);
        
        txtCustomerId = new JTextField(customerId);
        txtCustomerId.setEditable(false);
        txtCustomerId.setFont(lblFont);
        txtCustomerId.setBounds(140, 130, 120, 20);
        add(txtCustomerId);
        
        txtCustomerName = new JTextField();
        txtCustomerName.setText(null);
        txtCustomerName.setEditable(true);
        txtCustomerName.setFont(lblFont);
        txtCustomerName.setBounds(140, 160, 120, 20);
        add(txtCustomerName);


        txtBurgerQty = new JTextField();
        txtCustomerName.setText(null);
        txtBurgerQty.setFont(lblFont);
        txtBurgerQty.setBounds(140, 190, 120, 20);
        add(txtBurgerQty);        
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon/place_order.png")));
    }
}
