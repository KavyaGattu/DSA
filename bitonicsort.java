import java.util.Scanner;
public class bitonicsort{
    public static void compandswap(int arr[],int i,int j,int dir)
    {
        if(arr[i]>arr[j]&&dir==1||arr[i]<arr[j]&&dir==0)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void bitonicmerge(int arr[],int low,int count,int dir)
    {
        if(count>1)
        {
            int k=count/2;
            for(int i=low;i<low+k;i++)
            {
                compandswap(arr,i,i+k,dir);
            }
            bitonicmerge(arr,low,k,dir);
            bitonicmerge(arr,low+k,k,dir);

        }
    }
    public static void Bitonicsort(int arr[],int low,int count,int dir)
    {
        if(count>1)
        {
            int k=count/2;
            Bitonicsort(arr,low,k,1);
            Bitonicsort(arr,low+k,k,0);
            bitonicmerge(arr,low,count,dir);
        }
    }
    public  static void sort(int arr[],int n,int up)
    {
        Bitonicsort(arr,0,n,up);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size;");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int up=1;
        sort(arr,size,up);
        System.out.println("sorted array");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}