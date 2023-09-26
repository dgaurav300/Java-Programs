package static_vs_non_static;
public class Demo1 {
    int x=5;
    Demo1(int x){
        this.x=x;
  
    }

     Demo1(){     
  
    }

    static void staticFunction(){
        System.out.println("Static Function");
    }
    void nonStaticFunction(){
        System.out.println("Non Static Function");
    }
    public static void main(String[] args) {
        staticFunction();
       
        Demo1 d=new Demo1(25);
        Demo1 e=new Demo1(90);
      
        d.nonStaticFunction();
        System.out.println(d.x);
        System.out.println(e.x);
        
    }
}
