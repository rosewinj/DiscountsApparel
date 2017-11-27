package beans;

import utils.AppConsts;

public abstract class MensWear extends Wear{	
	public MensWear(String brand, int price) {
		super(brand, price);
		// finding higher discount available b/w brand and category
		if(AppConsts.MENSWEARDISCOUNT < AppConsts.BRANDPRICES.get(this.brand))
			this.discount = AppConsts.BRANDPRICES.get(this.brand);
		else
			this.discount = AppConsts.MENSWEARDISCOUNT;
	}
 }
