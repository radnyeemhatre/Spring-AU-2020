package Annotations;

import java.lang.reflect.*;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.METHOD,ElementType.TYPE}) 
public @interface Annotation1 {
	int value1() default 0;  
	String value2() default "default";  
}



