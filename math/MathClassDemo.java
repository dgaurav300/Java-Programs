package math;
import java.util.Scanner;

public class MathClassDemo {
    public static void main(String[] args) {
       // Scanner sc = new Scanner (System.in);
       // System.out.println("Enter First Number:");
        //int a=sc.nextInt();
        //System.out.println("Enter Second Number:");
        //int b=sc.nextInt();
    /* 
        int min=Math.min(a, b);
        int max=Math.max(a, b);
        System.out.println("Minimum Value is:"+min);
        System.out.println("Maximum Value is:"+max);
        */

        //calculate square root
        //of number using sqrt() method in Math Class :
        double d=10;
        double sqrRootOfD=Math.sqrt(d);
        System.out.println("Square Root of "+d+" is: "+sqrRootOfD);

        //get absolute value of a number
        //by calling abs() method from Math Class :
        float f=-5f;
        float absolute=Math.abs(f);
        System.out.println("Absolute Value of "+f+" is: "+absolute);

        /*genrate random number*/
        double random=Math.random();
        System.out.println(random);
       // random number between 0 to 100 using Math.random() method
       //and casting it into integer type variable :
       int r=(int)(Math.random()*100+1);//generate random no btwn 1-100
       System.out.println(r);

       // random number between 1 to 6
        int r2=(int)((Math.random()*6)+1);//generate random no btwn 1-100
       System.out.println(r2);



    }
}
