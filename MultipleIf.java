import java.util.Scanner;
public class MultipleIf {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        number=sc.nextInt();
        System.out.println("Number is Divisible By:");
        if(number%2==0)
         System.out.println(2);
        if(number%3==0)
         System.out.println(3);
        if(number%5==0)
         System.out.println(5);
        if(number%2!=0 && number%3!=0 && number%5!=0)
        System.out.println("not divisble by any of them 2,3,5");
    }
}
