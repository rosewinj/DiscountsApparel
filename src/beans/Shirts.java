package beans;

import utils.AppConsts;

public class Shirts extends MensWear{
	public Shirts(String brand, int price) {
		super(brand,price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.SHIRTSDISCOUNT)
			this.discount = AppConsts.SHIRTSDISCOUNT;
	}
}
