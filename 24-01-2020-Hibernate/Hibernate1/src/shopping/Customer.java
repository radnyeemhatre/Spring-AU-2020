package shopping;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER_DETAILS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Customer {
	
	@Id
	private int customerId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		//System.out.println(customerId);
		this.customerId = customerId;
	}
	
	
	

}
