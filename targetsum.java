import java.util.Scanner;

public class targetsum
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a []=new int [n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int tsum=sc.nextInt();
        findpairsum(a,tsum);
        
        
    }
    public static void findpairsum(int a[],int tsum)
    {
         int begin=0;
        
         int end=a.length-1;
         int sum=a[begin]+a[end];
         if(sum==tsum)
         {
              System.out.println(a[begin]+" "+a[end]);
              return;
         }
         else if(sum<tsum)
         {
             begin++;
         }
         else
         {
             end--;
         }
         System.out.println("no pairs found");
    }
}

    

