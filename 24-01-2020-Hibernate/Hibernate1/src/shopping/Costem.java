package shopping;

import javax.persistence.Entity;

@Entity
public class Costem  extends Product{
	private int itemId;

	public Costem(int productId, String name, int price, int itemId) {
		super(productId, name, price);
		this.itemId = itemId;
		
	}
	public String toString() {
		return "Coesmetic Item [itemId=" + itemId + " productId= " + getProductId() + ", Name=" + getName() + ", price=" + getPrice() + "]";
	}

	

}
