package beans;

import utils.AppConsts;

public class MensWear {
	protected String brand;
	protected int price;
	protected int discount;
	
	public MensWear(String brand, int price) {
		this.brand = brand;
		this.price = price;
		// finding higher discount available b/w brand and category
		if(AppConsts.MENSWEARDISCOUNT < AppConsts.BRANDPRICES.get(this.brand))
			this.discount = AppConsts.BRANDPRICES.get(this.brand);
		else
			this.discount = AppConsts.MENSWEARDISCOUNT;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
 }
