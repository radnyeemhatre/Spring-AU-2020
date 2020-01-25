package com.springau.aop.aspects;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	long start;
	long end;
	
	 
    //Measure execution time for this method
 
 
    
 
    
	@Before("execution(* com.springau.aop.services.EmployeeManager.getEmployeeId(..))")
	public void logbeforeV1(JoinPoint joinPoint)
	{
		System.out.println("EmployeeAspect.logBeforeV1():"+joinPoint.getSignature().getName());
	}
	@Before("execution(* com.springau.aop.services.EmployeeManager.getALLEmployee(..))")
	public void logBeforeV2(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logBeforeV1 :"+joinPoint.getSignature().getName()+System.nanoTime());
		start = System.nanoTime();
	}

	@After("execution(* com.springau.aop.services.EmployeeManager.getALLEmployee(..))")
	public void logAfterV2(JoinPoint joinPoint) {
		System.out.println("EmployeeAspect.logAfterV1 :"+joinPoint.getSignature().getName()+System.nanoTime());
		end = System.nanoTime();
		
		System.out.println(end-start);
	}
}
