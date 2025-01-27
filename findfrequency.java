import java.util.Scanner;
class findfrequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count =0;
        System.out.println("Enter the size of the string:");
        int length=sc.nextInt();
        String str[]=new String[length];
        System.out.println("Enter a string:");
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.nextLine();
        }
        System.out.println("Enter the threshold value:");
        int n=sc.nextInt();
        for(int i=0;i<str.length;i++)
        {
            if(str[0]==str[i])
            {
                count++;
    
        
        if(count>n)
        {
            System.out.println(str[0]);
        }
    }
    }
        
    }
}