package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Annotation1 
public class Annotationsmain {

	public static void main(String[] args)throws Exception {
		
		Class<Annotationsmain> myClass = Annotationsmain.class; 
        
       System.out.println( "\nAnnotation of Annotationsmain: ");
       Annotation1 ca1= myClass.getAnnotation(Annotation1.class);
        System.out.println("value1 is: "+ca1.value1()+ " value2 is "+ca1.value2()); 
        
        Class<MethodAnnotation> myClass2 = MethodAnnotation.class; 
       
        System.out.println( "\nAnnotation of MethodAnnotation: ");
        Annotation1 ca2= myClass2.getAnnotation(Annotation1.class);
        System.out.println("value1 is: "+ca2.value1()+ " value2 is "+ca2.value2()); 
        
        MethodAnnotation ma=new MethodAnnotation(); 
		Method mm=ma.getClass().getMethod("MethodAnn1");  
		Annotation1 mma=mm.getAnnotation(Annotation1.class); 
		 System.out.println( "\nAnnotation of MethodAnn1: ");
		System.out.println("value1 is: "+mma.value1()+ " value2 is "+mma.value2());
		
		Method mm2=ma.getClass().getMethod("MethodAnn2");  
		Annotation1 mma2=mm2.getAnnotation(Annotation1.class);
		System.out.println( "\nAnnotation of MethodAnn2: ");
		System.out.println("value1 is: "+mma2.value1()+ " value2 is "+mma2.value2());
		
		Method mm3=ma.getClass().getMethod("MethodAnn3");  
		Annotation1 mma3=mm3.getAnnotation(Annotation1.class);
		System.out.println( "\nAnnotation of MethodAnn3: ");
		System.out.println("value1 is: "+mma3.value1()+ " value2 is "+mma3.value2());
		
		Method mmd=ma.getClass().getMethod("MethodAnnd");  
		Annotation1 mmad=mmd.getAnnotation(Annotation1.class); 
		System.out.println( "\nAnnotation of MethodAnnd: ");
		System.out.println("value1 is: "+mmad.value1()+ " value2 is "+mmad.value2());
		
	}

}
