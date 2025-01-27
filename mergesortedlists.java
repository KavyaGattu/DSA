

class mergesortedlists
{    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newnode;
        
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
    }
    public Node mergelists(Node list1,Node list2)
    {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        return list1;
        if(list1.data<list2.data)
        { list1.next=mergelists(list1.next, list2);
              return list1;
        }
        else{
            list2.next=mergelists(list1, list2.next);
            return list2;
        }

    }
    {

    }
    public static void main(String args[])
    {
        mergesortedlists list1=new mergesortedlists();
        list1.insertlast(1);
        list1.insertlast(2);
        list1.insertlast(4);
        list1.insertlast(7);
        list1.display();
        System.out.println("\n");
        mergesortedlists list2=new mergesortedlists();
        list2.insertlast(3);
        list2.insertlast(4);
        list2.insertlast(5);
        list2.insertlast(6);
        list2.display();
        System.out.println("\n");
        list1.head= new mergesortedlists().mergelists(list1.head,list2.head);
        list1.display();
        
    }

}