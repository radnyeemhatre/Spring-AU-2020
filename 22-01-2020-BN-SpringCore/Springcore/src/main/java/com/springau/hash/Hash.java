package com.springau.hash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hash {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Details d=(Details) context.getBean("map1");
		Students s =(Students) context.getBean("s2");
		System.out.println(s);
		System.out.println(d);
	}
	

}
