package collections;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grape");
        al.add("Pineapple");
        al.add("Lemon");
        al.add("Apple");

        System.out.println(al.get(5));
        al.set(5, "XYZ");
        al.remove("Apple");
        System.out.println(al.get(5));

        System.out.println(al);
    }
    

}
