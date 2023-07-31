package operators;
class Example1{

    public static void main(String[] args) {
        //5 and 6 is operands 
        //+ is an operator
        //arithmatic operator
        System.out.println("The addition result is:"+(5+6));
         System.out.println("The substraction result is:"+(5-6));
         System.out.println("The multplication result is:"+(5*6));
         System.out.println("The division result is:"+(5/6));
         System.out.println("The remainder result is:"+(5%6));

         //assignment operator
         int a=7,b=-3 ;
         //b=b+a;   -3+7=4
         b+=a;//it will add the value of variable 'a' to variable 'b'.
         System.out.println("\nAfter adding "+a+" to"+"variable B: "+b);

         //System.out.println(a==b);
         //System.out.println(a!=b);

         int age=45;
         float weight=57.6f;
         //logical operator
         boolean isValid = (age>=20 && !(weight<=50) );

         System.out.println(isValid);

         int x=60,y=13;

         System.out.println(x^y);
         /*
          * 
0-000
1-001
2-010
3-011
4-100
5-101
6-110
7-111
8-1000
9-1001
10-1010
11-1011
12-1100
          

          */


        
         
    }
}