package beans;

import utils.AppConsts;

public class Casuals extends Trousers{
	public Casuals(String brand, int price) {
		super(brand, price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.CASUALSDISCOUNT)
			this.discount = AppConsts.CASUALSDISCOUNT;
	}
	
}
