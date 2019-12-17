/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author DELL
 */
public class Billing {
//     private double TotlCost; 
//     private double tax ;
//     private double services ; 
     private int customerID;
    private int OrderID;
    private double TotalCost;
    private double taxes;
    private double  services ;
    
    public Billing() {
}

   public Billing(int customerID, int OrderID, double TotalCost, double taxes, double services) {
        this.customerID = customerID;
        this.OrderID = OrderID;
        this.TotalCost = TotalCost;
        this.taxes = TotalCost *(10/100);
        this.services = 10.00 ;
    }

  public int getCustomerID() {
        return customerID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getServices() {
        return services;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setTotalCost(float TotalCost) {
        this.TotalCost = TotalCost;
    }
    
}
