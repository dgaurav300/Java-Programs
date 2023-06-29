package collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> mymap=new HashMap<String,Integer>(5);
       

        mymap.put("India",245);
        mymap.put("USA", 400);
        mymap.put("China", 800);
        mymap.put("Japan", 900);
        mymap.put(null, 560);
        mymap.put(null,500);
        System.out.println(mymap.get("India")); // 245
        System.out.println(mymap);// {USA=400, China=800, Japan=900, India=245}
        System.out.println(mymap.containsKey("USA"));//true

        HashMap<String,Integer> mymap2=new HashMap<String,Integer>(mymap);
        mymap2.put("UAE",245);
        mymap2.put("UK", 400);
        mymap2.put("Russia", 800);
        mymap2.put("Ukrain", 900);
        
        System.out.println(mymap2);

        for(String i:mymap2.keySet())
        {
            System.out.println(i);
        }

        for(Integer i:mymap2.values())
        {
            System.out.println(i);
        }

        for(String i:mymap2.keySet())
        {
            System.out.println("Key: "+i+", Value: "+mymap2.get(i));
        }

    }
}
