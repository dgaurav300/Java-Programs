package tree;

public class Node {
    public String info;
    Node lChilNode;
    Node rChildNode;

public Node(String i, Node l, Node r) /* Constructor for the Node class */
 {
 info = i;
 lChilNode = l;
 rChildNode = r;
 }


}
