package com.mycompany.ecommercesystem;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class gui2 extends JFrame implements ActionListener{
    
    
JPanel p1 = new JPanel();
JLabel l0 = new JLabel("Products:");
JLabel l1 = new JLabel("Smartphone(ID:1 - Price:599,9 - Brand:Samsung)");
JLabel l2 = new JLabel("T-Shirt(ID:2 - Price:19.99 - Size:Meduim - Fabric:cotton)");
JLabel l3 = new JLabel("OOP(ID:3 - Price:39.99 - Author:O'Reilly - Publisher:X Publications)");
JButton b1 = new JButton("Add");
JButton b2 = new JButton("Remove");
JButton b3 = new JButton("Add");
JButton b4 = new JButton("Remove");
JButton b5 = new JButton("Add");
JButton b6 = new JButton("Remove");
JButton b7 = new JButton("Confirm");
JButton b8 = new JButton("Cancel");
JLabel l4 = new JLabel("Name: ");
JLabel l5 = new JLabel();
JLabel l6 = new JLabel("CustomerID: ");
JLabel l7 = new JLabel();
JLabel l8 = new JLabel("Address: ");
JLabel l9 = new JLabel();
    public gui2() {
        gf2();
    }
    public void gf2(){
    this.setTitle("E-commerce System");
   this.setSize(750, 500);
   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   this.setVisible(true);
   this.setResizable(false);
   this.setLayout(null);
   this.setLocation(100, 20);
   add(l0);
   add(l1);
   add(l2);
   add(l3);
    add(l4);
   add(l5);
   add(l6);
   add(l7);
   add(l8);
   add(l9);
   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);
   add(p1);
   p1.setBounds(0, 0, 750, 500);
   l0.setBounds(10,150,200,10);
   l0.setForeground(Color.white);
   l1.setBounds(10,180,500,20);
   l1.setForeground(Color.white);
   l2.setBounds(10,240,500,20);
   l2.setForeground(Color.white);
   l3.setBounds(10,300,500,20);
   l3.setForeground(Color.white);
   
 
   b1.setBackground(Color.GREEN);
   b1.setForeground(Color.WHITE);
   b3.setBackground(Color.GREEN);
   b3.setForeground(Color.WHITE);
   b5.setBackground(Color.GREEN);
   b5.setForeground(Color.WHITE);
   b2.setBackground(Color.RED);
   b2.setForeground(Color.WHITE);
   b4.setBackground(Color.RED);
   b4.setForeground(Color.WHITE);
   b6.setBackground(Color.RED);
   b6.setForeground(Color.WHITE);
     
   b1.setBounds(400,180,80,20);
   b2.setBounds(540,180,80,20);
   b3.setBounds(400,240,80,20);
   b4.setBounds(540,240,80,20);
   b5.setBounds(400,300,80,20);
   b6.setBounds(540,300,80,20);
   b7.setBounds(250,400,90,30);
   b7.setBackground(Color.BLACK);
   b7.setForeground(Color.white);
   b8.setBounds(350,400,90,30);
   b8.setBackground(Color.BLACK);
   b8.setForeground(Color.white);
   p1.setBackground(Color.DARK_GRAY);
   l4.setBounds(10,20,80,50);
   l4.setForeground(Color.white);
   l5.setBounds(160,20,350,50);
   l5.setForeground(Color.white);
   l6.setBounds(10,60,80,50);
   l6.setForeground(Color.white);
   l7.setBounds(160,60,350,50);
   l7.setForeground(Color.white);
   l8.setBounds(10,100,80,50);
   l8.setForeground(Color.white);
   l9.setBounds(160,100,350,50);
   l9.setForeground(Color.white);
   b8.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       gui g;
       if(e.getSource()==b8)
           g = new gui();     
    }
}
