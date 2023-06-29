package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("Z");
        ts.add("B");
        ts.add("C");
        System.out.println(ts);

        Iterator it=ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
