import java.util.Scanner;
import java.util.Arrays;
public class quicksort{
    public static int partition(int arr[],int low,int high)
    {
        int i=(low-1);
        int pivot=arr[high];
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }
    public static void sort(int arr[],int low,int high)
    {
        
        {
            if(low<high)
            {
                int pi=partition(arr,low,high);
                sort(arr,low,pi-1);
                sort(arr,pi+1,high);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        quicksort.sort(arr,low,high);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
        
    }
}