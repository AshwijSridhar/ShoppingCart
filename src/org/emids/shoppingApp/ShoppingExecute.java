package org.emids.shoppingApp;

import java.util.Scanner;

public class ShoppingExecute {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("1.view customer details,2.SearchItems,3.AddToCart,4.DeleteFromCart,5.PlaceOrder");

			int n = s.nextInt();

			Customer customer = new Customer();

			switch (n) {
			case 1:
				customer.viewCustomerDetails();

			}
		}

	}

}
