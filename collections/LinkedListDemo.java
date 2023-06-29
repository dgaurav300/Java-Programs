package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.addLast(10);
        linkedList.addFirst(9);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
