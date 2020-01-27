package com.springau.springmvc.controller;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springau.doa.EmployeeDao;

import com.springau.model.Employee;

@Controller
public class MainController {
	
	
	@RequestMapping(value = "/add")
	public String add() {
		
        return "add";
        		
        
	}
	@RequestMapping(value = "/return")
	public String returnpage() {
		
        return "return";
        		
        
	}
	@RequestMapping(value = "")
	public String hpage() {
		
        return "page";
        		
        
	}
	@RequestMapping(value = "/page")
	public String page() {
		
        return "page";
        		
        
	}
	@RequestMapping(value = "/update")
	public String update() {
		
        return "update";
        		
        
	}
	@RequestMapping(value = "/delete")
	public String delete() {
		
        return "delete";
        		
        
	}
	@RequestMapping(value = "/Enf")
	public String enf() {
		
        return "Enf";
        		
        
	}
	@RequestMapping(value = "/view")
	public String view() {
		
        return "view";
        		
        
	}
}
