package TimeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Timezone {
     
    public static void main(String[] args)
    {
    	String d1="1998-11-17T00:00:00";
    	String d2="2001-11-30T00:00:00";
    	ZoneId z1 = ZoneId.of("America/New_York");
        ZoneId z2 = ZoneId.of("Asia/Kolkata");
       days(d1, d2, z1, z2);
        
    }
    static void days(String d1,String d2, ZoneId z1,ZoneId z2) {
    	LocalDateTime date1 = LocalDateTime.parse(d1);
        LocalDateTime date2 = LocalDateTime.parse(d2);
        //Zoned date time at source timezone
        ZonedDateTime de1 =date1.atZone(z1);     
        ZonedDateTime de2 =date2.atZone(z2);     
        System.out.println("date1 "+d1+"in timezone "+z1+ " : "+de1);
        System.out.println("date2 "+d2+" in timezone "+z2+ " : "+de2);
        //Zoned date time at target timezone
        ZonedDateTime d1new = de1.withZoneSameInstant(z2);
        System.out.println("date1 "+d1+" in timezone "+z2+ " : "+d1new);
        //Format date time - optional
        long diff = ChronoUnit.DAYS.between(d1new,de2);
        System.out.println(diff);
    }
 
}

