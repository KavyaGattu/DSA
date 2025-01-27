 public class dlinkedlist
{
    Node head;
    Node tail;   
        dlinkedlist(){
            this.head=null;
            this.tail=null;
        }
    
    public class Node{
        int data;
        Node prev;
        Node next;
         Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public void addfirst(int data)
    {
         Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next =  head;
            head.prev = newNode;
            head = newNode;
        }
}
public void addlast(int data)
{
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
        tail=newnode;
    }
    else{
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
}
    
}
public void addafter(Node prevnode,int data)
{
    Node newnode=new Node(data);
    if(prevnode==null)
    {
        System.out.println("previous node should not be null");
    }
    else
    {
        newnode.next=prevnode.next;
        prevnode.next.prev=newnode;
        prevnode.next=newnode;
        newnode.prev=prevnode;
    }
    }
    void deletefirst()
    {
        if(head==null)
        {
            System.out.println("there is nothing to delete");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deletelast()
    {
        if(tail==null)
        {
            System.out.println("there is nothing to delete");
            return;
        }
        tail=tail.prev;
        if(tail.prev!=null)
        {
            tail.next=null;
        }
        else
        {
            head=null;
        }
    }
    void deleteafter(Node todelete)
    {
        if(todelete==null)
        {
            System.out.println("nothing to delete");
            return;
        }
        if(todelete!=null)
        {
            todelete.prev.next=todelete.next;
        }
        else
        {
            head=todelete.next;
        }
        if(todelete.next!=null)
        {
            todelete.next.prev=todelete.prev;
        }
        else
        {
            tail=todelete.prev;
        }
    }
    public void traverse()
    {    
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data+ " ");
            current=current.next;
        }
         System.out.println();
    }
     public Node search(int data)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.data==data)
            {
                return current;
        }
        current=current.next;
    }
    return null;
}
public static void main(String args[])
{
    dlinkedlist dl=new dlinkedlist();
    dl.addfirst(1);
    dl.addfirst(3);
    dl.addfirst(5);
    dl.addlast(4);
    dl.addafter(dl.search(1),6);
    dl.deletefirst();
    dl.traverse();
}
}
