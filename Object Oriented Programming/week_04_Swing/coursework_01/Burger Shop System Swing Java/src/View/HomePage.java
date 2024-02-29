/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.PlaceOrderPage;
import View.SearchOrderPage;
import View.UpdateOrderPage;
import Controller.OrderController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Keeth
 */
public class HomePage extends JFrame {
    
    static OrderController controller = new OrderController();
    
    public static OrderController getController() {
        return controller;
    }
    
    private JButton btnPlaceOrder;
    private JButton btnSearchBestCustomer;
    private JButton btnSearchOrder;
    private JButton btnSearchCustomer;
    private JButton btnViewOrder;
    private JButton btnUpdateOrder;
    private JButton btnExit;
    
    private JLabel homeLbl;
    
    public HomePage(){
        setTitle("Home Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        homeLbl = new JLabel();
        homeLbl.setText("Burger Shop");
        homeLbl.setFont(new Font("", Font.BOLD,40));
        homeLbl.setForeground(Color.WHITE);
        homeLbl.setBounds(0,0,500,70);
        homeLbl.setVerticalAlignment(JLabel.CENTER);
        homeLbl.setHorizontalAlignment(JLabel.CENTER);
        homeLbl.setBackground(new Color(202,64,67,255));
        homeLbl.setOpaque(true);
        add(homeLbl);
        
        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("", Font.PLAIN,15));
        btnPlaceOrder.setBounds(100, 100, 300, 40);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.addActionListener(evt->{
            new PlaceOrderPage().setVisible(true);
        });
        add(btnPlaceOrder);

        btnSearchBestCustomer = new JButton("Search Best Customer");
        btnSearchBestCustomer.setFont(new Font("", Font.PLAIN,15));
        btnSearchBestCustomer.setBounds(100, 150, 300, 40);
        btnSearchBestCustomer.setFocusable(false);
        btnSearchBestCustomer.addActionListener(evt->{
            
        });
        add(btnSearchBestCustomer);        

        btnSearchOrder = new JButton("Search Order");
        btnSearchOrder.setFont(new Font("", Font.PLAIN,15));
        btnSearchOrder.setBounds(100, 200, 300, 40);
        btnSearchOrder.setFocusable(false);
        btnSearchOrder.addActionListener(evt->{
            new SearchOrderPage().setVisible(true);
        });
        add(btnSearchOrder);         

        btnSearchCustomer = new JButton("Search Customer");
        btnSearchCustomer.setFont(new Font("", Font.PLAIN,15));
        btnSearchCustomer.setBounds(100, 250, 300, 40);
        btnSearchCustomer.setFocusable(false);
        btnSearchCustomer.addActionListener(evt->{
            
        });
        add(btnSearchCustomer);           
        
        btnViewOrder = new JButton("View Order");
        btnViewOrder.setFont(new Font("", Font.PLAIN,15));
        btnViewOrder.setBounds(100, 300, 300, 40);
        btnViewOrder.setFocusable(false);
        btnViewOrder.addActionListener(evt->{
            
        });        
        add(btnViewOrder);
        
        btnUpdateOrder = new JButton("Update Order");
        btnUpdateOrder.setFont(new Font("", Font.PLAIN,15));
        btnUpdateOrder.setBounds(100, 350, 300, 40);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.addActionListener(evt->{
            new UpdateOrderPage().setVisible(true);
        });        
        add(btnUpdateOrder);
        
        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("", Font.PLAIN,15));
        btnExit.setBounds(280, 420, 120, 40);
        btnExit.setFocusable(false);
        btnExit.addActionListener(evt->{
            System.exit(0);
        });        
        add(btnExit);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon/burger_icon.png")));
    }
}
