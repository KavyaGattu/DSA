class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class flattenBT {
    TreeNode prev=null;
    public void flatten(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=prev;  
        root.left=null;
        prev=root; 

    }
    public void printLinkedList(TreeNode root)
    {
        TreeNode current=root;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.right;
        }
        System.out.print("null"); 
    }
    public static void main(String args[])
    {
        flattenBT tree=new flattenBT();
              TreeNode root=new TreeNode(1);
              root.left=new TreeNode(2);
              root.right=new TreeNode(5);
              root.left.left=new TreeNode(3);
              root.left.right=new TreeNode(4);
              root.right.right=new TreeNode(7);
              root.right.left=new TreeNode(6);
              System.out.println("Linked list:");
              tree.flatten(root);
              tree.printLinkedList(root);
    }
    
}
