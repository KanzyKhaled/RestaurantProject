package restaurantproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadeeeeeeeeeeen
 */
public class ADDJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ADDJInternalFrame
     */
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
   
    public ADDJInternalFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        jTextField1FName = new javax.swing.JTextField();
        jTextField2LName = new javax.swing.JTextField();
        jTextField3Age = new javax.swing.JTextField();
        jTextField4Salary = new javax.swing.JTextField();
        AddEmp = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        jTextField5ID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 153));
        setBorder(null);
        setClosable(true);

        FirstName.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");

        LastName.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name");

        Age.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        Age.setText("Age");

        Salary.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        Salary.setForeground(new java.awt.Color(255, 255, 255));
        Salary.setText("Salary");

        jTextField1FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1FNameActionPerformed(evt);
            }
        });

        jTextField2LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2LNameActionPerformed(evt);
            }
        });

        jTextField3Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3AgeActionPerformed(evt);
            }
        });

        jTextField4Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4SalaryActionPerformed(evt);
            }
        });

        AddEmp.setBackground(new java.awt.Color(255, 255, 255));
        AddEmp.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        AddEmp.setText("Add Empolyee");
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");

        jTextField5ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastName)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstName))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3Age, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5ID, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1FName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2LName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(jTextField2LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(jTextField3Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salary)
                    .addComponent(jTextField4Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID))
                .addGap(44, 44, 44)
                .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2LNameActionPerformed

    private void jTextField3AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3AgeActionPerformed

    private void jTextField4SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4SalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4SalaryActionPerformed

    private void jTextField1FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FNameActionPerformed

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
     // if(!jTextField1FName.getText().equals("")&&!jTextField2LName.getText().equals("")&&!jTextField4Salary.getText().equals("")&&!jTextField3Age.getText().equals("")&&!jTextField5ID.getText().equals("")){
          /*int age = Integer.parseInt(jTextField3Age.getText());
          int salary =Integer.parseInt(jTextField4Salary.getText());
          Employee e =new Employee(jTextField1FName.getText(),jTextField2LName.getText(),age,salary);
          e.AddEmployee();*/
          
           try {
               
                conn = Connect.connect();
            } catch (ClassNotFoundException ex) {
                     System.out.println(ex);
            }
                
                String sql ="Insert into employees(fname,lname,age,salary) values ('"+jTextField1FName.getText()+"','"+jTextField2LName.getText()+"','"+Integer.parseInt(jTextField3Age.getText())+"','"+Integer.parseInt(jTextField4Salary.getText())+"')";
                try {
                       pst = conn.prepareStatement(sql);
                       pst.execute();
                       
                       JOptionPane.showMessageDialog(null,"Insert is successfull");
                       		
		
		}catch(SQLException se){
                    JOptionPane.showMessageDialog(null, se);
                    
		}
          
    }//GEN-LAST:event_AddEmpActionPerformed

    private void jTextField5IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5IDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Salary;
    private javax.swing.JTextField jTextField1FName;
    private javax.swing.JTextField jTextField2LName;
    private javax.swing.JTextField jTextField3Age;
    private javax.swing.JTextField jTextField4Salary;
    private javax.swing.JTextField jTextField5ID;
    // End of variables declaration//GEN-END:variables
}
