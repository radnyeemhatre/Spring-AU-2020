package Annotations;

@Annotation1(value1=10,value2="MethodAnnotation.class")
public class MethodAnnotation{  
	@Annotation1(value1=10,value2="method1")  
	public void MethodAnn1(){System.out.println("This is method Annotaion1");}  
	
	@Annotation1(value1=9)
	public void MethodAnn2(){System.out.println("This is method Annotaion2");} 
	
	@Annotation1(value2="method 3")
	public void MethodAnn3(){System.out.println("This is method Annotaion3");} 
	
	@Annotation1
	public void MethodAnnd(){System.out.println("This is method Annotaion default");} 
	} 

