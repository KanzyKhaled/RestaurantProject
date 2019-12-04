/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;


import java.awt.*;

import javax.swing.*;

public class LoginScreen extends JFrame{
    
    public JFrame frame1= new JFrame("Login Page");
    
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
        
     
            
    //adding pannel to frame
     frame1.add(panel); 
     
     placeComponents(panel);
     frame1.setVisible(true);
     frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     
       private static void placeComponents(JPanel panel) 
    {
        
        panel.setLayout(null);
        //header no coloring  
       /* JPanel header = new JPanel();
        header.setBackground(new Color(0,0,0,80));
        header.setBounds(0,0,200,100);
       */
         
        //creating label 
        JLabel userLabel = new JLabel("User Name");
        userLabel.setBounds(40,200,80,25);
        userLabel.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(userLabel);
        //creating text field for user name
        
        JTextField userText = new JTextField(8);
        userText.setBounds(125,200,175,25);
        panel.add(userText);
    
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40,240,80,25);
        passwordLabel.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(125,240,175,25);
        panel.add(passwordText);
        
        //creating login button
        JButton loginButton = new JButton("Sign in");
        loginButton.setBounds(165,280,80,25);
        loginButton.setBackground(Color.WHITE);
        loginButton.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(loginButton);
        
        
    }

     
}