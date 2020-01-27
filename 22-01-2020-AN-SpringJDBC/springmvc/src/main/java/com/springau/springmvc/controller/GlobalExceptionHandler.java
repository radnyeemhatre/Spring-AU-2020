package com.springau.springmvc.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springau.exceptions.EmployeeNotFoundException;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(SQLException.class)
	public void handleSQLException(HttpServletRequest request, Exception ex){
		System.out.println("Sql excp");
		logger.info("SQLException Occured:: URL="+request.getRequestURL());
		
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	@ExceptionHandler(IOException.class)
	public void handleIOException(){
		logger.error("IOException handler");
		
	}
	@ResponseStatus(reason="Employee not found")
	@ExceptionHandler(EmployeeNotFoundException.class)
	public  ModelAndView handleemployeeNotFound(HttpServletRequest request, Exception ex){
		System.out.println("enf");
		logger.error("Employee Not found");
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("exception", ex);
	    modelAndView.addObject("url", request.getRequestURL());
	    
	    modelAndView.setViewName("enf");
		return new ModelAndView("Enf");
	}
}
