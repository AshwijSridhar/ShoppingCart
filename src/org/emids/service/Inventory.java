package org.emids.service;

import java.util.Scanner;

import org.emids.Domain.Book;
import org.emids.main.OnlineBookShopMain;;

public class Inventory {
	Scanner scanner = new Scanner(System.in);
	String option = null;
	Product product = new Product();

	// static public Book searchBookName;
	public void searchByBookName() {
		System.out.println("enter the book name you want");
		String searchBookName = scanner.nextLine();
		// System.out.println(OnlineBookShopMain.bookcontainer.size());
		boolean isBookFound = false;

		for (int i = 0; i < OnlineBookShopMain.bookcontainer.size(); i++) {
			isBookFound = true;
			Book bokkNameSearched = OnlineBookShopMain.bookcontainer.get(i);
			if (searchBookName.equalsIgnoreCase(bokkNameSearched.getBookname()))
			{
				System.out.println("press 1 for add to cart");
				int value = scanner.nextInt();
				if (value == 1) {
					ShoppingCart.addShopingCart(bokkNameSearched);
					System.out.println(bokkNameSearched + "is added to cart");
					break;
				}
			
				
			}
			/*else  {
				System.out.println("Book not found");
				break;
			}*/
			
			
			
		
		
		if (!isBookFound) {
			System.out.println("book n ot found");
			
		}
		// return searchBookName;

	
	}
	}

	public void searchByAuthoerName() {
		System.out.println("Enter the author of the book");
		String searchAuthoerNam = scanner.nextLine();
		boolean isBookFound = false;
		for (int i = 0; i < OnlineBookShopMain.bookcontainer.size(); i++) {
			isBookFound = true;
			Book bokkNameSearched = OnlineBookShopMain.bookcontainer.get(i);
			if (searchAuthoerNam.equalsIgnoreCase(bokkNameSearched.getAuthoername())) {
				System.out.println("press 1 for add to cart");
				int value = scanner.nextInt();
				if (value == 1) {
					ShoppingCart.addShopingCart(bokkNameSearched);
					System.out.println(bokkNameSearched + "is added to cart");

				}
				if (!isBookFound) {
					System.err.println("Book not found");

				}

			}

		}
	}
}