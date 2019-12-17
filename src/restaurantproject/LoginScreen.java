/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;


import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginScreen implements ActionListener  {

   
   
    public  JFrame frame1= new JFrame("Login Page");
    public  JLabel idLabel;
    public  JTextField idText;
    public  JLabel passwordLabel;
    public  JPasswordField passwordText;
    public  JButton SigninButton;
    public JLabel Role;
    public JTextField roleField;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs ;
    Statement stmt;
     public LoginScreen()
     {
     
          
          frame1.setSize(380,580);
          frame1.setLocationRelativeTo(null);
          frame1.setBackground(Color.LIGHT_GRAY);
          
           //set icon );
     frame1.setIconImage(new ImageIcon("userLoginIcon.png").getImage());
                
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // create panel 
        JPanel panel= new JPanel();
        panel.setBackground(new Color (255,153,102));
     
            
    //adding pannel to frame
     frame1.add(panel); 
     
     placeComponents(panel);
     frame1.setVisible(true);
     frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
     
       private  void placeComponents(JPanel panel) 
    {
        
        panel.setLayout(null);
        //header no coloring  
       /* JPanel header = new JPanel();
        header.setBackground(new Color(0,0,0,80));
        header.setBounds(0,0,200,100);
       */
         
        //creating label 
        idLabel = new JLabel("ID");
        idLabel.setBounds(40,200,80,25);
        idLabel.setFont(new Font("Constantia",Font.BOLD,15));
        panel.add(idLabel);
        //creating text field for ID&Password&Role
        
        idText = new JTextField(8);
        idText.setBounds(125,200,175,25);
        panel.add(idText);
    
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40,240,80,25);
        passwordLabel.setFont(new Font("Constantia",Font.BOLD,15));
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(125,240,175,25);
        panel.add(passwordText);
        
       
      
        
        Role = new JLabel("Role");
        Role.setBounds(40,280,80,25);
        Role.setFont(new Font("Constantia",Font.BOLD,15));
        panel.add(Role);
        
        roleField = new JTextField(20);
        roleField.setBounds(125,280,175,25);
        panel.add(roleField);
        
         //creating login button
        SigninButton = new JButton("Sign in");
        SigninButton.setBounds(165,320,90,25);
        SigninButton.setBackground(Color.WHITE);
        SigninButton.setFont(new Font("Constantia",Font.BOLD,15));
        SigninButton.addActionListener(this);
        panel.add(SigninButton);
        //Action
       // SigninButton.addActionListener(this);
        
        
}
   
   
    @Override
    public void  actionPerformed(ActionEvent event) {
       if(event.getActionCommand().equals("Sign in")){
            int id =Integer.parseInt(idText.getText());
            String pass = passwordText.toString();
            String role = roleField.getText();
            
        
           try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
              System.out.println(ex);
           }
                String query;
                query = "Select * from users where ID=?";
           try{
                
                 pst=conn.prepareStatement(query);
                 pst.setInt(1, id);
                 rs= pst.executeQuery();
                while(rs.next()){
                    
                    if(pass.equals(rs.getString("Password"))&&role.equals(rs.getString("Role"))){
                        String r1 = rs.getString("Role");
                        switch(r1){
                        case("admin"):    
                        AdminJFrame admin = new AdminJFrame();
                        admin.setVisible(true);
                        break;
                        case("emolpyee"):
                        EmployeeFrame emp =  new EmployeeFrame();
                        emp.setVisible(true);
                        break;
                        
                        }
                   }
                
               } 
            } catch (SQLException ex) { 
               JOptionPane.showMessageDialog(null,ex);
            }
        }
    
    }
}    