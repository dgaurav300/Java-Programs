package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<String>();

        deque.add("Apple");
        deque.add("Banana");
        deque.addFirst("Orange");

        System.out.println(deque);
        deque.addLast("Mango");
        
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());

        System.out.println(deque.size());
    }
}
