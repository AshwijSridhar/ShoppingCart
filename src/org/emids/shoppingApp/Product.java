package org.emids.shoppingApp;

public class Product {
	
	int id;
	String name;
	float price;
	
	public Product() {
		
	}
    
	public Product(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		
		this.price = price;
	}
}
