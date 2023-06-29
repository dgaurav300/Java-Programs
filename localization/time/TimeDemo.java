package localization.time;
import java.text.*;
import java.util.*;

public class TimeDemo {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("en","US")); 
        String time = df.format(new Date()); 
        System.out.println(time); 
        
    }
}
