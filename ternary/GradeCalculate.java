package ternary;
import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int Marks=sc.nextInt();
        String grade=
        (Marks>=0 && Marks<=100)?
        Marks<50?
        "Fail":
        Marks<60?"Satisfactory":
        Marks<70?"Fair":
        Marks<80?"Good":"Exellent":"Inalid Marks";

        System.out.println(grade);

    }
}
