

public class queueLL {
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node rear,front;
    public queueLL()
    {
        this.rear=this.front=null;
    }
    public boolean isFull()
    {
        return front==null;
    }
    public void enqueue(int data)
    { 
        Node newnode=new Node(data);
        if(isFull())
        {
            System.out.println("queue is full");
        }
        if(this.rear==null)
        {
            this.rear=this.front=newnode;
            System.out.println("Enqueued"+data);
            return;
        }
        this.rear.next=newnode;
        this.rear=newnode;
        System.out.println("Enqueued"+data);
    }
    public void dequeue()
    {
        
    }
    
}
