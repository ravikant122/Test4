package q1;

import java.util.Comparator;

class SortByName implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return m1.getItemId().compareTo(m2.getItemId());
	}
	
}

class SortByPrice implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return Double.compare(m2.getPrice(), m1.getPrice());
	}
	
}

public class Merchandise {
	private String itemId;
	private int quantity;
	private double price;
	
	public Merchandise(String itemId, int quantity, double price) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Merchandise [itemId=" + itemId + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
