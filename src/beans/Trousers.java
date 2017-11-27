package beans;

import utils.AppConsts;

public class Trousers extends MensWear {
	public Trousers(String brand, int price) {
		super(brand, price);
		// finding higher discount b/w current category and parent category
		if(this.discount < AppConsts.TROUSERSDISCOUNT)
			this.discount = AppConsts.TROUSERSDISCOUNT;
	}

}
