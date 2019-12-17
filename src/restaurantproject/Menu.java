/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author nada
 */



import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import DAO.databaseHandler;

public class Menu extends Item{
	Connection conn;
        PreparedStatement pst;
        ResultSet rs;
	Scanner sc=new Scanner(System.in);
        
	
	public Menu() {
		
	}

    public Menu(int ID,String name ,String category , int price) {
       this.item_id=ID;
       this.item_name = name;
       this.item_category = category;
       this.item_price = price;
    }
    
////////////////////////////////////////////////////////////////////////////	
public boolean addItem() {
               /* System.out.println("Item ID");
                int item_id=sc.nextInt();
		System.out.print("Item name: ");
		String item_name = sc.nextLine();
		System.out.print("Item category: ");
		String item_category = sc.nextLine();
		System.out.print("Item price: ");
		int item_price = sc.nextInt();*/
		
            try {
               
                conn = Connect.connect();
            } catch (ClassNotFoundException ex) {
                     System.out.println(ex);
            }
                String sql ="Insert into Items(ID,itemName,itemCategory,itemPrice) values ('"+item_id+"',"+item_name+"',"+item_category+"',"+item_price+"')";
                try {
                       pst = conn.prepareStatement(sql);
                     
			
			pst.execute();
                        JOptionPane.showMessageDialog(null,"Insert is successfull");
                        return true;
			
		
		}catch(SQLException se){
                    System.out.println(se);
                    return false;
		}
	}

////////////////////////////////////////////////////////////////////////////////////////

    
public boolean DeleteItem(int id) {
       try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
         String sql ="Delete from Items where ID="+id+"";
        try {
                  pst = conn.prepareStatement(sql);
		  pst.executeUpdate();
			
		 // pst.close();
                        JOptionPane.showMessageDialog(null,"Deleted Successfully");
                        return true;
		}catch(SQLException se){
                    System.out.println(se);
                    return false;
		}
    }
    


////////////////////////////////////////////////////////////////////////////////////////////
        
public  ArrayList<Menu> MenuList(){
     ArrayList <Menu> menuList = new ArrayList<>();
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
                Menu menu;
                menu = new Menu(rs.getInt("ID"),rs.getString("itemName"),rs.getString("itemCategory"),rs.getInt("itemPrice"));
                menuList.add(menu);
                        
                }
                        JOptionPane.showMessageDialog(null,"Listed Successfully");
                        
		}catch(SQLException se){
                    System.out.println(se);
                   
		}
     
     return menuList;
}

 //////////////////////////////////////////////////////////////////////////////////////////////     
          
        
public boolean UpdateItem(int ID, String name ,String category , int price) {
		/*System.out.print("Item name: ");
		String item_name = sc.nextLine();
                Connection  connect = null;
                ResultSet rs=null;
                PreparedStatement pst=null;*/ 
           try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
                String sql ="update Items set name="+name+",category="+category+", price="+price+",where id="+ID+"";
		try {
                      pst = conn.prepareStatement(sql);
                      pst.executeUpdate();
		 
                        JOptionPane.showMessageDialog(null,"Updated Successfully");
                        return true;
		}catch(SQLException se){
                    System.out.println(se);
                    return false;
		}
    }
	


/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*public  void SearchMenu(int id) {
                 try {
               conn = Connect.connect();
           } catch (ClassNotFoundException ex) {
               System.out.println(ex);
           }
                 String sql="Select * from Items where ID=?";
                    try {
                       
                       pst = conn.prepareStatement(sql);
                       pst.setString(1,searchTextField.getText();
                       ResultSet rs =pst.executeQuery();
                       if(rs.next())
                        {
                            String setname = rs.getString("itemName");
                            nameField.setText(setname);
                            String setcategory = rs.getString("itemCategory");
                            categoryField.setText(setcategory);
                            int setprice = rs.getInt("itemPrice");
                            priceField.setText(setprice);
                        }

                    }catch(SQLException se){
                    System.out.println(se);
		}

	
}*/
   

 
}
    