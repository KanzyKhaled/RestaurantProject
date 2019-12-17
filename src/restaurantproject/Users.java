/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author koky
 */
public class Users {
    protected String User_Name;
    protected String Password;
    protected int ID;

public Users(String User_Name,String Password,int id){
this.User_Name=User_Name;
this.Password=Password;
this.ID=id;
}
public Users(){
}

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public int getID() {
        return ID;
    }

    
}