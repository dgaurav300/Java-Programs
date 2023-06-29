public class MultipleClassInOneFile {
    public static void main(String[] args) {

        A a1=new A();
        B b1=new B();
        //b1.x=45;
        System.out.println(b1.x);
        A.display();
        a1.greet();


    }
}
class B
{
    public final int x=5;
    B()
    {
        System.out.println("X value is:"+x);
    }
}

class A {
    A() {
    System.out.println("Counstroctor of A class is Invoke");
    display();

    }

    // access using Class name if function access out of it's scope
    //access only function name with his own class
    static void display()
    {
        System.out.println("Hello Good Evening");
    }
  //which can access using object
    public void greet()
    {
        System.out.println("Namastey!");
    }

}
