import java.util.Scanner;
public class rotate{
    public static void cycle(int arr[])
    {
        int n=arr.length;
        int last=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        rotate.cycle(arr);
        for(int i:arr)
        {
            System.out.println(i+"");
        }

    }
}