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
public class LISTJInternalFrame extends javax.swing.JInternalFrame {
	Connection conn;
        PreparedStatement pst;
        ResultSet rs;
    /**
     * Creates new form LISTJInternalFrame
     */
    public LISTJInternalFrame() {
        initComponents();
        show_employees();
    }
   
    public  ArrayList<Employee> EmployeeList(){
     ArrayList <Employee> EmployeesList = new ArrayList<>();
       try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
        String sql = "Select * from employees";
        try {
            Statement st=conn.createStatement();
            rs= st.executeQuery(sql);
                Employee employee;
		while(rs.next()){
            
                employee = new Employee(rs.getInt("ID"),rs.getString("fname"),rs.getString("lname"),rs.getInt("age"),rs.getInt("salary"));
                EmployeesList.add(employee);
                        
                }
                        JOptionPane.showMessageDialog(null,"Listed Successfully");
                        
		}catch(SQLException se){
                    JOptionPane.showMessageDialog(null,se);
                   
		}
     
     return EmployeesList;
}

public void show_employees(){
    ArrayList<Employee> list = EmployeeList();
    DefaultTableModel model1 = (DefaultTableModel) employeeTable.getModel();
    Object[] row = new Object[5];
    for(int i =0;i<list.size();i++){
        row[0]=list.get(i).getID();
         row[1]=list.get(i).getFname();
          row[2]=list.get(i).getLname();
           row[3]=list.get(i).getAge();
           row[4]=list.get(i).getSalary();
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

        ALLEmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 153));
        setClosable(true);

        ALLEmp.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        ALLEmp.setForeground(new java.awt.Color(255, 255, 255));
        ALLEmp.setText(" Empolyees Data");

        employeeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "First Name", "Last Name", "Age", "Salary"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(ALLEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ALLEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALLEmp;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
