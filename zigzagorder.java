import java.util.Stack;

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class zigzagorder {
    TreeNode node;
    public void traverseorder(TreeNode node)
    {
        Stack<TreeNode> stack1=new Stack<>();
         Stack<TreeNode>stack2=new Stack<>();
         stack1.push(node);
    while(!stack1.isEmpty()||!stack2.isEmpty())
    {
        while(!stack1.isEmpty())
        {
            TreeNode current=stack1.pop();
            System.out.print(current.data);
            if(current.left!=null)
            {
                stack2.push(current.left);
            }
            if(current.right!=null)
            {
                stack2.push(current.right);
            }
        }
        while(!stack2.isEmpty())
        {
            TreeNode current=stack2.pop();
            System.out.print(current.data);
            if(current.right!=null)
            {
                stack1.push(current.right);
            }
            if(current.left!=null)
            {
                stack1.push(current.left);
            }
        }
    }
    }
    public static void main(String args[])
    {
        zigzagorder tree=new zigzagorder();
        TreeNode node =new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(5);
        node.left.left=new TreeNode(3);
        node.left.right=new TreeNode(4);
        node.right.left=new TreeNode(6);
        node.right.right=new TreeNode(7);
        tree.traverseorder(node);
    }
}
    
