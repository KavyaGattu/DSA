import java.util.Scanner;
import java.util.Arrays;
public class bubblesort
{
    static void sort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter elements of the array:");    
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         bubblesort.sort(arr,n);
         System.out.println(Arrays.toString(arr));
    }
}