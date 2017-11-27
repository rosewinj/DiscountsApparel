package beans;

import utils.AppConsts;

public class WomensWear {
	protected String brand;
	protected int price;
	protected int discount;
	
	public WomensWear(String brand, int price) {
		this.brand = brand;
		this.price = price;
		// finding higher discount available b/w brand and category
		if(AppConsts.WOMENSWEARDISCOUNT < AppConsts.BRANDPRICES.get(this.brand))
			this.discount = AppConsts.BRANDPRICES.get(this.brand);
		else
			this.discount = AppConsts.WOMENSWEARDISCOUNT;
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
