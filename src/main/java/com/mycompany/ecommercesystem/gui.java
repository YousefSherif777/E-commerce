package com.mycompany.ecommercesystem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class gui extends JFrame implements ActionListener{
 Customer cas = new Customer();
    

    
    
    
JPanel p1 = new JPanel();
JLabel l0 = new JLabel("Welcome to our commerce System" );
JLabel l1 = new JLabel("Name : ");
JLabel l2 = new JLabel("Password : ");
JLabel l3 = new JLabel("Customer ID : ");
JLabel l4 = new JLabel("Address : ");
JTextField t1 = new JTextField();
JTextField t2 = new JTextField();
JTextField t3 = new JTextField();
JPasswordField t4 = new JPasswordField();
JButton b1 = new JButton("Save");
JButton b2 = new JButton("Delete");

    public gui() {
        gf();
    }
   public void gf(){
   this.setTitle("E-commerce system");
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
       add(t1);
       add(t2);
       add(t3);
       add(t4);
       add(b1);
       add(b2);
       add(p1);
   p1.setBounds(0,0,750,500); 
   p1.setBackground(Color.DARK_GRAY);
   l0.setBounds(270, 10, 300, 15);
   l0.setForeground(Color.RED);
   l1.setBounds(10,80,100,50);
   l1.setForeground(Color.WHITE);
   t1.setBounds(80,95,200,20);
   l2.setBounds(10,150,100,50);
   l2.setForeground(Color.WHITE);
   t4.setBounds(100,165,200,20);
   l3.setBounds(10,220,100,50);
   l3.setForeground(Color.WHITE);
   t2.setBounds(110,235,200,20);
   l4.setBounds(10,290,100,50);
   l4.setForeground(Color.WHITE);
   t3.setBounds(90,305,200,20);
   b1.setBounds(250,400,80,30);
   b1.setBackground(Color.BLACK);
   b1.setForeground(Color.WHITE);
   b2.setBounds(410,400,80,30);
   b2.setBackground(Color.BLACK);
   b2.setForeground(Color.WHITE);
   b1.addActionListener(this);
   b2.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            cas.name=t1.getText().toString();
            gui2 g2 = new gui2();           
            cas.address = t3.getText().toString(); 
            g2.l5.setText(cas.name);
            g2.l7.setText(t2.getText());
            g2.l9.setText(cas.address);
        } 
             
        if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        
        }
        
        
    }
        
}
