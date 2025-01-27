import java.util.Scanner;
import java.util.Arrays;
public class removedupicates{
    public static int duplicates(int arr[],int n){
        int temp[]=new int[n];
        int x=0;
        for(int i=0;i<n-1;i++)
        if(arr[i]!=arr[i+1])
    
                temp[x++]=arr[i];
                
         if(arr[x]!=arr[n-1])
         temp[x++]=arr[n-1];
         
        
           
            
            for(int i=0;i<x;i++)
        
                arr[i]=temp[i];
            
            return Arrays.copyOf(temp,x);
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the array size:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter array elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            removedupicates.duplicates(arr,n);
            System.out.println(Arrays.toString(arr));
            
        
            
        }
    }
    
    
