/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Employee  {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
   
//     public boolean CancelORDER(){
//     
//     
//     return true ; 
//     }

    //public boolean HOME (){
    protected String fname;
    protected String lname;
    protected int age;
    protected int salary;
    protected int ID;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public Employee(){
         HomePage home_page = new HomePage() ; 
     }
    //for adding
    public Employee(String fname,String lname,int age,int salary){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.salary=salary;
    }
    //for updating
     public Employee(int ID,String fname,String lname,int age,int salary){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.salary=salary;
        this.ID=ID;
    }
     //for deleting 
     
      public Employee(int ID){
        this.ID=ID;
    }
    public void  AddEmployee (){
         try {
               
                conn = Connect.connect();
            } catch (ClassNotFoundException ex) {
                     System.out.println(ex);
            }
                String sql ="Insert into employees(fname,lname,age,salary) values ('"+fname+"',"+lname+"',"+age+"',"+salary+"')";
                try {
                       pst = conn.prepareStatement(sql);
                       pst.execute();
                     JOptionPane.showMessageDialog(null,"Insert is successfull");
                        			
		
		}catch(SQLException se){
                    JOptionPane.showMessageDialog(null, se);
                    
		}
	}
         
     
     public void UpdateEmployee (){
      try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
                String sql ="Update employees set fname="+fname+",lname="+lname+",age="+age+",salary="+age+",where ID="+ID+"";
		try {
                      pst = conn.prepareStatement(sql);
                      pst.executeUpdate();
		 
                        JOptionPane.showMessageDialog(null,"Updated Successfully");
                       
		}catch(SQLException se){
                    System.out.println(se);
                   
		}
     }

     
      public void DeleteEmployee (){
      try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
         String sql ="Delete from employees where ID="+ID+"";
        try {
                  pst = conn.prepareStatement(sql);
		  pst.executeUpdate();
			
		 // pst.close();
                        JOptionPane.showMessageDialog(null,"Deleted Successfully");
                        
		}catch(SQLException se){
                    System.out.println(se);
                   
		}
      }
    
      
   /*   public  ArrayList<Employee> EmpList(){
     ArrayList <Employee> empList = new ArrayList<>();
       try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
        String sql = "Select * from Items";
        try {
            pst=conn.prepareStatement(sql);
            rs= pst.executeQuery();
		while(rs.next()){
                Employee emp;
                emp = new Employee(rs.getString("fname"),rs.getString("lname"),rs.getInt("age"),rs.getInt("salary"),rs.getInt("ID"));
                empList.add(emp);
                        
                }
                        JOptionPane.showMessageDialog(null,"Listed Successfully");
                        
		}catch(SQLException se){
                    System.out.println(se);
                   
		}
     
     return empList;
}*/
      
      
     public boolean MakeORDER (){
    {
    MakingOrder order= new MakingOrder ();
        //JFrameName object_of_it= new JFrameName () ;
       order .setVisible(true);
    
    return true ;
    }
}
    
} 
