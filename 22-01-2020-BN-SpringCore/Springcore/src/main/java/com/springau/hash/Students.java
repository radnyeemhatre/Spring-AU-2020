package com.springau.hash;

import java.util.Map;

public class Students {
	
	private int id;
	private String fname;
	@Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	/**
	 * @param id
	 * @param fname
	 * @param lname
	 */
	
	public Students()
	{
		
	}
	public Students(int id, String fname, String lname) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	private String lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
