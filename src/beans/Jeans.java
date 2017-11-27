package beans;

import utils.AppConsts;

public class Jeans extends Trousers{
	public Jeans(String brand, int price) {
		super(brand,price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.JEANSDISCOUNT)
			this.discount = AppConsts.JEANSDISCOUNT;
	}
}
