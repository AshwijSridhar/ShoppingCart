package org.emids.shoppingApp;

import java.util.Scanner;

public class Inventory {

	int id, price;
	String BookName, Author;

	void addItemInventory() {
		
			
		System.out.println("enter the id,bookname,author,price");
		Scanner sc = new Scanner(System.in);

	public Inventory(int id, int price, String bookName, String author) {

		this.id = id;
		this.price = price;
		BookName = bookName;
		Author = author;
	}

}
