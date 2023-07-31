package localization.date;
import java.text.DateFormat;
import java.util.*;
class DateDemo{
    public static void main(String[] args) {
        Locale german=new Locale.Builder()
             .setLanguage("hi")
             .setRegion("IN")
             .build();
        DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, german);

        String localdate=df.format(new Date());
        System.out.println(localdate);        
    }
}