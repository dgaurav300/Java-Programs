package methodoverloading;

public class MethodOverloading {

   

    public static void add(int a,int b)
    {
        System.out.println("The sum result of int,int is:"+(a+b));
    }
    public static void add(int a,int b,int c)
    {
        System.out.println("The sum result of int,int,int is:"+(a+b+c));
    }

    public static void add(float a,float b)
    {
        System.out.println("The sum result of float,float is:"+(a+b));
    }
    public static void add(double a,double b)
    {
        System.out.println("The sum result of double,double is:"+(a+b));
    }


    public static void main(String[] args) {
        add(5, 9);
        add(5, 9,9);
        add(4.5f,7.8f);
        add(4.5,7.8);
    }
}
