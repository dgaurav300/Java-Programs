package user_defined_function;
import java.util.Scanner;

public class TempratureConverter {

    public static double degCelsiusToFahrenheit(double c){

        return  (c*9/5)+32;

    }

     public static double fahrenheitToDegCelsius(double F){

        return  (F-32)*5/9;

    }

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        int choice;

        System.out.println("Please choose your Conversion Type");
        System.out.print("(1) Celcius to Fahrenheit\n" + "(2) Fahrenheit to Degree celcius \nChoice: ");
       double result;
        choice =read.nextInt();
        switch(choice){
            case 1:
              System.out.println("Enter Celcius value:");
              double tempInCelcius=read.nextDouble();
              result=degCelsiusToFahrenheit(tempInCelcius);
              System.out.printf("%f °C = %f f",tempInCelcius,result);
            break;
            case 2:
              System.out.println("Enter Fahrenheit value:");
              double tempInFahrenheit=read.nextDouble();
              result=fahrenheitToDegCelsius(tempInFahrenheit);
              System.out.printf("%f f = %f °C",tempInFahrenheit,result);
            break;
        }

       

    }
}
