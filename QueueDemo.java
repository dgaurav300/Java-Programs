class Node
{
public int data;
 public Node next;
}

class Queue{
    Node FRONT, REAR;
 public Queue()
 {
 FRONT = null;
 REAR = null;
 }
 public void insert (int element){
    Node newNode=new Node();
    newNode.data=element;
    newNode.next=null;
    if(FRONT==null)
    {
        FRONT=newNode;
        REAR=newNode;
        return;
    }
    REAR.next=newNode;
    REAR=newNode;    

 }
 public void remove(){
    
if(FRONT==null)
    {
        System.out.println("Queue is Empty!");
        return;
    }

    FRONT=FRONT.next;
 }
 public void display(){
    if(FRONT==null)
    {
        System.out.println("Queue is Empty!");
        return;
    }
   Node temp;
  for(temp=FRONT;temp!=null;temp=temp.next)
  {
    System.out.println(temp.data);
  }

 }

}


public class QueueDemo{
public  static void main(String args[]) {
    Queue list=new Queue();
    list.insert(40);
    list.insert(50);
    list.insert(45);
    list.insert(10);
    list.remove();
    list.display();

}
}