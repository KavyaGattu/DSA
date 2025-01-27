import java.util.*;
public class binarysearch {
    public static int bsearch(int arr[] ,int key,int l,int h)
    {    int n=arr.length;
          while(l<=h)
        {
            int mid=l+(h-l)/2;
            for(int i=0;i<n;i++)
            {
                if(key==arr[mid])
                {
                    return mid;
                }
                else if(key<arr[mid])
                {
                    h=mid-1;
                }
                else {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key element");
        int key=sc.nextInt();
        int result=bsearch(arr, key, 0, n-1);
        if(result!=-1)
        {
            System.out.println("Element found in the array "+result);
        }
        else
        {
            System.out.println("Element not found");
        }

        }
    
    
}
