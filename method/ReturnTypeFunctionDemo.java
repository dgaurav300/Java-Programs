package method;

class ResturnTypeMethodDemo
{

   static int add(int a,int b)
   {
    System.out.println("int int");
    return a+b;
   }  
   static float add(float a,int b) 
   {
    System.out.println("float int");
    return a+b;
   }
   static float add(float a,float b) 
   {
    System.out.println("float float");
    return a+b;
   }
   static float add(int a,float b) 
   {
    System.out.println("int float");
    return a+b;
   }
   static void multiply(int a,int b)
   {
     System.out.println(a*b);
   }


    public static void main(String[] args) {
       int result=add(4,5) ;  

       System.out.println(result);
      System.out.println(add(5.5f,4));

       multiply(6, 3);
    }
}