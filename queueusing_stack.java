import java.util.*;
public class queueusing_stack {
             Stack<Integer>inputstack=new Stack<>();
             Stack<Integer>outputstack=new Stack<>();
    void enqueue(int data)
    {
        inputstack.push(data);
    }
    public int dequeue()
    {
        if(outputstack.isEmpty())
        {
            while(!inputstack.isEmpty())
            {
                outputstack.push(inputstack.pop());
            }
        }
       return outputstack.pop();
    }
    public static void main(String args[])
    {
        queueusing_stack queue=new queueusing_stack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("enqueued");
        System.out.println("10,20,30");
         System.out.println("dequeued"+queue.dequeue());

    }
    
}
