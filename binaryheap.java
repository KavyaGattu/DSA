 import java.util.*;
 public class binaryheap {
    int []heap;
    int capacity;
    int size;
    binaryheap(int capacity)
    {
           this.capacity=capacity;
           size=0;
           heap=new int[capacity];
    }
    public void insert(int value)
    {
        if(size==capacity)
        {
            System.out.println("heap is full");
        }
        heap[size]=value;
        int current=size;
        size++;
        while(current>0)
        {
            int parent=(current-1)/2;
            if(heap[current]<heap[parent])
           {
            int temp=heap[current];
            heap[current]=heap[parent];
            heap[parent]=temp;
            current=parent;
           }
           else{
              break;
           }

        }
    }
    public void display()
    {
        if(size==0)
        {
            System.out.println("heap is empty");
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(heap[i]);
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int capacity=sc.nextInt();
            binaryheap hp=new binaryheap(capacity);
           
           
            while(true) { 
                int choice=sc.nextInt();
            switch(choice)
            {
                  case 1:
                  {
                    int value=sc.nextInt();
                    hp.insert(value);
                    break;
                  }
                  case 2:
                  {
                    hp.display();
                    break;
                  }
                  case 3:
                  {
                    sc.close();
                    return;
                  }
                  default:
                  {
                    System.out.println("Invalid choice");
                  }
            }
        }
        }
    }
    
