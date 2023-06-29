import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegExp1 {
   
    public static void main(String[] args) {
        String text="@ello World";
        Pattern pattern = Pattern.compile("^.ello", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()) {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
