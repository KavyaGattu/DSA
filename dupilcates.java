import java.util.Scanner;

public class dupilcates
{
    public static int remove(int arr[],int n)
   {
       if(n==0||n==1)
       {
           return n;
       }
       int temp[]=new int[n];
       int j=0;
       for(int i=0;i<n-1;i++)
       {if(arr[i]!=arr[i+1])
           {
               temp[j++]=arr[i];
           }
           
       }
       temp[j++]=arr[n-1];
       for(int i=0;i<n;i++)
       {
           arr[i]=temp[i];
       }
       return j;
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of the array:");
       int n=sc.nextInt();
       System.out.println("Enter array elements:");
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int res=arr.length;
         res=remove(arr,n);
       for(int i=0;i<n;i++)
       {
       System.out.println(arr[i]+" ");
    }
   }
}
