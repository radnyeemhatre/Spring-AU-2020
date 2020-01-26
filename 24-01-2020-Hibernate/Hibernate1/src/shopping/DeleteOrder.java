package shopping;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class DeleteOrder extends Cart {
	
	
	@GeneratedValue
	private int order_id;
	@ManyToOne
	@JoinTable(name="CUST_ORDERDELETE")
	Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		System.out.println(customer.getCustomerId());
		this.customer = customer;
	}
	
	public int getOrderId() {
		return order_id;
	}

	public void setOrderId(int orderId) {
		this.order_id = orderId;
	}
	
	
	@OneToMany
	@JoinTable(name="ITEM_ORDERDELETE" , joinColumns=@JoinColumn(name="ORDER_ID"),inverseJoinColumns=@JoinColumn(name="ITEM_ID"))
	@ElementCollection(fetch=FetchType.EAGER)
	@GenericGenerator(name="myg", strategy="sequence")
	@CollectionId(columns = { @Column(name="Item_no") }, generator = "myg", type = @Type(type="int"))
	List<Product> Itemlist =new LinkedList<Product>();

	public List<Product> getItemlist() {
		return Itemlist;
	}

	public void setItemlist(List<Product> itemlist) {
		Itemlist = itemlist;
	}

}
