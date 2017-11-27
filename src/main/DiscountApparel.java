/**
 * 
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import beans.Inventory;
import beans.Order;
import utils.AppConsts;

/**
 * @author ab70352
 *
 */
public class DiscountApparel {

	/**
	 * Application flow entry point
	 */
	public static void main(String[] args) {

		//initializing class to load properties information from properties file.
		@SuppressWarnings("unused")
		AppConsts appConsts = new AppConsts();

		//using BufferedReader to read user input from console
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("====================================================");
		System.out.println("Welcome to the discounted price finding application");
		System.out.println("====================================================\n");
		String userChoice = "y";
		do {
			try {
				//getting no. of items to be entered in CSV form for Inventory List
				int noOfInventoryListItems = Integer.valueOf(s.readLine().replace(" ", ""));

				ArrayList<Inventory> inventoryList = new ArrayList<>();
				//reading and setting inventory list items
				for (int i = 0; i < noOfInventoryListItems; i++) {
					String itemString = s.readLine();
					String[] details = itemString.split(",");
					Inventory item = new Inventory(details[0], details[1], details[2], details[3]);
					inventoryList.add(item);
				}
				System.out.println();
				//reading no. of orders for orders list
				int noOfOrders = Integer.valueOf(s.readLine().replace(" ", ""));
				ArrayList<Order> ordersList = new ArrayList<>();
				//reading the orders and adding in orderlist
				for (int i = 0; i < noOfOrders; i++) {
					String orderInput = s.readLine();
					Order order = new Order();
					order.setOrderIdList(orderInput);
					order.setInventoryList(inventoryList);
					order.checkOutOrder();
					ordersList.add(order);
				}
				System.out.println();
				//printing out the final discounted prices as output
				for (int i = 0; i < ordersList.size(); i++) {
					System.out.println(ordersList.get(i).getDiscountedPrice());
				}
			} catch (Exception e){
				System.out.println("Oops! Looks like you entry was not in expected format.");
			} finally {
				System.out.println("=============================");
				System.out.println("Do you wish to continue?y/n");
				try {
					userChoice = s.readLine().replaceAll(" ", "");
					if(userChoice.equalsIgnoreCase("n")){
						System.out.println("=====================================================");
						System.out.println("Thank you for using our Application. Have a nice day!");
						System.out.println("=====================================================");
					}
				} catch (IOException e) {
					continue;
				}
			}
		}while (userChoice.equalsIgnoreCase("y"));
	}

}
