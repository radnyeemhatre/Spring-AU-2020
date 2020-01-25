package com.springau.aop.services;
import java.util.ArrayList;
import java.util.List;

import com.springau.aop.model.Employee;


public class EmployeeManager {
	
	public static ArrayList<Employee> el= new ArrayList<Employee>();
	public Employee getEmployeeById(Integer employeeid) {
		System.out.println("getEmployeeById called");
		return new Employee(1,"a","k");
	}
	
	public List<Employee> getALLEmployee(){
		System.out.println("getALLEmployee called");
		for(Employee e :el)
		{
			System.out.println(e);
		}
		return el;
	}
	
	public void getEmployeeId() {
		System.out.println("getEmployeeId called");
	}
	public void addEmployees() {
		el.add(new Employee(2, "b","a"));
		el.add(new Employee(3, "n","s"));
		el.add(new Employee(4, "m","d"));
		el.add(new Employee(5, "y","f"));
		el.add(new Employee(6, "r","g"));
		
	}
	
}
