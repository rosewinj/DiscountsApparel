package utils;

import beans.Casuals;
import beans.Dresses;
import beans.FootWear;
import beans.Inventory;
import beans.Jeans;
import beans.Order;
import beans.Shirts;
import beans.Trousers;


/**
 * @author ab70352
 * DiscountCalculator class has price and discount calculating functionality 
 */
public class DiscountCalculator {
	
	// Method to find out discounted price of 1 order for example 1,2,3,4
	public static int calculateOrderDiscountedPrice(Order order){
		int discountedTotalPrice=0;
		for (Inventory item : order.getInventoryList()) {
			for (int id : order.getOrderIdList()) {
				if(item.getId() == id){
					discountedTotalPrice += calculateItemDiscountedPrice(item.getBrand(),item.getCategory(),item.getPrice());
				}
				
			}
		}
		return discountedTotalPrice;
	}
	
	// Mehtod to find out discounted price of a single item
	private static int calculateItemDiscountedPrice(String brand, String category, int price){
		int discount=0;
		category = category.replace(" ", "");
		category = category.toUpperCase();
		
		//we use if else here and not switch case because case requires constant
		//since we can't make category strings as final as it is assigned once read from properties files. 
		if(category.equalsIgnoreCase(AppConsts.SHIRTSCATEGNAME)){
			Shirts shirt = new Shirts(brand, price);
			discount = shirt.getDiscount();
		} else if(category.equalsIgnoreCase(AppConsts.TROUSERSCATEGNAME)){
			Trousers trousers = new Trousers(brand, price);
			discount = trousers.getDiscount();
		} else if(category.equalsIgnoreCase(AppConsts.CASUALSCATEGNAME)){
			Casuals casual = new Casuals(brand, price);
			discount = casual.getDiscount();
		} else if(category.equalsIgnoreCase(AppConsts.JEANSCATEGNAME)){
			Jeans jeans = new Jeans(brand, price);
			discount = jeans.getDiscount();
		} else if(category.equalsIgnoreCase(AppConsts.DRESSESCATEGNAME)){
			Dresses dresses = new Dresses(brand, price);
			discount = dresses.getDiscount();			
		} else if(category.equalsIgnoreCase(AppConsts.FOOTWEARCATEGNAME)){
			FootWear footWear = new FootWear(brand, price);
			discount = footWear.getDiscount();
		}		
		int discountedPrice = price*(100-discount)/100;
		
		return discountedPrice;
	}
	
	//method to find total price of order without discount
	public static int calculateOrderPrice(Order order){
		int totalPrice = 0;
		for (Inventory item : order.getInventoryList()) {
			for (int id : order.orderIdList) {
				if(item.getId() == id){
					totalPrice += item.getPrice();
				}
			}
		}	
		return totalPrice;
	}
	
}
