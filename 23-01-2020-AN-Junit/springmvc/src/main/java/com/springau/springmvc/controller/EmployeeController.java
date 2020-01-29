package com.springau.springmvc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springau.doa.EmployeeDao;
import com.springau.exceptions.EmployeeNotFoundException;
import com.springau.model.Employee;

@Controller
public class EmployeeController {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	
	EmployeeDao empDao = ctx.getBean("employeeDAO", EmployeeDao.class);
	@RequestMapping(value = "/addemp", method = RequestMethod.POST)
    public String addemp(@ModelAttribute("Employee")Employee emp, 
    		ModelMap model) throws EmployeeNotFoundException, SQLException {
		System.out.println(emp);
		empDao.add(emp);
		return "add";
 }
	@RequestMapping(value = "/updemp", method = RequestMethod.POST)
    public String empup(@ModelAttribute("Employeeup")Employee e, 
    		ModelMap model) throws EmployeeNotFoundException, SQLException {
		
		empDao.update(e);
		return "update";
 }
	
	@RequestMapping(value = "/delemp", method = RequestMethod.POST)
    public String del(@ModelAttribute("Employeed")Employee e, 
    		ModelMap model) throws EmployeeNotFoundException, SQLException {
		System.out.println(e);
		empDao.delete(e.getId());
		return "delete";
 }
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public  ModelAndView view(@ModelAttribute("Employee") Employee e) throws SQLException, EmployeeNotFoundException {
		
        ModelAndView model = new ModelAndView("view");
		List<Employee> list = empDao.getAll();
		for(Employee e1 : list) {
			System.out.println(e1);
		}
		model.addObject("el", list);
		ctx.close();		
		return model;
	}
	

}
