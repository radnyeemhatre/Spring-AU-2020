package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="RegisterProcessorResponse")
public class RegisterProcessorResponse {
	private boolean result;
	private String resName;
	private String resEmail;

	public String isResult() {
		return this.toString();
	}

	public void setResult(boolean result, String name, String email) {
		this.result = result;
		this.resName = name;
		this.resEmail=email;
	}

	@Override
	public String toString() {
		return "RegisterProcessorResponse ["+ ", resName=" + resName + ", resEmail=" + resEmail + "]";
	}
}
