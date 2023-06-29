package singlylinkedlist;

public class TestProgram {
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
       
        list.treverse();
        list.addNode("Rakesh", "Lucknow");
        list.addNode("Ajay", "Bangalore");
        list.addNode("Rahul", "Kolkata");
        list.addNode("Arjun", "Chennai");
        list.treverse();
    }
}
