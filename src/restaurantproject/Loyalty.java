package restaurantproject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koky
 */
public final class Loyalty {//implements ActionListener{
      // Variables declaration - do not modify   
    public  JFrame ratingFrame= new JFrame("Rating Form");
    public  JCheckBox almostEnoughCheckBox;
    public  JLabel amountLabel;
    public  ButtonGroup buttonGroup1;
    public  ButtonGroup buttonGroup2;
    public  JCheckBox cheapCheckBox;
    public  JLabel commentsLabel;
    public  JTextArea commentsTextArea;
    public  JTextField customerNameField;
    public  JLabel customerNameLabel;
    public  JTextField customerPhoneField;
    public  JLabel customerPhoneLabel;
    public  JCheckBox expensiveCheckBox;
    public  JCheckBox goodChickBox;
    public  JLabel headerLabel;
    public  JLabel backGround;
    public  JScrollPane jScrollPane1;
    public  JTextField mealField;
    public  JLabel mealNameLabel;
    public  JCheckBox moderateCheckBox;
    public  JCheckBox notEnoughCheckBox;
    public  JLabel priceLabel;
    public  JCheckBox regularChickBox;
    public  JLabel tasteLabel;
    public  JCheckBox veryEnoughCheckBox;
    public  JCheckBox veryGoodChickBox;
    
    public Loyalty(){
        ratingFrame.setSize(518, 441);
        ratingFrame.setLocationRelativeTo(null);
        ratingFrame.setResizable(true);
        ratingFrame.setLayout(null);
      
        JPanel panel = new JPanel();
        ratingFrame.add(panel);
        
        initComponents(panel);
        
        ratingFrame.setVisible(true);
        ratingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    /**
     *
     * @param panel
     */
    public   void initComponents(JPanel panel) {
          
           panel.setLayout(null);
        //getContentPane().setLayout(null);
       
        headerLabel.setText("Rate Our Service For The Best");
        headerLabel.setBounds(110, 10, 300, 52);
        panel.add(headerLabel);

        amountLabel.setFont(new java.awt.Font("Constantia", 1, 12));
        amountLabel.setText("Amount:");
        panel.add(amountLabel);
        amountLabel.setBounds(160, 200, 60, 20);

        tasteLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        tasteLabel.setText("Taste:");
        panel.add(tasteLabel);
        tasteLabel.setBounds(10, 205, 40, 16);

        veryEnoughCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        veryEnoughCheckBox.setText("Very Enough");
        panel.add(veryEnoughCheckBox);
        veryEnoughCheckBox.setBounds(225, 201, 110, 25);

        almostEnoughCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        almostEnoughCheckBox.setText("Almost Enough");
        panel.add(almostEnoughCheckBox);
        almostEnoughCheckBox.setBounds(225, 224, 110, 25);

        notEnoughCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        notEnoughCheckBox.setText("Not Enough");
        notEnoughCheckBox.addActionListener(this::notEnoughCheckBoxActionPerformed);
        panel.add(notEnoughCheckBox);
        notEnoughCheckBox.setBounds(225, 247, 110, 25);

        veryGoodChickBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        veryGoodChickBox.setText("Very Good");
        panel.add(veryGoodChickBox);
        veryGoodChickBox.setBounds(59, 201, 80, 25);

        goodChickBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        goodChickBox.setText("Good");
        panel.add(goodChickBox);
        goodChickBox.setBounds(59, 224, 80, 25);

        regularChickBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        regularChickBox.setText("Regular");
        panel.add(regularChickBox);
        regularChickBox.setBounds(59, 247, 80, 25);

        priceLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        priceLabel.setText("Price:");
        panel.add(priceLabel);
        priceLabel.setBounds(360, 200, 40, 20);

        moderateCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        moderateCheckBox.setText("Moderate");
        panel.add(moderateCheckBox);
        moderateCheckBox.setBounds(408, 224, 90, 25);

        cheapCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        cheapCheckBox.setText("Cheap");
        cheapCheckBox.addActionListener(this::cheapCheckBoxActionPerformed);
        panel.add(cheapCheckBox);
        cheapCheckBox.setBounds(408, 247, 90, 25);

        expensiveCheckBox.setFont(new java.awt.Font("Constantia", 0, 12)); 
        expensiveCheckBox.setText("Expensive");
        expensiveCheckBox.addActionListener(this::expensiveCheckBoxActionPerformed);
        panel.add(expensiveCheckBox);
        expensiveCheckBox.setBounds(408, 201, 90, 25);

        mealField.addActionListener(this::mealFieldActionPerformed);
        panel.add(mealField);
        mealField.setBounds(121, 76, 265, 20);

        customerNameField.addActionListener(this::customerNameFieldActionPerformed);
        panel.add(customerNameField);
        customerNameField.setBounds(121, 107, 265, 20);
        panel.add(customerPhoneField);
        customerPhoneField.setBounds(121, 134, 265, 20);

        commentsTextArea.setColumns(20);
        commentsTextArea.setRows(5);
        jScrollPane1.setViewportView(commentsTextArea);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(147, 299, 320, 96);

        commentsLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        commentsLabel.setText("Additional Comments :");
        panel.add(commentsLabel);
        commentsLabel.setBounds(10, 270, 133, 70);

        mealNameLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        mealNameLabel.setText("Meal :");
        panel.add(mealNameLabel);
        mealNameLabel.setBounds(10, 79, 60, 20);

        customerPhoneLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        customerPhoneLabel.setText("Phone Number:");
        panel.add(customerPhoneLabel);
        customerPhoneLabel.setBounds(10, 137, 90, 16);

        customerNameLabel.setFont(new java.awt.Font("Constantia", 1, 12)); 
        customerNameLabel.setText("Your Name:");
        panel.add(customerNameLabel);
        customerNameLabel.setBounds(10, 110, 70, 16);

        backGround.setIcon(new javax.swing.ImageIcon("ratingBackground.jpg")); 
        backGround.setText("jLabel2");
        panel.add(backGround);
        backGround.setBounds(0, 0, 520, 410);

        ratingFrame.pack();
    }           


 private void cheapCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private  void mealFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private  void expensiveCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private  void customerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private  void notEnoughCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    
 /*   @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

*/


}


