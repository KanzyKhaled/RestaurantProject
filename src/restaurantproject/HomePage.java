/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class HomePage implements ActionListener {
   public JFrame frame = new JFrame("Homepage");
   public HomePage(){
       frame.setSize(1300,850);
       frame.setVisible(true);
       frame.setLocationRelativeTo(null);
       //set icon for frame
       frame.setIconImage(new ImageIcon("HomeIcon.png").getImage());
       
        JPanel headerPanel = new JPanel();
        frame.getContentPane().add(headerPanel);
        headerPanel.setSize(1300,100);
        headerPanel.setLayout(null);
       headerPanel.setBackground(new Color (255,153,102));
       
       JLabel headerLabel = new JLabel("Welcome To Homepage!");
       headerLabel.setBounds(20,26,500,45);
       headerLabel.setFont(new Font("Serif",Font.BOLD,35));
     
      
       headerPanel.add(headerLabel);
      // headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
       
       //background
        JLabel background1;
            background1 = new JLabel(new ImageIcon("LogInPageBackground1.png"));
            
            frame.add(background1); 
      //login button
      JButton loginButton = new JButton("Login");
      headerPanel.add(loginButton);
      loginButton.setBounds(1070,35,200,39);
      loginButton.setBackground(Color.WHITE);
      loginButton.setFont(new Font("Serif",Font.BOLD,28));
     
      //register the action 
      loginButton.addActionListener(this);
     //loginButton.addActionListener(new LoginBtnListener());
   
     //menu button
     
      JButton menuButton = new JButton("Menu");
      headerPanel.add(menuButton);
      menuButton.setBounds(850,35,200,39);
      menuButton.setBackground(Color.WHITE);
      menuButton.setFont(new Font("Serif",Font.BOLD,28));
      menuButton.addActionListener(this);
   
   
   
   
   
   }

    @Override
    public void actionPerformed(ActionEvent event) {
       
        if(event.getActionCommand().equals("Menu")){
            Meals frame2 = new Meals();
           // frame2.setVisible(true);
        }else if(event.getActionCommand().equals("Login")){
            LoginScreen frame3 = new LoginScreen();
           // frame3.setVisible(true);
           
        }    
        }
        
    }
 /*  
   @Override
     public void actionPerformed(ActionEvent event){
         if (event.getActionCommand().equals("Menu")){
             Meals frame3 = new Meals();
         }
     }*/

    

