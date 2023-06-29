package switchcase;

public class GradeWithSwitch {
    public static void main(String[] args) {

        int percentage=49;
     
        switch(percentage/10)
        {
            case 9:
            System.out.println("Grade A");
            break;
            case 8:
            System.out.println("Grade B");
            break;
            case 7:
            System.out.println("Grade C");
            break;
            case 6:
            System.out.println("Grade D");
            break;
            case 5:
            case 4:
            System.out.println( "Grade E");
            break;        
           
            default:
            System.out.println("Grade F");

        }
        
    }
}
