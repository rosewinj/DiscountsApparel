package beans;

import utils.AppConsts;

public class FootWear extends WomensWear {
	public FootWear(String brand, int price) {
		super(brand, price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.FOOTWEARDISCOUNT)
			this.discount = AppConsts.FOOTWEARDISCOUNT;
	}
}
