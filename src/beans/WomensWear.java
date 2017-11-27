package beans;

import utils.AppConsts;

public abstract class WomensWear extends Wear{
	public WomensWear(String brand, int price) {
		super(brand, price);
		// finding higher discount available b/w brand and category
		if(AppConsts.WOMENSWEARDISCOUNT < AppConsts.BRANDPRICES.get(this.brand))
			this.discount = AppConsts.BRANDPRICES.get(this.brand);
		else
			this.discount = AppConsts.WOMENSWEARDISCOUNT;
	}
}
