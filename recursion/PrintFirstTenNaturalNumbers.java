package recursion;

public class PrintFirstTenNaturalNumbers {
    static int  n=1;
    public static void print() {        
        if(n<=10){
         System.out.println(n);        
         n++;        
         print(); 
        }
        
    }
    public static void main(String[] args) {
        print();
    }
}
