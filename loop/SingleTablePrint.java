package loop;
import java.util.Scanner;

public class SingleTablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Print Table");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
           }
        
    }
}
