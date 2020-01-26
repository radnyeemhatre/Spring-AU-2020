package shopping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class DairyItem extends Product {
	
	public DairyItem(int productId, String name, int price) {
		super(productId, name, price);
		// TODO Auto-generated constructor stub
	}
	private int itemId;
	public DairyItem(int productId, String name, int price, int itemId) {
		super(productId, name, price);
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "DairyItem [itemId=" + itemId + " productId= " + getProductId() + ", Name=" + getName() + ", price=" + getPrice() + "]";
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
