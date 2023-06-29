package recursion;

public class RecursionExample {

    public static void display(int n) {        
        if(n>0){
         System.out.println("Hello");
         display(n-1);
        }
        
    }
    public static void main(String[] args) {
         display(5);
    }
}
