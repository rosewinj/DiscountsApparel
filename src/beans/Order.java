package beans;

import java.util.ArrayList;

import utils.DiscountCalculator;

public class Order {
	public ArrayList<Integer> orderIdList;
	public int totalPrice;
	public int discountedPrice;
	ArrayList<Inventory> inventoryList;
	
	public Order() {
		this.orderIdList = new ArrayList<>();
		this.inventoryList = new ArrayList<>();
		this.totalPrice = 0;
		this.discountedPrice = 0;
	}
	
	public ArrayList<Inventory> getInventoryList() {
		return inventoryList;
	}

	public void setInventoryList(ArrayList<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}

	public int getPrice() {
		return totalPrice;
	}

	private void setPrice() {
		this.totalPrice = DiscountCalculator.calculateOrderPrice(this);
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	private void setDiscountedPrice() {
		this.discountedPrice = DiscountCalculator.calculateOrderDiscountedPrice(this);
	}

	public void checkOutOrder(){
		this.setPrice();
		this.setDiscountedPrice();
	}
	
	public ArrayList<Integer> getOrderIdList() {
		return orderIdList;
	}

	public void setOrderIdList(String orderLine) {
		String[] orderIdListString = orderLine.split(",");
		for (String string : orderIdListString) {
			this.orderIdList.add(Integer.valueOf(string));
		}
	}
}
