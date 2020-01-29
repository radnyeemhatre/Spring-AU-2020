package com.springau.model;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String dept;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
	}
	public Employee(int id, String name, String email, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
	}
	public Employee() {
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
