package com.springau.aop.model;

public class Employee {
	private Integer employeeId;
	private String name;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", pos=" + pos + "]";
	}
	/**
	 * @param employeeId
	 * @param name
	 * @param pos
	 */
	public Employee(Integer employeeId, String name, String pos) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.pos = pos;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	private String pos;
	

}
