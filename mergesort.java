import java.util.Scanner;
import java.util.Arrays;
public class mergesort{
    public static void divide(int arr[],int si,int ei)
    {
        int n=arr.length;
        if(si>=ei)
        {
            return ;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int arr[],int si,int mid,int ei)
    {
        int n=arr.length-1;
        int x=0;
        int idx1=si;
        int idx2=mid+1;
        int merged[]=new int[ei-si+1];
        while(idx1<=mid&&idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x++]=arr[idx1++];
            }
            else
            {
               merged[x++]=arr[idx2++];                
            }
        }
        while(idx1<=mid)
        {
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei)
        {
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int si=0;
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ei=arr.length-1;
        mergesort.divide(arr,si,ei);
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(arr));
        
    }
    
}