package collections;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet hs2=new HashSet();

        hs2.add(35);
        hs2.add("Hello");

        System.out.println(hs2);
           
        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(5);
        System.out.println(hs.size());// 3
        //hs.remove(5);
        //hs.clear();
        System.out.println(hs);

        //use iterator to print hashset
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()) {
            Integer temp=it.next();
            if(temp%2==0){
                it.remove();
            }
        }
        System.out.println(hs);



    }
}
