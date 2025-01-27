public class queueArray {
    int capacity;
    int queue[];
    int front,rare,size;
    public queueArray(int capacity){
        this.capacity=capacity;
        this.front=0;
        this.rare=-1;
        queue=new int[capacity];
       this.size=0;
    }
    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("overflow");
        }
        rare=rare+1;
        queue[rare]=data;
        size++;
        System.out.println("enqueued"+queue[rare]);
    }
    public void dequeue()
    {
           if(isEmpty())
           {
            System.out.println("underflow");
           }
           System.out.println("dequeued"+queue[front]);
           front++;
           size--;
    }
      public boolean isFull()
      {
           return size==capacity;
      }
      public boolean isEmpty(){
        return size==0;
      }
      public void display()
      {
        for(int i=front;i<=rare;i++)
       {
        System.out.println("elements"+queue[i]);
       }
      }
      public void peek()
     {
        
        System.out.println(queue[front]);
     }
      public static void main(String args[])
      {
        queueArray q=new queueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
        q.peek();


      }
      
    
      


    
}
