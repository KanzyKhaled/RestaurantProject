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
public class Customer {
    private String userName;
    private String password;
    private String fullName;
    private String address;
    private String mobileNum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
    
    
    public Customer(){
        
    }
    public Customer (String userName,String password , String fullName,String address,String mobileNum){
    this.userName=userName;
    this.password=password;
    this.fullName=fullName;
    this.address= address;
    this.mobileNum = mobileNum;
        
    }
}
