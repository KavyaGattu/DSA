
import java.util.*;

public class nextGE {
    public static void findnextgreater(int arr[])
    {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
               while(!stack.isEmpty()&&stack.peek()<=arr[i])
               {
                         stack.pop();
               }
               if(stack.isEmpty())
               {
                 nge[i]=-1;
               }
               else{
                nge[i]=stack.peek();
               }
            stack.push(arr[i]);
        }
        System.out.println("Next greater elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+  "-->"  +nge[i]+"\n");
        }
    }
    public static void main(String args[]){
            int arr[]={1,5,3,8,9};
            int n=arr.length;
            System.out.println("array elements");
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
            findnextgreater(arr);
            
       
       }

    }


