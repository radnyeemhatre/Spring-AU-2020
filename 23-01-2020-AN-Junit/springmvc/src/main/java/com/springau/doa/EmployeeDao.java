   package com.springau.doa;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.springau.exceptions.EmployeeNotFoundException;
import com.springau.model.Employee;

public interface EmployeeDao {

	public void add(Employee employee) throws EmployeeNotFoundException, SQLException;
	
	public void update(Employee employee) throws EmployeeNotFoundException, SQLException;
	
	public void delete(int id) throws EmployeeNotFoundException, SQLException;

	public Employee getdet(int id) throws EmployeeNotFoundException, SQLException;
	
	public List<Employee> getAll() throws EmployeeNotFoundException, SQLException;
}
