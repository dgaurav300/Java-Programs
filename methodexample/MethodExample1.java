package methodexample;

public class MethodExample1 {

   static void function1()
    {
        System.out.println("This is function  1 Block");
        
    }
    static void function2()
    {
        System.out.println("This is function  2 Block");
    }

    static void add(int a,int b)
    {
        System.out.println("The sum result is:"+(a+b));
    }

    static void add(int ...arr)
    {
        int sum=0;
        for(int e:arr)
        {
            sum+=e;
        }

        System.out.println("The sum result is:"+(sum));
    }


    static void display(String name,int age)
    {
        System.out.println("Mr. "+name+", Your age is:"+age);
    }

    static float areaOfCircle(double radius)
    {
        return  (float)(Math.PI*Math.pow(radius, 2));
    }

}
