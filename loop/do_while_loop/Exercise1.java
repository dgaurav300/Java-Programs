package loop.do_while_loop;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n;

       do{
        System.out.println("Enter a Number");
        n=sc.nextInt();
        if(n<=0){
        System.out.println("Enter Valid Number");
        
        }
        else
        {
            System.out.println("The Number is:"+n);
            break;
        }
       }while(true);
        
    }
}
