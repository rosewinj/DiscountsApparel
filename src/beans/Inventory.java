package beans;

public class Inventory {
	protected int id;
	protected String brand;
	protected String category;
	protected int price;
	
	public Inventory(String id, String brand, String category, String price) {
		this.id = Integer.valueOf(id.replace(" ", ""));
		this.brand = brand.replace(" ", "");
		this.brand = this.brand.toUpperCase();
		this.category = category.replace(" ", "");
		this.category = this.category.toUpperCase();
		this.price = Integer.valueOf(price.replace(" ", ""));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
