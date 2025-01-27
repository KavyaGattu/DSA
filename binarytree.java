

class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class simpleTree{
    Node root;
    simpleTree()
    {
           this.root=null;
    }
    void addelement(int data)
    {
        root=addRecursive(root,data);
    }
    public Node addRecursive(Node root,int data){
        if(root==null)
        {
            return new Node(data);
        }
        if(data<root.data)
        {
            root.left=addRecursive(root.left,data);
        }
        else{
            root.right=addRecursive(root.right, data);
        }
        return root;
    }
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);  
            System.out.print(node.data + " ");  
            inOrderTraversal(node.right); 
        }
    }
}
public class binarytree{
    public static void main(String args[])
    {
        simpleTree tree=new simpleTree();
        tree.addelement(50);
        tree.addelement(20);
        tree.addelement(30);
        tree.addelement(40);
        tree.inOrderTraversal(tree.root);

    }
}
