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
    public class Item {
	protected int item_id;
        protected String item_name;
        protected String item_category ;
        protected  int item_price;

        
	//constructor without arguments
	public Item() {
		
	}
	
	//constructor with arguments
	  public Item(int ID,String name ,String category , int price) {
       this.item_id=ID;
       this.item_name = name;
       this.item_category = category;
       this.item_price = price;
       }
        
        
    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_category() {
        return item_category;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }
	
}
    

