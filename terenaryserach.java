import java.util.Scanner;
import java.util.Arrays;
public class terenaryserach
{
    public static int sort(int arr[],int l,int r,int key)
    {
        if(l>=r)
        { 
            return -1;
        }
        int mid1=l+(r-l)/3;
        int mid2=r-(r-l)/3;
        if(arr[mid1]==key)
        {
            return mid1;
        }
        else if(arr[mid2]==key)
        {
            return mid2;
        }
        else if(key<arr[mid1])
        {
            return sort(arr,l,mid1-1,key);
        }
        else if(key<arr[mid2])
        {
            return sort(arr,mid1+1,r,key);
        }
        else
        {
            return sort(arr,mid1+1,mid2-1,key);
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter array elements:");
        for(int i =0;i<n;i++)
        {
           arr[i]=sc.nextInt();            
        }
        System.out.println("Enter key element:");
        int key=sc.nextInt();
        int r=n-1;
        int l=0;
        int res=sort(arr,l,r,key);
        System.out.println("The " +key+ "element found at index" +res);
    }
}
