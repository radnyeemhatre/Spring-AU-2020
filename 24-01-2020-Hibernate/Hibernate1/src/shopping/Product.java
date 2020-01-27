package shopping;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="PRODUCT_DETAILS")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
	@NamedQuery(  
	        name = "ProductById",  
	        query = "from Product p where p.productId = :id"  
	        ) , 
	@NamedQuery(  
	        name = "AllProducts",  
	        query = "from Product"  
	        )  
	
})

public class Product {
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", Name=" + Name + ", price=" + price + "]";
	}
	@Id
	private int productId;
	private String Name;
	private int price;
	
	
	
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return Name;
	}
	public Product(int productId, String name, int price) {
		super();
		this.productId = productId;
		Name = name;
		this.price = price;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	

	
}
