/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author koky
 */
public class Admin extends Users{ 
    private int age;
    private String fname;
    private String lname;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
//implements Function {
 public Admin(){
     
 }
    public Admin(int age, String fname, String lname, String User_Name, String Password, int id) {
        super(User_Name, Password, id);
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Admin(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
    
    
 public Admin(String User_Name,String Password,int id){
     super(User_Name , Password , id);
 } 
 
    public String toString(String User_Name ,String Password ,int id) {
        return "\nUserName: "+User_Name+"\t password : "+Password+"\t ID: "+id+ "\nfirst name: "+fname+"\t last name : "+lname+"\t age: "+age+"\n";
    }
            
    //update username and password
    public void updateusername(String username) 
    {
        this.User_Name=username;
    }
    public void updatepassword(String password) 
    {
        this.Password=password;
    }
    
 
 //Menu
    public void add (int id,String name,String category, int price)
    {
        Menu m = new Menu(id,name,category,price);
        if(m.addItem())
        {
            System.out.println(m.toString()+"\nAdded Successufully");
        }
        else
        {
            System.out.println("\nFaild to added");
        }
    }
    public void List()
    {
        Menu m = new Menu() ;
        System.out.println(m.MenuList());
    }
 //   public void search(int id) {
 //       Menu m = new Menu();
   //     m.SearchMenu(id);
  //  }

    public void update(int id, String name ,String category , int price) {
        Menu x = new Menu(id,name,category,price);
        if (x.UpdateItem(id,name,category,price)) {
            System.out.println("Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void delete(int id) {
        Menu m = new Menu();
        if (m.DeleteItem(id)) {
           System.out.println("Item Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
               //reports
  /*    public ArrayList<Employee> listReportsemp() {
          ArrayList<Employee> employeeList = new ArrayList<>();
            try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
           
            String sql="Select * from employees";
           try{ pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
           
              while(rs.next()){
                Employee  employee;
                employee =new Employee (rs.getString("fname"),rs.getString("lname"),rs.getInt("age"),rs.getInt("salary"),rs.getInt("ID"));
                employeeList.add(employee);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    } 
    */
    /*
    public void Reportsforcust() {
         
             String sql="SELECT *FROM Customers";    
             
        try {
             String url="jdbc:sqlserver://localhost:1433;databaseName=Restaurant [sa on Default schema]";
             Connection con =DriverManager.getConnection(url);
             Statement st=con.createStatement();
              ResultSet rs=st.executeQuery(sql);
          
          //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Customer customer;
            while(rs.next()){
                customer =new Customer (rs.getInt("id"),rs.getString("fname"),rs.getString("lname"),rs.getInt("age"));
                Customer.add(customer);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
       */ 
}