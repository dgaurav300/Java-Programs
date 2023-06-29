package tree;

public class BinaryTree {
    public Node ROOT;
    private Node parent, currentNode;

    // constructor
    public BinaryTree() {
        ROOT = null; // Initializing ROOT to null
    }

    public void insert(String element) // Inserts a Node in the Binary Search Tree
    {
        Node tmp;
        parent = currentNode = null;

        if (find(element) == true) /*
                                    * Checks if the node to be inserted is already
                                    * present or not
                                    */
        {
            System.out.println("Duplicate words not allowed");
            return;
        } else // If the specified Node is not present
        {
            tmp = new Node(element, null, null); // Creates a Node
            if (parent == null) // If the tree is empty
            {
                ROOT = tmp;
            } else {
                if (element.compareTo(parent.info) < 0) {
                    parent.lChilNode = tmp;
                } else {
                    parent.rChildNode = tmp;
                }
            }
        }
    }
    public void inorder(Node ptr) /* Performs the inorder traversal of the tree 
*/
{
if (ptr != null)
{
inorder(ptr.lChilNode);
System.out.print(ptr.info + " ");
inorder(ptr.rChildNode);
}
}
    public boolean find(String element) {
        /*
         * This function finds a given element in the tree and returns a variable
         * containing the address of the
         * corresponding node. It also returns a variable containing the address of the
         * parent of the node.
         */
        currentNode = ROOT;
        parent = null;
        while ((currentNode != null) && (!element.equals(currentNode.info))) {
            parent = currentNode;
            if (element.compareTo(currentNode.info) < 0) {
                currentNode = currentNode.lChilNode;

            } else {
                currentNode = currentNode.rChildNode;
            }
        }
        if (currentNode == null)
            return false;
        else
            return true;
    }

}
