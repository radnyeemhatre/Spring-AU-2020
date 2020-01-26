package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RegisterProcessorRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterProcessorRequest {
	
	@XmlElement(name="Name",required=true)
	private String Name;
	private String Email;
	
	@Override
	public String toString() {
		return "RegisterProcessorRequest [Name=" + Name + ", Email=" + Email + "]";
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
}
