package com.springau.model;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Point {
	private int x;
	private int y;
	
	public int getx()
	{
		return this.x;
	}
	public int gety()
	{
		return this.y;
	}
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Value of X is "+x+"\n Value of Y is "+y);
		
	}
}
