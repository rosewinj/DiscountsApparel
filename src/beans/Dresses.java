package beans;

import utils.AppConsts;

public class Dresses extends WomensWear {
	public Dresses(String brand, int price) {
		super(brand, price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.DRESSESDISCOUNT)
			this.discount = AppConsts.DRESSESDISCOUNT;
	}
}
