import java.util.Scanner;
public class ElseIfExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Percentage");
        float percentage=sc.nextFloat();       
        /*
         * 0-49 Fail
         * 50-59 Satisfactory
         * 60-69 Fair
         * 70-79 Good
         * 80-100 Exellent
         */
         if(percentage>=0 && percentage<=100)
         {
            if(percentage<50)
              System.out.println("Fail");
            else if(percentage<60)
              System.out.println("Satisfactory");
            else if(percentage<70)
              System.out.println("Fair");
            else if(percentage<80)
              System.out.println("Good");
            else 
             System.out.println("Exellent");
              

         }
         else
         {
            System.out.println("Invalid Percentage Please Try Again!");
         }

    }
}
