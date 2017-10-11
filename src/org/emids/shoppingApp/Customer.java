package org.emids.shoppingApp;

public class Customer extends Inventory {

	public Customer() {
		super(id, price, bookName, author);
		// TODO Auto-generated constructor stub
	}

	String name = "Ashwij'Sridhar", address = "Basavanagudi", custID = "1267AB";

	void viewCustomerDetails() {

		System.out.println("CUSTOMER DETAILS");
		System.out.println("***************************");
		System.out.println("name :" + name);
		System.out.println("address :" + address);
		System.out.println("Customer ID :" + custID);

	}

}
