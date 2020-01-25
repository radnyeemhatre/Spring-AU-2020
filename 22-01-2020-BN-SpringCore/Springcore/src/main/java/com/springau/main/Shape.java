package com.springau.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.config.AppConfig;
import com.springau.model.Point;

;

public class Shape {
	
	public static void main(String args[]) {
		

		
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		    Point p = context.getBean(Point.class);
		    p.draw();
		    
	}

}
