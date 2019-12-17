package restaurantproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koky
 */
public class Connect {
    private static Connection  connect =null;
    
    PreparedStatement pst;
    public static Connection connect() throws ClassNotFoundException {
       
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           
        connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Restaurant;username=sa;password=123 ");
       }
        catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    
        return connect;
    
}
}
