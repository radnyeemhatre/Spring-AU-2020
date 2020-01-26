package shopping;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class CustomerDetails extends Customer {
	
	private String Name;
	private String Email;
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "CustomerDetails [ Id ="+super.getCustomerId()+" Name=" + Name + ", Email=" + Email + ", HomeAddress=" + HomeAddress + ", offAddress="
				+ offAddress + "]";
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Address getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		HomeAddress = homeAddress;
	}
	public Address getOffAddress() {
		return offAddress;
	}
	public void setOffAddress(Address offAddress) {
		this.offAddress = offAddress;
	}
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="Street",column=@Column(name="HOME_STREET")),
		@AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))
	})
	Address HomeAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="Street",column=@Column(name="OFFICE_STREET")),
		@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))
	})
	Address offAddress;

}
