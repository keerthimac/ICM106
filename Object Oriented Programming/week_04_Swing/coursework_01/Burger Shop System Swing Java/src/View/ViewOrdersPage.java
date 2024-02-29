/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import View.PendingOrdersPage;

/**
 *
 * @author Keeth
 */
public class ViewOrdersPage extends JFrame {
    
    private JLabel homeLbl;
    private JButton btnPendingOrders;
    private JButton btnDeleveredOrders;
    private JButton btnCanceledOrders;
    private JButton btnBack;
    
    public ViewOrdersPage(){
        setTitle("Home Page");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        
        
        btnPendingOrders = new JButton("Pending Orders");
        btnPendingOrders.setFont(new Font("", Font.PLAIN,15));
        btnPendingOrders.setBounds(100, 150, 300, 40);
        btnPendingOrders.setFocusable(false);
        btnPendingOrders.addActionListener(evt->{
           new PendingOrdersPage().setVisible(true);
        });
        

        btnDeleveredOrders = new JButton("Delevered Orders");
        btnDeleveredOrders.setFont(new Font("", Font.PLAIN,15));
        btnDeleveredOrders.setBounds(100, 200, 300, 40);
        btnDeleveredOrders.setFocusable(false);
        btnDeleveredOrders.addActionListener(evt->{
            new DeleveredOrdersPage().setVisible(true);
        });
                

        btnCanceledOrders = new JButton("Cancled Orders");
        btnCanceledOrders.setFont(new Font("", Font.PLAIN,15));
        btnCanceledOrders.setBounds(100, 250, 300, 40);
        btnCanceledOrders.setFocusable(false);
        btnCanceledOrders.addActionListener(evt->{
            new CanceledOrdersPage().setVisible(true);
        });
        
        
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("", Font.PLAIN,15));
        btnBack.setBounds(280, 420, 120, 40);
        btnBack.setFocusable(false);
        btnBack.addActionListener(evt->{
            dispose();
        });
        
        add(homeLbl);
        add(btnPendingOrders);
        add(btnDeleveredOrders);
        add(btnCanceledOrders);
        add(btnBack);
    }
}
