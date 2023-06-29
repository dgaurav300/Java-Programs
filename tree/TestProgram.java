package tree;

public class TestProgram {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        tree.insert("ramesh");
        tree.insert("rajesh");
        tree.insert("ujjwal");
        tree.insert("rahul");
        System.out.println(tree.find("rajesh"));
        tree.inorder(tree.ROOT);
    }
}
