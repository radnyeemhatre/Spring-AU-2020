package com.springau.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.doa.EmployeeDao;
import com.springau.model.Employee;

public class JdbcMain {

	public void jdbcCreate() {
		System.out.println("Jdbc conn");
		System.out.println(System.getProperty("java.class.path"));
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Get the EmployeeDAO Bean
		EmployeeDao empDao = ctx.getBean("employeeDAO", EmployeeDao.class);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("ara");
		emp.setEmail("ara@ara.com");
		emp.setDept("HR");
		
	}

}
