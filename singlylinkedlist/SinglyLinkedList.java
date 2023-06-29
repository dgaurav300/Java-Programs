package singlylinkedlist;

public class SinglyLinkedList {
     Node START;
    
   public SinglyLinkedList()
   {
    START=null;
   }
public void addNode(String name,String city)
{

    Node newNode=new Node();
    Node curr=START;
    newNode.name=name;
    newNode.city=city;
    newNode.next=null;
    if(curr==null){
    
    START=newNode;
    }
    else
    {
        while(curr.next!=null)
    {
    
      curr=curr.next;
    }
    curr.next=newNode;
    }
   
}

public void treverse()
{

    Node curr=START;
    if(curr==null)
    {
      System.out.println("List is Empty");
      
    }
    else
    {
    while(curr!=null)
    {
        System.out.println("-----------------");
        System.out.println("Name:"+curr.name);
        System.out.println("Name:"+curr.city);
        System.out.println("-----------------");
        System.out.println();
      curr=curr.next;
    }
    
    }


   
}


}
