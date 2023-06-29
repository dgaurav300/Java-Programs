package localization.date;
import java.text.DateFormat;
import java.util.*;
class DateDemo{
    public static void main(String[] args) {
        Locale india=new Locale.Builder()
             .setLanguage("jp")
             .setRegion("JP")
             .build();
        DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, india);

        String localdate=df.format(new Date());
        System.out.println(localdate);        
    }
}