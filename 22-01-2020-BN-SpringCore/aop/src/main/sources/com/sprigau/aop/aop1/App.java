package com.sprigau.aop.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.aop.services.EmployeeManager;

/**
 * Hello world!
 *
 */

@ComponentScan(basePackages="com.springau")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeManager manager=context.getBean(EmployeeManager.class);
        manager.getEmployeeId();
        manager.addEmployees();
        manager.getALLEmployee();
    }
}
