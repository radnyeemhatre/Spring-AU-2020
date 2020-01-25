package com.springau.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;



import com.springau.model.Point;
@Configuration
@ComponentScan(basePackages = "com.*")
public class AppConfig {
	
	
	@Autowired
	private Environment env;
	
	
	@Bean(name="point")
	public Point getPoint()
	{
		Point p=new Point();
		
		p.setx(Integer.parseInt(env.getProperty("X")));
		
		p.sety(Integer.parseInt(env.getProperty("X")));

		return p;
		
	}
	

}
