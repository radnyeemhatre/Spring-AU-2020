package TimeZone;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Difference {

	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 dates (dd/MM/yyyy");
		String Date1=sc.next();
		String Date2=sc.next();
	   diff(Date1,Date2);
	   
	}
	static void diff(String Date1,String Date2)throws Exception 
	{
		 	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  
		    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(Date2);
		    long mill1 = date1.getTime(); 
		    long mill2 = date2.getTime();    
		     
	        TimeUnit tu = TimeUnit.MILLISECONDS;
		   
	        long nano1=tu.toNanos(mill1);
	        long nano2=tu.toNanos(mill2);
	        System.out.println("Date1 : "+date1+" milliseconds: "+mill1+" nano :"+nano1);
	        System.out.println("Date2 : "+date2+" milliseconds: "+mill2+ " nano :"+nano2);
	        System.out.println("Difference in nanoseconds is "+(nano2-nano1));
	}
}
