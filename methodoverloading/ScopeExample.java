package methodoverloading;

public class ScopeExample {
    int a=5;// instance variable
    
    
    
    public static void main(String[] args) {
       
        int a=10;
      ScopeExample obj=new ScopeExample();  
      obj.display();//5
      System.out.println(a);//10
    }

    public void display() {
        System.out.println(a);
    }
}
