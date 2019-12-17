package restaurantproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nadeeeeeeeeeeen
 */
public class ReportCustJInternalFrame extends javax.swing.JInternalFrame {
Connection conn;
        PreparedStatement pst;
        ResultSet rs;
    /**
     * Creates new form ReportCustJInternalFrame
     */
    public ReportCustJInternalFrame() {
        initComponents();
        show_customers();
    }
     public  ArrayList<Customer> CustomerList(){
     ArrayList <Customer> CustomersList = new ArrayList<>();
       try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
        String sql = "Select * from customers";
        try {
            Statement st=conn.createStatement();
            rs= st.executeQuery(sql);
                Customer customer;
		while(rs.next()){
            
                customer = new Customer(rs.getString("username"),rs.getString("password"),rs.getString("fullname"),rs.getString("address"),rs.getString("mobilenum"));
                CustomersList.add(customer);
                        
                }
                        JOptionPane.showMessageDialog(null,"Listed Successfully");
                        
		}catch(SQLException se){
                    JOptionPane.showMessageDialog(null,se);
                   
		}
     
     return CustomersList;
}

public void show_customers (){
    ArrayList<Customer> list = CustomerList();
    DefaultTableModel model1 = (DefaultTableModel) customersTable.getModel();
    Object[] row = new Object[5];
    for(int i =0;i<list.size();i++){
        row[0]=list.get(i).getUserName();
         row[1]=list.get(i).getPassword();
          row[2]=list.get(i).getFullName();
           row[3]=list.get(i).getAddress();
           row[4]=list.get(i).getMobileNum();
           model1.addRow(row);
    }
}
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReportCust = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 153));
        setClosable(true);

        ReportCust.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        ReportCust.setForeground(new java.awt.Color(255, 255, 255));
        ReportCust.setText("       Report For Customers");

        customersTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User Name", "Password", "Full Name", "Address", "Mobile Number"
            }
        ));
        jScrollPane1.setViewportView(customersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(ReportCust, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ReportCust, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReportCust;
    private javax.swing.JTable customersTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
