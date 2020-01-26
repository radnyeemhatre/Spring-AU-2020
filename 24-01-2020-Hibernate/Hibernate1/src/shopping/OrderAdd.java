package shopping;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@NamedNativeQuery(
        name = "OrderFor",
        query = "SELECT *  from orderadd",
                    resultClass=OrderAdd.class
    )
public class OrderAdd extends Cart {
	
	@GeneratedValue
	private int orderId;
	
	@ManyToOne
	@JoinTable(name="CUST_ORDERADD")
	Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		
		this.customer = customer;
	}

	
	@OneToMany
	@JoinTable(name="ITEM_ORDERSADD", joinColumns=@JoinColumn(name="ORDER_ID"),inverseJoinColumns=@JoinColumn(name="PRODUCT_ID"))
	@ElementCollection(fetch=FetchType.EAGER)
	@GenericGenerator(name="myg", strategy="sequence")
	@CollectionId(columns = { @Column(name="Item_no") }, generator = "myg", type = @Type(type="int"))
	List<Product> Itemlist =new LinkedList<Product>();
	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void additem(Product i)
	{
		Itemlist.add(i);
		
	}

}
