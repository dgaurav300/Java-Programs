package recursion;

public class AddFirstTenNaturalNumbers { 
    public static int sum(int n) {        
        if(n>0){
            return n+sum(n-1); 
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sum(10)); //10+9+8+7+6+5+4+3+2+1+0
    }
}
