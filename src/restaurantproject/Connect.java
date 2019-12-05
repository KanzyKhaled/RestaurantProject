package restaurantproject;


import java.sql.Connection;
import java.sql.DriverManager;
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
    public static void connect(){
        Connection connect = null;
        try{
            String url="jdbc:sqlserver://localhost:1433;databaseName=Restaurant [sa on Default schema]";
            connect = DriverManager.getConnection(url);
        }
        catch(SQLException e ){
            System.out.println(e.getMessage());
        }
    }
    
}
