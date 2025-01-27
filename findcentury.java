import java.util.Scanner;
class findcentury
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the years:");
        int n=sc.nextInt();
        if(n>0)
        {
            int res=n/100;
            System.out.println(res+ "century");
        }
    }
}