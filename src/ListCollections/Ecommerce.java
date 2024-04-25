package ListCollections;

public class Ecommerce implements Comparable<Ecommerce>{
	
	String product;
	int price;
	String category;
	int quantity;
	public Ecommerce() {
		super();
		
	}
	
	public Ecommerce(String product, int price, String category, int quantity) {
		super();
		this.product = product;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Ecommerce [product=" + product + ", price=" + price + ", category=" + category + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int compareTo(Ecommerce o) {
		int sorted=this.quantity-o.quantity;
		return sorted;
	}
	

}
