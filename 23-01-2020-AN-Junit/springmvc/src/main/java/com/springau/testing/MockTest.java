package com.springau.testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.*;

import javax.sound.midi.Soundbank;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.springau.doa.EmployeeDao;
import com.springau.doa.EmployeeDaoImpl;
import com.springau.exceptions.EmployeeNotFoundException;
import com.springau.model.Employee;

public class MockTest {
	
	@InjectMocks
	EmployeeDaoImpl empDaoMock=new EmployeeDaoImpl();
	
	@Mock
	EmployeeDao empDaoService=mock(EmployeeDao.class);
	
	Employee empTest1=new Employee(0, "lira", "lira@d.com", "d");
	Employee empTest2=new Employee();
	
	public List<Employee> empList=new ArrayList<Employee>();
	@Test
	public void testEmpDao() throws EmployeeNotFoundException, SQLException {
		empList.add(new Employee(1, "Alice", "Alice@s.com", "h"));
		empList.add(new Employee(2, "Bob", "bob@s.com", "h"));
		
		doAnswer(invocation->{
			empTest2=(Employee) invocation;
			//checking name.length>0 and<16
			Assert.assertEquals(empTest2.getName().length(),8,7 );
			
			//checking id is in between 0-20
			Assert.assertEquals(empTest2.getId(), 10,10);
			System.out.println("Employee added" +empTest2);
			return null;
		}).when(empDaoService).add(any(Employee.class));
		
		doAnswer(invocation->{
			Employee t=(Employee)invocation;
			System.out.println("Updating Employee" +t);
			Assert.assertEquals(t.getId(), 0);
			empTest1=t;
			return null;
		}).when(empDaoService).update(any(Employee.class));
		
		doAnswer(invocation->{
			Assert.assertEquals(invocation, 0);
			System.out.println("Employee Deletion for id= " +invocation);
			return null;
		}).when(empDaoService).delete(3);
		
		when(empDaoService.getdet(0)).thenReturn(empTest1);
		when(empDaoService.getAll()).thenReturn(empList);
		
		
		empDaoMock.add(new Employee(3, "cara", "cara@s.com", "l"));	
		empDaoMock.update(new Employee(0, "liya", "liya@s.com", "l"));
		Employee emp1=empDaoMock.getdet(0);
		System.out.println(emp1);
		
		List<Employee> data=empDaoMock.getAll();
		Assert.assertEquals(data.size(), 2);
		
		
	}
	

}
