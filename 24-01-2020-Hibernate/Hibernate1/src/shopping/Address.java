package shopping;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", pincode=" + pincode + "]";
	}
	
	private String Street;
	private String pincode;
	public Address(String street, String pincode) {
		
		Street = street;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	
	

}
